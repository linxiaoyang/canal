package com.alibaba.otter.canal.example.linyang;


import com.google.common.base.Function;
import com.google.common.collect.MigrateMap;

import java.util.Map;



public class Main {

    public static void main(String[] args){
        Map map=MigrateMap.makeComputingMap(new Function<String, Integer>() {
            int i=1;
            @Override
            public Integer apply(final String destination) {
                return i++;
            }
        });
        System.out.println(map.get("123"));
        System.out.println(map.get("456"));
    }
}
