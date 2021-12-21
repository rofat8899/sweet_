package model;

import java.util.List;

public interface IPresent {
    public List<Sweet> filterSweetBySugarRange(List<Sweet> sweetList, double minSugarWeight,double maxSugarWeight);

    double getTotalWeight(List<Sweet> sweets);

    List<Sweet> addPresent(Sweet sweet);

    List<Sweet> getSweet();
}
