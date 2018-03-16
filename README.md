### Introduce
About week ago I upload an overlay [NTFSFIX-GUI App](https://github.com/dominico2000/NTFSFIX-GUI). I'm a fan of Linux system and I want to popularize it so I decided to make more programs like that. I decided to make from that a series named LGT - Linux Graphical Tools.

Today I created graphical overlay for Linux console tool called *shred*. Thats tool can help you to permanenty destroy sensitive (or not :) ) data (files) by overwriting it few times. Files after that operation were had been unrestorable. You can use it for destroying data on disks too (but for SSD better method is buld-in SecureErase mode ,because it remove data from service space too). 

### Features
- Enforcing shred
- Changing number of overwriting iterations
- Removing file after overwrite
- Overwriting by zeros 
- Direct output from ntfsfix in output window 

### Technology Stack
- Java 8
- JavaFX (FXML)
- Linux Bash Command for launching *shred* tool

### Screenshots
![pow.png](https://res.cloudinary.com/hpiynhbhq/image/upload/v1521275346/hqxjxjzwojbh2dk08fky.png)

### Dependencies
- shred (console tool)

### Instalation
1. Download shred-gui_stable-x.x.x.tar.gz from here package and untar it using following command: ```tar -zxvf shred-gui_stable-x.x.x.tar.gz```.  
2. Make sure that you have shred. If you don't install it.  
3. Run install script with root. You can do it usually by using: ```sudo ./install```.  
4. Gratulations! *SHRED-GUI* is installed on your computer. Now you can run it by call ```shred-gui``` or create shortcut for it.  

### Problems
If you have any problems with my app you can contact with me on Discord by dominico2000#8230.

### Join LGT
If you want to make grapical overlay for other linux tool  for LGT Project contact with me on Discord by dominico2000#8230 

### How to contribute
If you want to contribute that project you can make Pull Request or contact with me on Discord by dominico2000#8230.
