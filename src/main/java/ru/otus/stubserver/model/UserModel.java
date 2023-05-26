package ru.otus.stubserver.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserModel {

    private Long userId;
    private String name;
    private String course;
    private String email;
    private Integer age;

}
