package Assignment2;

import java.util.Scanner;

class Students{
  String name;
  int marks1;
  int marks2;
  int marks3;
  Students(String name,int marks1,int marks2,int marks3){
    this.name=name;
    this.marks1=marks1;
    this.marks2=marks2;
    this.marks3=marks3;
  }
  
}
public class Bubble3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
     sc.nextLine();
  Students[] arr=new Students[n];
  for(int i=0;i<n;i++){

    String name=sc.nextLine();
    int marks1=sc.nextInt();
    sc.nextLine();
    int marks2=sc.nextInt();
    sc.nextLine();
    int marks3=sc.nextInt();
    sc.nextLine();
     arr[i]=new Students(name,marks1,marks2,marks3);
  }
for(int i=0;i<n-1;i++){
    for(int j=0;j<n-1-i;j++) {
        if (arr[j].marks1>arr[j+1].marks1){
            Students temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        } 
        else if(arr[j].marks1==arr[j+1].marks1) {
            if (arr[j].marks2>arr[j+1].marks2) {
                Students temp=arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            } 
            else if(arr[j].marks2==arr[j+1].marks2) {

                if (arr[j].marks3>arr[j+1].marks3){
                    Students temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

   for(Students s:arr){
    System.out.println(s.name+" "+s.marks1+" "+s.marks2+" "+s.marks3);
   }


  }
}
