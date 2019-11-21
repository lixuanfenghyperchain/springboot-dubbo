/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: HelloController
 * Author:   lixuanfeng
 * Date:     2019/11/21 上午9:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hyperchain.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyperchain.api.IUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/11/21
 * @since 1.0.0
 */
@RestController
@RequestMapping("/test")
public class HelloController {


    @Reference
    private IUser user;

    @RequestMapping("/hello")
    public String test() {
        return user.say();
    }

}