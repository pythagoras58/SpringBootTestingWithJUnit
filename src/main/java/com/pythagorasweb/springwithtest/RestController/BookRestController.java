package com.pythagorasweb.springwithtest.RestController;

import com.pythagorasweb.springwithtest.Repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookRestController {

    private final BookRepository bookRepository;


}
