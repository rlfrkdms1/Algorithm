
common = [1, 2, 3, 4]
result = 0

def arithmeticSeq(common) :
    d = common[1] - common[0]
    result = common[len(common)-1] + d
    return result

def geometricSeq(common) : 
    r = common[1] / common[0]
    result = common[len(common)-1] * r
    return result

if (common[1]-common[0]) == (common[2]-common[1]) :
    print(arithmeticSeq(common)) 
else : print(geometricSeq(common))
