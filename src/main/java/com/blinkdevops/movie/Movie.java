package com.blinkdevops.movie;

import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@NoArgsConstructor
public record Movie(
        @Id ObjectId id,
        String imdbId,
        String title,
        String releaseDate,
        String trailerLink,
        String poster,
        List<String> genres,
        List<String> backdrops,
        @DocumentReference List<Review> reviewsId) {
}
