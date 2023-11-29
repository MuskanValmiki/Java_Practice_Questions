//by using sealed keyword we can specify which class can inherit main class so here only B,C can inherit the class of A.
// if gave error so we need to specify with B,C with final so that other class cannot inherit that.
//this sealed keyword use in java 17 .

// sealed class A permits B,C{

// }

// final class B extends A{

// }

// final class C extends A{

// }

// class D{

// }

// public class SealedClassDemo {
//     public static void main(String arg[]){

//     };
// };
