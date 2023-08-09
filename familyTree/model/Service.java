package familyTree.model;

import familyTree.model.human.Gender;
import familyTree.model.human.Human;

import java.time.LocalDate;
   
public class Service {
        FamilyTree<Human> tree;
        FileHandler fileHandler;
        
    public Service(){
        this.tree = testTree();
        fileHandler=new FileHandler();
    }

    public void getHumansListInfo() {
        FamilyTree<Human> tree = testTree();
        System.out.println(tree);
    }
    public void sortByName() {
        tree.sortByName();
        System.out.println(tree);
    }
    public void sortByBirthDate() {
        tree.sortByBirthDate();
        System.out.println(tree);
    }

public FamilyTree<Human> testTree() {
        FamilyTree<Human> tree = new FamilyTree<>();
        Human Sasha = new Human("Александр", Gender.Male, LocalDate.of(1976, 9, 19));
        Human Lena = new Human("Елена", Gender.Female, LocalDate.of(1987, 3, 1));
        tree.add(Sasha);
        tree.add(Lena);
        tree.setWedding(Sasha.getId(), Lena.getId());
        Human Nadya = new Human("Надежда", Gender.Female, LocalDate.of(2023, 12, 10), Sasha, Lena);
        Human Gena = new Human("Геннадий", Gender.Male, LocalDate.of(2022, 1, 14), Sasha, Lena);
        tree.add(Nadya);
        tree.add(Gena);
        Human Nina = new Human("Нина", Gender.Female, LocalDate.of(1942, 7, 8));
        tree.add(Nina);
        return tree;
    }    
    public void fileHandler() {
        // Сериализация объекта в файл
        fileHandler.serializeObject(tree, "person.out");

        // Десериализация объекта из файла
        FamilyTree<Human> treeRestored = (FamilyTree<Human>) fileHandler.deserializeObject("person.out");
    }
}
