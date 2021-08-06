def findAngle(hour, mins):
 
    # find the position of the hour's hand
    h = hour * (360 // 12) + mins *((360 // 12) / 60)
 
    # find the position of the minute's hand
    m = (mins * 360) // (60)
 
    # calculate the angle difference
    angle = abs(h - m)
 
    # consider the shorter angle and return it
    if angle > 180:
        angle = 360 - angle
    return h
    #return int(angle)

hr = int(input("Enter Hours "))
mi = int(input("Enter Minuts "))
ang = findAngle(hr,mi)
print(ang)