package com.turkcell.pairproject1.controllers;

import com.turkcell.pairproject1.dtos.requests.BasketItemRequests.BasketItemSaveRequest;
import com.turkcell.pairproject1.dtos.requests.BasketItemRequests.BasketItemUpdateRequest;
import com.turkcell.pairproject1.entities.BasketItem;
import com.turkcell.pairproject1.services.abstracts.BasketItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/basket-items")
public class BasketItemController {

    private final BasketItemService basketItemService;

    public BasketItemController(BasketItemService basketItemService) {
        this.basketItemService = basketItemService;
    }

    @GetMapping
    public List<BasketItem> getAll() {
        return basketItemService.findAll();
    }

    @GetMapping("/{id}")
    public BasketItem getById(int id) {
        return basketItemService.findById(id);
    }

    @PutMapping("/{id}")
    public BasketItem update(@PathVariable int id , @RequestBody BasketItemUpdateRequest request) {
        return basketItemService.update(id,request);
    }

    @PostMapping
    public BasketItem save(@RequestBody BasketItemSaveRequest request) {
        return basketItemService.save(request);
    }


    @DeleteMapping("/{id}")
    public void delete(int id) {
        basketItemService.delete(id);
    }




}
