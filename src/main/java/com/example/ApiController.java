package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {
    @GetMapping("/api/test")
    public ResponseEntity<Map<String, Object>> testApi(@RequestParam(value = "success", defaultValue = "true") boolean success) {
        Map<String, Object> result = new HashMap<>();
        result.put("success", success);
        if (success) {
            result.put("message", "요청이 성공적으로 처리되었습니다.");
            return ResponseEntity.ok(result);
        } else {
            result.put("message", "요청이 실패하였습니다.");
            return ResponseEntity.badRequest().body(result);
        }
    }
} 