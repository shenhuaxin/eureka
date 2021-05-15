package com.netflix.discovery.config;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.config.ConfigurationManager;
import com.netflix.discovery.util.InstanceInfoGenerator;
import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;



public class ConfigurationManagerTest {

    public static final String EUREKA_ENVIRONMENT = "eureka.environment";

    @Test
    public void testGetString() {
        System.setProperty(EUREKA_ENVIRONMENT, "prod");

        String env = ConfigurationManager.getConfigInstance().getString(
                EUREKA_ENVIRONMENT, "TEST");

        System.out.println(env);

    }
}
