package com.vendavo.training.lombok.showcase.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PojoBuilder {

    private String property1;

    private Long property2;

    public static void main(String[] args) {
        PojoBuilder pojo1 = PojoBuilder.builder()
                .property1("Some fancy stuff")
                .property2(100L)
                .build();

        PojoBuilder pojo2 = PojoBuilder.builder()
                .property1("Some fancy stuff")
                .property2(100L)
                .build();

        PojoBuilder pojo3 = PojoBuilder.builder()
                .property1("Some other stuff")
                .property2(555L)
                .build();

        System.out.println(pojo1);
        System.out.println(pojo1.equals(pojo2));
        System.out.println(pojo1.equals(pojo3));

    }
}
