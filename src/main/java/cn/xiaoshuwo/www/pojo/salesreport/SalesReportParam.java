package cn.xiaoshuwo.www.pojo.salesreport;

import cn.xiaoshuwo.www.pojo.PageBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @文件名：SalesReportParam.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：
 */
@Data
@ApiModel(value = "SalesReportParam")
public class SalesReportParam extends PageBase implements Serializable {

    @ApiModelProperty(value = "客户名称")
    private String customerName;

    @ApiModelProperty(value = "创建时间start")
    private String createTimeStart;

    @ApiModelProperty(value = "创建时间end")
    private String createTimeEnd;

}
