package dev.drugowick.springthymeleafvuecrudexample.web.api.v1.exceptionhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * This class is now ready to handle other exceptions. The first method here handles all
 * exceptions through Exception.class.
 */
@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handler(Exception exception, WebRequest request) {

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        String detail = exception.getMessage();
        exception.printStackTrace();

        ApiError apiError = ApiError.builder()
                .type("Internal Server Error")
                .status(status.value())
                .detail(detail)
                .build();

        return handleExceptionInternal(exception, apiError, new HttpHeaders(), status, request);
    }
}

