package cn.xiaoshuwo.www.controller;

import cn.xiaoshuwo.www.pojo.CommonPageListWithTotal;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.salesreport.*;
import cn.xiaoshuwo.www.service.SalesReportService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @文件名：SalesReportController.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：销售报表
 */
@RestController
@RequestMapping("/salesreport")
@Api(value = "SalesReportController", description = "销售报表")
public class SalesReportController {

    @Autowired
    SalesReportService salesReportService;

    @ApiOperation(value = "销售报表列表接口", notes = "销售报表列表接口")
    @RequestMapping(value = "/getSalesReportList", method = RequestMethod.POST)
    public Result<CommonPageListWithTotal<SalesReportResult>> getSalesReportList(
            @RequestBody SalesReportParam salesReportParam){
        return salesReportService.getSalesReportList(salesReportParam);
    }

    @ApiOperation(value = "新增接口", notes = "新增接口")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Result save(@RequestBody SalesReportSaveParam salesReportSaveParam) {
        return salesReportService.save(salesReportSaveParam);
    }

    @ApiOperation(value = "编辑接口", notes = "编辑接口")
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public Result edit(@RequestBody SalesReportEditParam salesReportEditParam) {
        return salesReportService.edit(salesReportEditParam);
    }

    @ApiOperation(value = "删除接口", notes = "删除接口")
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public Result remove(@RequestBody SalesReportRemoveParam salesReportRemoveParam) {
        return salesReportService.remove(salesReportRemoveParam);
    }

}
