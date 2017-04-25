package com.fengxc.dubbo;

import com.fengxc.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/4/24.
 */
public class RegiestServiceImpl implements RegiestService {

    public String sayHello(String name) {
        return "hello" + name;
    }

    public List<UserVO> queryUserList() {
        UserVO userVO = new UserVO();
        userVO.setUserId(13L);
        userVO.setAge(18);
        userVO.setName("CC");
        List<UserVO> userList = new ArrayList<UserVO>();
        return userList;
    }
}
