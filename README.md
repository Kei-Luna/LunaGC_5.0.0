# LunaGC-5.0.0

[简中](docs/README_zh-CN.md)

My Discord https://discord.gg/8vSyTHVphj

Please contribute actively to this repository

# Setup Guide

This guide is very minimal and contains steps to just get your server and client up and running.
However, if you need a more detailed guide and help with the server please refer to GrassCutter's official repository and discord server.


## You'll need a proxy to connect to the server.
- This tutorial uses fiddler, check this [video tutorial](https://tutorials.freespyware.store/api/public/dl/viOvXvPH) to set it up if you don't know how.
- The script can be found in the docs folder, or by [this link](https://github.com/Kei-Luna/LunaGC_5.0.0/blob/main/docs/fiddlerscript.txt).

## Read the handbook (found at the end of the file)
## Some stuff mentioned here (such as wishing etc.) will not work.

## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get [NodeJS](https://nodejs.org/dist/v20.15.0/node-v20.15.0-x64.msi)
- Get game version REL5.0.0 (If you don't have a 5.0.0 client, you can find it here along with the audio files) :


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [GenshinImpact_5.0.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.001) | 10.0 GB | 20.0 GB | 1ebf5dbcbe43bebcda7a57a8d789092e |
| [GenshinImpact_5.0.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.002) | 10.0 GB | 20.0 GB | 57a67026c45d57c28e5b52e24e84cc04 |
| [GenshinImpact_5.0.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.003) | 10.0 GB | 20.0 GB | 5e66ff28eaf6ba89e49f153c0f077d34 |
| [GenshinImpact_5.0.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.004) | 10.0 GB | 20.0 GB | 39f014a760e27f77abed1989739c74c6 |
| [GenshinImpact_5.0.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.005) | 10.0 GB | 20.0 GB | 15f9405a199afba833f18fce288b9c7f |
| [GenshinImpact_5.0.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.006) | 10.0 GB | 20.0 GB | 881432ceab27987b1297c9eefb39f192 |
| [GenshinImpact_5.0.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/GenshinImpact_5.0.0.zip.007) | 3.78 GB | 7.57 GB | 951f91992b428385294baf9b6c764d49 |
| [Audio_Chinese_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_Chinese_5.0.0.zip) | 14.77 GB | 29.56 GB | 216b3e53f3c5c7e1290891696b2bbc66 |
| [Audio_English(US)_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_English(US)_5.0.0.zip) | 17.23 GB | 34.47 GB | ecd59f31ec48c50f9051fdad39603d67 |
| [Audio_Korean_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_Korean_5.0.0.zip) | 14.51 GB | 29.04 GB | 8bf09bd07413189b69a5a0512df97335 |
| [Audio_Japanese_5.0.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240816185649_LtymMnnIZVQfbLZ2/Audio_Japanese_5.0.0.zip) | 19.37 GB | 38.76 GB | 95efbd23e1bde2eb574f8090cc118109 |

- Or get the 4.8.0 -> 5.0.0 hdiffs:


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [game_4.8.0_5.0.0_hdiff_wZvKsUhQtnBEutrh.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/game_4.8.0_5.0.0_hdiff_wZvKsUhQtnBEutrh.zip) | 19.52 GB | 39.86 | ec0cc740e01c374cd53d48219c1a4aff |
| [audio_ko-kr_4.8.0_5.0.0_hdiff_gTmBNUAGPpXxrRKC.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ko-kr_4.8.0_5.0.0_hdiff_gTmBNUAGPpXxrRKC.zip) | 0.60 GB | 1.31 GB | 64c52d4065a5d5983b37faeb9796a3eb |
| [audio_ja-jp_4.8.0_5.0.0_hdiff_LumPhRraNOjGJMnG.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ja-jp_4.8.0_5.0.0_hdiff_LumPhRraNOjGJMnG.zip) | 0.71 GB | 1.63 GB | 934899593f7234bec937fca98c0b0bed |
| [audio_zh-cn_4.8.0_5.0.0_hdiff_ZZiDHvYQeHGKuFeP.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_zh-cn_4.8.0_5.0.0_hdiff_ZZiDHvYQeHGKuFeP.zip) | 0.62 GB | 1.35 GB | c1073373d6c7b3680217335dc346de50 |
| [audio_en-us_4.8.0_5.0.0_hdiff_vsfAECOkroqoZSqK.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_en-us_4.8.0_5.0.0_hdiff_vsfAECOkroqoZSqK.zip) | 0.74 GB | 1.58 GB | b5cb77749a0e2fc0e85b6b1ee319a7e9 |


- Make sure to install java and set the environment variables.
- Build the server (refer to "Compile the actual server" in this guide.)
- Put [Astrolabe.dll](https://github.com/Kei-Luna/LunaGC_5.0.0/raw/main/patch/Astrolabe.dll) in the local game root directory
- Download the [Resources](https://github.com/Kei-Luna/LunaGC_Resources_5.0.0), make a new folder called `resources` in the downloaded LunaGC folder and then extract the resources in that new folder.
- Set useEncryption, Questing and useInRouting to false (it should be false by default, if not then change it)
- Start the server and the game, make sure to also create an account in the LunaGC console!
- Have fun

### Getting started

- Clone the repository (install [Git](https://git-scm.com) first )
```
git clone https://github.com/Kei-Luna/LunaGC_5.0.0.git
```

- Now you can continue with the steps below.


### Compile the actual Server

**Sidenote**: Make sure to append the right prefix and suffix based on your operating system (./ for linux | .\ for windows | add .bat for windows systems when compiling server JAR/handbook).

**Requirements**:

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

- **Sidenote**: Handbook generation may fail on some systems. To disable handbook generation, append `-PskipHandbook=1` to the `gradlew jar` command.

- **For Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar
```
*If you are wondering, the first command is to set up the environment while the 2nd one is for building the server JAR file.*

- **For Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*If you are wondering, the first command is to make the file executeable and for the rest refer to the windows explanation.*

### You can find the output JAR in the project root folder.

### Manually compile the handbook
```shell
./gradlew generateHandbook
```

## Troubleshooting
- Make sure to set useEncryption and useInRouting both to false otherwise you might encounter errors.
- To use windy make sure that you put your luac files in C:\Windy (make the folder if it doesnt exist)
- If you get an error related to MongoDB connection timeout, check if the mongodb service is running. On windows: Press windows key and r then type `services.msc`, look for mongodb server and if it's not started then start it by right clicking on it and start. On linux, you can do `systemctl status mongod` to see if it's running, if it isn't then type `systemctl start mongod`. However, if you get error 14 on linux change the owner of the mongodb folder and the .sock file (`sudo chown -R mongodb:mongodb /var/lib/mongodb` and `sudo chown mongodb:mongodb /tmp/mongodb-27017.sock` then try to start the service again.)


## How to make or get custom banners?
- Well, you can get pre-made ones from this [github repo](https://github.com/Zhaokugua/Grasscutter_Banners)
- Rename the file you chose to download to Banners.json and replace it with the already-existing one in the data folder.
- The repo also offers a file which contains all of the banners, to use it follow the same procedure mentioned above.
### Making custom banners
- If you want to make a custom banner for a character or weapon, you'll need to know the prefabPath, the titlePath and the character/item IDs.
- Fun fact: You can set any item to be on the rateUp, even if it's a 4* instead of a 5*.

## Handmade Handbook (tested)
- Create accounts: /account <username>
- Get all achievements: /am grantall
- God mode: /prop god 1
- Enter a domain: /dungeon <ID>
- Unlimited stamina: /prop ns 0
- Unlimited energy: /prop UnlimitedEnergy 1
- Recharge energy: /er
- Set constellation for selected character: /setConst <number 1 to 6>
- Get rid of the skill cooldown: /stat cdr 99
- Change weather: /weather <sunny/rain/cloudy/thunderstorm/snow/mist>
- Change talent for selected character: /talent <n/e/q/all> <level> (n - normal attack only) (e - skill only) (q - burst only)
- Give items: /g <itemId|avatarId|all|weapons|mats|avatars> [lv<number>] [r<refinement number>] [x<amount>] [c<constellation number>] [sl<skilllevel>]
- Unlock all: /unlockall
- Change world level: /prop wl <number>
- Change AR: /prop player_level <number between 1 and 60>
- Change the game speed: /gamespeed <0.1|0.2|0.5|0.75|1.0|1.5|2.0|3.0>
- Get 9999 Intertwined fates: /g 223 x9999
- Get 9999 Acquaint fates: /g 224 x9999
- Get 9999 Mora: /g 202 x9999
- Get 9999 Primogems: /g 201 x9999
### Make sure to not include <> or [] in the commands! The stuff in <> means its required and the stuff in [] means its not required.
### How to get all of the stuff maxed out: /g all lv90 r5 c6 c6 sl10 | Then do a separate one for the materials: /g mats x99999
### Ways to TP around the map:

Method 1:

- 1: Unlock the map: /prop um 1
- 2: Open the map
- 3: Use the waypoints

Method 2:

- 1: Open the map
- 2: Place a fishing rod marker (the last one) where you want to teleport and mark it.
### How to get avatar/entity/material etc. IDs?
- Go to [ambr.top](https://ambr.top)
- Search up the material/avatar/enemy and then the ID of it should be in the URL of the site, for example I searched for the pyro hilichurl archer; the link for it is ambr.top/en/archive/monster/21010501/pyro-hilichurl-shooter so the ID for it will be 21010501.


### How to spawn monsters?
- Get the ID from the ambr.top link (above)
- Do /spawn <id> in the in-game chat. You can also find out more arguments that you can use to modify the monster hp etc by doing `/help spawn` or `/spawn` | Example: `/spawn 21010501`, that will spawn a pyro hilichurl. Give it more hp: `/spawn 21010501 hp9999` and you can find more about the arguments trough the method I mentioned above.

### How to use the brand new /uid command?
- Rich text is supported
- How to set custom UID: `/uid set changethistext` | bold: `/uid set <b>changethistext</b>` | italic: `/uid set <i>changethistext</i>` | combined: `/uid set <i><b>changethistext</b></i>` | colored text (you'll need a hex color code, you can easy get and pick one by search hex color picker on google now let's assume that you have done it): `/uid set <color=#698ae8>changethistext</color>`
- You can also include spaces like this: `/uid set <b>B O L D</b>`
- You can combine the bold, italic and colored text
- Restore to server-default UID: `/uid default`

## What doesn't work
- Wishing
- Quests
- Serenitea pot
- Abyss
- Mail
- Battlepass
- Events
- Claiming AR/Commission rewards
- Claiming bosses drops
- City reputation
- Character ascension
- Gadgets
- Forging
- Some inventory stuff
- Weapon refinement
- Registration in-game using the box when logging in for first time (use console to make account instead)
### Even more

## Credit

Repository containing the original Proto [XilonenImpact](https://git.xeondev.com/reversedrooms/XilonenImpact/src/commit/92c687cae20ba2dda20ceabe338d6e4125b19f7e/hk4e_proto/out/cmd.rs)