package com.example.swaggerrequestbodyschema.service;

import com.example.swaggerrequestbodyschema.model.Body;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api")
@Tag(name = "REST Service")
public class RESTService {

    @PostMapping("/testWithoutSchema")
    @Operation(summary = "Test Request Body type Schema usage [Error]")
    public String withoutSchema(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true)
                                @RequestBody Body body) {
        log.info(body.toString());
        return "without proper schema";
    }

    @PostMapping("/testWithSchema")
    @Operation(summary = "Test Request Body type Schema usage [Correct]")
    public String withSchema(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true, content = @Content(schema = @Schema(implementation = Body.class)))
                             @RequestBody Body body) {
        log.info(body.toString());
        return "with proper schema";
    }

}
