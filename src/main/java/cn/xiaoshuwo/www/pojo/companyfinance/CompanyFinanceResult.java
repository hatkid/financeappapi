package cn.xiaoshuwo.www.pojo.companyfinance;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * @文件名：CompanyFinanceResult.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：财务管理
 */
@Data
@ApiModel(value = "CompanyFinanceResult")
public class CompanyFinanceResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Integer id;

	@ApiModelProperty(value = "公司名字")
	private String companyName;

	@ApiModelProperty(value = "货款金额")
	private Double loanAmount;

	@ApiModelProperty(value = "年初欠款")
	private Double arrears;

	@ApiModelProperty(value = "已付款")
	private Double paid;

	@ApiModelProperty(value = "总欠款额")
	private Double totalArrears;

	@ApiModelProperty(value = "时间")
	private String timedate;

	@ApiModelProperty(value = "渠道：0-pc；1-小程序")
	private Integer channel = 1;
}
