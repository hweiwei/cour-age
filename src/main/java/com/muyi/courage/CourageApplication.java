package com.muyi.courage;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.cloud.openfeign.EnableFeignClients;

@ComponentScan("com.muyi.courage")
@EnableAutoConfiguration
@Configuration
@EnableSwagger2
@EnableKnife4j
@EnableTransactionManagement
//@EnableFeignClients
public class CourageApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourageApplication.class, args);
	}

}
