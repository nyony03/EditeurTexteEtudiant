package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument {

    public CommandeMajuscule(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : majuscules;depart;fin");
            return;
        }
        int start = Integer.parseInt(parameters[1]);

        int end = Integer.parseInt(parameters[2]);

        this.document.majuscules(start, end);
        super.executer();
    }
}
