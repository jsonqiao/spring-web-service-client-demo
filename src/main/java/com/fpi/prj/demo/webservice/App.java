package com.fpi.prj.demo.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.fpi.prj.demo.webservice.wsdl.interfaces.GetCityForecastByZIPResponse;

/**
 * spring webservice client
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(WeatherConfiguration.class, args);

		WeatherClient weatherClient = ctx.getBean(WeatherClient.class);

		String zipCode = "94304";
		if (args.length > 0) {
			zipCode = args[0];
		}
		GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
		weatherClient.printResponse(response);
	}
}
