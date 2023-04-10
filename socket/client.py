import socket

HOST = 'localhost'  # El servidor se encuentra en la misma máquina
PORT = 5000         # Puerto utilizado por el servidor

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect((HOST, PORT))
    message = input("Escriba un mensaje: ")
    s.sendall(message.encode())
    data = s.recv(1024)

print('Mensaje recibido:', data.decode())