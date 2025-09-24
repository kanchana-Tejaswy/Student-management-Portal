//abstrsct
package Student;

abstract class Person {
			proctected String name;
			
			Person(String name){
						this.name = name;
			}
			abstract String getDetails(); // abstract method
			
						
}
/* javac -d .Person.java

javac             .. java compiler
-d                .. directory
. | example       .. current directory

*/
