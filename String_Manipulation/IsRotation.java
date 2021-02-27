package String_Manipulation;

public class IsRotation {

    private static boolean isRotationOfOther(String s1 , String s2){

        if(s1 == null || s2 == null){
            return false;
        }

        if(s1.length() != s2.length()){
            return false;
        }

        String newString = s1 + s1;
        if(newString.contains(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isRotationOfOther("ABCD", "DACB"));
        System.out.println(isRotationOfOther("ABCD","DABC"));
    }
}
