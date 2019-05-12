package cn.xiaoshuwo.www.service.impl;

import cn.xiaoshuwo.www.dao.MybatisDAO;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.companyfinance.*;
import cn.xiaoshuwo.www.service.CompanyFinanceService;
import cn.xiaoshuwo.www.util.ConstantUtils;
import cn.xiaoshuwo.www.util.EntityUtil;
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
public class CompanyFinanceServiceImpl implements CompanyFinanceService {

    @Autowired
    MybatisDAO mybatisDAO;

    /**
     * @param
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

    /**
     * @param companyFinanceSaveParam
     * @函数介绍：新增公司
     * @参数 null
     * @返回值：
     */
    @Override
    public Result save(CompanyFinanceSaveParam companyFinanceSaveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(companyFinanceSaveParam);
        // 判断捕捉公司名字重复的提醒
        int count = mybatisDAO.get("companyFinance.checkExistedCompanyNameForSave",companyFinanceSaveParam);
        if (count == 0) {
            if (mybatisDAO.insert("companyFinance.save",companyFinanceSaveParam) != 1) {
                result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
                result.setMsg("新增数据异常");
            }
        } else {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("公司名称重复");
        }
        return result;
    }

    /**
     * @param companyFinanceEditParam
     * @函数介绍：修改公司信息
     * @参数 null
     * @返回值：
     */
    @Override
    public Result edit(CompanyFinanceEditParam companyFinanceEditParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(companyFinanceEditParam);
        // 判断捕捉公司名字重复的提醒
        int count = mybatisDAO.get("companyFinance.checkExistedCompanyNameForEdit",companyFinanceEditParam);
        if (count == 0) {
            if (mybatisDAO.update("companyFinance.edit",companyFinanceEditParam) != 1) {
                result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
                result.setMsg("修改数据异常");
            }
        } else {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("公司名称重复");
        }
        return result;
    }

    /**
     * @param companyFinanceRemoveParam
     * @函数介绍：删除
     * @参数 null
     * @返回值：
     */
    @Override
    public Result remove(CompanyFinanceRemoveParam companyFinanceRemoveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(companyFinanceRemoveParam);
        if (mybatisDAO.update("companyFinance.remove",companyFinanceRemoveParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("修改数据异常");
        }
        return result;
    }
}
