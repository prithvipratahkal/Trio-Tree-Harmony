# Trio-Tree-Harmony
This project implements a 2-3 tree in Java, a balanced search tree that allows for efficient insertion, searching, and splitting operations. The tree supports nodes with either 2 or 3 children, ensuring balanced height and fast lookup, insertion, and deletion times.

Files:

1) TwoThreeTree.java: Contains the main logic for the 2-3 tree, including methods for insertion, searching, and cascade splitting.
2) TreeNode.java: Defines the structure of a node in the 2-3 tree, holding values and references to child nodes.

Features:

1) Insert Operation: Adds new values to the tree while maintaining its balanced properties.
2) Search Operation: Efficiently finds values in the tree, returning true if the value exists, false otherwise.
3) Cascade Split: Manages node splitting during insertion to maintain the tree's balance, ensuring all nodes adhere to the 2-3 tree properties.
