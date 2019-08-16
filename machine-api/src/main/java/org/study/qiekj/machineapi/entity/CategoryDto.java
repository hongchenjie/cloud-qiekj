package org.study.qiekj.machineapi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by zenglingtao 2018/12/29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class CategoryDto {
	
	@ApiModelProperty("类型id")
	private Integer id;

	@ApiModelProperty("类型代码")
    private String categoryCode;

	@ApiModelProperty("类型名称")
    private String categoryName;

	@ApiModelProperty("是否显示<0：不可用 1：可用>")
    private Byte status;

	@ApiModelProperty("额外参数")
    private String extraAttr;

	@ApiModelProperty("创建时间")
    private Date createTime;

	@ApiModelProperty("修改时间")
    private Date updateTime;
}