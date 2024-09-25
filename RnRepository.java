package Repositories;

import entities.Rn;

import java.util.ArrayList;
import java.util.List;

public class RnRepository {
    private List<Rn> rns;

    public RnRepository() {
        this.rns = new ArrayList<>();
    }

    public void addRn(Rn rn) {
        rns.add(rn);
    }

    public List<Rn> getAllRns() {
        return rns;
    }

    public List<Rn> getRnsByDate(String date) {
        List<Rn> rnsByDate = new ArrayList<>();
        for (Rn rn : rns) {
            if (rn.getDate().equals(date)) {
                rnsByDate.add(rn);
            }
        }
        return rnsByDate;
    }
}
