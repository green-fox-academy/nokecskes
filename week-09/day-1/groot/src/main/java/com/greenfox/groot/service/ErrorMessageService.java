package com.greenfox.groot.service;

import com.greenfox.groot.models.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017.06.04..
 */
@Service
public class ErrorMessageService {

  @Autowired
  ErrorMessage errorMessage;

  public ErrorMessage setErrorMessage(String errorText) {
    errorMessage.setError(errorText);
    return errorMessage;
  }


}
