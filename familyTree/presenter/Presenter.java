package familyTree.presenter;

import familyTree.model.Service;
import familyTree.view.View;

public class Presenter {
    private Service service;
        
    public Presenter(View view) {
        service=new Service();
    }
    public void getFileHandler() {
        service.fileHandler();
    }
    public void getHumansListInfo() {
        service.getHumansListInfo();
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
    } 

    public void sortByName() {
        service.sortByName();  
    }
}
