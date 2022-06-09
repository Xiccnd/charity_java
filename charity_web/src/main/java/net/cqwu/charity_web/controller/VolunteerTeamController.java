package net.cqwu.charity_web.controller;

import lombok.Data;
import net.cqwu.charity_commons.pojo.VolunteerTeam;
import net.cqwu.charity_service.service.VolunteerTeamService;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteerTeam)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteerTeam")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteerTeamController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteerTeamService volunteerTeamService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteerTeam selectOne(Integer id) {
        return this.volunteerTeamService.queryById(id);
    }
    @GetMapping("selectOneByUserId")
    public ResultUntil selectOneByUserId(Integer id) {
        ResultUntil result = new ResultUntil(this.volunteerTeamService.queryByUserId(id));
        return result;
    }
    @GetMapping("queryAll")
    public List<VolunteerTeam> queryAll(VolunteerTeam volunteerTeam) {
        return this.volunteerTeamService.queryAll(volunteerTeam);
    }
}