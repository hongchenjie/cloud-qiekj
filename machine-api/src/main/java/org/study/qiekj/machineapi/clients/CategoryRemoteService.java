package org.study.qiekj.machineapi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.study.qiekj.machineapi.entity.CategoryDto;

/**
 * 类型
 * @author zenglingtao
 */
@FeignClient("machine")
public interface CategoryRemoteService {

	@RequestMapping(value = "/category/details/{code}", method = RequestMethod.GET)
	CategoryDto details(@PathVariable("code") String code);
}