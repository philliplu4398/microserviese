package com.plu.stock.dbserver.repository;

import com.plu.stock.dbserver.model.Quote;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {

    List<Quote> findByUserName(String username);
}
