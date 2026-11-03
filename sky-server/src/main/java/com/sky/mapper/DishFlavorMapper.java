package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 标记这是一个MyBatis的Mapper接口
public interface DishFlavorMapper {
    /**
     * 批量保存口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
