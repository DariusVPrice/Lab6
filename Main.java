
class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    MyMap<String, Integer> CreditHours = new MyHashMap<>();

    CreditHours.put("IT-1025", 3);
    CreditHours.put("IT-1050", 3);
    CreditHours.put("IT-1150", 3);
    CreditHours.put("IT-2310", 3);
    CreditHours.put("IT-2320", 4);
    CreditHours.put("IT-2351", 4);
    CreditHours.put("IT-2650", 4);
    CreditHours.put("IT-2660", 4);
    CreditHours.put("IT-2030", 4);

    System.out.println(CreditHours.containsKey("IT-1025"));
    System.out.println(CreditHours.containsKey("IT-2110"));

    System.out.println("All Credit Hours:");
    for (Integer hours : CreditHours.values()) {
      System.out.println(hours);
    }

    CreditHours.remove("IT-1025");
    CreditHours.remove("IT-2110");

    System.out.println("All Credit Hours:");
    for (Integer hours : CreditHours.values()) {
      System.out.println(hours);
    }

    
  }


  
}