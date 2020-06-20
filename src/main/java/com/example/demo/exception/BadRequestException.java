package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The type Bad Request exception.
 *
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BadRequestException extends Exception {

  /**
   * Instantiates a bad request exception - Not supply all mandatory fields by the client in the request.
   *
   * @param message the message
   */
  public BadRequestException(String message) {
    super(message);
  }
}
