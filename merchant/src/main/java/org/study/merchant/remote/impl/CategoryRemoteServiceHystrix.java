package org.study.merchant.remote.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.study.merchant.remote.CategoryRemoteService;
import org.study.qiekj.common.dto.CategoryDto;

/**
 * Created by Administrator on 2019\2\21 0021.
 */
@Component
public class CategoryRemoteServiceHystrix implements CategoryRemoteService {
    @Override
    public CategoryDto details(String code) {
        CategoryDto dto = new CategoryDto();
        dto.setCategoryCode("code超时");
        dto.setCategoryName("name超时");
        return dto;
    }
}
