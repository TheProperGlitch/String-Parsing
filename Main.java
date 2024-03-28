public class Main {
    public static void main(String[] args){
        System.out.println("Method 1: ");
        System.out.println("abc : " + Split("abc"));
        System.out.println("(ab)c : " + Split("(ab)c"));
        System.out.println("((a(bc))) : " + Split("((a(bc)))"));
        System.out.println("Method 2:");
        String[] test = {"abc," , "b"};
        System.out.println("\"abc\" and \"b\": " + Cut(test)[0] + " | " + Cut(test)[1]);
        String[] test2 = {"one two three!" , "two"};
        System.out.println("one two three!: " + Cut(test2)[0] + " | " + Cut(test2)[1]);

    }

    public static String Split(String str){
        int start = str.indexOf("(");
        if (!(start == -1)){
            return Split(str.substring(start+1));
        }
        int end = str.indexOf(")");
        if (end == -1) return str;
        return Split(str.substring(0, end));
    }

    public static String[] Cut(String[] strs){
        String[] parts = new String[2];
        int place = strs[0].indexOf(strs[1]);
        parts[0] = strs[0].substring(0, place);
        parts[1] = strs[0].substring(place + strs[1].length());
        return parts;
    }
}