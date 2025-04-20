package openApiGeneratorDemo.demo.api;


import com.exemple.model.pets.Produit;
import com.exemple.pets.ProduitApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
@RestController
public class ProduitControllerApi implements ProduitApi {

    @Override
    public ResponseEntity<List<Produit>> getAllProduits() {
        Produit produit = new Produit();
        produit.setId(1L);
        produit.code("Produit 1");
        List<Produit> produits = List.of(produit);
        return ResponseEntity.ok(produits);
    }
}
