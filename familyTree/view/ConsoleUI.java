package familyTree.view;

import familyTree.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }
    
    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        hello();
        while (work){
            printMenu();
            choiceMenu();
            String choice=scanner.nextLine();
            int choiceInt=Integer.parseInt(choice);
            menu.execute(choiceInt);
        }
        presenter.getFileHandler();
    }
    public void finish() {
        System.out.println("Приятно было пообщаться!");
        work = false;
    }
    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }
    public void sortByName() {
        presenter.sortByName();
    }
    public void getHumansListInfo() {
        presenter.getHumansListInfo();
    }
    private void hello(){
        System.out.println("Доброго времени суток!\n");
    }
    private void choiceMenu(){
        System.out.println("Выберите действие: ");
    }

    private void printMenu(){
        System.out.println(menu.menu());
    }

}
