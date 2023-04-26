package com.pythagorasweb.springwithtest.Repository;

import com.pythagorasweb.springwithtest.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
