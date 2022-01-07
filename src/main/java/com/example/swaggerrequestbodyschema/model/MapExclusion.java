package com.example.swaggerrequestbodyschema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface MapExclusion {
    @JsonIgnore
    boolean isEmpty();
}
