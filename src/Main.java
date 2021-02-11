import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> carsModel = new ArrayList<>();

        carsModel.add("Audi");
        carsModel.add("Mercedes");
        carsModel.add("Opel");
        carsModel.add("Dodge");
        carsModel.add("Tesla");
        carsModel.add("BMW");
        carsModel.add("Ford");
        carsModel.add("Honda");
        carsModel.add("Porsche");
        carsModel.add("Toyota");

        System.out.println(carsModel);
        System.out.println("-------------");

        Iterator<String> iterator = carsModel.iterator();

        while (iterator.hasNext()){
            String model = iterator.next();

            System.out.println(model);
        }
    }
}
