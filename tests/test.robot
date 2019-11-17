*** Settings ***
Library    Remote    http://127.0.0.1:8270       WITH NAME    RemoteLibraryDemo
Library    OperatingSystem

*** Test Cases ***
Get String
    ${value}    Return String

Get Float
    ${value}    Return Float

Get Int
    ${value}    Return Int

Get Image
    ${image_data}    Return Image
    Create Binary File    image_from_remote.png    ${image_data}
    Log    <img src="image_from_remote.png">    HTML

Write File
    ${file_data}    Get Binary File    Capture.png
    Write File    uploaded_file.png    ${file_data}
    ${image_data}    Return Image    uploaded_file.png
    Create Binary File    received_uploaded_image.png    ${image_data}
    Log    <img src="received_uploaded_image.png">    HTML

Get Stored Variable
    ${value}   Get Stored Variable

Set Stored Variable
    ${new_value}    Set Stored Variable    New value
    ${value}   Get Stored Variable