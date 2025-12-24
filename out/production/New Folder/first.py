import bcrypt
pw = b'NityaSingh'
s = bcrypt.gensalt()

h = bcrypt.hashpw(pw, s) # Hash password
print(s)
print(h)
