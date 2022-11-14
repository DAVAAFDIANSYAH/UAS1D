public class utsmethod{
    public static void ubahhurufEtostar(String[]java){
        for (int index=0;index<java.length;index++){
            System.out.println(java[index].replace("e","*"));
        }

    }

    public static void main(String[] args) {
        String[] _block = new String[]{"triangle", "cubes", "circle"};
        ubahhurufEtostar(_block);

    }
}
