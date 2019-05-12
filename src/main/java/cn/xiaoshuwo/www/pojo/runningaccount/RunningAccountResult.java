package cn.xiaoshuwo.www.pojo.runningaccount;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @文件名：RunningAccountResult.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：流水账
 */
@Data
@ApiModel(value = "RunningAccountResult")
public class RunningAccountResult {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "费用属性")
    private String costAttribute;

    @ApiModelProperty(value = "属性类别")
    private String costAttributeType;

    @ApiModelProperty(value = "单位名称")
    private String companyName;

    @ApiModelProperty(value = "项目")
    private String projectName;

    @ApiModelProperty(value = "摘要")
    private String abstractContent;

    @ApiModelProperty(value = "入账（借）")
    private Double entrys;

    @ApiModelProperty(value = "出账（贷）")
    private Double outs;

    @ApiModelProperty(value = "支付方式")
    private String payment;

    @ApiModelProperty(value = "收款人")
    private String payee;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "时间")
    private String timedate;

}
