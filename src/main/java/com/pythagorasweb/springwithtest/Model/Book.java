package com.pythagorasweb.springwithtest.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "book_record")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;

    @NonNull
    private String name;

    @NonNull
    private String summary;

    @NonNull
    private int rating;
}
