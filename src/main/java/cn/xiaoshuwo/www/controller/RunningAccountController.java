package cn.xiaoshuwo.www.controller;

import cn.xiaoshuwo.www.pojo.CommonPageListWithTotal;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.runningaccount.*;
import cn.xiaoshuwo.www.service.RunningAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @文件名：RunningAccountController.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：流水账
 */
@RestController
@RequestMapping("/runningaccount")
@Api(value = "RunningAccountController", description = "流水账")
public class RunningAccountController {

    @Autowired
    RunningAccountService runningAccountService;

    @ApiOperation(value = "流水账明细列表接口", notes = "流水账明细列表接口")
    @RequestMapping(value = "/getRunningAccountList", method = RequestMethod.POST)
    public Result<CommonPageListWithTotal<RunningAccountResult>> getRunningAccountList(
            @RequestBody RunningAccountParam runningAccountParam){
        return runningAccountService.getRunningAccountList(runningAccountParam);
    }

    @ApiOperation(value = "新增接口", notes = "新增接口")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Result save(@RequestBody RunningAccountSaveParam runningAccountSaveParam) {
        return runningAccountService.save(runningAccountSaveParam);
    }

    @ApiOperation(value = "编辑接口", notes = "编辑接口")
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public Result edit(@RequestBody RunningAccountEditParam runningAccountEditParam) {
        return runningAccountService.edit(runningAccountEditParam);
    }

    @ApiOperation(value = "删除接口", notes = "删除接口")
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public Result remove(@RequestBody RunningAccountRemoveParam runningAccountRemoveParam) {
        return runningAccountService.remove(runningAccountRemoveParam);
    }

}
