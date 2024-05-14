package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class BatchGeoData {
    private Double x;
    private Double y;
    private String flag;

    public BatchGeoData() {

    }
}

