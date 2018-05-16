package com.lzw.customer01.apis01.circuit;

import com.lzw.customer01.apis01.interfaces.HystrixClient;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by snail on 18-5-16.
 */
@Component
@Order(1)
public class FallBackHandler  implements HystrixClient {

    public Object handler() {
        return "服务不可用！！！";
    }
}
