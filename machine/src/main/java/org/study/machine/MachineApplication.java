package org.study.machine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2019\2\21 0021.
 */
@SpringBootApplication
@EnableEurekaClient
public class MachineApplication {
    public static void main(String[] args) {
        SpringApplication.run(MachineApplication.class, args);
    }
}
