package net.cqwu.charity_web.controller;

import net.cqwu.charity_commons.pojo.MyProject;
import net.cqwu.charity_commons.pojo.User;
import net.cqwu.charity_commons.pojo.VolunteersProject;
import net.cqwu.charity_service.service.UserService;
import net.cqwu.charity_service.service.VolunteersProjectService;
import net.cqwu.charity_web.until.MyProtectStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (VolunteersProject)表控制层
 *
 * @author makejava
 * @since 2022-06-06 16:53:01
 */
@RestController
@RequestMapping("volunteersProject")
@CrossOrigin(allowedHeaders="*",value="*",originPatterns="*")
public class VolunteersProjectController {
    /**
     * 服务对象
     */
    @Resource
    private VolunteersProjectService volunteersProjectService;

    @Resource
    private UserService userService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public VolunteersProject selectOne(Integer id) {
        return this.volunteersProjectService.queryById(id);
    }

    @PostMapping("myProject")
    public List<MyProject> myProject(@RequestBody User user){
        return MyProtectStatus.upDate(this.volunteersProjectService.myProject(this.userService.queryByName(user.getName()).getId()));
    }
    @PostMapping("Project")
    public List<VolunteersProject> Project(@RequestBody User user){
        return this.volunteersProjectService.queryByIdList(this.userService.queryByName(user.getName()).getId());
    }
    @PostMapping("myJoinInProject")
    public List<MyProject> myJoinInProject(@RequestBody User user){
        return MyProtectStatus.upDate(this.volunteersProjectService.myJoinInProject(this.userService.queryByName(user.getName()).getId()));
    }
    @GetMapping("inserter")
    public VolunteersProject inserter(String name,Integer postid,Integer pid){
        VolunteersProject volunteersProject=new VolunteersProject();
        volunteersProject.setId(this.userService.queryByName(name).getId());
        volunteersProject.setPid(pid);
        volunteersProject.setPostid(postid);
        if (null!=this.volunteersProjectService.queryByIdAndPid(volunteersProject))
            return null;
        volunteersProject.setJoinTime(new Date(System.currentTimeMillis()));
        volunteersProject.setStatus("0");
        return this.volunteersProjectService.insert(volunteersProject);
    }
    @GetMapping("upData")
    public void upData(String name, Integer pid,String mark){

        User u = this.userService.queryByName(name);
        VolunteersProject volunteersProject = new VolunteersProject();
        volunteersProject.setId(u.getId());
        volunteersProject.setPid(pid);
        if ("1".equals(mark)){
            volunteersProject.setStatus("-1");
        } else if("-1".equals(mark)){
            volunteersProject.setStatus("1");
        } else if("0".equals(mark)){
            this.volunteersProjectService.deleteById(volunteersProject);
            return;
        }
        this.volunteersProjectService.update(volunteersProject);
    }
}