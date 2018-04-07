package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.util.Base64Utils;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

// https://www.callicoder.com/spring-5-reactive-webclient-webtestclient-examples/

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DemoApplication.class, args);
		//test();

		SpringApplication.run(DemoController.class, args);
	}


//	static void test() {
//
//		String base = "https://sr-config.westus.cloudapp.azure.com/v1";
//		String consulToken = "X-Consul-Token";
//		String kvToken = "b45ca485-9a2e-68bd-d47a-c6b4f2dbe56b";
//		String kv = "/kv/dev/foo";
//
//		WebClient webClient = WebClient.builder()
//				.baseUrl(base)
//				.defaultHeader(consulToken, kvToken)
//				.build();
//
//		String res = webClient.get()
//				.uri(kv)
//				.retrieve()
//				.bodyToMono(String.class)
//				.block();
//
//		System.out.println("======\n" + res + "\n========");
//
//	}

}


/*
//				.baseUrl("https://api.github.com")
//				.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/vnd.github.v3+json")
//				.defaultHeader(HttpHeaders.USER_AGENT, "Spring 5 WebClient")

//				.header("Authorization", "Basic " + Base64Utils
//						.encodeToString((username + ":" + token).getBytes(UTF_8)))
		WebClient client = WebClient
				.builder()
				.baseUrl(host)
				.defaultHeader(consulToken, kvToken)
				//.defaultCookie("cookieKey", "cookieValue")
				//.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				//.defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
				.build();

		WebClient.RequestHeadersUriSpec<?> request1 = client.get();
		//WebClient.UriSpec<WebClient.RequestBodySpec> request2 = client.post();

		WebClient.RequestBodySpec uri1 = client
				.method(HttpMethod.GET)
				.uri(kv);

		String res = request1.retrieve()
				.onStatus(HttpStatus::is3xxRedirection, clientResponse ->
						Mono.error(new RuntimeException("ERROR " + clientResponse.statusCode())
				))
				.bodyToMono(String.class)
				.block();

		System.out.println(res);
*/
