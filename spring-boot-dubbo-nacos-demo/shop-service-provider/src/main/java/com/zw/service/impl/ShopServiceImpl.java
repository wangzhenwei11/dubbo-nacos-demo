package com.zw.service.impl;

import com.zw.service.RpcShopService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ShopServiceImpl implements RpcShopService {

    public String sayHello(String name) {
        return name;
    }
}
