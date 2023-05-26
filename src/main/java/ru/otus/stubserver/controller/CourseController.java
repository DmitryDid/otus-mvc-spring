package ru.otus.stubserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.stubserver.model.CourseModel;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@RestController
@RequestMapping("/course")
public class CourseController {

    private List<CourseModel> generateData() {
        return LongStream
                .range(0, 10)
                .mapToObj(val -> new CourseModel("name" + val, 100 + new Random().nextInt(1000)))
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<CourseModel> getAllUser() {
        return generateData();
    }
}
