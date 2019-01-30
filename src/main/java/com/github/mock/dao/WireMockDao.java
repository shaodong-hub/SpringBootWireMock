package com.github.mock.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * 创建时间为 下午2:11-2019/1/30
 * 项目名称 SpringBootWireMock
 * </p>
 *
 * @author shao
 * @version 0.0.1
 * @since 0.0.1
 */

@Repository
public class WireMockDao {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${remote}")
    private String url;

    public String access() {
        ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
        System.out.println(result);
        return result.getBody();
    }





}
