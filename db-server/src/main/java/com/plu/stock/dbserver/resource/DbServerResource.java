package com.plu.stock.dbserver.resource;

import java.util.List;
import java.util.stream.Collectors;

import com.plu.stock.dbserver.model.Quote;
import com.plu.stock.dbserver.repository.QuotesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/db")
public class DbServerResource {

    private QuotesRepository quotesRepository;

    public DbServerResource(QuotesRepository quoteRepository){
        this.quotesRepository = quoteRepository;
    }
    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable("username")
                                      final String username){

        return quotesRepository.findByUserName(username)
                                             .stream()
                                            .map(Quote::getQuote)
                                            .collect(Collectors.toList());

    }

    @PostMapping("/add")
    public List<Quote> add(@RequestBody final Quote quotes){

        return null;
    }


}
