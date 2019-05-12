package cn.xiaoshuwo.www.service;

import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceParam;
/**
 * @公司名称：YUTONG
 * @工程名：appapi
 * @文件名：CompanyFinanceService.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12 11:23
 * @功能描述：采购管理
 */
public interface CompanyFinanceService {
    
    /**
     * @函数介绍：采购管理列表接口
     * @参数 null
     * @返回值：
     */
    Result getCompanyFinanceList(CompanyFinanceParam companyFinanceParam);
}
