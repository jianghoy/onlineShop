package com.jianghoy.onlineShop.onlineshopserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DataSourceConfig.class})
public class OnlineShopServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopServerApplication.class, args);
	}

}
