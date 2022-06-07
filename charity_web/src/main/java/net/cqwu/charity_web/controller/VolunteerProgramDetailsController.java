package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.VolunteerProgramDetails;
import net.cqwu.charity_service.service.VolunteerProgramDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerProgramDetails)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteerProgramDetails")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteerProgramDetailsController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteerProgramDetailsService volunteerProgramDetailsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteerProgramDetails selectOne(Integer id) {
        return this.volunteerProgramDetailsService.queryById(id);
    }
    @RequestMapping("selectAll")
    public List<VolunteerProgramDetails> selectAll(VolunteerProgramDetails volunteerProgramDetails) {
        return this.volunteerProgramDetailsService.queryAll(volunteerProgramDetails);
    }
}