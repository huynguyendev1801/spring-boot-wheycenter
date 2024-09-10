package vn.student.vluxfashion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.student.vluxfashion.model.ProductSize;

@Repository  
public interface ProductSizeRepository extends JpaRepository<ProductSize, Integer>{
}
