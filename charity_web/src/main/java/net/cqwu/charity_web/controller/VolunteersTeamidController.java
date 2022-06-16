package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.MyTeam;
import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_commons.pojo.VolunteersTeamid;
import net.cqwu.charity_dao.mapper.UserDao;
import net.cqwu.charity_service.service.UserService;
import net.cqwu.charity_service.service.VolunteersTeamidService;
import net.cqwu.charity_web.until.MyTeamStatus;
import net.cqwu.charity_web.until.ResultUntil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
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

    @GetMapping("endGetAllTeam")
    public ResultUntil endGetAllTeam(){
        return new ResultUntil(this.volunteersTeamidService.endAllTeamMessage());
    }
    @GetMapping("selectOne")
    public List<VolunteersTeamid> selectOne(String name) {
        return this.volunteersTeamidService.queryById(this.userService.queryByName(name).getId());
    }

    @GetMapping("selectAllNumByTid")
    public Integer selectAllNumByTid(VolunteersTeamid volunteersTeamid){
        return this.volunteersTeamidService.queryAll(volunteersTeamid).size();
    }
    @PostMapping("selectMyJoinInTeam")
    public List<MyTeam> selectMyJoinInTeam(@RequestBody User user){
        return MyTeamStatus.upDate(this.volunteersTeamidService.selectMyJoinInTeam(user));
    }
    @PostMapping("selectMyTeam")
    public List<MyTeam> selectMyTeam(@RequestBody User user){
        return MyTeamStatus.upDate(this.volunteersTeamidService.selectMyTeam(user));
    }
    @GetMapping("inserter")
    public VolunteersTeamid inserter(String name,Integer teamid){
        VolunteersTeamid volunteersTeamid =new VolunteersTeamid();
        volunteersTeamid.setId(this.userService.queryByName(name).getId());
        volunteersTeamid.setTeamid(teamid);
        if (null!=this.volunteersTeamidService.queryByIdAndTeamID(volunteersTeamid))
            return null;
        volunteersTeamid.setJoinTime(new Date(System.currentTimeMillis()));
        volunteersTeamid.setMark("0");
        return this.volunteersTeamidService.insert(volunteersTeamid);
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
    //通过id获取teamid
    @GetMapping("selectTeamidByid")
    public List<VolunteersTeamid> selectTeamidByid(int id){
        return this.volunteersTeamidService.selectTeamidByid(id);
    }
}