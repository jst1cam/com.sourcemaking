package creational.abstractFactory;


public class Client {

	public static void main(String[] args) {
		
		AbstractFactory factory =  AbstractFactory.SetTool(architecture.INTEL);
		

		System.out.println(  factory.CreateCpu()   );
		System.out.println(  factory.CreateCpu()   );
		System.out.println(  factory.CreateCpu()   );
		
		System.out.println( factory.CreateMmu()    );
		System.out.println( factory.CreateMmu()    );
		System.out.println( factory.CreateMmu()    );
		



	}

}
