import model.IPresent;
import model.Sweet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PresentImp implements IPresent {
    @Override
    public List<Sweet> filterSweetBySugarRange(List<Sweet> sweetList, double minSugarWeight,double maxSugarWeight) {

       List<Sweet> sweets = sweetList.stream().filter(sweet -> sweet.getSugarWeight()<maxSugarWeight && sweet.getSugarWeight()>minSugarWeight).collect(Collectors.toList());
        return sweets;
    }

    @Override
    public double getTotalWeight(List<Sweet> sweets) {
        double totalWeight = 0;
        try {
            for (int i = 0; i<=sweets.size(); i++) {
                totalWeight += sweets.get(i).getWeight();
            }
        }
        catch (Exception ex)
        {}

        return totalWeight;
    }

    @Override
    public List<Sweet> addPresent(Sweet sweet) {
    List<Sweet> sweetList = new ArrayList<>();
    sweetList.add(sweet);
    return sweetList;
    }

    @Override
    public List<Sweet> getSweet() {
        return null;
    }


}
