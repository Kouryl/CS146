public class Lab6 {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean finish = true;
        int[] in = new int[numCourses];

        for (int i = 0; i < in.length; i++) { //initialize all in-degrees to 0
            in[i] = 0;
        }

        for (int i = 0; i < prerequisites.length; i++) { //find in-degrees of all courses
            in[prerequisites[i][0]] += 1;
        }

        for (int i = 0; i < prerequisites.length; i++) {
            if (in[prerequisites[i][1]] != 0) {
                //if pre req has incoming edges, then we can't finish.
                finish = false;
            }
        }
        return finish;
    }
}
