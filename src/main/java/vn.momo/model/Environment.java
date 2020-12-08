package vn.momo.model;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class Environment {
    public String PASSWORD;
    public String PHONE_NUMBER;

    private Environment() {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        PASSWORD = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("account.password");
        PHONE_NUMBER = EnvironmentSpecificConfiguration.from(environmentVariables)
                .getProperty("account.phoneNumber");
    }

    public static Environment instance() {
        return new Environment();
    }
}
