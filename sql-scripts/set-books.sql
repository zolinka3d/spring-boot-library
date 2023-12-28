USE `library`;

-- insert books {
--     "title": "20.000 Leagues Under The Sea",
--     "cover": "https://wolnelektury.pl/media/book/cover_api_thumb/20-000-mil-podmorskiej-zeglugi_4tC1gOu.jpg",
--     "description": "Twenty Thousand Leagues Under the Sea tells the story of three men who go to sea in search of a giant whale. They are taken prisoner on board the world's first submarine – the Nautilus. The Nautilus travels through the world's seas. The men see amazing deep-sea creatures, and they travel to remote islands.",
--     "releaseDate": "1954-01-01"
-- }

INSERT INTO `book` (`title`, `cover`, `description`, `release_date`)
VALUES
    ( '20.000 Leagues Under The Sea',
     'https://wolnelektury.pl/media/book/cover_api_thumb/20-000-mil-podmorskiej-zeglugi_4tC1gOu.jpg',
     'Twenty Thousand Leagues Under the Sea tells the story of three men who go to sea in search of a giant whale. They are taken prisoner on board the world''s first submarine – the Nautilus. The Nautilus travels through the world''s seas. The men see amazing deep-sea creatures, and they travel to remote islands.',
        '1954-01-01'
    );
