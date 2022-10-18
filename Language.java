class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    Language(String passName, int passNumSpeakers,
             String passRegionsSpoken, String passWordOrder){
        this.name = passName;
        this.numSpeakers = passNumSpeakers;
        this.regionsSpoken = passRegionsSpoken;
        this.wordOrder = passWordOrder;

    }
    protected void getInfo() {
        System.out.println(String.format("%s is spoken by %s people mainly in %s. The language follows the word order: %s.", name, numSpeakers, regionsSpoken, wordOrder));
    }
    protected void makeChange(String changedRegionOrOrder) {
        if (changedRegionOrOrder.contains("verb")) {
            this.wordOrder = changedRegionOrOrder;
        } else {
            this.regionsSpoken = changedRegionOrOrder;
        }
    }
    protected void makeChange(int changedNumSpeakers) {
        this.numSpeakers = changedNumSpeakers;
    }

    public static void main(String[] args) {
        Language pain = new Language("Pain", 5, "America", "subject-verb-object");
        Language mayan = new Mayan("Ki'che", 2330000);
        Language tibetan = new SinoTibetan("Mandarin Chinese", 23);
        Language whoins = new SinoTibetan("Burmese", 23);
        Language[] languages = {pain, mayan, tibetan, whoins};
        mayan.makeChange("Smokey");
        for(Language language : languages){
            language.getInfo();
        }
    }
}