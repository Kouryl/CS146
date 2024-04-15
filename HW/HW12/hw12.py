import heapq

class hw12:
    def minCostToSupplyWater(self, n: int, wells: list[int], pipes: list[list[int]]) -> int:
        min = 0
        heapq.heapify(pipes)
        pipes.sort(key=lambda x: x[2])
        heapq.heapify(wells)
        pQ = pipes.copy()
        visited = [False] * n

        while pQ:
            if visited[pQ[0][0] - 1] and visited[pQ[0][1] - 1]:
                heapq.heappop(pQ)
            else:
                visited[pQ[0][0] - 1] = True
                visited[pQ[0][1] - 1] = True
                min += pQ[0][2]
                heapq.heappop(pQ)
        return min + wells[0]
