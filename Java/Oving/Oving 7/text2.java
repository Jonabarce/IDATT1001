public class text2 {
    private String text;
    private String letter;
    private String letter2;


    public text2(String text){
        this.text = text;
    }



    public String gettext(){

        return text;
    }

    public int totalWords(){

        String test = text;

        int count = 0;




        String[] words = test.split("\\s+");


        for (String word : words) {
            double wordLength = word.length();

            count++;
        }



        return (count);
    }


    public double averageWord(){
        String test = text;

        int count = 0;
        double sum = 0;



        String[] words = test.split("\\s+");


        for (String word : words) {
            double wordLength = word.length();
            sum += wordLength;
            count++;
        }


        double average = 0;
        if (count > 0) {
            average = sum / count;
        }
        
        
        return (average);
    }

    public double averageNumberWord(){
        String test = text;

        int totalletters = totalWords();

        String[] periods = test.split("[.!:?]+");

        int average = totalletters / periods.length;

        return (average);

    }

    public text2 replaceWord(String letter, String letter2){
        String test = text;
        String test2 = letter;
        String test3 = letter2;

        String newText = test.replaceAll(test2,test3);

        return new text2(newText);




    }

    public text2 retrieveText(){
        String test = text;

        return new text2(text);
    }

    public text2 upperCase(){
        String test = text;

        String newText = test.toUpperCase();

        return new text2(newText);
    }


    @Override
    public String toString(){
        return text;


    }






}
