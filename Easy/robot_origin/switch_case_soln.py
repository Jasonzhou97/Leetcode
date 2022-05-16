class Solution:
    def judgeCircle(self, moves: str) -> bool:
        #set up a graph system
        x = 0
        y = 0
        
        for move in moves:
            match (move):
                case "L":
                    x-=1
                case "R":
                    x+=1
                case "U":
                    y+=1
                case "D":
                    y-=1
            
        return x==0 and y==0
                    