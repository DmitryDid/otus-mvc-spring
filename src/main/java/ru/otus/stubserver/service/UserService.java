package ru.otus.stubserver.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import ru.otus.stubserver.model.UserModel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@Service
public class UserService implements IUserService {

    @Override
    public List<UserModel> getAllUser() {
        return generateData();
    }

    @Override
    public UserModel getUserById(@PathVariable Long id) {
        List<UserModel> users = generateData().stream()
                .filter(userModel -> userModel.getUserId().equals(id))
                .toList();
        assert users.size() == 1;
        return users.get(0);
    }

    public List<UserModel> generateData() {
        return LongStream
                .range(0, 10)
                .mapToObj(val -> new UserModel(val, "name" + val, "course" + val, "email@" + val, 25))
                .collect(Collectors.toList());
    }
}
