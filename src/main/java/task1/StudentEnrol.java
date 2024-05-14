package task1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class StudentEnrol
{
    //----------------------------------------------------------
    // state variables
    private final Set<String> coresOffered = new HashSet<String>(Arrays.asList("P1", "OS", "SEF", "DC", "WP"));
    private final Set<String> electivesOffered = new HashSet<String>(Arrays.asList("C++", "PHP", "Web3D", "ICT", "AI"));
    private Set<String> electives = new HashSet<String>();
    private Set<String> cores = new HashSet<String>();


    //--------------------------------------------------------------------------------------
    // Add core
    /*+
    * This method Will add the selected Course By the student To theList of Courses they have chosen
    *
    *
     */


    // Add Invariant
    // Adding a core
    // ADD pre-condition
    // ADD post-condition

    public void addCore(String core)
    {
        // @pre.condition: that “core” Selected Is contained in The courses offered “coresOffered”
        assert coresOffered.contains(core) : "course chosen must exist";

        cores.add(core);

        //@post.condition:
        assert (electivesOffered.size() + electives.size() < 7)&&(cores.size() > 2*electives.size()) :
                "Number of courses and electives chosen must be no more than 7 " +
                        "and the student must twice as many courses than electives";

        // post condition: the student has chosen a course.
        assert electivesOffered.size() >0 : " the student has chosen a course";

    }// close  public void addCore(String core)


    //--------------------------------------------------------------------------------------
    /*+
     * This method will add an Elective
     *
     */
    // Add an elective
    // Add Invariant
    // ADD pre-condition
    // ADD post-condition

    public void addElective(String elective)
    {


        // @pre.condition: that “elective” Selected Is contained in The electives offered “electivesOffered”
        assert electivesOffered.contains(elective) : "course chosen must exist";

        electives.add(elective);

        //@post.condition:
        assert (cores.size() + electives.size() < 7)&&( electives.size() < cores.size()/2 ) :
                "Number of courses and electives chosen must be no more than 7 " +
                        "and the student must have chosen less than half the number of electiuves to courses";

        // post condition: the student has chosen an electives.
        assert electives.size() >0 : " the student has chosen an elective";

    }// close public void addElective(String elective)


    //--------------------------------------------------------------------------------------
    /*+
     *This method will remove a chosen course "core"
     *
     */
    //
    // Add Invariant
    // ADD pre-condition
    // ADD post-condition

    public void removeCore(String core)
    {

        // @pre.condition: that “core” Selected Is contained in The cores offered “coresOffered”
        assert coresOffered.contains(core) : "course chosen to remove must exist";

        cores.remove(core);

        //@post.condition: number of cores selected must no be zero.
        assert cores.size() >=1 : "the student must chosen at least one core ";

    }// close  public void removeCore(String core)

    //--------------------------------------------------------------------------------------
    /*+
     *Removing an elective
     *
     */
    //
    // Add Invariant
    // ADD pre-condition
    // ADD post-condition

    public void removeElective(String elective)
    {
        // @pre.condition: that “elective” Selected Is contained in The electives offered “electivesOffered”
        assert electivesOffered.contains(elective) : "elective chosen to remove must exist";

        electives.remove(elective);

    }// close public void removeElective(String elective)



    //--------------------------------------------------------------------------------------
    // Listing all courses enrolled
    public void display()
    {
        for (String course : cores) System.out.println(course);
        for (String course : electives) System.out.println(course);
    }
}// close class StudentEnrol
