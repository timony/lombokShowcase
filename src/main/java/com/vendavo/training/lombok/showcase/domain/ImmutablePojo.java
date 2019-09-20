package com.vendavo.training.lombok.showcase.domain;

import lombok.Builder;
import lombok.Value;
import lombok.extern.java.Log;

@Value
@Builder
@Log
public class ImmutablePojo {

    private String property1;

    private Long property2;

    public static void main(String[] args) {
        ImmutablePojo pojo1 = ImmutablePojo.builder()
                .property1("Unchangable property")
                .property2(10L)
                .build();

        log.info(pojo1.toString());

    }
}
