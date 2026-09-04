package io.aiven.klaw.clusterapi.models;

import java.io.Serializable;
import java.util.Set;
import lombok.Data;

@Data
public class SchemaInfoOfTopic implements Serializable {
  private String topic;
  private Set<Integer> schemaVersions;
}
