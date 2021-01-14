package com.ceiba.cinema.dominio.infraestructura;


import com.ceiba.cinema.CinemaApplication;
import com.ceiba.cinema.aplicacion.comando.ComandoCliente;
import com.ceiba.cinema.testdatabuilder.ComandoClienteTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CinemaApplication.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControladorClienteTest {

    private static final String CEDULA = "123";

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
    public void crearCliente() throws Exception{
        //Arrange
        ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().build();

        //Act - Assert
        mockMvc.perform(post("/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCliente)))
                .andExpect(status().isOk())
                .andDo(a-> {
                    Assert.assertEquals(comandoCliente.getIdCliente().longValue(), 10);
                    Assert.assertEquals(comandoCliente.getNombre(), "Peter");
                    Assert.assertEquals(comandoCliente.getApellido(), "Parker");
                    Assert.assertEquals(comandoCliente.getCedula(), "1036400700");
                    Assert.assertEquals(comandoCliente.getCelular(), "3135811244");
                    Assert.assertEquals(comandoCliente.getCorreo(), "peterparker@marvel.com");
                });
    }

    @Test
    public void eliminarCliente() throws Exception {
        //Arrange
        ComandoCliente comandoCliente = new ComandoClienteTestDataBuilder().conCedula("123").build();

        //Act - Assert
        mockMvc.perform(post("/cliente")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(comandoCliente)))
                .andExpect(status().isOk());

        mockMvc.perform(delete("/cliente/".concat(CEDULA))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
