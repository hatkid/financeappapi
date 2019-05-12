package cn.xiaoshuwo.www.pojo.companyfinance;

import cn.xiaoshuwo.www.pojo.CommonEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
@ApiModel(value = "CompanyFinanceEditParam")
public class CompanyFinanceEditParam extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Integer id;

	@ApiModelProperty(value = "公司名字")
	private String companyName;

	@ApiModelProperty(value = "年初欠款")
	private Double arrears;

}
