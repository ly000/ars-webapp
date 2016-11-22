/*package edu.myan.config;

import edu.myan.filter.ApiFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean dispatcherRegistration(){
		ApiFilter apiFilter = new ApiFilter();
		FilterRegistrationBean registration = new FilterRegistrationBean(apiFilter);
		registration.addUrlPatterns("/api*//*");
		registration.setName("apiFilter");
		return registration;
	}
	
}*/
