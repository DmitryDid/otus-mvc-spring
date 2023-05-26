package ru.otus.stubserver.controller;

import org.springframework.web.bind.annotation.*;
import ru.otus.stubserver.model.UserModel;
import ru.otus.stubserver.service.IUserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserModel> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
