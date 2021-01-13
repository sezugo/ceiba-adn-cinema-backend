package com.ceiba.cinema.dominio.infraestructura;

import com.ceiba.cinema.CinemaApplication;
import com.ceiba.cinema.aplicacion.comando.ComandoPelicula;
import com.ceiba.cinema.testdatabuilder.ComandoPeliculaTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CinemaApplication.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControladorPeliculaTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void crearPelicula() throws  Exception{
        //Arrange
        ComandoPelicula comandoPelicula = new ComandoPeliculaTestDataBuilder().build();

        //Act - Assert
        mockMvc.perform(post("/pelicula")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoPelicula)))
                .andExpect(status().isOk()
                );
    }








}
