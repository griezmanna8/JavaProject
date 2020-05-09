package project.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PropertiesConfig {

    private static final String ACTIVE_PROFILE_PROPERTY_NAME = "spring.config.profile";

    private static final String TOMCAT_BASE_PROPERTY_NAME = "catalina.base";

    @Bean
    public static PropertyPlaceholderConfigurer properties() {
        final PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();

        final List<Resource> resList = new ArrayList<>();

        resList.add(new ClassPathResource("application.properties"));
        String profile = System.getProperty(ACTIVE_PROFILE_PROPERTY_NAME);
        if (StringUtils.hasText(profile)) {
            resList.add(new ClassPathResource(String.format("application-%s.properties", profile)));
        }
        String base = System.getProperty(TOMCAT_BASE_PROPERTY_NAME);
        if (StringUtils.hasText(base)) {
            resList.add(new FileSystemResource(base + "/conf/application.properties"));
        }

        ppc.setLocations(resList.toArray(new Resource[resList.size()]));

        ppc.setLocalOverride(true);

        return ppc;
    }
}
