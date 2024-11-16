# Assignment3
Kaitlyn Hicks - 49137588

Roxana Dicusara - 49287621

Output:
Enter product IDs to search for, or type 'exit' to quit.
Enter product ID: 5912d6223d9d7ec9aa5c4bb3b583de3e
Product ID: 5912d6223d9d7ec9aa5c4bb3b583de3e, Name: "Roces 550030 Model Chuck Roller Skate, Category: Black/White, Price: $9USW
Enter product ID: daa78f7b015d3e5d344aa6ece3304363
Product ID: daa78f7b015d3e5d344aa6ece3304363, Name: "Wild Republic Lion Baby Plush, Category:  Stuffed Animal, Price: $ Plush Toy
Enter product ID: e086ff1f756e3e72dfd5295fd07c2310
Product ID: e086ff1f756e3e72dfd5295fd07c2310, Name: I Love RC Boats Remote Radio Control Hobby T-Shirt, Category: Toys & Games | Hobbies | Remote & App Controlled Vehicles & Parts | Remote & App Controlled Vehicles, Price: $$15.95 
Enter product ID: exit

Exiting the program.

Inserting new product:

Product ID: 1111, Name: New Product, Category: Electronics, Price: $$49.99

Inserted

Inserting product:

Product ID: 1111, Name: New Product, Category: Electronics, Price: $$49.99

Error: Product with ID 1111 already exists.


# Performance and Scalability Considerations - Time Complexity, Performance with large data set, Maintaining balance 

Insertion:
When inserting a new element in the Red-Black tree, the timing of the average case for insertion is 1.01 lg N. After searching between elements (parent and child nodes), the options for where the element could be inserted is cut in half. Part of the tree is excluded and that reduces the time as the place for insertion is reached. After insertion, the tree may have to rebalance by rotating and changing link colors, and the timing of these will also be O lg n as the go up to the root (increase logarithmically, O is a placeholder).
*Rotations have a constant time, but as they go up and reach the root, they increase logarithemically.
