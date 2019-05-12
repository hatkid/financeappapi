package cn.xiaoshuwo.www.service.impl;

import cn.xiaoshuwo.www.dao.MybatisDAO;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.supplierdetail.*;
import cn.xiaoshuwo.www.service.SupplierDetailService;
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
 * @文件名：SupplierDetailServiceImpl.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：采购明细
 */
@Service
public class SupplierDetailServiceImpl implements SupplierDetailService {

    @Autowired
    MybatisDAO mybatisDAO;

    /**
     * @param supplierDetailParam
     * @函数介绍：采购明细列表
     * @参数 null
     * @返回值：
     */
    @Override
    public Result getSupplierDetailList(SupplierDetailParam supplierDetailParam) {
        Result result = new Result();
        Page page = PageHelper.startPage(supplierDetailParam.getPageNo(),supplierDetailParam.getPageSize());
        List<SupplierDetailResult> newList = mybatisDAO.getList("supplierDetail.getSupplierDetailList", supplierDetailParam);
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("totalCount",page.getTotal());
        retMap.put("data", newList);
        result.setData(retMap);
        return result;
    }

    /**
     * @param supplierDetailSaveParam
     * @函数介绍：新增采购
     * @参数 null
     * @返回值：
     */
    @Override
    public Result save(SupplierDetailSaveParam supplierDetailSaveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(supplierDetailSaveParam);
        if (mybatisDAO.insert("supplierDetail.save",supplierDetailSaveParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("新增数据异常");
        }
        return result;
    }

    /**
     * @param supplierDetailEditParam
     * @函数介绍：编辑接口
     * @参数 null
     * @返回值：
     */
    @Override
    public Result edit(SupplierDetailEditParam supplierDetailEditParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(supplierDetailEditParam);
        if (mybatisDAO.update("supplierDetail.edit",supplierDetailEditParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("修改数据异常");
        }
        return result;
    }

    /**
     * @param supplierDetailRemoveParam
     * @函数介绍：删除接口
     * @参数 null
     * @返回值：
     */
    @Override
    public Result remove(SupplierDetailRemoveParam supplierDetailRemoveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(supplierDetailRemoveParam);
        if (mybatisDAO.update("supplierDetail.remove",supplierDetailRemoveParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("修改数据异常");
        }
        return result;
    }

    /**
     * @函数介绍：获取公司名称列表
     * @参数 null
     * @返回值：
     */
    @Override
    public Result getCompanyName() {
        Result result = new Result();
        List<CompanyFianceResult> list = mybatisDAO.getList("supplierDetail.getCompanyName");
        result.setData(list);
        return result;
    }
}
