package Complete_Design_Patterns.strategy_pattern;

public class ZipArchive implements  StrategyArchive{

	@Override
	public void archiveFile() {
		System.out.println("zip archiving....");		
	}
}
