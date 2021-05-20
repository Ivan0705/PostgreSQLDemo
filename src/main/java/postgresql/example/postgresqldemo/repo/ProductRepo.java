package postgresql.example.postgresqldemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import postgresql.example.postgresqldemo.model.Product;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findAllByName(String name);
}
