package com.github.hi_fi.examplelibrary.keywords;

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import org.apache.commons.codec.binary.Hex;

@RobotKeywords
public class Keywords {

    private String stored_variable = "Initial value";

    @RobotKeyword
    public String returnString() {
        return "Returning String";
    }

    @RobotKeyword
    public int returnInt() {
        return 1;
    }

    @RobotKeyword
    public double returnFloat() {
        return 1.1;
    }

    @RobotKeyword
    @ArgumentNames({ "file_name" })
    public byte[] returnImage(String fileName) throws IOException {
        return Files.readAllBytes(new File(fileName).toPath());
    }

    @RobotKeyword
    @ArgumentNames({ "file_name", "file_object"})
    public void writeFile(String fileName, byte[] fileData) throws IOException {
        OutputStream out = new FileOutputStream(fileName);
        out.write(fileData);
        out.close();
    }

    @RobotKeyword
    public String getStoredVariable() {
        return this.stored_variable;
    }

    @RobotKeyword
    @ArgumentNames({ "new_value "})
    public String setStoredVariable(String new_value) {
        this.stored_variable = new_value;
        return this.stored_variable;
    }

}