# APCSA Assignment 1 Instructions!
Author: Will Gass

## Instructions for Class Day 10/26/2023:

### For Ms. Mahuta --
1. Have students create GitHub account. I would recommend PERSONAL EMAIL!
2. Invite students to the GitHub classroom, then have them select their name from the roster.
3. Have students accept the link to the assignment and go to their own repo. From there, they should be ok to continue the instructions.

### Setting up VS Code
Luckily, Java makes this easy for Mac/Windows users. If that applies to you, go to https://code.visualstudio.com/docs/languages/java and follow the instructions there.
Download the coding pack for your appropriate operating system, let it install with the setup wizard, and then you should be finished for this section.
<img src="./images/vscode_wm.png">

If you are on Chromebook, it looks like you have to take a couple extra steps. I haven't done this myself, so there may be some troublehsooting involved.
I also can't emulate this, so the best I can do is give you pointers.
Start at this page:
https://code.visualstudio.com/blogs/2020/12/03/chromebook-get-started
And follow the instructions from start to finish.

Now, go to this page and install our Java Development Kit:
https://learn.microsoft.com/en-us/java/openjdk/download/

At this point, you should be in the same position as Mac + Windows, so feel free to go to the next section. If not, we will need to find some time to troubleshoot.

### Downloading GitHub Desktop (Mac + Windows)
Github makes a desktop app that will make your life 1000x easier with this course.  
Navigate to https://desktop.github.com/, download the desktop app and install it. Ms. Mahuta can walk you through the setup involved, but it's important you sign in with the account you just created.  
Once you've done that, we can clone your student repo!! Click on the BIG GREEN '<> CODE' button, and then 'Open with GitHub Desktop'
If you've configured VS Code as your Code Editor with GitHub desktop, you should be able to edit 

### Using Git (Chromebooks)
GitHub doesn't have a desktop app for Linux, so this will be harder for you all. Much, much harder.  
Inside your linux terminal, run:  
`sudo apt update`  
`sudo apt install git`  
To verify this worked, run:  
`git --version`  
Next, run   
`git config --global user.name "YOUR NAME"`  
`git config --global user.name "YOUR EMAIL"`  
And replace "YOUR NAME" with your name, and "YOUR EMAIL" with the email you've used for your GitHub account.  
Almost done.  
Launch up a new instance of Linux terminal.   
Run the following commands:  
`mkdir AP-CSA`  
`cd AP-CSA`  
Now, click the BIG GREEN '<> CODE' button, click HTTPS, and then copy the link to your clipboard.  
Run the following command  
`git clone <LINK>`  
where <LINK> is the link you just copied.  

