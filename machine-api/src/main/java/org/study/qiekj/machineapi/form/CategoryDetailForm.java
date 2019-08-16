package org.study.qiekj.machineapi.form;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.study.qiekj.common.form.BaseForm;

/**
 * @author: 李坡
 * @date: 2019/1/26 16:31
 */
@Data
@ApiModel
public class CategoryDetailForm extends BaseForm {
    private String code;
}
