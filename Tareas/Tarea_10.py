
#A



#B - BIEN
"""
num = 1
while not num == 0:
    num = int(input())
    if num == 0:
        break
    elif(num / 11 == num //11):
        print("SI")
    else:
        print("NO")
"""


#C
"""
n_datos = int(input())

for x in range(n_datos):
    i = 0
    j = 0
    descendente = 0
    sec = []
    sec_datos = input()
    sec = sec_datos.split(" ")
    sec_ord = sorted(sec)
    longitud = len(sec)

    for y in range(longitud - 1):
        if sec[y] > sec[y+1]:
            descendente += 1

    for z in range(longitud):
        if(sec[z] != sec_ord[z]):
            i = z+1

    for a in range (i +1, longitud):
        if(sec[z] != sec_ord[z]):
            j = z+1
            print()

    if(sec == sec_ord):
        print("Ordeneda")
    elif(sec != sec_ord and descendente <= 2):
        print("Casi ordenada: intercambiar", i, "y", j)
    elif(sec != sec_ord and descendente >= 2):
        print("Desordenada")
    print(sec)
    print(sec_ord)
"""
"""
i = 0
j = 0
descendente = 0
sec = []

n_datos = int(input())

sec_datos = input()
sec = sec_datos.split(" ")
sec_ord = sorted(sec)

for x in range(n_datos):
    if sec[x] != sec_ord[x]:
        descendente += 1
        print("descendente")


for z in range(n_datos):
    if(sec[z] != sec_ord[z]):
        i = z+1
        break

for a in range (i-1, n_datos):
    if(sec[a] != sec_ord[a]):
        j = z+1
        break

if(sec == sec_ord):
    print("Ordenada")
elif(sec != sec_ord and descendente <= 2):
    print("Casi ordenada: intercambiar", i, "y", j)
elif(sec != sec_ord and descendente >= 2):
    print("Desordenada")

print(sec)
print(sec_ord)
"""

#D

"""
n_entradas = int(input())
carros = input()

lis_car = carros.split(" ")
lis_car.sort()

print(lis_car)

for x in range(n_entradas):
    z = lis_car.count(x)
    print(lis_car)

    for y in range(z):
        lis_car.remove(lis_car[x])
        y += 1
    print(lis_car.count(lis_car[x]))
    x += 1
"""

n_entradas = int(input())
carros = input()

lis_car = carros.split(" ")
lis_car.sort()

for x in range(n_entradas):
    z = lis_car.count(x)

    if lis_car.count(lis_car[x]) >= 2:
        print(lis_car[x])
        break

#E



#F



#G



#H