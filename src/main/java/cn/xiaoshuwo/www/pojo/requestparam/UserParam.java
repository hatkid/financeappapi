package cn.xiaoshuwo.www.pojo.requestparam;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @文件名：UserParam.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/4/27
 * @功能描述：用户登录接口请求参数
 */
@Data
public class UserParam {

    @ApiModelProperty(value = "姓名", required = true)
    private String userName;

    @ApiModelProperty(value = "密码", required = true)
    private String password;

    @ApiModelProperty(value = "用户id", hidden = true)
    private Integer userId;

}
