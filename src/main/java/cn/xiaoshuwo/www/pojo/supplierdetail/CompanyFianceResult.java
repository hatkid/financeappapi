package cn.xiaoshuwo.www.pojo.supplierdetail;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @文件名：CompanyFianceParam.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：
 */
@Data
@ApiModel(value = "CompanyFianceResult")
public class CompanyFianceResult {

    @ApiModelProperty(value = "公司id")
    private Integer id;

    @ApiModelProperty(value = "公司名字")
    private String companyName;
}
