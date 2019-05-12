package cn.xiaoshuwo.www.service;

import cn.xiaoshuwo.www.pojo.Result;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountEditParam;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountParam;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountRemoveParam;
import cn.xiaoshuwo.www.pojo.runningaccount.RunningAccountSaveParam;

/**
 * @公司名称：YUTONG
 * @工程名：appapi
 * @文件名：RunningAccountService.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12 19:19
 * @功能描述：流水账
 */
public interface RunningAccountService {

    /**
     * @函数介绍：获取流水账列表
     * @参数 null
     * @返回值：
     */
    Result getRunningAccountList(RunningAccountParam runningAccountParam);

    /**
     * @函数介绍：新增流水账
     * @参数 null
     * @返回值：
     */
    Result save(RunningAccountSaveParam runningAccountSaveParam);

    /**
     * @函数介绍：编辑流水账
     * @参数 null
     * @返回值：
     */
    Result edit(RunningAccountEditParam runningAccountEditParam);

    /**
     * @函数介绍：删除流水账
     * @参数 null
     * @返回值：
     */
    Result remove(RunningAccountRemoveParam runningAccountRemoveParam);
}
