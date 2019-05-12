package cn.xiaoshuwo.www.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lvzhi
 * @version 创建时间：2019年3月5日 上午10:40:14
 * @ClassName 类名称
 * @Description 类描述
 */
@Data
@ApiModel(value = "CommonEntity")
public class CommonEntity implements Serializable {

	private static final long serialVersionUID = 4431397413864840169L;

	@ApiModelProperty(value = "创建者", hidden = true)
	private Long row_creater;

	@ApiModelProperty(value = "编辑者", hidden = true)
	private Long row_modifier;

	@ApiModelProperty(value = "创建时间", hidden = true)
	private String row_create_time;

	@ApiModelProperty(value = "修改时间", hidden = true)
	private String row_modify_time;

	@ApiModelProperty(value = "行状态", hidden = true)
	private Integer row_state;
}
