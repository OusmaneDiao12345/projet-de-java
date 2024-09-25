package services;

import java.util.List;

import Repositories.MedecinRepository;
import entities.Medecin;

public class MedecinService {
    private MedecinRepository medecinRepository;

    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public void registerMedecin(Medecin medecin) {
        medecinRepository.addMedecin(medecin);
    }

    public List<Medecin> getAllMedecins() {
        return medecinRepository.getAllMedecins();
    }

    public Medecin getMedecinById(int id) {
        return medecinRepository.getMedecinById(id);
    }
}