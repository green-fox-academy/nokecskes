package com.greenfox.groot.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.greenfox.groot.GrootApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Connor on 2017.05.15..
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
class GuardianControllerTest {

  @org.junit.jupiter.api.Test
  void translate() {

  }

}