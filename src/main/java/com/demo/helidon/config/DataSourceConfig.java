package com.demo.helidon.config;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.concurrent.atomic.AtomicReference;

@ApplicationScoped
public class DataSourceConfig {

    @Inject
    @ConfigProperty(name = "datasource.url")
    private String url;

    @Inject
    @ConfigProperty(name = "datasource.username")
    private String userName;

    @Inject
    @ConfigProperty(name = "datasource.password")
    private String password;

    public String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
