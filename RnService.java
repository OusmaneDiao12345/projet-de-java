package services;

import java.util.List;

import Repositories.RnRepository;
import entities.Rn;

public class RnService {
    private RnRepository rnRepository;

    public RnService(RnRepository rnRepository) {
        this.rnRepository = rnRepository;
    }

    public void registerRn(Rn rn) {
        rnRepository.addRn(rn);
    }

    public List<Rn> getAllRns() {
        return rnRepository.getAllRns();
    }

    public List<Rn> getRnsByDate(String date) {
        return rnRepository.getRnsByDate(date);
    }
}
