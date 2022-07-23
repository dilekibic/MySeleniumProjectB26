package com.cydeo.selenium.day13_configurationReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_properties {

    @Test
    public void reading_from_properties_file() throws IOException {

        // Create Properties class' object.
        // We need properties class to use getProperty("key") method
        Properties properties = new Properties();

        // Create FileInputStream object to open file as a stream in Java memory.
        FileInputStream file = new FileInputStream("configuration.properties");

        // Load "properties" object with the "file" we opened using FileInputStream
        properties.load(file);

        // We can use properties.getProperty method to read from the file we loaded. (configuration.properties)
        properties.getProperty("");

    }
}
