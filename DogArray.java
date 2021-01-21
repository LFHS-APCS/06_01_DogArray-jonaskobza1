public class DogArray
{

    /**
     *  Returns the index of the youngest dog in the given array
     */
     
    public static int getYoungestIndex(Dog[] dogs)
    {
     int lowest = dogs[0].getAge();
      int lowestIndex = 0;
        for (int i = 0; i < dogs.length; i++){
          int theAge = dogs[i].getAge();
          if (theAge < lowest){
            lowest = theAge;
            lowestIndex = i;
          }
    
          }
          
          return lowestIndex;
        }

        
        
    

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
      int lowest = dogs[0].getAge();
      int lowestIndex = 0;
        for (int i = 0; i < dogs.length; i++){
          int theAge = dogs[i].getAge();
          if (theAge < lowest){
            lowest = theAge;
            lowestIndex = i;
          }
    
          }
          
          return dogs[lowestIndex].getName();
        }

    }

