package ru.otus.stubserver.service;

import ru.otus.stubserver.model.UserModel;

import java.util.List;

public interface IUserService {

    List<UserModel> getAllUser();

    UserModel getUserById(Long id);

}
