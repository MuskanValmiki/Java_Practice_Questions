enum Status{
    Running, Failed, Pending, Success;
};

public class Enumif_Switch {
    public static void main(String arg[]){
        Status s= Status.Success;
    
        switch(s){
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        };
        // if(s==Status.Pending)
        //     System.out.println("Please wait");
        // else if(s==Status.Failed)
        //     System.out.println("Try Again");
        // else if(s==Status.Running)
        //     System.out.println("All Good");
        // else
        //    System.out.println("Success");
        // Status[] ss=Status.values();
        // for(Status s:ss){
        //     System.out.println(s + " : "+s.ordinal());
        // }
    };
};
