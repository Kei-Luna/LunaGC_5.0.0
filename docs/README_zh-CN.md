# LunaGC-5.0.0

我的Discord https://discord.gg/8vSyTHVphj

请积极为这个仓库贡献

# 安装指南

本指南非常简洁，仅包含启动服务器和客户端的步骤。
连接服务器需要使用Fiddler。
然而，如果你需要更详细的指南和服务器帮助，请参考GrassCutter的官方仓库和Discord服务器。

## 阅读手册（在文件末尾找到）
## 这里提到的一些内容（如祈愿等）将无法使用。

## 主要要求

- 获取 [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- 获取 [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- 获取游戏版本REL5.0.0（如果你没有5.0.0客户端，可以在这里找到，包括音频文件）：

| 下载链接 | 包大小 | 解压后的包大小 | MD5校验码 |
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


- 或者获取 4.8.0 -> 5.0.0 hdiff:


| 下载链接 | 包大小 | 解压后的包大小 | MD5校验码 |
| :---: | :---: | :---: | :---: |
| [game_4.8.0_5.0.0_hdiff_wZvKsUhQtnBEutrh.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/game_4.8.0_5.0.0_hdiff_wZvKsUhQtnBEutrh.zip) | 19.52 GB | 39.86 | ec0cc740e01c374cd53d48219c1a4aff |
| [audio_ko-kr_4.8.0_5.0.0_hdiff_gTmBNUAGPpXxrRKC.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ko-kr_4.8.0_5.0.0_hdiff_gTmBNUAGPpXxrRKC.zip) | 0.60 GB | 1.31 GB | 64c52d4065a5d5983b37faeb9796a3eb |
| [audio_ja-jp_4.8.0_5.0.0_hdiff_LumPhRraNOjGJMnG.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_ja-jp_4.8.0_5.0.0_hdiff_LumPhRraNOjGJMnG.zip) | 0.71 GB | 1.63 GB | 934899593f7234bec937fca98c0b0bed |
| [audio_zh-cn_4.8.0_5.0.0_hdiff_ZZiDHvYQeHGKuFeP.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_zh-cn_4.8.0_5.0.0_hdiff_ZZiDHvYQeHGKuFeP.zip) | 0.62 GB | 1.35 GB | c1073373d6c7b3680217335dc346de50 |
| [audio_en-us_4.8.0_5.0.0_hdiff_vsfAECOkroqoZSqK.zip](https://autopatchhk.yuanshen.com/client_app/update/hk4e_global/audio_en-us_4.8.0_5.0.0_hdiff_vsfAECOkroqoZSqK.zip) | 0.74 GB | 1.58 GB | b5cb77749a0e2fc0e85b6b1ee319a7e9 |

- 确保安装Java并设置环境变量。
- 构建服务器（参考本指南中的“编译实际服务器”部分）。
- 解决反作弊弹窗以及补丁重命名问题
- 私服补丁使用教程
- 把mhypbase.dll和version.dll放到游戏本地根目录下
- 下载 [资源](https://github.com/Kei-Luna/LunaGC_Resources_5.0.0)，在下载的LunaGC文件夹中创建一个名为resources的新文件夹，然后在新文件夹中解压资源。
- 将useEncryption、Questing和useInRouting设置为false（默认情况下应该是false，如果不是则更改）。
- 启动服务器和游戏，确保在LunaGC控制台中创建一个账户！
- 玩得开心

## 重要！
- 如果你使用cultivation并且知道自己在做什么，请在设置中禁用自动补丁RSA选项！（建议使用NotThorny's Cultivation修改，如果你真的想使用Cultivation）Cultivation会自动用4.0或4.6补丁修补游戏，这对LunaGC的4.7版本来说不太好。因此，在设置中取消选中自动修补RSA，然后如果Cultivation删除了rsa补丁dll，请再次将其放置在游戏文件夹中。

### 编译实际服务器

**附注**：请确保根据你的操作系统附加正确的前缀和后缀（./用于Linux | .\用于Windows | 编译服务器JAR/手册时添加.bat用于Windows系统）。

**要求**：

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 或更高版本

- **附注**：在某些系统上生成手册可能会失败。要禁用手册生成，请在gradlew jar命令后附加 -PskipHandbook=1。

- **对于Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar

```
*如果你想知道，第一条命令是设置环境，而第二条命令是构建服务器JAR文件。*

- **对于Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*如果你想知道，第一条命令是使文件可执行，其余的参考Windows解释。*

### 你可以在项目根文件夹中找到输出的JAR文件。

### 手动编译手册
```shell
./gradlew generateHandbook
```

## 疑难解答
- 确保将useEncryption和useInRouting都设置为false，否则可能会遇到错误。
- 要使用Windy，请确保将luac文件放在C:\Windy（如果不存在则创建该文件夹）
- 如果遇到与MongoDB连接超时相关的错误，请检查mongodb服务是否正在运行。在Windows上：按Windows键和R键，然后输入services.msc，查找mongodb server，如果没有启动则右键单击并启动。在Linux上，可以使用systemctl status mongod查看其是否正在运行，如果没有则输入systemctl start mongod。然而，如果在Linux上遇到错误14，请更改mongodb文件夹和.sock文件的所有者（sudo chown -R mongodb
/var/lib/mongodb和sudo chown mongodb
/tmp/mongodb-27017.sock然后再尝试启动服务）。


## 如何制作或获取自定义横幅？
- 你可以从这个[GitHub仓库](https://github.com/Zhaokugua/Grasscutter_Banners)获取预制的Banner文件。
- 下载后将文件重命名为`Banners.json`，然后替换data文件夹中已有的同名文件。
- 该仓库还提供包含所有Banner的文件，使用方法与上面提到的相同。

### 制作自定义Banner
- 如果你想为角色或武器制作自定义Banner，你需要知道`prefabPath`、`titlePath`和角色/物品的ID。
- 趣闻：你可以将任何物品设为rateUp，即使它是4星而不是5星。

## 手动手册（已测试）
- 创建账户：`/account <username>`
- 获取所有成就：`/am grantall`
- 上帝模式：`/prop god 1`
- 进入秘境：`/dungeon <ID>`
- 无限体力：`/prop ns 0`
- 无限能量：`/prop UnlimitedEnergy 1`
- 充能：`/er`
- 为选择的角色设置命座：`/setConst <number 1 to 6>`
- 移除技能冷却：`/stat cdr 99`
- 更改天气：`/weather <sunny/rain/cloudy/thunderstorm/snow/mist>`
- 更改选定角色的天赋：`/talent <n/e/q/all> <level>`（n - 普通攻击，e - 技能，q - 爆发）
- 给予物品：`/g <itemId|avatarId|all|weapons|mats|avatars> [lv<number>] [r<refinement number>] [x<amount>] [c<constellation number>] [sl<skilllevel>]`
- 解锁所有：`/unlockall`
- 更改世界等级：`/prop wl <number>`
- 更改冒险等级：`/prop player_level <number between 1 and 60>`
- 更改游戏速度：`/gamespeed <0.1|0.2|0.5|0.75|1.0|1.5|2.0|3.0>`
- 获取9999相遇之缘：`/g 223 x9999`
- 获取9999纠缠之缘：`/g 224 x9999`
- 获取9999摩拉：`/g 202 x9999`
- 获取9999原石：`/g 201 x9999`
### 请确保不要在命令中包含<>或[]！<>中的内容为必填项，[]中的内容为选填项。
### 如何将所有东西最大化：`/g all lv90 r5 c6 c6 sl10` | 然后单独为材料使用：`/g mats x99999`

### 在地图上传送的方法：

方法1：

- 1. 解锁地图：`/prop um 1`
- 2. 打开地图
- 3. 使用传送点

方法2：

- 1. 打开地图
- 2. 将一个钓鱼标记（最后一个）放在你想传送的地方并标记。

### 如何获取角色/实体/材料等ID？
- 访问[ambr.top](https://ambr.top)
- 搜索材料/角色/敌人，ID在网站的URL中，例如，我搜索了火元素丘丘人弓箭手，链接为`ambr.top/en/archive/monster/21010501/pyro-hilichurl-shooter`，所以ID是21010501。

### 如何生成怪物？
- 从上面的ambr.top链接获取ID
- 在游戏聊天中输入`/spawn <id>`。你还可以通过输入`/help spawn`或`/spawn`来了解更多可用参数 | 示例：`/spawn 21010501`，这将生成一个火元素丘丘人。增加其HP：`/spawn 21010501 hp9999`，你可以通过上述方法了解更多参数。

### 如何使用全新的`/uid`命令？
- 支持富文本
- 设置自定义UID：`/uid set changethistext` | 粗体：`/uid set <b>changethistext</b>` | 斜体：`/uid set <i>changethistext</i>` | 组合：`/uid set <i><b>changethistext</b></i>` | 彩色文本（你需要一个HEX颜色代码，你可以通过搜索hex颜色选择器轻松获取）：`/uid set <color=#698ae8>changethistext</color>`
- 你还可以像这样包含空格：`/uid set <b>B O L D</b>`
- 你可以组合使用粗体、斜体和彩色文本
- 恢复到服务器默认UID：`/uid default`

## 不可用功能
- 祈愿
- 任务
- 洞天
- 深渊
- 邮件
- 战令
- 活动
- 领取冒险等级/委托奖励
- 领取boss掉落
- 城市声望
- 角色突破
- 小道具
- 锻造
- 某些背包物品
- 武器精炼
- 游戏内首次登录注册（请使用控制台创建账户）
### 还有更多
