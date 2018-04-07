package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;
import reactor.core.publisher.Mono;


@RestController
@EnableAutoConfiguration
public class DemoController {

    String base = "https://sr-config.westus.cloudapp.azure.com/v1";
    String consulToken = "X-Consul-Token";
    String kvToken = "b45ca485-9a2e-68bd-d47a-c6b4f2dbe56b";

    @GetMapping("/")
    Mono<String> home() {
        String kv = "/kv/dev/test";
        Mono<String> json = web().get().uri(kv).accept(MediaType.APPLICATION_JSON_UTF8)
                .exchange() //.log()
                .flatMap(r -> process(r));
        return json;
    }

    Mono<String> process(ClientResponse r) {
        return r.bodyToMono(String.class);
    }

    WebClient web() {
        return WebClient.builder().baseUrl(base)
                .defaultHeader(consulToken, kvToken)
                .build();
    }

}

//                .flatMap(r -> r.bodyToMono(String.class));

//        .retrieve()
//                .bodyToMono(String.class);

//        .block();
//System.out.println("======\n" + json + "\n========");
//        try {
//        } catch (WebClientException ex) {
//            // ClientResponse has erroneous status code: 404 Not Found
//            //System.out.println(ex.getMessage());
//            return Mono<String> ex.getMessage();
//        }

// [{"LockIndex":0,"Key":"dev/foo","Flags":0,"Value":"NDI=","CreateIndex":146,"ModifyIndex":146}]

//    private Mono<String> getPeopleRsp(Long id) {
//
//        String url = "https://swapi.co/api/people/" + id + "/?format=json";
//
//        return webClient.get().uri(url).accept(MediaType.APPLICATION_JSON_UTF8).header("User-Agent", "Chrome")
//
//                .exchange().log().flatMap(r -> r.bodyToMono(String.class));
//
//    }

