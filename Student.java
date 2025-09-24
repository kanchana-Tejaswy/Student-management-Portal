// Encapsulation and inheretance 

package Student;
class Student extends Person{
			private String id, name , branch , password;
		
			Student (String n){
						super(n);
						this.name = name;
						
			}
		
			void getdId(String id){
			this.id = id;
			
			
			}
			void getName(String name){
			this.name = name;
		
			}
			void getBranch(String branch){
			this.branch = branch;
			
			}
			void getPassword(String password){
			this.password = password;
			
			}
			@Override
			public String getDetails(){
						return (id+ "," +name+ "," +branch+ "," +password);
			}
}
