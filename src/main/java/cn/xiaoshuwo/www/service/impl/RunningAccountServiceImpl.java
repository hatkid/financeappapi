package cn.xiaoshuwo.www.service.impl;

import cn.xiaoshuwo.www.dao.MybatisDAO;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountEditParam;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountParam;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountRemoveParam;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountSaveParam;
import cn.xiaoshuwo.www.pojo.supplierdetail.SupplierDetailResult;
import cn.xiaoshuwo.www.service.RunningAccountService;
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
 * @文件名：RunningAccountService.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：流水账
 */
@Service
public class RunningAccountServiceImpl implements RunningAccountService {

    @Autowired
    MybatisDAO mybatisDAO;

    /**
     * @param runningAccountParam
     * @函数介绍：获取流水账列表
     * @参数 null
     * @返回值：
     */
    @Override
    public Result getRunningAccountList(RunningAccountParam runningAccountParam) {
        Result result = new Result();
        Page page = PageHelper.startPage(runningAccountParam.getPageNo(),runningAccountParam.getPageSize());
        List<SupplierDetailResult> newList = mybatisDAO.getList("runningAccount.getRunningAccountList", runningAccountParam);
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("totalCount",page.getTotal());
        retMap.put("data", newList);
        result.setData(retMap);
        return result;
    }

    /**
     * @param runningAccountSaveParam
     * @函数介绍：新增流水账
     * @参数 null
     * @返回值：
     */
    @Override
    public Result save(RunningAccountSaveParam runningAccountSaveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(runningAccountSaveParam);
        if (mybatisDAO.insert("runningAccount.save",runningAccountSaveParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("新增数据异常");
        }
        return result;
    }

    /**
     * @param runningAccountEditParam
     * @函数介绍：编辑流水账
     * @参数 null
     * @返回值：
     */
    @Override
    public Result edit(RunningAccountEditParam runningAccountEditParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(runningAccountEditParam);
        if (mybatisDAO.update("runningAccount.edit",runningAccountEditParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("修改数据异常");
        }
        return result;
    }

    /**
     * @param runningAccountRemoveParam
     * @函数介绍：删除流水账
     * @参数 null
     * @返回值：
     */
    @Override
    public Result remove(RunningAccountRemoveParam runningAccountRemoveParam) {
        Result result = new Result();
        EntityUtil.setCommonInfo(runningAccountRemoveParam);
        if (mybatisDAO.update("runningAccount.remove",runningAccountRemoveParam) != 1) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("修改数据异常");
        }
        return result;
    }
}
