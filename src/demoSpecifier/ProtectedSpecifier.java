package demoSpecifier;

import acessSpecifier.PrivateUse;

public class ProtectedSpecifier extends PrivateUse {

	public static void main(String[] args) {
	
	PrivateUse p= new PrivateUse();
	p.test1();
	
	ProtectedSpecifier ps=new ProtectedSpecifier();
	ps.test1();
	ps.test4();
	}

}
