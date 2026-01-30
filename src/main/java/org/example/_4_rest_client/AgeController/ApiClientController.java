package org.example._4_rest_client.AgeController;

import org.example._4_rest_client.model.AgeResponseReceived;
import org.example._4_rest_client.model.AgeResponseSend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.Date;

@RestController
public class ApiClientController {

    public final RestClient restClient;

    public ApiClientController(RestClient restClient) {
        this.restClient = restClient;
    }


    //http://localhost:8080/age/obb
    @GetMapping("/age/{name}")
    public AgeResponseSend makeApiCall(@PathVariable String name){
        //make api call using RestClient
        String apiURL = "https://api.agify.io/?name=" + name;
        AgeResponseReceived arr =
                restClient
                .get()
                .uri(apiURL)
                .header("Accept-Encoding","identity")
                .retrieve()
                .body(
                        AgeResponseReceived.class
                );
        AgeResponseSend ars = new AgeResponseSend();
        ars.setAge(arr.getAge());
        ars.setName(arr.getName());
        ars.setCount(arr.getCount());
        ars.setDate(new Date().toString());

        return ars;


    }
}
