package com.xj.show.sw;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:StreamTest
 * @Description:
 * @Author: gj
 * @Date: 2021/7/30 15:56
 * @Version: 1.0
 */
public class StreamTest {


    @Test
    public void testListStream() {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("22266666");
        boolean bool = list.stream().filter(p -> p.matches("222")).findAny().isPresent();
        System.out.println(bool);

//        .stream().filter(p -> p.matcher(url).find()).findAny().isPresent()
    }
}
