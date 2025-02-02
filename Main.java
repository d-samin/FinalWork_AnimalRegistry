import model.AnimalRegistry;
import presenter.AnimalRegistryPresenter;
import view.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        AnimalRegistry model = new AnimalRegistry();
        ConsoleUI view = new ConsoleUI(new AnimalRegistryPresenter(model, new ConsoleUI(null)));

        view.start();
    }
}
