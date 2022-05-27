package mapper;

import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;
import pojo.User;
import utils.MyBatisUtil;

import java.util.List;

public class UserMapperTest {
    @Test(description = "测试 MyBatis 读取全部数据")
    public void UserMapper() {
        SqlSession session = MyBatisUtil.getSqlSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user: userList) {
            System.out.println(user);
        }
        session.close();
    }
}
