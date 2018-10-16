package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

@Bean
	public	Employee employee(){
	Employee	bean	=	new	Employee();
	return	bean;
	}
@Bean
	public	Ramp ramp(){
	Ramp	bean	=	new	Ramp();
	return	bean;
	}
}
