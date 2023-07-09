package com.imooc.mapper;

import com.imooc.pojo.vo.ItemCommentVO;
import com.imooc.pojo.vo.SearchItemsVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@Component
public interface ItemsMapperCustom {

    /**
     * -
     *
     * @param map -
     * @return -
     */
    List<ItemCommentVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);


    /**
     * -
     *
     * @param map -
     * @return -
     */
    List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map);


}