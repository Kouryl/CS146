import java.util.*;
public class Lab6 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean finish = true;
        ArrayList<Integer> in = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) { //initialize all in-degrees to 0
            in.add(0);
        }

        for (int i = 0; i < prerequisites.length; i++) { //find in-degrees of all courses
            in.set(prerequisites[i][0], in.get(prerequisites[i][0]) + 1);
        }

        for (int i = 0; i < prerequisites.length; i++) {
            if (in.get(prerequisites[i][1]) == 0) {
                in.set(prerequisites[i][0], in.get(prerequisites[i][0]) - 1); //decrement in degrees
            }
        }

        for (int i = 0; i < prerequisites.length; i++) {
            if (in.get(prerequisites[i][1]) != 0) {
                finish = false;
            }
        }
        return finish;
    }
}
