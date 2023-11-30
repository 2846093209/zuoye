package com.example.car.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.car.jinru.Car;
import com.example.car.map.Mapper;
import com.example.car.service.Service;


@org.springframework.stereotype.Service("carService")
public class CarServiceImpl extends ServiceImpl<Mapper, Car> implements Service {
}
