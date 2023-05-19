# ISBN Validator

ISBN stands for 'International Standard Book Number'. There are two ISBN standards: `ISBN-10` and `ISBN-13`.

```
ISBN-13:    9780470059029
            978 0 471 48648 0
            978-0596809485
            978-0-13-149505-0
            978-0-262-13472-9

ISBN-10:    0471958697
            0 471 60695 2
            0-470-84525-2
            0-321-14653-0
```

`ISBN-10` is made up of 9 digits plus a check digit (which may be 'X'). `ISBN-13` is made up of 12 digits plus a check
digit. Spaces and hyphens may be included in a ISBN, but are not significant. So `9780471486480` is
equivalent to `978-0-471-48648-0` and `978 0 471 48648 0`.

## Feature 1 - ISBN-13 validator

Write a function that checks if an `ISBN-13` is valid.

The check digit for `ISBN-13` is calculated by multiplying each digit alternately by 1 or 3 (i.e., 1 x 1st digit, 3 x
2nd digit, 1 x 3rd digit, 3 x 4th digit, etc.), summing these products together, taking modulo 10 of the result and then
subtracting this value from 10. The result you get should be equal to the check (13th) digit of the ISBN.

## Feature 2 - ISBN-10 validator

Add support for `ISBN-10` to your validator.

The check digit for `ISBN-10` is calculated by multiplying each digit by its position (i.e., 1 x 1st digit, 2 x 2nd digit,
etc.), summing these products together and taking modulo 11 of the result (with 'X' being used if the result is 10).

## Attribution
This technical challenge is described [here](https://github.com/ardalis/kata-catalog/blob/main/katas/ISBN.md).