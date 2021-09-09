package com.xj.show.sw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xj.show.sw.mapper")
public class XjShowSwApplication {

	public static void main(String[] args) {
		SpringApplication.run(XjShowSwApplication.class, args);
	}

}
