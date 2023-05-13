# String Calculator

For this project we'll build a calculator that takes a string and evaluates it as if it were a calculation. The idea 
is to implement it one step at a time with tests, and see where the design ends up. Try to implement the calculator
one feature at a time, writing tests for each step as you go.

## Feature 1 - Integers
If you give your String Calculator a single integer, just return that integer. 

- `""` returns `0`
- `"456"` returns `456`
- `"-20"` returns `-20`

## Feature 2 - Addition
The String Calculator should support addition via the `plus` operator. 

- `"1 + 1"` returns `2`
- `"1000 + 0""` returns `1000`
- `"-10 + 2"` returns `-8`

## Feature 3 - Subtraction
The String Calculator should support addition via the `minus` operator.

- `"1 - 1"` returns `0`
- `"100 - 50"` returns `50`
- `"-10 - 5"` returns `-15`

## Feature 4 - Multiplication
The String Calculator should support addition via the `times` operator.

- `"5 * 2"` returns `10`
- `"0 * 100"` returns `0`
- `"-10 * -10"` returns `100`

## Attribution
This technical challenge is described by [sammancoaching](https://sammancoaching.org/kata_descriptions/string_calculator.html).