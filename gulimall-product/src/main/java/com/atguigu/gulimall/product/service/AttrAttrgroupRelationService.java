package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author zhanbp
 * @email zhanbp_swufer@163.com
 * @date 2022-03-13 21:35:15
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

