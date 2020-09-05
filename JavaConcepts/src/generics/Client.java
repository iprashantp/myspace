package generics;

public class Client {
    public static void main(String[] args) {
        Storage<Integer, String, Character> storage1 = new StorageImpl<>(1,"prashant",'A');
        Client.getObjInfo(storage1);
        Storage<Integer, String, Boolean> storage2 = new StorageImpl<>(2,10,Boolean.TRUE);
        Client.getObjInfo(storage2);
    }
    public static void getObjInfo(Storage storage){
        System.out.println(
                storage.getKey().getClass().getName()+" "
                +storage.getValue().getClass().getName()+" "
                +storage.getLValue().getClass().getName()
            );
    }
}
