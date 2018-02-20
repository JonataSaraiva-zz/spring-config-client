package br.com.own.application.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DataSourceConfigurationController {

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.url}")
    private String url;

    @GetMapping("/datasource")
    public ResponseEntity configurations(){
        Map<String, String> response = new HashMap<>();
        response.put("username", username);
        response.put("password", password);
        response.put("url", url);

        return ResponseEntity.ok(response);
    }

}
