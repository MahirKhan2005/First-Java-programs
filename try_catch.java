public class try_catch {
    public static void main(String[] args) {
        try{
            System.out.println(1/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
