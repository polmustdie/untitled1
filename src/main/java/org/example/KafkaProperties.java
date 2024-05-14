package org.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class KafkaProperties {
    private String bootstrapServers = "localhost:9093";
    private String topic = "anomaly_topic";
    private String topic_out = "anomaly_topic_out";

}
