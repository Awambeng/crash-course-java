package parttwo.chapterone;

public enum DaysOfWeek implements Manage {
    MONDAY(true){
        public String getHours(){
            return "9am - 3pm";
        }
    }, 
    TUESDAY(false){
        public String getHours(){
            return "9am - 5pm";
        }
    }, 
    WEDNESDAY(true){
        public String getHours(){
            return "9am - 7pm";
        }
    }, 
    THURSDAY(true){
        public String getHours(){
            return "9am - 9pm";
        }
    }, 
    FRIDAY(false){
        public String getHours(){
            System.out.println("testing");
            return "9am - 10pm";
        }
    }, 
    SATURDAY(false){
        public String getHours(){
            return "9am - 11pm";
        }
    }, 
    SUNDAY(true){
        public String getHours(){
            return "9am - 12pm";
        }
    };

    private DaysOfWeek(boolean test){
        System.out.println("constructing...");
    }
}

interface Manage{
    public abstract String getHours();
}