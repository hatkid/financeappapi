package cn.xiaoshuwo.www.pojo.supplierdetail;

import cn.xiaoshuwo.www.pojo.PageBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @文件名：SupplierDetailParam.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/5/12
 * @功能描述：采购明细
 */
@Data
@ApiModel(value = "SupplierDetailParam")
public class SupplierDetailParam extends PageBase implements Serializable {

    @ApiModelProperty(value = "创建时间start")
   private String createTimeStart;

    @ApiModelProperty(value = "创建时间end")
    private String createTimeEnd;

    @ApiModelProperty(value = "公司id")
    private Integer companyId;

}
