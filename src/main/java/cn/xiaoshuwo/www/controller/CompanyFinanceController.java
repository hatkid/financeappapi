package cn.xiaoshuwo.www.controller;

import cn.xiaoshuwo.www.pojo.CommonPageListWithTotal;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceParam;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceResult;
import cn.xiaoshuwo.www.service.CompanyFinanceService;
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

}
