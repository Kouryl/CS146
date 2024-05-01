import heapq
class lab8:
    def coinChange(self, coins, amount):
        heapq.heapify(coins)
        coinAmount = 0
        stack = []
        for i in coins:
            stack.append(coins[i])

        while (amount > 0):
            if len(stack) == 0 and amount > 0:
                return -1
            if stack[-1] <= amount:
                amount -= stack[-1]
                coinAmount += 1
            else:
                stack.pop()
        return coinAmount