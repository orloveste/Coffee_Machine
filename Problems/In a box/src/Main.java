class Box {

    double height;
    double width;
    double length;

     double getVolume() {
         return this.height * this.width * this.length;
     }

    /*public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.getVolume());
    }*/
}
//Compilation error Main.java:35: error: method getVolume in class Box cannot be applied to
//  given types;         
// System.out.println(box.getVolume());                               
// ^   required: double,double,double   found: no arguments   
// reason: actual and formal argument lists differ in length 1 error

//Compilation error Main.java:32: error: method getVolume in class Box cannot be applied to 
// given types;         System.out.println(box.getVolume());                               
// ^   required: double,double,double   
// found: no arguments   reason: actual and formal argument 
// lists differ in length 1 error