enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String arg[]) {
        // Status s=Status.Running;//0
        // Status s=Status.Success;//3
        Status[] ss = Status.values();
        for(Status s:ss){
            System.out.println(s);
        };
    };
};
