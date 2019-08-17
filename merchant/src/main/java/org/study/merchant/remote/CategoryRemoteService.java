package org.study.merchant.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.study.merchant.cfg.FeignConfig;
import org.study.merchant.remote.impl.CategoryRemoteServiceHystrix;
import org.study.qiekj.machineapi.entity.CategoryDTO;

/**
 * 类型
 * @author zenglingtao
 */
@FeignClient(value = "machine", fallback = CategoryRemoteServiceHystrix.class, configuration = FeignConfig.class)
public interface CategoryRemoteService {

	@RequestMapping(value = "/category/details/{code}", method = RequestMethod.GET)
	CategoryDTO details(@PathVariable("code") String code);
}
