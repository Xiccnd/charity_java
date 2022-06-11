package net.cqwu.charity_web.controller;


import net.cqwu.charity_commons.pojo.VolunteerTeamcensor;
import net.cqwu.charity_service.service.ClassOfServiceService;
import net.cqwu.charity_service.service.VolunteerTeamcensorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * (VolunteerTeamcensor)表控制层
 *
 * @author makejava
 * @since 2022-06-11 15:07:25
 */
@RestController
@RequestMapping("volunteerTeamcensor")
public class VolunteerTeamcensorController {
    /**
     * 服务对象
     */
    @Resource
    private ClassOfServiceService classOfServiceService;
    @Resource
    private VolunteerTeamcensorService volunteerTeamcensorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteerTeamcensor selectOne(Integer id) {
        return this.volunteerTeamcensorService.queryById(id);
    }
    @PostMapping("Add")
    public void add(@RequestBody VolunteerTeamcensor volunteerTeamcensor){
        StringBuffer sid = new StringBuffer();
        for (int i = 0; i < volunteerTeamcensor.getSids().length; i++) {
            sid.append(this.classOfServiceService.queryById(volunteerTeamcensor.getSids()[i]).getServiceName()+" ");
        }
        volunteerTeamcensor.setRegisterDate(new Date(System.currentTimeMillis()));
        volunteerTeamcensor.setSid(sid.toString());
        volunteerTeamcensor.setStatus("1");
        this.volunteerTeamcensorService.insert(volunteerTeamcensor);
    }
}