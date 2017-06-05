package com.greenfox.groot.controllers;

import static org.junit.Assert.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfox.groot.GrootApplication;
import com.greenfox.groot.models.Food;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by K on 2017.06.05..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DraxRestControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void addFood() throws Exception {
    Food food = new Food("gyros", 5, 3000);
    ObjectMapper objectMapper = new ObjectMapper();
    String testInput = objectMapper.writeValueAsString(food);

    mockMvc.perform(post("/drax/add")
        .contentType(MediaType.APPLICATION_JSON_UTF8)
        .content(testInput))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$[0].name", is("gyros")))
        .andExpect(jsonPath("$[0].amount", is(5)))
        .andExpect(jsonPath("$[0].calorie", is(3000)))
        .andDo(print());
  }
}