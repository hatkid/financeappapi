package cn.xiaoshuwo.www.service;

import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.requestparam.UserParam; /**
 * @公司名称：YUTONG
 * @工程名：appapi
 * @文件名：LoginService.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/4/27 17:53
 * @功能描述：登陆接口服务层接口层
 */
public interface LoginService {

    Result findPasswordByUserName(UserParam userParam);

    /**
     * @函数介绍：主页（main）数据获取
     * @参数 null
     * @返回值：
     */
    Result getMainPageData();
}
