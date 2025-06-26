package com.ista.posapi.service;

import com.ista.posapi.entity.ItemFactura;
import com.ista.posapi.repository.ItemFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemFacturaServiceImpl implements ItemFacturaService {

    @Autowired
    private ItemFacturaRepository itemFacturaRepository;

    @Override
    public List<ItemFactura> findAll() {
        return itemFacturaRepository.findAll();
    }

    @Override
    public ItemFactura findById(Long id) {
        return itemFacturaRepository.findById(id).orElse(null);
    }

    @Override
    public ItemFactura save(ItemFactura item) {
        return itemFacturaRepository.save(item);
    }

    @Override
    public void deleteById(Long id) {
        itemFacturaRepository.deleteById(id);
    }
}
