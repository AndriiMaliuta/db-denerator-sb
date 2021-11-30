package com.anma.sb.dbdeneratorsb.models.web;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Name {
    private String common;
    private String official;
}
