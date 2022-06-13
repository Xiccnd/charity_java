package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.ClassOfService;
import net.cqwu.charity_service.service.ClassOfServiceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ClassOfService)表控制层
 *
 * @author makejava
 * @since 2022-06-10 10:04:46
 */
@RestController
@RequestMapping("classOfService")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class ClassOfServiceController {
    /**
     * 服务对象
     */
    @Resource
    private ClassOfServiceService classOfServiceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ClassOfService selectOne(Integer id) {
        return this.classOfServiceService.queryById(id);
    }
    @GetMapping("queryAll")
    public List<ClassOfService> queryAll(){
        return this.classOfServiceService.queryAll(new ClassOfService());
    }
}