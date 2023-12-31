package com.example.demo0210;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String helloWorld() {
        System.out.println("Received request for /hello");
        String response = "Hello world from Spring Boot!";
        System.out.println("Sending response: " + response);
        return response;
    }

    @GetMapping("/reverse")
    public String reverseText(@RequestParam String text) {
        System.out.println("Received request for /reverse with text: " + text);
        StringBuilder sb = new StringBuilder(text);
        String response = sb.reverse().toString();
        System.out.println("Sending response: " + response);
        return response;
    }

    // operation that removes vowels from a string
    @GetMapping("/removeVowels")
    public String removeVowels(@RequestParam String text) {
        System.out.println("Received request for /removeVowels with text: " + text);
        String response = text.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Sending response: " + response);
        return response;
    }

    
}
