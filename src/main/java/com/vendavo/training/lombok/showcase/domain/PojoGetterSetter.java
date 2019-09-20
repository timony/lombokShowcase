package com.vendavo.training.lombok.showcase.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PojoGetterSetter {

    private String property1;

    private Long pp;

    public static void main(String[] args) {

        PojoGetterSetter pojo1 = new PojoGetterSetter();
        pojo1.setProperty1("Some value");
        pojo1.setPp(1L);
        PojoGetterSetter pojo2 = new PojoGetterSetter();
        pojo2.setProperty1("Some value");

        System.out.println(pojo1);
        System.out.println(pojo1.getProperty1());
        System.out.println(pojo1.equals(pojo2));

    }
}
