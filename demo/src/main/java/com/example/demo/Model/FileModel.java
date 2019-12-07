package com.example.demo.Model;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class FileModel {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String name;
    private @NonNull String directory;
}