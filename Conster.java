 class Sample{
    String Name;
    int Rollnum;

    Sample( String Nam,int num){
        System.out.println("this is default constractor");
        
        Nam=Name;
        num=Rollnum;
        

    }
    void display(){
        System.out.println("this is my new");


    }

}




public class Conster  {
    public static void main(String[] args) {
        Sample obj=new Sample("varshini",23);
        
        System.out.println(obj.Name);
        System.out.println(obj.Rollnum);
    
        
    
}
    
}
