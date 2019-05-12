package cn.xiaoshuwo.www.controller;

import cn.xiaoshuwo.www.pojo.CommonPageListWithTotal;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.companyfinance.*;
import cn.xiaoshuwo.www.service.CompanyFinanceService;
import cn.xiaoshuwo.www.util.EntityUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @文件名：CompanyFinanceController.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：采购管理
 */
@RestController
@RequestMapping("/companyfinance")
@Api(value = "CompanyFinanceController", description = "采购管理")
public class CompanyFinanceController {

    @Autowired
    CompanyFinanceService companyFinanceService;

    @ApiOperation(value = "采购管理列表接口", notes = "采购管理列表接口")
    @RequestMapping(value = "/getCompanyFinanceList", method = RequestMethod.POST)
    public Result<CommonPageListWithTotal<CompanyFinanceResult>> getCompanyFinanceList(
            @RequestBody CompanyFinanceParam companyFinanceParam){
        return companyFinanceService.getCompanyFinanceList(companyFinanceParam);
    }

    @ApiOperation(value = "新增接口", notes = "新增接口")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Result save(@RequestBody CompanyFinanceSaveParam companyFinanceSaveParam) {
        return companyFinanceService.save(companyFinanceSaveParam);
    }

    @ApiOperation(value = "编辑接口", notes = "编辑接口")
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public Result edit(@RequestBody CompanyFinanceEditParam companyFinanceSaveParam) {
        return companyFinanceService.edit(companyFinanceSaveParam);
    }

    @ApiOperation(value = "删除接口", notes = "删除接口")
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public Result remove(@RequestBody CompanyFinanceRemoveParam companyFinanceRemoveParam) {
        return companyFinanceService.remove(companyFinanceRemoveParam);
    }



}
