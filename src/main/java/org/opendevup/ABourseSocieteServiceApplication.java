package org.opendevup;

import java.util.stream.Stream;

import org.opendevup.dao.SocieteRepository;
import org.opendevup.entities.Societe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@EnableEurekaClient
@SpringBootApplication
public class ABourseSocieteServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ABourseSocieteServiceApplication.class, args);
		SocieteRepository sr = ctx.getBean(SocieteRepository.class);
		Stream.of("A","B","C").forEach(s->sr.save(new Societe(s)));
		sr.findAll().forEach(s->System.out.println(s.getNomSociete()));
	}
}

@Configuration
class MyConf extends RepositoryRestMvcConfiguration{
	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Societe.class);
	}
}
