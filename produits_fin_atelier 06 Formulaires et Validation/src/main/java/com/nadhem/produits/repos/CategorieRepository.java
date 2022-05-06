package com.nadhem.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadhem.produits.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
