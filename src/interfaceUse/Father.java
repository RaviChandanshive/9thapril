package interfaceUse;

public interface Father {

	
	void money();
	void car();
	void bike();
	
	default void love() {
		System.out.println("Fathers Love");
	}
	
	static void attitude() {
		System.out.println("Father attitude ");
	}
}
