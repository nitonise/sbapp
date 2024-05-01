package dev.fun.sbapp.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {

    private final AtomicInteger counter;

    public Controller() {
        this.counter = new AtomicInteger(0);
    }

    @GetMapping("/")
    public ResponseEntity<String> getResponse() {
        var msg = "Spring Boot App call #" + counter.incrementAndGet() + "\n";
        return ResponseEntity.ofNullable(msg);
    }
}
