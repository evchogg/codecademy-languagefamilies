class SinoTibetan extends Language {
    SinoTibetan(String passName, int passNumSpeakers) {
        super(passName, passNumSpeakers, "Asia", "subject-object-verb");
        if(passName.contains("Chinese")) {
            this.wordOrder = "subject-verb-object";
        }

    }

}