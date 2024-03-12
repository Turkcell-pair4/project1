package com.turkcell.pairproject1.services.concretes;
import com.turkcell.pairproject1.dtos.requests.SellerRequests.SellerSaveRequest;
import com.turkcell.pairproject1.dtos.requests.SellerRequests.SellerUpdateRequest;
import com.turkcell.pairproject1.mappers.SellerMapper;
import com.turkcell.pairproject1.services.abstracts.SellerService;
import com.turkcell.pairproject1.repositories.SellerRepository;
import org.springframework.stereotype.Service;
import com.turkcell.pairproject1.entities.Seller;
import java.util.List;
import java.util.Optional;

@Service
public class SellerServiceImpl implements SellerService{
    // Implement the methods
    private final SellerRepository sellerRepository;
    public SellerServiceImpl(SellerRepository sellerRepository)
    {
        this.sellerRepository = sellerRepository;
    }

    public Seller save(Seller seller){
        return sellerRepository.save(seller);
    }
    public Seller findById(int id){
        Optional<Seller> sellerOptinal = sellerRepository.findById(id);
        if(sellerOptinal.isEmpty()) {
            throw new RuntimeException("Seller with this id -> " + id +" does not exist");
        }

        return sellerOptinal.get();
    }
    public List<Seller> findAll(){
        List<Seller> sellers = sellerRepository.findAll();
        if(sellers.isEmpty())
        {
            throw new RuntimeException("Seller does not exist");
        }
        return sellers;
    }

    @Override
    public Seller update(int id, Seller seller) {
        Optional<Seller> sellerOptional = sellerRepository.findById(id);
        if(sellerOptional.isEmpty()) {
            throw new RuntimeException("Seller does not exist");
        }

        Seller sellerToUpdate = sellerOptional.get();
        sellerToUpdate = sellerRepository.save(seller);
        return sellerToUpdate;
    }

    @Override
    public void delete(int id) {
        Optional<Seller> seller = sellerRepository.findById(id);
        if(seller.isEmpty()) {
            throw new RuntimeException("Seller with id " + id + " does not exist");
        }
        sellerRepository.delete(seller.get());
    }
}
