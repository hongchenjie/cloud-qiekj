package org.study.merchant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.qiekj.common.dto.CategoryDto;
import org.study.merchant.remote.CategoryRemoteService;

/**
 * Created by Administrator on 2019\2\21 0021.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryRemoteService categoryRemoteService;

    @RequestMapping("/details/{code}")
    public CategoryDto details(@PathVariable("code") String code) {
        CategoryDto details = categoryRemoteService.details(code);
        System.out.println(details);
        return details;
    }

}
