package String;

public class impperformance {
    public static void main(String[] args) {
        // String series = "";                    (NOt a Modified version)
        // for(int i = 0 ; i<26;i++){
        //     char c = (char)('a'+i);
        //     System.out.println(c);
        //     series += c +",";
        // }
        // System.out.println(series);

        StringBuilder string = new StringBuilder();
        for(int i = 0 ; i<26;i++){
                char c = (char)('a'+i);
                string.append(c);
            }
            System.out.println(string.toString());
            string.toString();
            System.out.println(string);
    }
}
