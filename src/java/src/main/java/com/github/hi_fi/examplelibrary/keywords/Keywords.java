package com.github.hi_fi.examplelibrary.keywords; 

import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

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

//     def return_image(self, file_name="image_from_remote.png"):
//     return open(file_name, "rb").read()

// def write_file(self, file_name, file_object):
//     f = open(file_name, 'wb')
//     f.write(file_object)
//     f.close()

    @RobotKeyword
    public String getStoredVariable() {
        return this.stored_variable;
    }

    @RobotKeyword
    public String setStoredVariable(String new_value) {
        this.stored_variable = new_value;
        return this.stored_variable;
    }

}