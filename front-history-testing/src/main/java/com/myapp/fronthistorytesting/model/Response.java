package com.myapp.fronthistorytesting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Response {
    private Integer id;
    private String response;
}
