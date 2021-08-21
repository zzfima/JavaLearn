package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class TrackzillaController {
    //  *** Get Mappings ***
    @GetMapping("/tali")
    public String tali(@RequestParam(value = "name", defaultValue = "Tali, she is monster") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/eden")
    public String eden(@RequestParam(value = "name", defaultValue = "Eden, she is princess") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/yael")
    public String yael(@RequestParam(value = "name", defaultValue = "Yael, she is bomba") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/")
    public String home() {
        return "Hello. Use: /eden, /yael or /tali";
    }

    // *** Post mapping ***
    @PostMapping("/application")
    public ResponseEntity<String> HHH() {
        return new ResponseEntity<>("posted", HttpStatus.OK);
    }

    // *** Delete mapping ***
    @DeleteMapping("/application")
    public ResponseEntity<String> DDD() {
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }

    // *** Put mapping ***
    @PutMapping("/application")
    public ResponseEntity<String> PPP() {
        return new ResponseEntity<>("put", HttpStatus.OK);
    }
}