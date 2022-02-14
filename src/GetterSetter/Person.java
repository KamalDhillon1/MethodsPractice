package GetterSetter;

public class Person {
   int height;
    int age;
    
    int getHeight() {
    	return height;
    }
    void setHeight(int updatedHeight) {
    	height=updatedHeight;
    }
    int getAge() {
    	return age;
    }
    void setAge(int updatedAge ) {
    	age=updatedAge;
    
    }
    boolean isPersonEligible(int height, int age) {
    	if (height >=90 & height<=200 && age>=12 & age<=60) {
    		return true;
    	}	 
    return false;
    	 	
    } 
} 	
  	
    
 



