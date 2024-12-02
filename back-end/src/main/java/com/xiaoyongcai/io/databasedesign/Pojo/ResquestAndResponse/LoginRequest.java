package com.xiaoyongcai.io.databasedesign.Pojo.ResquestAndResponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    @JsonProperty("NAME")
    private String name;

    @JsonProperty("PASSWD")
    private String passwd;

    // Lombok will generate getters and setters
}
