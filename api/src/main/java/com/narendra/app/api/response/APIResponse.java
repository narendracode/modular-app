package com.narendra.app.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse<T> implements Serializable {
    private String status;
    private T data;
}
