// Generated by delombok at Sat Jun 11 11:12:44 CEST 2016

class SimpleTypeResolutionFail {
	@Getter
	private int x;
}

class SimpleTypeResolutionSuccess {
	private int x;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int getX() {
		return this.x;
	}
}
