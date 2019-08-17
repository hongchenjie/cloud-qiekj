package org.study.merchant.remote.impl;

import org.springframework.stereotype.Component;
import org.study.merchant.remote.CategoryRemoteService;
import org.study.qiekj.machineapi.entity.CategoryDTO;

/**
 * Created by Administrator on 2019\2\21 0021.
 */
@Component
public class CategoryRemoteServiceHystrix implements CategoryRemoteService {
    @Override
    public CategoryDTO details(String code) {
        CategoryDTO dto = new CategoryDTO();
        dto.setCategoryCode("code超时");
        dto.setCategoryName("name超时");
        return dto;
    }
}
