package Complete_Design_Patterns.chain_of_responsibilites;

public class ConsoleBasedLogger extends Logger {
	public ConsoleBasedLogger(int levels) {
		this.levels=levels;
	}
	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("CONSOLE LOGGER INFO: "+msg);
	}
}
