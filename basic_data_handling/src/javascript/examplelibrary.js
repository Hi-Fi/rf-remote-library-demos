'use strict';

var fs = require('fs'),
    robot = require('robotremote');

var lib = module.exports;

var stored_variable = "Initial value"

lib.__intro__ = function () {}
lib.__intro__.doc = "Introductions of the JS library"

lib.__init__ = function () {}
lib.__init__.doc = "Init introductions of the JS library"

lib.returnString = function () {
    return "Returning string"
}

lib.returnString.doc = "Testing returning of string"

lib.returnInt = function () {
    return 1
}

lib.returnInt.doc = "Testing returning of integer"

lib.returnFloat = function () {
    return 1.1
}

lib.returnFloat.doc = "Testing returning of float"


lib.returnImage = function (file_name) {
    var contents = fs.readFileSync(file_name)
    return contents
}

lib.writeFile = function (file_name, contents) {
    fs.writeFileSync(file_name, contents)
}

lib.getStoredVariable = function () {
    return stored_variable
}

lib.setStoredVariable = function (value) {
    stored_variable = value
    return stored_variable
}

// Run this keyword library if the library itself is called explicitly.
if (!module.parent) {
    var server = new robot.Server([lib], { host: 'localhost', port: 8271 });
}
