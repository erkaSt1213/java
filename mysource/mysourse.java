package mysource;
import java.util.Scanner;
public class mysourse {
public static   public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        mysourse in = new mysourse();
        String names[] = {"hantuguu","navchaa", "nasaa", "erka", "naraa"};
        System.out.println("Massiviin elementuud: ");
        for(int i=0; i<names.length; i++)
            System.out.print(names[i] + " ");
        System.out.println();
        System.out.print("haih neree oruulna uu: ");
        String findName = input.nextLine();
        in.findString(names, findName);
        System.out.println();
        System.out.print("haih temdeg tee oruulna uu: ");
        String findChar = input.nextLine();
        in.findChar(names, findChar);
        System.out.println();
    }
    public void findString(String arr[], String s){
       int count = 0;
       for(int i=0; i<arr.length; i++)
        {
           if(s.equals(arr[i]))
           count++;
        }
        System.out.print("tanii haisan "+ s +" gesen ner "+ count + " shirheg bn");
    }
    public void findChar(String ar[], String findChar){
        int count = 0;
        for(String name : ar){
            for(int i=0; i<ar.length; i++ ){
                if(name.charAt(i) == findChar.charAt(0)  ){
                    count++;
                } 
            }
           
        }
        System.out.print("tanii haisan "+ findChar +" temdegt "+ count +" shirheg bn");
}
