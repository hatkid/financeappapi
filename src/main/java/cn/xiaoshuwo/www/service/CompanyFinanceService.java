package cn.xiaoshuwo.www.service;

import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceEditParam;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceParam;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceRemoveParam;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceSaveParam;
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

    /**
     * @函数介绍：新增公司
     * @参数 null
     * @返回值：
     */
    Result save(CompanyFinanceSaveParam companyFinanceSaveParam);

    /**
     * @函数介绍：修改公司信息
     * @参数 null
     * @返回值：
     */
    Result edit(CompanyFinanceEditParam companyFinanceEditParam);

    /**
     * @函数介绍：删除
     * @参数 null
     * @返回值：
     */
    Result remove(CompanyFinanceRemoveParam companyFinanceRemoveParam);
}
