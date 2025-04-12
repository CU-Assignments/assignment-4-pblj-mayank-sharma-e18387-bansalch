
#  Medium Level: Card Collection System

---

##  Problem Statement

Create a Java program to manage a collection of cards (like playing cards).  
Allow the user to:
- Add cards
- Find all cards of a specific symbol (e.g., "Hearts", "Spades")

---

##  Key Concepts Used

- `HashMap` – To store and categorize cards by symbol
- Collection interface – For managing and accessing card data
- `Scanner` – For input/output

---

##  How to Run

1. Navigate to the `Medium/` folder.
2. Compile and run:
```bash
javac CardCollection.java
java CardCollection
```
3. Enter a card symbol when prompted to search.

---
### Examples

Enter number of cards: 4

Enter Card Symbol: Hearts
Enter Card Value: Ace

Enter Card Symbol: Spades
Enter Card Value: King

Enter Card Symbol: Diamonds
Enter Card Value: Queen

Enter Card Symbol: Hearts
Enter Card Value: Jack

Enter symbol to search: Hearts
Output: Cards of Hearts: [Ace, Jack]

Enter symbol to search: Clubs
Output: No cards found for symbol: Clubs

---
