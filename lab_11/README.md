
  
## Lab XI: custom Queue (2)
A queue is a particular kind of collection in which the entities are kept in order. Queues can be implemented
using `Array`s or `reference`s. Here, we use our favorite `DLine` object as the nodes (so, the reference) and
implement `queue`. The principal methods of this data structure are `enqueue` and `dequeue`. `enqueue`  adds entities
to the rear terminal position (tail), while `dequeue` removes entities from the front terminal position (head).
In addition to those two, we would like to implement some other methods as well. See the list of the methods below:
  
```java
void enqueue(DLine dl);
void enqueueAll(IDQueue dq);	//NEW
void transfer(IDQueue dq);		//NEW
DLine dequeue();
DLine peek();
DLine last();					//NEW
void empty();					//NEW
int size();
```


### Objectives:
* We want to implement our own `Queue` object from scratch.
* The primary goal is to introduce a simple Queue data structure and show the students how the theory and the code connects.
* Students will gain a better understanding of how the Queues and Stacks that they have been using but treating as black boxes, are actually implemented.

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




