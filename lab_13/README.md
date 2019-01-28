
  
## Lab XIII: custom Binary Search Tree (2)

A binary search tree is a binary tree data structure in which the following conditions are always held true:

* `dl.length > dl.leftChild.lengt`
* `dl.length <= dl.rightChild.length`

In this project, we would like to use the concept of reference to build our tree. Therefore, we use our favorite
object, `DLine`, as the tree nodes. To this end, we first tweak the `DLine` class so that it fits the properties of
a tree node, and then we will work on our tree class, `DTree`. This class will initially have the following methods,
but in the next project, we will expand the list.
  
```java
DLine getRoot();
int getNumberOfNodes();
void insert(DLine dl);
int getTreeLevel(DLine dl);		//NEW
void traverseInorder();			//NEW
void traversePreorder();		//NEW
void traversePostorder();		//NEW
void traverseLevelOrder();		//NEW
DLine find(DLine dl, int len);		//NEW
```


### Objectives:
* We want to implement our own `Binary tree` object from scratch.
* Students will be introduced to some important functionality of recursive methods, such as traversing of the tree.
* Students will gain a better understanding of how the tree-based data structures are actually implemented.


### Description
The details of this project can be found at [class page](https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720).

#### Author
* *Azim Ahmadzadeh* - [webpage](https://grid.cs.gsu.edu/~aahmadzadeh1/)

#### Course
* *Data Structures - 2720* - Fall 2018 

#### School
* [Computer Science Department](https://www.cs.gsu.edu/) - Georgia State University

#### License
This project is licensed under the GNU General Public License - see the [GPL LICENSE](http://www.gnu.org/licenses/gpl.html) for details.




