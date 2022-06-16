package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.VolunteerProgramDetailscensor;

import net.cqwu.charity_service.service.VolunteerProgramDetailscensorService;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerProgramDetailscensor)表控制层
 *
 * @author makejava
 * @since 2022-06-16 08:52:28
 */
@RestController
@RequestMapping("volunteerProgramDetailscensor")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteerProgramDetailscensorController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteerProgramDetailscensorService volunteerProgramDetailscensorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteerProgramDetailscensor selectOne(Integer id) {
        return this.volunteerProgramDetailscensorService.queryById(id);
    }
    @GetMapping("getAll")
    public ResultUntil getAll(){
        return new ResultUntil(this.volunteerProgramDetailscensorService.queryAll(new VolunteerProgramDetailscensor()));
    }
}