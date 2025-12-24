import bcrypt
pw = b'GeekPassword'
s = bcrypt.gensalt()

h = bcrypt.hashpw(pw, s) # Hash password
print(s)
print(h)