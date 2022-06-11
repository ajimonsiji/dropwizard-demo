package com.learning;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotEmpty;
import com.learning.models.modelClassOne;

import java.nio.file.Files;
import java.nio.file.Paths;

public class configurationClass extends Configuration {

    private modelClassOne modelClassOne;
    @NotEmpty
    private String configName;
    
    private String filePath;

    @JsonCreator
    public configurationClass(@JsonProperty("filePath") String filePath){
        ObjectMapper objectMapper=new ObjectMapper();
        try{
            modelClassOne = objectMapper.readValue(Files.readAllBytes(Paths.get(filePath)),modelClassOne.class);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
