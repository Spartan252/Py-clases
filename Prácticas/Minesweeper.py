
import random

fil = 0
col = 0

minas = 99
while(minas != 0):
    n = random.randint(0, 479)

fil = n//30
col = n%30

if([fil][col] == 0):

