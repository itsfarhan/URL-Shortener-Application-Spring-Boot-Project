package com.farhan.url_shortener_springboot.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.farhan.url_shortener_springboot.domain.entities.ShortUrl;
import com.farhan.url_shortener_springboot.domain.repositories.ShortUrlRepository;

@Service
public class ShortUrlService {
    private final ShortUrlRepository shortUrlRepository;

    public ShortUrlService(ShortUrlRepository shortUrlRepository) {
        this.shortUrlRepository = shortUrlRepository;
    }

    public List<ShortUrl> findAllPublicShortUrls() {
        return shortUrlRepository.findPublicShortUrls();
    }
}