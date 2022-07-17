package com.company.work.util;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;

@UtilityClass
public class ReadConf {

    @SneakyThrows
    public <T> T readSet (String filePath, Class<T> clazz){
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        return objectMapper.readValue(new File(filePath), clazz);
    }
}
