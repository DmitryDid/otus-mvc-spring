package ru.otus.stubserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseModel {

    private String name;
    private Integer prise;

}
