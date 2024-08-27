# Notes: Tuesday, August 27, 2024

## Linked Lists Review
A list that is connected \
Separated into Nodes, by pointer/reference to next node \

### Given a linked list pointed to by head whose last element is tail, write the code to insert an element at the end of the linked list
- To inset an element into a linked list you need to add it to the end of the queue and adjust the tail to point to the new node
- Linked Lists can be empty which means that inserting a new node will point the head and tail to said new node

### Given a linked list pointed to by the head, write the code to delete an element with value x
Special Cases:
- If head exists
- Check node by node for x
- Keep track of previous nodes
- Point the previous to the node after x

## Stacks
Similar to a stack of dinner plates where you add and take from the top \
Add to the same end as you remove
Call Stacks

### peek
Key thing is to return top.data
Unless top is null
If top is null Return -999
