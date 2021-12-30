#Autor: Alex Sanchez
@stories
Feature: uTest
  As a user, I want to learn how to automate in uTest Academy with the Basic Testing course.
  @scenario1
  Scenario: Find the automation course
    Given than Alex wants to learn automation at the academy uTest
    | strUser    | strPassword  |
    | TuUsuario  | TuClave      |
    When he search for course on the uTest academy platform
    | strCourse      |
    | Testing Basics |
    Then he find the course called
    | strCourse      |
    | Testing Basics |