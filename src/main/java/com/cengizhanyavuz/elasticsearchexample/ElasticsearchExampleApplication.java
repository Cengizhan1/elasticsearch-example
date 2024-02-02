package com.cengizhanyavuz.elasticsearchexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
public class ElasticsearchExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchExampleApplication.class, args);
	}

}
