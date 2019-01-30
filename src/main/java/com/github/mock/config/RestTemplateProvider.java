package com.github.mock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 创建时间为 下午2:10-2019/1/30
 * 项目名称 SpringBootWireMock
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Configuration
public class RestTemplateProvider {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
