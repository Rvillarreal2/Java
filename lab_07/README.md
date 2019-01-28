  
## Lab VII: custom LinkedList II
We want to create our own ```List``` where we can keep a collection of ```DLine```'s. Therefore,
we will not use objects such as ```java.util.LinkedList``` or any of the methods provided by the ```List``` API.
Since our list is customized to deal with objects of type ```DLine```, we need some modifications in the class ```DLine``` as well.  
I start this project together with the students, and I then gradually leave some important pieces for them to finish.
  
The following methods will be implemented:  

```java
DLine get(int index);
int add(DLine dl, int index);
void append(IList<DLine> ls);
int appendAt(IList<DLine> ls, int index);
int remove(int index);
void empty();
int size();
```


### Objectives:
* We want to implement our own ```LinkedList``` object from scratch. That is, 
* The primary goal is to introduce the Singly Linked-List data structure and show them how the theory and the code connects.
* Students will gain a better understanding of how the classes (such as String, Array, LinkedLists, etc) that they have been using but treating as black boxes, are implemented.

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




