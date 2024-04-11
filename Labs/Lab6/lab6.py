
def canFinish(numCourses, prerequisites):
    finish = True
    in_degree = []
    for i in range(numCourses):
        in_degree.append(0)

    for i in range(len(prerequisites)):
        in_degree[prerequisites[i][0]] += 1

    for i in range(len(prerequisites)):
        if (in_degree[prerequisites[i][1]] != 0):
            finish = False

    return finish

