package com.ista.posapi.service;

import com.ista.posapi.entity.ItemFactura;

import java.util.List;

public interface ItemFacturaService {
    List<ItemFactura> findAll();
    ItemFactura findById(Long id);
    ItemFactura save(ItemFactura entity);
    void deleteById(Long id);
}
