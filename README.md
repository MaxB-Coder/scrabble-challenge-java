![Scrabble](./Documentation/%F0%9F%92%AFSCRABBLE%F0%9F%92%AF.png)

## A simple Scrabble class in Java that scores a single word with: double or triple letters and double or triple word score if specified.

### Letter Values

| Letter                       | Value |
| ---------------------------- | ----- |
| A, E, I, O, U, L, N, R, S, T | 1     |
| D, G                         | 2     |
| B, C, M, P                   | 3     |
| F, H, V, W, Y                | 4     |
| K                            | 5     |
| J, X                         | 8     |
| Q, Z                         | 10    |

Example
"cabbage" should be scored as worth 14 points:

- 3 points for C
- 1 point for A, twice
- 3 points for B, twice
- 2 points for G
- 1 point for E

And to total:

```
3 + 2x1 + 2x3 + 2 + 1
= 3 + 2 + 6 + 3
= 14
```

## Screenshots

## To Run the Program

1. Create a new instance of the scrabble class with the word that you want to score.
2. User the .score() method on that instance to get the score for the word.

### Prerequisites

- Git

### Technologies

- Java
- Maven

## Acknowledgements

- Scrabble, for the inspiration.
- Digital Futures for setting this project as a challenge.
