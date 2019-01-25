package com.it.service.impl;

import com.it.dao.ItemDao;
import com.it.domain.Item;
import com.it.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    /**
     * 通过id查询
     * @param id
     * @return
     */
    public Item findById(Integer id) {
        return itemDao.findById(id);
    }
}
