package com.mettre.provider.service;

import com.mettre.common.bean.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}