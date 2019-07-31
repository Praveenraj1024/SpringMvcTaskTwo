package main.com.stackroute.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
//It indicates the Spring to process this class,
// because it contains @Bean definition methods
@ComponentScan(basePackages ="com.stackroute")
//It indicates the spring to scan the mentioned base package
//and its subpackages.
@EnableWebMvc
//It imports the spring mvc configurations.
public class WebConfig {

    @Bean//It returns the bean(object) which can be managed by spring.
    /*
    This method returns the ViewResolver object for the mentioned prefix and suffix.
     */
    public ViewResolver viewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        //internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }
}
