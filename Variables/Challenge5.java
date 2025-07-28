package Variables;

public class Challenge5 {

    int instanceCount = 0;       //instant var
    static int staticCount = 0;    //static var

    void demonstrate() {
    	int localCount = 0;
    	
    	instanceCount++;
    	staticCount++;
    	localCount++;
    	
    	System.out.println("\nInside Method: ");
    	 System.out.println("Instance: " + instanceCount);
         System.out.println("Static: " + staticCount);
         System.out.println("Local: " + localCount);
    }
    
    
	public static void main(String[] args) {
		Challenge5 demo1 = new Challenge5();
		Challenge5 demo2 = new Challenge5();
		
		demo1.demonstrate();
		demo2.demonstrate();
		
		System.out.println("\nAfter both demonstrations:");
        System.out.println("demo1 instance: " + demo1.instanceCount);
        System.out.println("demo2 instance: " + demo2.instanceCount);
        System.out.println("Static (via demo1): " + demo1.staticCount);
        System.out.println("Static (via demo2): " + demo2.staticCount);
		
	}

}
