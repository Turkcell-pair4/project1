package com.example.odev.services.concretes;
import com.example.odev.services.abstracts.SellerService;
import com.example.odev.repositories.concretes.SellerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.odev.entities.Seller;
import java.util.List;
@Service
public class SellerServiceImpl implements SellerService{
    // Implement the methods
    @Autowired
    private SellerRepositoryImpl sellerRepository;
    public void createSeller(Seller seller){
        sellerRepository.save(seller);
    }
    public Seller getSellerById(Long id){
        return sellerRepository.get(id);
    }
    public List<Seller> getAllSellers(){
        return sellerRepository.getAll();
    }
}
