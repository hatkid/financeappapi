package cn.xiaoshuwo.www.pojo.companyfinance;

import cn.xiaoshuwo.www.pojo.CommonEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


@Data
@ApiModel(value = "CompanyFinanceRemoveParam")
public class CompanyFinanceRemoveParam extends CommonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Integer id;

}
