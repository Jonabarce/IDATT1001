



public class newString2 {
    private String text;
    private String letter;

    public newString2(String text) {
        this.text = text;

    }

    public String gettext() {
        return text;

    }


    public newString2 abbreviation() {

        String test = text;
        String text4 = "";

        String[] text2 = test.split(" ");
        for (int i = 0; i < text2.length; i++) {
            text4 += (text2[i].charAt(0));

        }


        return new newString2(text4);
    }


    public newString2 removeOne(String letter) {
        String test = text;
        String test2 = letter;

        String text4 = test.replaceAll(letter,"");




        return new newString2(text4);
    }






    @Override
    public String toString() {
        return text;

   }

}






