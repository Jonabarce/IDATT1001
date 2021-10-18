public class textTestKlient {
    private static text2 test = new text2( " This is a test ");



    public static void main (String[] args) {
        System.out.println(test.totalWords() + " Totalletters test ok ");
        System.out.println(test.averageWord() + " Averageword test ok ");
        System.out.println(test.averageNumberWord() + " Averagenumberword test ok ");
        System.out.println(test.replaceWord("a","e") + "Replaceword test ok ");
        System.out.println(test.retrieveText() + " Retrieve test ok ");
        System.out.println(test.upperCase() + " upperCase test ok ");
    }















}
