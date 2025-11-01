class ByteName {
    public static void main(String[] args) {

        byte[] nameArray = { 68, 105, 118, 121, 101 };
        String name = new String(nameArray);
        System.out.println("Name from byte array: " + name);
        

        byte[] emailArray = { 100, 105, 118, 121, 101, 46, 98, 104, 97, 116, 110, 97, 103, 97, 114, 64, 103, 109, 97, 105, 108, 46, 99, 111, 109 };
        String email = new String(emailArray);
        System.out.println("Email from byte array: " + email);
    }
}
