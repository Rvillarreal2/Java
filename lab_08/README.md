  
## Lab VIII: custom ArrayList 
We want to create our own `ArrayList` in which we can keep a collection of `DLine`'s. Therefore,
we will not use Java classes such as `java.util.ArrayList` or any of the methods provided by the `List` interface.
Since our ArrayList is customized to deal with objects of type `DLine`, we need some modifications in the class `DLine` as well.  
I start this project together with the students, and I then gradually leave some important pieces for them to finish.
  
The following methods will be implemented:  

```java
int size();
DLine get(int index);
void set(DLine dl, int index);
void add(DLine dl);
void addAfter(DLine dl, int index);
void ensureCapacity();
void resize();
```


### Objectives:
* We want to implement our own `ArrayList` object from scratch.
* The primary goal is to introduce a simple ArrayList data structure and show how the theory and the code connects.
* Since previously students implemented a custom `LinkedList`, now by implementing a `ArrayList`-like object, the differences and similarities between these two data structures will be more apparent to the students.
* Students will gain a better understanding of how the classes (such as String, `Array`'s, `ArrayList`'s, etc) that they have been using so far but treating as black boxes, are actually implemented.

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




