

import Repositories.MedecinRepository;
import Repositories.RnRepository;
import Views.MedecinView;
import services.MedecinService;
import services.RnService;

public class Main {
    public static void main(String[] args) {
        MedecinRepository medecinRepository = new MedecinRepository();
        RnRepository rnRepository = new RnRepository();
        MedecinService medecinService = new MedecinService(medecinRepository );
        RnService rnService = new RnService(rnRepository);
        MedecinView mainView = new MedecinView(medecinService, rnService);
        mainView.run();
    }
}
