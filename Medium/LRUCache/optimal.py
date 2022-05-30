from collections import deque

class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.deque = deque()
        self.Map = dict()
    def get(self, key: int) -> int:
        if key in self.Map:
            self.deque.remove(key)
            self.deque.append(key)
            return self.Map[key]
        else:
            return -1
    def put(self, key: int, value: int) -> None:
        if key not in self.Map:
            if self.capacity == len(self.deque):
                leastUsed = self.deque.popleft()
                del self.Map[leastUsed]
        else:
            self.deque.remove(key)
        
        self.deque.append(key)
        self.Map[key] = value


# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)