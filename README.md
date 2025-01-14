# Lab 2 - Card Game Helper
### Due - Monday, January 20, 11:59pm

Assignment Link:
[https://classroom.github.com/a/TrUpdC_F](https://classroom.github.com/a/TrUpdC_F)

In this assignment, you will practice with programs that using multiple classes
as well as conditionals and iteration. You will also need to use exceptions and
the List interface.

<hr/>

## Program Operation

The goal of this program is to calculate the total point value of a hand of cards. The program will prompt the user for the suit and rank of each card in their hand. The user may have any number of cards, so the program will continue to prompt as long as the user wishes to enter more cards. Once the user is finished, the program will calculate the total number of points in the hand according to this scale:

| Suit | Rank |
| ---- | ---- | 
| Joker | 50 | 
| Two & Ace | 20 | 
| Nine, Ten, Jack, Queen, King | 10 | 
| Four, Five, Six, Seven, Eight | 5 | 
| Three of Spade or Club | 5 | 
| Three of Heart or Diamond | 0 | 

An example run of your program would look as follows:

```
Welcome to the card game helper!
What is the suit of your card? 
Spades
Invalid suit.
What is the suit of your card? 
Spade
What is the rank of your card? 
Jack
Are there more cards in your hand? 
yes
What is the suit of your card? 
Heart
What is the rank of your card? 
Three
Are there more cards in your hand? 
no
The value of your hand is: 10
```

## Program Design

The starter code includes Javadoc describing the classes and methods you must implement. You are
responsible for implementing the following methods as described in the starter
code documentation:

### `Card`
- `Constructor`
- `isFaceCard`
- `getCardValue`

### `ConsoleView`
- `getRank`
- `getCard`
- `printWelcome`
- `showHandValue`

### `Hand`
- `getHandValue`

### Tests

You must implement at least three unit tests for the `Hand#getHandValue` method.

In addition to implementing the methods exactly as described, you are also expected to use the provided methods and data members where appropriate.