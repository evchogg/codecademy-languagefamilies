class Mayan extends Language {
    Mayan(String passName, int passNumSpeakers) {
        super(passName, passNumSpeakers, "Central America", "verb-object-subject");
    }
    @Override
    public void getInfo(){
        System.out.println(String.format("%s is spoken by %s people mainly in %s. The language follows the word order: %s. Fun fact: Ki'che' is an ergative language.", name, numSpeakers, regionsSpoken, wordOrder));
    }
}