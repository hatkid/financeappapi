package cn.xiaoshuwo.www.controller;

import cn.xiaoshuwo.www.pojo.CommonPageListWithTotal;
import cn.xiaoshuwo.www.pojo.CommonPageListWithoutTotal;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.supplierdetail.*;
import cn.xiaoshuwo.www.service.SupplierDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @文件名：SupplierDetailController.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：采购明细
 */
@RestController
@RequestMapping("/supplierdetail")
@Api(value = "SupplierDetailController", description = "采购明细")
public class SupplierDetailController {

    @Autowired
    SupplierDetailService supplierDetailService;

    @ApiOperation(value = "采购明细列表接口", notes = "采购明细列表接口")
    @RequestMapping(value = "/getSupplierDetailList", method = RequestMethod.POST)
    public Result<CommonPageListWithTotal<SupplierDetailResult>> getSupplierDetailList(
            @RequestBody SupplierDetailParam supplierDetailParam){
        return supplierDetailService.getSupplierDetailList(supplierDetailParam);
    }

    @ApiOperation(value = "新增接口", notes = "新增接口")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Result save(@RequestBody SupplierDetailSaveParam supplierDetailSaveParam) {
        return supplierDetailService.save(supplierDetailSaveParam);
    }

    @ApiOperation(value = "编辑接口", notes = "编辑接口")
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public Result edit(@RequestBody SupplierDetailEditParam supplierDetailEditParam) {
        return supplierDetailService.edit(supplierDetailEditParam);
    }

    @ApiOperation(value = "删除接口", notes = "删除接口")
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public Result remove(@RequestBody SupplierDetailRemoveParam supplierDetailRemoveParam) {
        return supplierDetailService.remove(supplierDetailRemoveParam);
    }

    @ApiOperation(value = "获取公司名称列表", notes = "获取公司名称列表")
    @RequestMapping(value = "/getCompanyName", method = RequestMethod.POST)
    public Result<CommonPageListWithoutTotal<CompanyFianceResult>> getCompanyName() {
        return supplierDetailService.getCompanyName();
    }

}
