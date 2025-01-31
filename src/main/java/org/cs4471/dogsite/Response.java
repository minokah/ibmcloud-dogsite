package org.cs4471.dogsite;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Response {
    private int code;
    private String service, response;

    public Response(int code, String service, String response) {
        this.code = code;
        this.service = service;
        this.response = response;
    }
}
