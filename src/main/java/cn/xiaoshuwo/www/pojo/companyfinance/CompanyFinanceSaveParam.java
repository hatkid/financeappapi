package cn.xiaoshuwo.www.pojo.companyfinance;

import cn.xiaoshuwo.www.pojo.CommonEntity;
import cn.xiaoshuwo.www.pojo.PageBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
@ApiModel(value = "CompanyFinanceSaveParam")
public class CompanyFinanceSaveParam extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "公司名字")
	private String companyName;

	@ApiModelProperty(value = "年初欠款")
	private Double arrears;

	@ApiModelProperty(value = "渠道：0-pc；1-小程序")
	private Integer channel = 1;

}
