package com.pwelagedara.springredisstarter;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class SampleRestController {

    @Cacheable(value = "post", key = "#id")
    @GetMapping("/{id}")
    public Post getPostByID(@PathVariable String id) {
        return new Post(id, UUID.randomUUID().toString());
    }

}
