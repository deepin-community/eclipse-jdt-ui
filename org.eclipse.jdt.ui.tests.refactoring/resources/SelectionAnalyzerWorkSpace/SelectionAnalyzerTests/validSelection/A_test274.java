package validSelection;

public class A_test274 {
	public void foo() {
		switch(1) {
			case 1:
				foo();
			case 2:
				foo();
		}
		
		/*]*/foo();/*[*/
	}
}