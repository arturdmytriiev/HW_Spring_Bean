package org.example.spring_app.model;

import lombok.Data;

@Data
public class Note {
    private Long id;
    private String title;
    private String content;

}
