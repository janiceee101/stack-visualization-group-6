# Test Cases

## Boundary Conditions (Task 5)

| # | Stack | Operation | Input | Expected Output | Result |
|---|---|---|---|---|---|
| 1 | EMPTY | POP | - | STACK UNDERFLOW: Cannot pop, stack is empty | PASS |
| 2 | EMPTY | PEEK | - | STACK EMPTY: Nothing to peek, stack is empty | PASS |
| 3 | EMPTY | PUSH | 10 | Stack contains [10] | PASS |
| 4 | [10] | PUSH | 20 | Stack contains [10, 20] | PASS |
| 5 | [10, 20] | PEEK | - | Top element is 20; stack remains unchanged | PASS |
| 6 | [10, 20] | POP | - | 20 is removed; stack contains [10] | PASS |
| 7 | FULL (10 elements) | PUSH | 99 | STACK OVERFLOW: Cannot push, stack is full | PASS |
| 8 | ANY | CLEAR | - | Stack becomes empty | PASS |
| 9 | ANY | RANDOM | - | Stack contains randomly generated numbers | PASS |

## Additional Test Cases

| # | Stack | Operation | Input | Expected Output | Result |
|---|---|---|---|---|---|
| 10 | ANY | PUSH | abc | Invalid input: enter a whole number | PASS |
| 11 | ANY | PUSH | Empty field | Input required: enter a whole number | PASS |
| 12 | EMPTY | CHECK STACK | - | The stack is empty | PASS |
| 13 | FULL (10 elements) | POP, then PUSH | 7 | POP succeeds, PUSH succeeds, stack is full again | PASS |
