package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.PersonalData;
import net.cqwu.charity_service.service.PersonalDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (PersonalData)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("personalData")
public class PersonalDataController {
    /**
     * 服务对象
     */
    @Resource
    private PersonalDataService personalDataService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PersonalData selectOne(Integer id) {
        return this.personalDataService.queryById(id);
    }

}