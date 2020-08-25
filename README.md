# jv-functional-interface
1. Given:
     - class `Car` with fields: `model`, `engine`, `color`, `autoType`, `weight`;
     - `Engine` class with fields: `engineType`, `engineVolume`;
     - and two enum classes: `autoType` and `engineType`;

2. Your task is to create classes that implement functional interfaces for
    performing the following operations:
     - if the car's weight is less than 1500, then autoType must be `CAR`, if it is greater or
     equal, then `TRUCK`
     - implement a check whether an electric engine is installed on the car or not;
     - compare two cars by their `engineVolume` and return the difference;
     - assign random color to car from the following list of colors
       (red, green, blue, yellow, pink, black, white);