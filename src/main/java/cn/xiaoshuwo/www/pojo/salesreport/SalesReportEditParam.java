package cn.xiaoshuwo.www.pojo.salesreport;

import cn.xiaoshuwo.www.pojo.CommonEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @文件名：SalesReportEditParam.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：
 */
@Data
@ApiModel(value = "SalesReportEditParam")
public class SalesReportEditParam extends CommonEntity implements Serializable {

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "品名")
    private String teaName;

    @ApiModelProperty(value = "色别")
    private String color;

    @ApiModelProperty(value = "件数 套数")
    private Integer setCount;

    @ApiModelProperty(value = "发货件数")
    private Integer saleCount;

    @ApiModelProperty(value = "合计数量")
    private Integer totalCount;

    @ApiModelProperty(value = "单价")
    private Double price;

    @ApiModelProperty(value = "合计金额")
    private Double totalPrice;

    @ApiModelProperty(value = "小计")
    private String subtotal;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "时间")
    private String timedate;

}
