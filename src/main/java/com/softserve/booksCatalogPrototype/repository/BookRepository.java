package com.softserve.booksCatalogPrototype.repository;


import com.softserve.booksCatalogPrototype.model.Author;
import com.softserve.booksCatalogPrototype.model.Book;
import com.softserve.booksCatalogPrototype.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    List<Book> findBooksByAuthors(Author author);

    List<Book> findAllByRateIsNotNull(Pageable pageable);

    List<Book> findAllByRateIs(int rate, Pageable pageable);

    Book findBookByReviewsIs(Review review);

}
