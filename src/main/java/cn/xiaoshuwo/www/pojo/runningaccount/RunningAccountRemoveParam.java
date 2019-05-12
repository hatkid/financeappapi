package cn.xiaoshuwo.www.pojo.runningaccount;

import cn.xiaoshuwo.www.pojo.CommonEntity;
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
@ApiModel(value = "RunningAccountRemoveParam")
public class RunningAccountRemoveParam extends CommonEntity implements Serializable {

    @ApiModelProperty(value = "id")
    private Integer id;
}
