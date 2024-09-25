package Repositories;

import entities.Medecin;
import entities.Rn;

import java.util.ArrayList;
import java.util.List;

public class MedecinRepository {
    private List<Medecin> medecins;

    public MedecinRepository() {
        this.medecins = new ArrayList<>();
    }

    public void addMedecin(Medecin medecin) {
        medecins.add(medecin);
    }

    public List<Medecin> getAllMedecins() {
        return medecins;
    }

    public Medecin getMedecinById(int id) {
        for (Medecin medecin : medecins) {
            if (medecin.getId() == id) {
                return medecin;
            }
        }
        return null;
    }
}
