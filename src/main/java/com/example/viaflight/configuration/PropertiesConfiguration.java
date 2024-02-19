package com.example.viaflight.configuration;

import com.example.viaflight.configuration.properties.KakaoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableConfigurationProperties({
	KakaoProperties.class
})
@PropertySource({
	"classpath:properties/kakao.properties"
})
public class PropertiesConfiguration {

}
