# ViewModelDemo
 this is a view model simple demo which is describe that how you can use viewmodel in your project.
 
This is a basic view model.

some questions on view model

What is ViewModel?
Viewmodel is a Jetpack component, The class is designed to store and Manage the UI related data.
To handle data upon Lifecycle changes of activity/application, Like Screen orientation changes.

 

How to create ViewModel class in Android
To work with ViewModel we need to create a class that should be extends from ViewModel class.

 

How to instantiate ViewModel Class?
We can instantiate ViewModel class by two way

With default constructor(new key word in java)
With ViewModelProvider class
Class MyViewModel() extends ViewModel{
}
    1=> MyViewModel obj=new MyViewModel()
    1=> MyViewModel obj= ViewModelProvider(this).get(MyViewModel.class)


    
Note: Always use ViewModelProvider to create ViewModel objects rather than directly instantiating an instance of ViewModel.

 

Why we need to create ViewModel object with ViewModelProvider class?
Create ViewModel Object with ViewModelProvider    
1) It will return an existing viewmodel instance if already exists, other wise create new instance and return it.
2) It will create the ViewModel instance with the given Scope (Activity/Fragment)
3) The Instance is alive as long as the current scope is alive.

 

What is onCleared() method?
The onCleared method is a lifecycle method of viewmodel. This method will called when the Viewmodel is destroy.
So when we want to clear up any resources we need to do in this method.

for any help you can contact me on linkedin

![ViewModelScreenShoot](https://user-images.githubusercontent.com/42467336/150928295-053fffda-a42b-4411-9575-399803b5ed1b.jpg)






