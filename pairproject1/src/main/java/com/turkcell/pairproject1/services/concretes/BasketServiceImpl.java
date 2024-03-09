package com.turkcell.pairproject1.services.concretes;
import com.turkcell.pairproject1.dtos.requests.BasketRequests.BasketSaveRequest;
import com.turkcell.pairproject1.dtos.requests.BasketRequests.BasketUpdateRequest;
import com.turkcell.pairproject1.entities.Basket;
import com.turkcell.pairproject1.entities.BasketItem;
import com.turkcell.pairproject1.services.abstracts.BasketService;
import com.turkcell.pairproject1.repositories.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BasketServiceImpl implements BasketService {

    private final BasketRepository basketRepository;


    @Override
    public Basket findById(int id) {
        Optional<Basket> basket = basketRepository.findById(id);

        if(basket.isEmpty()) {
            throw new RuntimeException("Not found");
        }

        return basket.get();

    }

    @Override
    public List<Basket> findAll() {
        return basketRepository.findAll();
    }

    @Override
    public Basket save(BasketSaveRequest request) {
        Basket basket = new Basket();
        basket.setCustomer(request.customer());
        basket.setTotalPrice(request.totalPrice());
        basket.setQuantity(request.quantity());

        return basket;
    }

    @Override
    public Basket update(int id, BasketUpdateRequest request) {
        Optional<Basket> basket = basketRepository.findById(id);

        if(basket.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye sahip sepet bulunamadı!");
        }

        Basket updatedBasket = basket.get();
        updatedBasket.setId(request.id());
        updatedBasket.setCustomer(request.customer());
        updatedBasket.setTotalPrice(request.totalPrice());
        updatedBasket.setQuantity(request.quantity());

        updatedBasket = basketRepository.save(updatedBasket);

        return updatedBasket;
    }

    @Override
    public void delete(int id) {
        Optional<Basket> basket = basketRepository.findById(id);

        if(basket.isEmpty()) {
            throw new RuntimeException("İlgili Id'ye sahip sepet bulunamadı!");
        }

        basketRepository.delete(basket.get());
    }
}
