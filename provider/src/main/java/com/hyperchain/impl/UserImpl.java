/**
 * Copyright (C), 2016-2019, 趣链科技有限有限公司
 * FileName: UserImpl
 * Author:   lixuanfeng
 * Date:     2019/11/21 上午9:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.hyperchain.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hyperchain.api.IUser;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author lixuanfeng
 * @create 2019/11/21
 * @since 1.0.0
 */
@Component
@Service(interfaceClass = IUser.class, timeout = 1200000)
public class UserImpl implements IUser {

    @Override
    public String say() {
        return "Hello Dubbo!";
    }
}