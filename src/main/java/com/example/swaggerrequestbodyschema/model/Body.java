package com.example.swaggerrequestbodyschema.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "Body", description = "Body", example = "{\"key\":\"value\"}")
public class Body implements Map<String, Object> {

    @Delegate
    @Schema(hidden = true)
    private Map<String, Object> data;
}
