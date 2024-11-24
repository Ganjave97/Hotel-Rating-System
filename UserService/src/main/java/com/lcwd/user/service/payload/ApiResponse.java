package com.lcwd.user.service.payload;

import org.springframework.http.HttpStatus;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

    public static ApiResponseBuilder builder() {
        return new ApiResponseBuilder();
    }

    public static class ApiResponseBuilder {
        private String message;
        private boolean success;
        private HttpStatus status;

        public ApiResponseBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ApiResponseBuilder success(boolean success) {
            this.success = success;
            return this;
        }

        public ApiResponseBuilder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            ApiResponse apiResponse = new ApiResponse();
            apiResponse.message = this.message;
            apiResponse.success = this.success;
            apiResponse.status = this.status;
            return apiResponse;
        }
    }
}
