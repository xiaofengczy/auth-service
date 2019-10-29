package com.yunsom.auth.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Component
@Primary
public class SwaggerProvider implements SwaggerResourcesProvider {
    public static final String API_URI = "/v2/api-docs";

    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        resources.add(swaggerResource("用户中心", "/swagger-docs"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }
}
