position=input()
column=['a','b','c','d','e','f','g','h']

x=int(position[1])
y=column.index(position[0])+1

move_type=[[2,-1],[2,1],[1,2],[-1,2],[-2,1],[-2,-1],[-1,-2],[1,-2]]

result=0

for move in move_type:
    dx=x+move[0]
    dy=y+move[1]

    if 1<=dx<=8 and 1<=dy<=8:
        result+=1
    
print(result)
    

