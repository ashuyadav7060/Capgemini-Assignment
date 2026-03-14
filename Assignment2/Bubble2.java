package Assignment2;
import java.util.*;
class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}

public class Bubble2 {
  public static void main(String[] args) {
    
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
     sc.nextLine();
  Student[] arr=new Student[n];
  for(int i=0;i<n;i++){

    String name=sc.nextLine();
    int marks=sc.nextInt();
    sc.nextLine();
     arr[i]=new Student(name,marks);
  }
   
    for(int i=0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-1-i;j++){
      if(arr[j].marks>arr[j+1].marks){
        Student temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
    }

   for(Student s:arr){
    System.out.println(s.name+": "+s.marks);
   }
    sc.close();
  }
}
