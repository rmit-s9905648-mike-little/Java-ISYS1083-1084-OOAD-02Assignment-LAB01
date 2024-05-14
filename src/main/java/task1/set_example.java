package task1;

import java.util.*;
public class set_example
{
    public static void main(String[] args)
    {

        //Integer int_arr[] = {}
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> stringList = Arrays.asList("a", "b", "c", "test");
        Set<Integer> intSet = new HashSet<>(intList);


        Set<String> coresOffered = new HashSet<String>(Arrays.asList("P1", "OS", "SEF", "DC", "WP"));
        Set<String> electivesOffered = new HashSet<String>(Arrays.asList("C++", "PHP", "Web3D", "ICT", "AI"));

        Set<String> electives = new HashSet<String>();
        Set<String> cores = new HashSet<String>();

        //System.out.println(intSet);
        //System.out.println(intSet.size() );
        //System.out.println(stringList);
        //System.out.println(stringList.size());
        System.out.println(coresOffered);
        System.out.println(coresOffered.size());

        //check if 'WP' is contained in 'coresoffered
        System.out.println("Does \'coresoffered\' contain \'WP\'"+coresOffered.contains("WP") );
        cores.add("WP");
        System.out.println(cores);
        cores.remove("WP");
        System.out.println(cores);

        //@post.condition
        //System.out.println(electivesOffered);
        //ßSystem.out.println(electivesOffered.size());


    }// close public static void main(String[] args)

}// close public class set_example
