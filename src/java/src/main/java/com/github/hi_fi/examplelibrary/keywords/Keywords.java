package com.github.hi_fi.examplelibrary.keywords; 

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

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
        File myFile = new File(fileName);
        byte[] myByteArray = new byte[(int) myFile.length()];
        FileInputStream fileInputStream = new FileInputStream(myFile);
        fileInputStream.read(myByteArray);
        fileInputStream.close();

        return myByteArray;
    }

    @RobotKeyword
    @ArgumentNames({ "file_name", "file_object"})
    public void writeFile(String fileName, byte[] fileObject) throws IOException {
        OutputStream out = new FileOutputStream(fileName);
        out.write(fileObject);
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