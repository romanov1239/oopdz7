package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public class SortByName extends Command {
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Отсортировать по имени";
    }
    public void execute(){
        consoleUI.sortByName();
    }
}
