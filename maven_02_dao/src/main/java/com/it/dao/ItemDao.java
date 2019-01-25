package com.it.dao;

import com.it.domain.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao {
    /**
     * 通过id查找
     * @param id
     * @return
     */
    Item findById(Integer id);
}
