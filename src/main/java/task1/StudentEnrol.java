package task1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;





class StudentEnrol {
    private final Set<String> coresOffered = new HashSet<String>(Arrays.asList("P1", "OS", "SEF", "DC", "WP"));
    private final Set<String> electivesOffered = new HashSet<String>(Arrays.asList("C++", "PHP", "Web3D", "ICT", "AI"));
    private Set<String> electives = new HashSet<String>();
    private Set<String> cores = new HashSet<String>();

    // Add Invariant




    // Adding a core
    // ADD pre-condition




    // ADD post-condition

    public void addCore(String core) {
        cores.add(core);
    }




    // Adding an elective
    // ADD pre-condition




    // ADD post-condition

    public void addElective(String elective) {
        electives.add(elective);
    }





    // Removing a core
    // ADD pre-condition





    // ADD post-condition





    public void removeCore(String core) {
        cores.remove(core);
    }

    // Removing an elective
    // ADD pre-condition




    // ADD post-condition




    public void removeElective(String elective) {
        electives.remove(elective);
    }




    // Listing all courses enrolled
    public void display() {
        for (String course : cores) System.out.println(course);
        for (String course : electives) System.out.println(course);
    }
}
