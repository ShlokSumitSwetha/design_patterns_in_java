package Complete_Design_Patterns.command_pattern1;

public class CommandPatternClient {
	public static void main(String[] args) {
		Document doc = new Document();
		ActionListenerCommand clickOpen = new ActionOpen(doc);
		ActionListenerCommand clickSave = new ActionSave(doc);
		MenuOptions menu = new MenuOptions(clickOpen, clickSave);
		menu.clickOpen();
		menu.clickSave();
	}
}
