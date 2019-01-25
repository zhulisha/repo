package com.it.service;

import com.it.domain.Item;

public interface ItemService {
    /**
     * 通过id查找
     * @param id
     * @return
     */
    Item findById(Integer id);
}
