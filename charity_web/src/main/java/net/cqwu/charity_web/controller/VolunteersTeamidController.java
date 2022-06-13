package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.MyTeam;
import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import net.cqwu.charity_dao.mapper.UserDao;
import net.cqwu.charity_service.service.UserService;
import net.cqwu.charity_service.service.VolunteersTeamidService;
import net.cqwu.charity_web.until.MyTeamStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (VolunteersTeamid)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteersTeamid")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteersTeamidController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteersTeamidService volunteersTeamidService;

    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteersTeamid selectOne(Integer id) {
        return this.volunteersTeamidService.queryById(id);
    }

    @GetMapping("selectAllNumByTid")
    public Integer selectAllNumByTid(VolunteersTeamid volunteersTeamid){
        return this.volunteersTeamidService.queryAll(volunteersTeamid).size();
    }
    @PostMapping("selectMyTeam")
    public List<MyTeam> selectMyTeam(@RequestBody User user){
        return MyTeamStatus.upDate(this.volunteersTeamidService.selectMyTeam(user));
    }
    @GetMapping("upData")
    public void upData(String name, Integer teamId,String mark){
        User u = this.userService.queryByName(name);
        VolunteersTeamid volunteersTeamid = new VolunteersTeamid();
        volunteersTeamid.setTeamid(teamId);
        volunteersTeamid.setId(u.getId());
        if ("1".equals(mark)){
            volunteersTeamid.setMark("-1");
        } else if("-1".equals(mark)){
            volunteersTeamid.setMark("1");
        } else if("0".equals(mark)){
            this.volunteersTeamidService.deleteById(volunteersTeamid);
            return;
        }
        this.volunteersTeamidService.update(volunteersTeamid);
    }
}