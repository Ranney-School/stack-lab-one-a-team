[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/o2-4MDsz)

Data Structures & Algorithms Activity: Stack Lab & ADTs in Action

Class Size: 3 students (working together)
Time: 50–55 minutes
Deliverable: Completed code file(s) + short reflection answers

Part 1 — Warm-Up Discussion (5–7 minutes)

Discuss as a group and jot down notes:

What is an Abstract Data Type (ADT)?

Why does it matter that a stack only has push, pop, peek, isEmpty, and size?

How do generics allow us to make stacks that can hold different types?

Part 2 — Hands-On Coding Challenge (35–40 minutes)

Work together on the following steps. Rotate who is typing (“driver”) every 10 minutes.
1. Complete the implementation of a stack in MyStack.java using an array.
2. Use StackTester.java to test your implementation.
3. Complete the checkBalanced() method in StackTester.java.

Part 3 — Reflection & Wrap-Up (7–8 minutes)

Answer these questions as a group:

How does the Stack ADT “hide” implementation details?

What advantages did generics give us in this activity?

Why is it useful to limit access to data through ADT operations instead of exposing the array directly?

---

Completed Answers

Part 1 — Warm-Up Discussion

- What is an Abstract Data Type (ADT)?
	- An ADT specifies what operations are available and what they do, without saying how they are implemented. It focuses on behavior (the interface) rather than the underlying data structure.

- Why does it matter that a stack only has push, pop, peek, isEmpty, and size?
	- Limiting operations enforces LIFO behavior and makes reasoning about the structure simple and safe. It prevents clients from breaking invariants (like removing from the middle) and enables different implementations to be swapped without changing how it’s used.

- How do generics allow us to make stacks that can hold different types?
	- Generics let us define `MyStack<T>` once and use it for any reference type (e.g., `Integer`, `String`). The compiler checks types at compile time, reducing casting and runtime errors.

Part 3 — Reflection & Wrap-Up

- How does the Stack ADT “hide” implementation details?
	- Users interact through methods like `push` and `pop` and don’t see whether the stack uses an array or a linked list. This encapsulation lets the implementation change without affecting client code.

- What advantages did generics give us in this activity?
	- Type safety (no unchecked casts), code reuse (one class for many types), and clearer intent (a `MyStack<String>` can only hold strings).

- Why is it useful to limit access to data through ADT operations instead of exposing the array directly?
	- It protects invariants (e.g., the `top` pointer and LIFO order), avoids accidental corruption, and makes the code easier to maintain and reason about. It also allows internal optimizations or data structure changes without breaking users.
