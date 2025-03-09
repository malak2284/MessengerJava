# UDP Client-Server Communication Example

Welcome to the **UDP Client-Server Communication** project! This Java-based application demonstrates a simple yet powerful way to perform real-time communication using UDP. It's a great example of network programming fundamentals, showcasing how a client and server interact over datagram sockets.

## Overview

This project consists of two main components:

- **Client:**  
  A console-based application that reads user input, sends messages via UDP to a server, and displays the echoed response.

- **Server:**  
  An echo server that listens for incoming UDP packets on a designated port, processes the messages, and sends them back to the originating client.

## Features

- **Real-time Messaging:**  
  Demonstrates low-latency communication using the UDP protocol.

- **Simple Echo Mechanism:**  
  The server echoes back every message it receives, providing immediate feedback to the client.

- **Interactive Console Interface:**  
  A user-friendly command-line interface for sending and receiving messages.

## How It Works

1. **Client Process:**  
   - Reads a message from the console.
   - Converts the message into bytes.
   - Sends a UDP packet containing the message to the server.
   - Waits for the echoed response and displays it.

2. **Server Process:**  
   - Listens on a specific port (e.g., 1234) for incoming UDP packets.
   - Receives a packet, extracts the sender's address and port.
   - Sends the same message back to the client, creating an echo effect.

