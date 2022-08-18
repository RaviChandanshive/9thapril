package interfaceUse;

public interface Mother {


	void nature();
	void beauty();
	void hairstyle();
	
	default void love() {
		System.out.println("Mother Love");
	}
	static void attitude() {
		System.out.println("Mother attitude ");
	}
}
