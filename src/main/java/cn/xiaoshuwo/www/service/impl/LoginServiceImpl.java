package cn.xiaoshuwo.www.service.impl;

import cn.xiaoshuwo.www.dao.MybatisDAO;
import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.requestparam.UserParam;
import cn.xiaoshuwo.www.service.LoginService;
import cn.xiaoshuwo.www.util.ConstantUtils;
import cn.xiaoshuwo.www.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @文件名：LoginServiceImpl.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/4/27
 * @功能描述：登录接口服务是现实层
 */
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    MybatisDAO mybatisDAO;


    /**
     * 根据用户名查询密码
     * @param userParam
     * @return
     */
    @Override
    public Result findPasswordByUserName(UserParam userParam) {
        Result result = new Result();
        if (StringUtils.isEmpty(userParam.getPassword()) || StringUtils.isEmpty(userParam.getUserName())) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("用户名或密码为空");
        }
        UserParam user = mybatisDAO.get("login.findPasswordByUserName", userParam);
        if (null == user || !Md5Utils.hash(userParam.getPassword()).equalsIgnoreCase(user.getPassword())) {
            result.setCode(ConstantUtils.ErrorCode.ERROR_FAILE);
            result.setMsg("用户名或密码错误");
        }
        return result;
    }

    /**
     * @param userParam
     * @函数介绍：主页（main）数据获取
     * @参数 null
     * @返回值：
     */
    @Override
    public Result getMainPageData() {

        Result result = new Result();

        // 获取所有商家数量
        int companyFinancesCount =  mybatisDAO.get("login.getAllCompanyFinanceCount");

        // 获 取所有流水记录数量
        int runningAccountsCount = mybatisDAO.get("login.getAllRunningAccountsCountCount");

        // 获取所有销售记录数量
        int salesRecordsCount = mybatisDAO.get("login.getAllSalesRecordsCountCount");

        // 组装结果
        Map<String,Integer> resultMap = new HashMap<>(3);
        resultMap.put("companyFinancesCount", companyFinancesCount);
        resultMap.put("runningAccountsCount", runningAccountsCount);
        resultMap.put("salesRecordsCount", salesRecordsCount);

        // 设置返回结果
        result.setData(resultMap);

        return result;
    }
}
