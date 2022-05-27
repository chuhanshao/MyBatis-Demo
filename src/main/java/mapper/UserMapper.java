package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    // 返回所有 User 记录.
    List<User> getUserList();
}
