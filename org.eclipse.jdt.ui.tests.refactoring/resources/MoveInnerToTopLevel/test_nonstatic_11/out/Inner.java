package p;
class Inner {
	/** Comment */
	private A a;

	/**
	 * @param a
	 */
	Inner(A a) {
		this.a= a;
	}

	void f(){
		new Inner(this.a);
	}
}