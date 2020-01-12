package main

import (
	"go_example/libraries"
	"github.com/daluu/gorrs/runner"
)

func main() {
	runner.RunRemoteServer(new(libraries.ExampleLibrary))
}
