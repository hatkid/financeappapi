package cn.xiaoshuwo.www.service.impl;

import cn.xiaoshuwo.www.dao.MybatisDAO;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.salesreport.*;
import cn.xiaoshuwo.www.service.SalesReportService;
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
 * @文件名：SalesReportServiceImpl.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：销售报表
 */
@Service
public class SalesReportServiceImpl implements SalesReportService {

    @Autowired
    MybatisDAO mybatisDAO;

    /**
     * @param salesReportParam
     * @函数介绍：获取销售报表列表
     * @参数 null
     * @返回值：
     */
    @Override
    public Result getSalesReportList(SalesReportParam salesReportParam) {
        Result result = new Result();
        Page page = PageHelper.startPage(salesReportParam.getPageNo(),salesReportParam.getPageSize());
        List<SalesReportResult> newList = mybatisDAO.getList("salesReport.getSalesReportList", salesReportParam);
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("totalCount",page.getTotal());
        retMap.put("data", newList);
        result.setData(retMap);
        return result;
    }

    /**
     * @param salesReportSaveParam
     * @函数介绍：新增销售记录
     * @参数 null
     * @返回值：
     */
    @Override
    public Result save(SalesReportSaveParam salesReportSaveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(salesReportSaveParam);
        if (mybatisDAO.insert("salesReport.save",salesReportSaveParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("新增数据异常");
        }
        return result;
    }

    /**
     * @param salesReportEditParam
     * @函数介绍：编辑销售记录
     * @参数 null
     * @返回值：
     */
    @Override
    public Result edit(SalesReportEditParam salesReportEditParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(salesReportEditParam);
        if (mybatisDAO.update("salesReport.edit",salesReportEditParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("修改数据异常");
        }
        return result;
    }

    /**
     * @param salesReportRemoveParam
     * @函数介绍：删除记录
     * @参数 null
     * @返回值：
     */
    @Override
    public Result remove(SalesReportRemoveParam salesReportRemoveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(salesReportRemoveParam);
        if (mybatisDAO.update("salesReport.remove",salesReportRemoveParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("修改数据异常");
        }
        return result;
    }
}
