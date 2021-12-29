package com.example.exceptionnestedhandling.exception;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseApi {
    protected LocalDateTime timeStamp;
    protected int statusCode;
    protected HttpStatus httpStatus;
    protected String reason;
    protected String message;
    protected String developerMessage;
    protected Map<?, ?> data;

    public ResponseApi(LocalDateTime timeStamp,
                       int statusCode,
                       HttpStatus httpStatus,
                       String reason,
                       String message,
                       String developerMessage,
                       Map<?, ?> data) {
        this.timeStamp = timeStamp;
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
        this.reason = reason;
        this.message = message;
        this.developerMessage = developerMessage;
        this.data = data;
    }

    public ResponseApi(ResponseBuilder responseBuilder) {
        this.timeStamp = responseBuilder.timeStamp;
        this.statusCode = responseBuilder.statusCode;
        this.httpStatus = responseBuilder.httpStatus;
        this.reason = responseBuilder.reason;
        this.message = responseBuilder.message;
        this.developerMessage = responseBuilder.developerMessage;
        this.data = responseBuilder.data;
    }


    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getReason() {
        return reason;
    }

    public String getMessage() {
        return message;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public Map<?, ?> getData() {
        return data;
    }

    public static  class ResponseBuilder{

        protected LocalDateTime timeStamp;
        protected int statusCode;
        protected HttpStatus httpStatus;
        protected String reason;
        protected String message;
        protected String developerMessage;
        protected Map<?, ?> data;

        public ResponseBuilder() {
        }

        public ResponseBuilder(LocalDateTime timeStamp,
                               int statusCode,
                               HttpStatus httpStatus,
                               String reason,
                               String message,
                               String developerMessage,
                               Map<?, ?> data) {
            this.timeStamp = timeStamp;
            this.statusCode = statusCode;
            this.httpStatus = httpStatus;
            this.reason = reason;
            this.message = message;
            this.developerMessage = developerMessage;
            this.data = data;
        }

        public LocalDateTime getTimeStamp() {
            return timeStamp;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public HttpStatus getHttpStatus() {
            return httpStatus;
        }

        public String getReason() {
            return reason;
        }

        public String getMessage() {
            return message;
        }

        public String getDeveloperMessage() {
            return developerMessage;
        }

        public Map<?, ?> getData() {
            return data;
        }

        public ResponseBuilder TimeStamp(LocalDateTime timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public ResponseBuilder StatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;

        }

        public ResponseBuilder HttpStatus(HttpStatus httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public ResponseBuilder Reason(String reason) {
            this.reason = reason;
            return this;

        }

        public ResponseBuilder Message(String message) {
            this.message = message;
            return this;

        }

        public ResponseBuilder DeveloperMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;

        }

        public ResponseBuilder Data(Map<?, ?> data) {
            this.data = data;
            return this;

        }

        public ResponseApi build() {
            return new ResponseApi(this);
        }
    }
}