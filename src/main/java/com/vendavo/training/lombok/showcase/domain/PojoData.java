package com.vendavo.training.lombok.showcase.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class PojoData {

    @Setter(AccessLevel.PROTECTED)
    private String property1 = "Some fancy stuff";

    public static void main(String[] args) {
        PojoData pojo2 = new PojoData();

        System.out.println(pojo2);
    }
}
