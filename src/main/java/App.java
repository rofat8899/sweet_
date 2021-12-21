import model.IPresent;
import model.Sweet;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Sweet> sweetList = new ArrayList<>();
        sweetList.add(new Sweet("AAA",15,5));
        sweetList.add(new Sweet("CCC",17,12));
        sweetList.add(new Sweet("BBB",19,22));

        System.out.println("All sweet in the present :"+sweetList.toString());

        IPresent present = new PresentImp();
        List<Sweet> result= present.filterSweetBySugarRange(sweetList,10,20);
        double TotalWeight = present.getTotalWeight(sweetList);

        System.out.println("Filter By Sugar Range "+result);
        System.out.println("Total Weight "+TotalWeight);
    }
}
