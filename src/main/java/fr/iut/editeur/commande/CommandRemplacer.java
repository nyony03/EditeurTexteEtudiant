package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandRemplacer extends CommandeDocument {

    public CommandRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4) {
            System.err.println("Format attendu : remplacer;depart;fin;chaine");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        String texteChange = parameters[3];

        this.document.remplacer(start, end, texteChange);
        super.executer();
    }
}
