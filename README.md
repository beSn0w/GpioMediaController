# GpioMediaController

Hi, If you're reading this that means you've found my very crude program to switch video's on a raspberry pi using the gpio.

## Usage
This program is only for use with a raspberry pi for now, there are currently no plans to update this for any other unix devices.

You'll need to download Java to your pi to run this program, do this by running (while you're at it also update your pi, and install omxplayer):
```
sudo apt-get update
sudo apt-get install java omxplayer
```
To see if java has been correctly installed or not use:
```
java --version
```
If it outputted the current version of java then huray you installed it correctly.

To run this program go to the directory where you put the `.jar` executable and run:
```
java -jar GpioMediaControllerV2-0.1.0.jar
```

If everything went well it should be working. (if not submit an issue ticket, it's still in development after all)

I'd also recommend using this in a console environment instead of the desktop environment. this takes care of the desktop between video's.
Just run: 
```
sudo raspi-config
```
then select system, then boot, then switch it to 'Console Autologin'
