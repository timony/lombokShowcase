package com.vendavo.training.lombok.showcase.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;

@Data
@AllArgsConstructor
@Log
public class AllArgsPojo {

    private String property1;

    private Long property2;

    public static void main(String[] args) {
        AllArgsPojo pojo1 = new AllArgsPojo("Fancy stuff", 1L);
        log.info(pojo1.toString());
    }
}
