package ExCondition;

public class IsNumber {

    public static boolean isInteger(String s){
        if (s==null || s.equals("")) return false;
        try {
            int value = Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println("Day khong la so nguyen!");
            return false;
        }
        return true;

    }

    public static boolean isDouble(String s){
        if (s==null || s.equals("")) return false;
        try {
            double value = Double.parseDouble(s);
        }
        catch (NumberFormatException e){
            System.out.println("Day khong la so thuc!");
            return false;
        }
        return true;

    }

}
