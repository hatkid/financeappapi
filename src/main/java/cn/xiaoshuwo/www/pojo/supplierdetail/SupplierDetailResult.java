package cn.xiaoshuwo.www.pojo.supplierdetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @文件名：SupplierDetailResult.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：采购明细
 */
@Data
@ApiModel(value = "SupplierDetailResult")
public class SupplierDetailResult implements Serializable {


    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "采购名称")
    private String purchaseName;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "数量")
    private Integer amount;

    @ApiModelProperty(value = "单价")
    private Double price;

    @ApiModelProperty(value = "金额")
    private Double total;

    @ApiModelProperty(value = "已付款")
    private Double paid;

    @ApiModelProperty(value = "付款方式")
    private String payment;

    @ApiModelProperty(value = "公司名字")
    private String companyName;

    @ApiModelProperty(value = "时间")
    private String timedate;

}
