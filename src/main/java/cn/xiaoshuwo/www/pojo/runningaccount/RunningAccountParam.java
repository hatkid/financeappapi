package cn.xiaoshuwo.www.pojo.runningaccount;

import cn.xiaoshuwo.www.pojo.PageBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @文件名：RunningAccountParam.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：流水账
 */
@Data
@ApiModel(value = "RunningAccountParam")
public class RunningAccountParam  extends PageBase implements Serializable {


    @ApiModelProperty(value = "单位名称")
    private String companyName;

    @ApiModelProperty(value = "创建时间start")
    private String createTimeStart;

    @ApiModelProperty(value = "创建时间end")
    private String createTimeEnd;

}
