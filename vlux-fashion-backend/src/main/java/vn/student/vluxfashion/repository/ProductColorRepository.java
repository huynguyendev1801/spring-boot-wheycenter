package vn.student.vluxfashion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.student.vluxfashion.model.ProductColor;

@Repository  
public interface ProductColorRepository extends JpaRepository<ProductColor, Integer>{
    
}