package org.study.machine.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.qiekj.common.dto.CategoryDto;

/**
 * Created by Administrator on 2019\2\21 0021.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @RequestMapping("/details/{code}")
    public CategoryDto details(@PathVariable("code") String code) {
        CategoryDto dto = new CategoryDto();
        dto.setCategoryCode("code2");
        System.out.println(dto);
        try {
            Thread.sleep(70000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dto;
    }
}
