package cn.xiaoshuwo.www.controller;


import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.requestparam.UserParam;
import cn.xiaoshuwo.www.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "LoginController", description = "登陆")
public class LoginController {

    @Autowired
    LoginService loginService;

    @ApiOperation(value = "登陆接口", notes = "登陆接口")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody UserParam userParam){
        return loginService.findPasswordByUserName(userParam);
    }


    @ApiOperation(value = "主页数据展示", notes = "主页数据展示")
    @RequestMapping(value = "/getMainPageData", method = RequestMethod.GET)
    public Result getMainPageData(){
        return loginService.getMainPageData();
    }

}
