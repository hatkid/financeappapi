package cn.xiaoshuwo.www.service.impl;

import cn.xiaoshuwo.www.dao.MybatisDAO;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceParam;
import cn.xiaoshuwo.www.pojo.companyfinance.CompanyFinanceResult;
import cn.xiaoshuwo.www.service.CompanyFinanceService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @文件名：CompanyFinanceServiceImpl.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：采购管理
 */
@Service
public class CompanyFinanceServiceImpl implements CompanyFinanceService{

    @Autowired
    MybatisDAO mybatisDAO;

    /**
     * @param CompanyFinanceParam
     * @函数介绍：采购管理列表接口
     * @参数 null
     * @返回值：
     */
    @Override
    public Result getCompanyFinanceList(CompanyFinanceParam companyFinanceParam) {
        Result result = new Result();
        Page page = PageHelper.startPage(companyFinanceParam.getPageNo(),companyFinanceParam.getPageSize());
        List<CompanyFinanceResult> newList = mybatisDAO.getList("companyFinance.getCompanyFinanceList", companyFinanceParam);
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("totalCount",page.getTotal());
        retMap.put("data", newList);
        result.setData(retMap);
        return result;
    }
}
