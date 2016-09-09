package com.bincai.cloud.zipkin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

import com.google.common.collect.Tables;

import zipkin.server.ZipkinServerConfiguration;
@EnableZipkinStreamServer
@SpringBootApplication
@EnableEurekaClient
public class ZipkinServer {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServer.class, args);
		ZipkinServerConfiguration g;
		Tables b;
	}
}
