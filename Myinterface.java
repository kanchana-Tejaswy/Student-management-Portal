// Interface
interface InterfaceDemo{
			String str = "welcome"
			
			public static void show(){
					System.out.println("Interface");
			} 
			
			default void displa(){
						InterfaceDemo.show();
			}

}            

class MyInterface implements InterfaceDemo{
			public static void main(String...args){
			}
}
