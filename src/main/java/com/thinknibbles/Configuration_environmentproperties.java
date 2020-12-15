package com.thinknibbles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "application.properties")
public class Configuration_environmentproperties {

    Environment environment;

    private final String TAG = " (Configuration_environmentproperties) ";
    private String sample_property;
    private final String sample_property_key = "sample.property";

    @Autowired
    public Configuration_environmentproperties(Environment environment) {
        this.environment = environment;
        this.sample_property = this.environment.getProperty(sample_property_key);
        System.out.println(TAG + "sample_property value = " + sample_property);
    }
    public String getSample_property(){
        return this.sample_property;
    }

}