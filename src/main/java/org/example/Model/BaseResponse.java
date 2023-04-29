package org.example.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {
    private String status;
    public BaseResponse(String status)
    {
        this.status=status;
    }
}
