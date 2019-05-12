package cn.xiaoshuwo.www.pojo.companyfinance;

import cn.xiaoshuwo.www.pojo.PageBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
@ApiModel(value = "CompanyFinanceParam")
public class CompanyFinanceParam extends PageBase implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "公司名字")
	private String companyName;

}
