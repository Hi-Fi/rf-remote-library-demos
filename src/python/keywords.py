import os

class RemoteDemoLibrary(object):

    stored_variable = "Initial value"

    def return_string(self):
        return "Returning String"

    def return_int(self):
        return 1

    def return_float(self):
        return 1.1

    def return_image(self, file_name="image_from_remote.png"):
        return open(file_name, "rb").read()

    def write_file(self, file_name, file_object):
        f = open(file_name, 'wb')
        f.write(file_object)
        f.close()

    def get_stored_variable(self):
        return self.stored_variable

    def set_stored_variable(self, new_value):
        self.stored_variable = new_value
        return self.stored_variable