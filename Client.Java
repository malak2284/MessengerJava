public class Client{
    public static void main(String[] args){
        private DatagramSocket datagramSocket;
        private InetAddress inetAddress;
        private byte[] buffer;

        public Client(DatagramSocket datagramSocket, InetAddress inetAddress){
            this.datagramSocket = datagramSocket;
            this.InetAddress=InetAddress;
        }

        public void sendThenReceive(){
            Scanner scanner = new Scanner(System.in);

            while(true){
                try{
                    String wiadomoscDoWyslania = scanner.nextLine();
                    buffer = wiadomoscDoWyslania.getBytes()

                    DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, inetAddress, 1234);
                    datagramSocket.send(datagramPacket);

                    datagramSocket.receive(datagramPacket);
                    String wiadomoscOdSerwera = new String(datagramPacket.getData(), 0, datagramPacket.getLength());

                    System.out.println("serwer mowi ze powiedziales: " + wiadomoscOdSerwera)
                } catch (IOException e){
                    e.printStackTrace();
                    break;
                }
            }
        }
    
    }

    public static void main(String[] args){
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress inetAddress = inetAddress.getByName("localhost");
        Client client = new Client(datagramSocket, inetAddress);
        client.sendThenReceive();
    }
}