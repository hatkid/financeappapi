package cn.xiaoshuwo.www.service;

import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.salesreport.SalesReportEditParam;
import cn.xiaoshuwo.www.pojo.salesreport.SalesReportParam;
import cn.xiaoshuwo.www.pojo.salesreport.SalesReportRemoveParam;
import cn.xiaoshuwo.www.pojo.salesreport.SalesReportSaveParam;

/**
 * @文件名：SalesReportService.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：销售报表
 */
public interface SalesReportService {

    /**
     * @函数介绍：获取销售报表列表
     * @参数 null
     * @返回值：
     */
    Result getSalesReportList(SalesReportParam salesReportParam);

    /**
     * @函数介绍：新增销售记录
     * @参数 null
     * @返回值：
     */
    Result save(SalesReportSaveParam salesReportSaveParam);

    /**
     * @函数介绍：编辑销售记录
     * @参数 null
     * @返回值：
     */
    Result edit(SalesReportEditParam salesReportEditParam);

    /**
     * @函数介绍：删除记录
     * @参数 null
     * @返回值：
     */
    Result remove(SalesReportRemoveParam salesReportRemoveParam);
}
