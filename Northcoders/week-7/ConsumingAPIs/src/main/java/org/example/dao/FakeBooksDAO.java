package org.example.dao;


import org.example.model.Author;
import org.example.model.Book;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Mono;

import java.util.List;

public class FakeBooksDAO {

    private final WebClient webClient;

    public FakeBooksDAO() {
        this.webClient = WebClient.builder()
                .baseUrl("https://fakerapi.it")
                .build();
    }



    public Mono<Book> getFakeBooksResponse() {

        WebClient client = WebClient.create("https://fakerapi.it/api/v1/books");
        Mono<Book> result = client.get()
                .uri("/books/").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Book.class);

        return result;
    }

    public List<Book> getBooks() {

        Mono<List<Book>> response = this.webClient.get()
                .uri("/api/v1/books")
                .retrieve()
                .bodyToFlux(Book.class)
                .collectList();


        return response.block();
    }


}
