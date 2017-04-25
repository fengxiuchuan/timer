package com.fengxc.dubbo;

import com.fengxc.vo.UserVO;

import java.util.List;

/**
 * Created by lenovo on 2017/4/24.
 */
public interface RegiestService {

    String sayHello(String name);

    List<UserVO> queryUserList();

}
