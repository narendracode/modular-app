package com.narendra.app.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements java.io.Serializable{
    private Long id;
    private String name;
    private Integer age;
}
