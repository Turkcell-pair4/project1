package com.turkcell.pairproject1.services.concretes;

import com.turkcell.pairproject1.core.exception.types.BusinessException;
import com.turkcell.pairproject1.dtos.requests.BasketItemRequests.BasketItemSaveRequest;
import com.turkcell.pairproject1.dtos.requests.BasketItemRequests.BasketItemUpdateRequest;
import com.turkcell.pairproject1.entities.Basket;
import com.turkcell.pairproject1.entities.BasketItem;
import com.turkcell.pairproject1.entities.Category;
import com.turkcell.pairproject1.entities.Product;
import com.turkcell.pairproject1.repositories.BasketItemRepository;
import com.turkcell.pairproject1.services.abstracts.BasketItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BasketItemServiceImpl implements BasketItemService {

    private final BasketItemRepository basketItemRepository;
    @Override
    public BasketItem findById(int id) {
        Optional<BasketItem> basketItem = basketItemRepository.findById(id);

        if(basketItem.isEmpty()) {
            throw new BusinessException("İlgili Id'ye sahip sepet ürünü bulunamadı!");
        }

        return basketItem.get();
    }

    @Override
    public List<BasketItem> findAll() {
        return basketItemRepository.findAll();
    }

    @Override
    public BasketItem save(BasketItemSaveRequest request) {
        BasketItem basketItem = new BasketItem();

        basketItem.setAmount(request.amount());;
        basketItem.setProduct(request.product());
        basketItem.setAmount(request.amount());

        return basketItem;
    }

    @Override
    public BasketItem update(int id, BasketItemUpdateRequest request) {
        Optional<BasketItem> basketItem = basketItemRepository.findById(id);

        if(basketItem.isEmpty()) {
            throw new BusinessException("İlgili Id'ye ait sepet ürünü bulunamadı");
        }

        BasketItem updatedBasketItem = basketItem.get();

        updatedBasketItem.setId(request.id());
        updatedBasketItem.setBasket(request.basket());
        updatedBasketItem.setProduct(request.product());
        updatedBasketItem.setAmount(request.amount());

        updatedBasketItem = basketItemRepository.save(updatedBasketItem);

        return updatedBasketItem;
    }

    @Override
    public void delete(int id) {
        Optional<BasketItem> basketItem = basketItemRepository.findById(id);

        if(basketItem.isEmpty()) {
            throw new BusinessException("İlgili Id'ye sahip sepet ürünü bulunamadı!");
        }

        basketItemRepository.delete(basketItem.get());
    }
}
