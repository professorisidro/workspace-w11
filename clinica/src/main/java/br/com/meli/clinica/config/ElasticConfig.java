package br.com.meli.clinica.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configuration
public class ElasticConfig extends ElasticsearchConfiguration{

	@Override
	public ClientConfiguration clientConfiguration() {
		// TODO Auto-generated method stub
		return ClientConfiguration.builder()
					.connectedTo("localhost:9200")
					.usingSsl("722813515166338379cba9737638d622387e0db9de0517417f0831c0b9a8e19d")
					.withBasicAuth("elastic", "elastic")
					.build();
	}

}
