package com.greenfox.groot.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import com.greenfox.groot.GrootApplication;
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
 * Created by Connor on 2017.05.15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GuardianRestControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void grootWithParameter() throws Exception {
    mockMvc.perform(get("/groot")
        .param("message", "somemessage")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is("somemessage")))
        .andExpect(jsonPath("$.translated", is("I am Groot!")))
        .andDo(print());
  }

  @Test
  public void grootWithoutParameter() throws Exception {
    mockMvc.perform(get("/groot")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")))
        .andDo(print());
  }

  @Test
  public void arrowWithParameter() throws Exception {
    mockMvc.perform(get("/yondu")
        .param("distance", "100.0")
        .param("time", "10.0")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.speed", is(10.0)))
        .andDo(print());
  }

  @Test
  public void arrowWithoutParameter() throws Exception {
    mockMvc.perform(get("/yondu")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")))
        .andDo(print());
  }

  @Test
  public void rocketTest1EmptyShipStatus() throws Exception {
    mockMvc.perform(get("/rocket")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.caliber25", is(0.0)))
        .andExpect(jsonPath("$.caliber30", is(0.0)))
        .andExpect(jsonPath("$.caliber50", is(0.0)))
        .andExpect(jsonPath("$.shipstatus", is("empty")))
        .andExpect(jsonPath("$.ready", is(false)))
        .andDo(print());
  }

  @Test
  public void rocketTest2FillShipWithoutParameter() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest())
        .andExpect(jsonPath("$.error", is("I am Groot!")))
        .andDo(print());
  }

  @Test
  public void rocketTest3FillShipToFortyPercent() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".50")
        .param("amount", "5000")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(".50")))
        .andExpect(jsonPath("$.amount", is(5000.0)))
        .andExpect(jsonPath("$.shipstatus", is("40.0%")))
        .andExpect(jsonPath("$.ready", is(false)))
        .andDo(print());
  }

  @Test
  public void rocketTest4FillShipToFull() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".50")
        .param("amount", "7500")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(".50")))
        .andExpect(jsonPath("$.amount", is(7500.0)))
        .andExpect(jsonPath("$.shipstatus", is("full")))
        .andExpect(jsonPath("$.ready", is(true)))
        .andDo(print());
  }

  @Test
  public void rocketTest5FillShipToOverloaded() throws Exception {
    mockMvc.perform(get("/rocket/fill")
        .param("caliber", ".25")
        .param("amount", "100")
        .contentType(MediaType.APPLICATION_JSON_UTF8))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(".25")))
        .andExpect(jsonPath("$.amount", is(100.0)))
        .andExpect(jsonPath("$.shipstatus", is("overloaded")))
        .andExpect(jsonPath("$.ready", is(false)))
        .andDo(print());
  }


}

