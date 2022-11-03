# PTR_Movie_Project
Assignment of Movie Information validation
The project created in Data Driven Framework with Page Object Module design pattern in that Data Member declared globally with acess level private 
using @FindBy annotation , Initialise within constructor Using PageFactory Class which utilise within method
Asserting the details of 2 sources (IMDB, Wiki)
TestClass i.e. Pushpa_The_Rise_IMDB_TestClass.java & Pushpa_The_Rise_Wiki_TestClass.java which are Main TestClasses For Execution
There is BaseClass and UtilityClass For Code Reuse purpose for Initialise Browser code in BaseClass.java and Accessing TestData from External source which stored once in UtilityClass.java
2 TestClass of IMDB and Wikipedia for comapring the Data which is Main class for Execution
Project having Different Folders like Browsers folder for storing path of browser on which browser you want to execute test Script
TestData folder for storing Excel sheet path for comparing data
PropertyFile Folder for storing the URL of the 2 Sources i.e. (IMDB, Wiki)
