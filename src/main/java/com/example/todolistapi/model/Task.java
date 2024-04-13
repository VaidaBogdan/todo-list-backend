package com.example.todolistapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TypeAlias("task")
public class Task {
    @Id
    private String id;
    private String nume;
    private String descriere;
    private String status;
}
