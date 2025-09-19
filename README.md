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

Answers:

1. What is an Abstract Data Type (ADT)?
	An ADT is a logical model of a data structure defined by the set of operations it supports and the semantics of those operations—not by its concrete implementation. It specifies the "what" while hiding the "how." This lets us change the underlying representation (array, linked list, etc.) without affecting client code.

2. Why does it matter that a stack only has push, pop, peek, isEmpty, and size?
	A restricted interface enforces the LIFO discipline. If random access or arbitrary removal were allowed, code could violate ordering guarantees and depend on internal structure. A minimal, purposeful API:
	- Protects invariants (last-in-first-out behavior always holds)
	- Simplifies reasoning about correctness & performance (push/pop are O(1) amortized here)
	- Enables implementation flexibility (we can swap implementations freely)
	- Reduces misuse and bugs

3. How do generics allow us to make stacks that can hold different types?
	Generics parameterize the element type (`MyStack<T>`). The compiler enforces that only the declared type (e.g., `Integer`, `String`) is pushed, giving us type safety, no casts, reusable code for all reference types, and earlier error detection.

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

Reflection Answers:

1. How does the Stack ADT “hide” implementation details?
	Client code never accesses the internal array or `top` index—only the public operations. We even resize internally with `Arrays.copyOf` transparently. Because users depend on behavior not structure, we could replace the array with a linked list without breaking any code.

2. What advantages did generics give us in this activity?
	- Type safety (compile-time checks, no casts)
	- Code reuse (one implementation for all reference types)
	- Clearer intent in method signatures
	- Fewer runtime `ClassCastException`s
	- Easy extension to domain-specific classes later

3. Why is it useful to limit access to data through ADT operations instead of exposing the array directly?
	- Preserves invariants (no skipping stack order or overwriting in the middle)
	- Allows internal changes/optimizations without ripple effects
	- Prevents accidental corruption and aliasing bugs
	- Supports predictable performance guarantees
	- Encourages cleaner, more maintainable client code

Bonus: Dynamic resizing in `push` gives amortized O(1) pushes; `pop` and `peek` are O(1). These guarantees are part of the ADT contract even though clients never see the implementation.
