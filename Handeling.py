
from pathlib import Path

def readfileandfolder():
    path = Path('')
    items = list(path.rglob('*'))
    for i, items in enumerate(items):
        print(f"{i+1} : {items}")

def createfile():
    readfileandfolder()
    name = input("please tell your file name: - ")
    p = Path(name)
    with open(p,"w") as fs:
        data = input("what you want to write in this file:- ")
        fs.write(data)
    print(f"FILE CREATED SUCCESSFULLY")

print("press 1 for creating a file")
print("press 2 for reading a file")
print("press 3 for updating a file")
print("press 4 for deleting a file")

check = int(input("please tell your response:- "))

if check == 1:
    createfile()