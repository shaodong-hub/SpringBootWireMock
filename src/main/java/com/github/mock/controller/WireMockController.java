package com.github.mock.controller;

import com.github.mock.dao.WireMockDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


@RestController
public class WireMockController {

    private final WireMockDao dao;

    public WireMockController(WireMockDao dao) {
        this.dao = dao;
    }

    @GetMapping("get")
    public String get() {
        return dao.access();
    }

}
