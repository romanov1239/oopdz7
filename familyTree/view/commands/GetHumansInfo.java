package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public class GetHumansInfo extends Command {
    public GetHumansInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список членов семьи";
    }

    public void execute(){
        consoleUI.getHumansListInfo();
    }
}
