package org.study.merchant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.study.merchant.remote.CategoryRemoteService;
import org.study.qiekj.machineapi.entity.CategoryDTO;

/**
 * Created by Administrator on 2019\2\21 0021.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryRemoteService categoryRemoteService;

    //http://localhost:8080/category/details/asd
    @RequestMapping("/details/{code}")
    public CategoryDTO details(@PathVariable("code") String code) {
        CategoryDTO details = categoryRemoteService.details(code);
        System.out.println(details);
        return details;
    }

}
