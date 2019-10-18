package com.mettre.common.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {

    private Long deptNo;
    private String dName;
    private String dbSource;
}