*** Settings ***
Library    Remote    http://127.0.0.1:8270/       WITH NAME    RemoteDatabaseLibrary
Suite Setup       Connect To Database Using Custom Params    psycopg2    database='${DBName}'
Suite Teardown    Disconnect From Database

*** Variables ***
${DBName}    world

*** Test Cases ***
Create person table
    [Tags]    db    smoke
    ${output} =    Execute SQL String    CREATE TABLE person (id integer unique,first_name varchar(20),last_name varchar(20))
    Log    ${output}
    Should Be Equal As Strings    ${output}    ${EMPTY}

Drop person tables
    [Tags]    db    smoke
    ${output} =    Execute SQL String    DROP TABLE person
    Log    ${output}
    Should Be Equal As Strings    ${output}    ${EMPTY}

