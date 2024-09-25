package Views;

import entities.Medecin;
import entities.Rn;
import services.MedecinService;
import services.RnService;

import java.util.List;
import java.util.Scanner;

public class MedecinView {
    private MedecinService medecinService;
    private RnService rnService;
    private Scanner scanner;

    public MedecinView(MedecinService medecinService, RnService rnService) {
        this.medecinService = medecinService;
        this.rnService = rnService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("1.Enreigistrer Medecin");
            System.out.println("2.  Enreigistrer RN");
            System.out.println("3. Lister RN et afficher le Medcin");
            System.out.println("4. Lister RN par date");
            System.out.print("Choisir une option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                registerMedecin();
                    break;
                case 2:
                registerRn();
                    break;
                case 3:
                    listRnsAndDisplayMedecin();
                    break;
                case 4:
                    listRnsByDate();
                    break;
                default:
                    System.out.println("option invalide");
            }
        }
    }

    private void EnreigistrerRn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EnreigistrerRn'");
    }

    private void EnreigistrerMedecin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EnreigistrerMedecin'");
    }

    private void registerMedecin() {
        System.out.print("Entrer Medecin ID: ");
        int id = scanner.nextInt();
        System.out.print("Entrer nom du Medecin: ");
        String nom = scanner.next();
        System.out.print("Entrer prenom du Medecin: ");
        String prenom = scanner.next();
        Medecin medecin = new Medecin(id, nom, prenom);
        medecinService.registerMedecin(medecin);
        System.out.println("Medecin enreigistrer avec succe");
    }

    private void registerRn() {
        System.out.print("Entrer RN ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter date RN: ");
        String date = scanner.next();
        System.out.print("Entrer heure RN: ");
        String heure = scanner.next();
        System.out.print("Enter Medecin ID: ");
        int medecinId = scanner.nextInt();
        Medecin medecin = medecinService.getMedecinById(medecinId);
        if (medecin == null) {
            System.out.println("Medecin n'a pas trouve");
            return;
        }
        Rn rn = new Rn(id, date, heure, medecin);
        rnService.registerRn(rn);
        System.out.println("RN enreigistre avec succe");
    }

    private void listRnsAndDisplayMedecin() {
        List<Rn> rns = rnService.getAllRns();
        for (Rn rn : rns) {
            System.out.println("RN ID: " + rn.getId());
            System.out.println("RN date: " + rn.getDate());
            System.out.println("RN heure: " + rn.getHeure());
            System.out.println("Medecin ID: " + rn.getMedecin().getId());
            System.out.println("Medecin nom: " + rn.getMedecin().getNom());
            System.out.println("Medecin prenom: " + rn.getMedecin().getPrenom());
            System.out.println();
        }
    }

    private void listRnsByDate() {
        System.out.print("Entrer date: ");
        String date = scanner.next();
        List<Rn> rns = rnService.getRnsByDate(date);
        for (Rn rn : rns) {
            System.out.println("RN ID: " + rn.getId());
            System.out.println("RN date: " + rn.getDate());
            System.out.println("RN heure: " + rn.getHeure());
            System.out.println("Medecin ID: " + rn.getMedecin().getId());
            System.out.println("Medecin nom: " + rn.getMedecin().getNom());
            System.out.println("Medecin prenom: " + rn.getMedecin().getPrenom());
            System.out.println();
        }
    }
}