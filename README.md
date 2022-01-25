# ViewModelWithFactoryDemo
 this is a view model simple demo which is describe that how you can use viewmodel in your project.
 
This is a basic view model.


### **Some questions on view model factory**


**What is Factory method pattern?**

Factory method pattern is a creational design pattern which will uses factory methods to create objects.
A factory method which will return instance of the same class.

 

**Why we will use FactoryMethod pattern while working with ViewModel object?**

To pass arguments to ViewModel constructor is not a proper way and is not support to pass the arguments upon creating the instance.
To pass arguments to the ViewModel constructor we will use the Factory Method Pattern.


**How to create ViewModelfactory pattern method?**

override fun <T : ViewModel?> create(modelClass: Class<T>): T {
   if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
       return ScoreViewModel(finalScore) as T
   }
   throw IllegalArgumentException("Unknown ViewModel class")
}



for any help you can contact me on linkedin

![ViewModelScreenShoot](https://user-images.githubusercontent.com/42467336/150928295-053fffda-a42b-4411-9575-399803b5ed1b.jpg)






