How to upload code from Eclipse to GitHub remote repository  i.e., Code from IDE to GitHub:
IDE New Folder to New Repository:<br>
Steps:
1.	Create New remote Repository
2.	Copy the URL of New remote Repository
3.	In IDE Eclipse->Windows->Show View->Other->Git Folder->Git Repositories

![Picture1](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/fbcffa32-8cdc-4d33-b809-a399c902e849)<br>
![Picture2](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/84a3da41-6d0f-4ac2-8b39-3258e2f9ecbf)<br>
Output: “Git Repositories” window will be opened with three links as shown below:<br>
a.	Add an existing local Git Repository<br>
b.	Clone a Git Repository<br>
c.	Create a new local Git Repository<br>
![Picture3](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/303f556d-9f72-4614-b667-f8a4f4ed5bfd)<br><br>
4.	Click “Clone a Git Repository” link-> “Clone Git Repository”-> “Source Git Repository” window opens.<br>
5.	In the “Location” ->’URL ‘ textbox-> give the copied url of new remote repository<br>
6.	Click Next button-> warning message “Source Git Repository is empty.”<br><br>
![Picture4](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/7f40f7e5-363b-4277-9b9b-d70491181592)<br><br>
7.	Ignore the above warning message and click Next button.<br><br>
![Picture5](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/c815b553-cd56-459d-921b-0ebfce851135)<br><br>
8.	In the “Local Destination” ->Click Browse and select the Local Destination and will be displayed in the ’Directory ‘ textbox<br>
9.	Click ‘Finish’ button.<br><br>
![Picture6](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/4a12f734-1897-46c6-85ce-3a7e01c0d135)<br><br>
10.	The Git Repository tab (located next to console tab) will display the new repository folder with .git file in it.<br><br>
![Picture7](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/1a7122df-d88e-4639-a5f0-503815f3508b)<br><br>
11.	After git initialization, to move the project folder from IDE Eclipse to remote repository, the steps to be followed in Eclipse are:<br><br>
a.	Project folder -> Team-> Share Project-> Configure Git Repository popup window will be opened<br><br>
![Picture8](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/82d15c90-2eef-4f8c-a21a-d5e8215daa1e)<br><br>
b.	Project Folder location in the local machine with \.git should be given in the Repository textbox. For example  C:\Users\LPrab\git\JavaLesson\.git<br><br>
c.	Click Finish button.<br><br>
![Picture9](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/1e100c6a-5989-4665-a8d9-90870bad7044)<br><br>
Note: Question marks will be displayed in all the files of the folder which means all the files are included in the working folder(git copy folder)<br><br>
![Picture10](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/0aaba620-cc5e-440a-9183-5e90b9b19785)<br><br>
d.	Project folder -> Team-> Add to Index<br><br>
![Picture11](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/aab38588-0752-4072-8c23-d40ebfad3409)<br><br>
Note: Plus marks will be displayed in all the files of the folder which means all the files are added to the Staging area<br><br>
![Picture12](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/f9ff61b3-061e-4bf5-bf40-fc6ac76a9b4f)<br><br>
e.	Project folder -> Team-> Commit<br><br>
![Picture13](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/efb089f1-efc2-4e80-8d47-df1e5603df76)<br><br>
Note: We need to give commit message which committing the code from Eclipse. Hence follow the below steps:<br><br>
  I.	Eclipse->Window->Show View->Other-> Git Folder->Git Staging->Open button-> New Git Staging window will be opened next to the console window in Eclipse.<br><br>
![Picture14](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/e4ebcde2-3b9f-4aa1-9510-39506d29d9ac)<br><br>
II.	Commit Message window-> Give the commit message-> Commit and Push button-> Login Authentication popup window ->Username and Password should be given in their respective textboxes->'Push Branch Master' window will be displayed<br><br>
![Picture15](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/5c35d4a6-3ffc-4ea5-93c4-3f752957d8a3)<br><br>
![Picture16](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/f4073a0f-402a-4a25-9ea5-ba6942f3d860)<br><br>
![Picture17](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/87009f99-5543-47f5-92fc-0f425bcff8fb)<br><br>
![Picture18](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/603a00c9-261e-42dd-b0c4-bfd9229efe59)<br><br>
![Picture19](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/0e4a6836-6c2b-4619-9a03-c08a00c1e620)<br><br>
![Picture20](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/8335cceb-a8b7-41f3-b912-012c601ff241)<br><br>
![Picture21](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/a0c1be30-320c-4a00-9159-715e4d94049b)<br><br>
![Picture22](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/ab46a37b-ba00-429b-858d-0ec7fe7ced86)<br><br>
![Picture23](https://github.com/LavanyaPrabhakar/JavaLesson/assets/117753230/9e974fd8-f8a0-4872-8606-d18c6af1dc8e)<br><br>

