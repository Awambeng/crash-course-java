
// class Shapes {
//     public static void main(String args[]) {
//         String[] shapes = {"Circle", "Square", "Triangle"};

//         // for (String shape : shapes) {
//             switch (shapes) {
//                 case "Square": System.out.println("Circle"); break;
//                 case "Triangle": System.out.println("Square"); break;
//                 case "Circle": System.out.println("Triangle"); break;
//                 // default: System.out.println("hello");
//             // }
//         }
//     }
// }

class Shapes{
    public static void main(String... args) {
        StringBuilder sb1 = new StringBuilder("eLion");
        String ejg = null;
        ejg = sb1.append("X").substring(sb1.indexOf("L"), sb1.indexOf("X"));
        System.out.println(ejg);
    }
}

class Diary {
    int pageCount = 100;
    int getPageCount() {
        return pageCount;
    }
    void setPageCount(int val) {
        pageCount = val;
    }
}

class ClassRoom {
    public static void main(String args[]) {
        System.out.println(new Diary().getPageCount());
        new Diary().setPageCount(200);
        System.out.println(new Diary().getPageCount());
        int a = 10;
        for (; a <= 20; ++a) {
            if (a%3 == 0) a++; else if (a%2 == 0) a=a*2;
            System.out.println(a);
        }
        
    }
}

class Phones {
    public static void main(String args[]) {
        String phones[]= {"BlackBerry", "Android", "iPhone"};
        for (String phone : phones){
            System.out.println(phone + phone.indexOf(phone));
        }
        
            /* REPLACE CODE HERE */
    }
}