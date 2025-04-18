package com.company.dropwizard;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class dropwizardConfiguration extends Configuration {
    // TODO: implement service configuration
    @JsonProperty
    private String mySetting;

    public String getMySetting() {
        return mySetting;
    }

    public void setMySetting(String mySetting) {
        this.mySetting = mySetting;
    }
}
