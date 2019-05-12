package cn.xiaoshuwo.www.service;

import cn.xiaoshuwo.www.pojo.CommonPageListWithTotal;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceSaveParam;
import cn.xiaoshuwo.www.pojo.supplierdetail.*;

/**
 * @公司名称：YUTONG
 * @工程名：appapi
 * @文件名：SupplierDetailService.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12 17:38
 * @功能描述：采购明细
 */
public interface SupplierDetailService {

    /**
     * @函数介绍：采购明细列表
     * @参数
     * @返回值：
     */
    Result getSupplierDetailList(SupplierDetailParam supplierDetailParam);

    /**
     * @函数介绍：新增采购
     * @参数 null
     * @返回值：
     */
    Result save(SupplierDetailSaveParam supplierDetailSaveParam);

    /**
     * @函数介绍：编辑接口
     * @参数 null
     * @返回值：
     */
    Result edit(SupplierDetailEditParam supplierDetailEditParam);

    /**
     * @函数介绍：删除接口
     * @参数 null
     * @返回值：
     */
    Result remove(SupplierDetailRemoveParam supplierDetailRemoveParam);

    /**
     * @函数介绍：获取公司名称列表
     * @参数 null
     * @返回值：
     */
    Result getCompanyName();
}
