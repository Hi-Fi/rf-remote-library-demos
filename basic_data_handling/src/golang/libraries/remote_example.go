package libraries

import (
	"io/ioutil"
)

//ExampleLibrary to be used with Robot Framework's remote server.
type ExampleLibrary struct{}

var storedVariable = "stored originally"

func (lib *ExampleLibrary) ReturnString() string {
	return "Returning string"
}

func (lib *ExampleLibrary) ReturnInt() int {
	return 1
}

func (lib *ExampleLibrary) ReturnFloat() float64 {
	return 1.1
}

func (lib *ExampleLibrary) GetStoredVariable() string {
	return storedVariable
}

func (lib *ExampleLibrary) SetStoredVariable(newValue string) string {
	storedVariable = newValue
	return storedVariable
}

func (lib *ExampleLibrary) ReturnImage(fileName string) []byte {
	fileData, _ := ioutil.ReadFile(fileName)
	return fileData
}

func (lib *ExampleLibrary) WriteFile(fileName string, fileData []byte) {
	ioutil.WriteFile(fileName, fileData, 0777)
}
