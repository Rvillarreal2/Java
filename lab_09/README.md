
  
## Lab IX: custom ArrayList (2)
Last time we created our own `ArrayList` and we called it `DALine`, since it holds objects of type `DLine`'s. In
this project, we want to continue on that project and implement some other methods:

```java
int size();
DLine get(int index);
void set(DLine dl, int index);
void add(DLine dl);
int addAfter(DLine dl, int index);	//NEW
void removeAt(int index);		//NEW	
void removeAll(int from, int to);	//NEW
public void removeAll();		//NEW
void ensureCapacity();
void resize();
int size()
```

### Objectives:
* We want to implement our own `ArrayList` object from scratch.
* The primary goal is to introduce a simple Array-List data structure and show the students how the theory and the code connects.
* Since previously students implemented a custom `LinkedList`, the differences and similarities between these two data structures will be more visible to them. 
* Students will gain a better understanding of how the classes (such as String, Array, ArrayLists, etc) that they have been using but treating as black boxes, are actually implemented.

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




