# LunaGC-4.7.0

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
- 获取游戏版本REL4.7.0（如果你没有4.7.0客户端，可以在这里找到，包括音频文件）：

| 下载链接 | 包大小 | MD5校验码 |
| :---: | :---: | :---: |
| [GenshinImpact_4.7.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.001) | 10.0 GB | 0790ed842a1732fb9e5530a826828440 |
| [GenshinImpact_4.7.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.002) | 10.0 GB | 6ac391b6a3a185bc8ab1e431f67ecd25 |
| [GenshinImpact_4.7.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.003) | 10.0 GB | 36460a467de4901f517f8ed9be6b877c |
| [GenshinImpact_4.7.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.004) | 10.0 GB | d1c0d81ab7aff5d5fb490cff20b9b87f |
| [GenshinImpact_4.7.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.005) | 10.0 GB | fec57d6f7f78c04309f16dfc2207cd6f |
| [GenshinImpact_4.7.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/GenshinImpact_4.7.0.zip.006) | 6.70 GB | 84135fa7008156965514a6ec99c55c66 |
| [Audio_Chinese_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_Chinese_4.7.0.zip) | 13.6 GB | 974bc5df3f7d96de01b68f1aab0371e5 |
| [Audio_English(US)_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_English(US)_4.7.0.zip) | 15.9 GB | f577ea4624981b36789e24913d0f3745 |
| [Audio_Japanese_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_Japanese_4.7.0.zip) | 17.8 GB | f039da619e670259d7e57c4f5e84be9e |
| [Audio_Korean_4.7.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240524181522_P7n5afVhY8WeoVZb/Audio_Korean_4.7.0.zip) | 13.4 GB | 58c3fc8782f3d59b324dfd603fa93e6d |

- 确保安装Java并设置环境变量。
- 构建服务器（参考本指南中的“编译实际服务器”部分）。
- 解决反作弊弹窗以及补丁重命名问题
- 私服补丁使用教程
- 把mhypbase.dll和version.dll放到游戏本地根目录下
- 把mihoyonet.dll放到 GenshinImpact_Data/Plugins/mihoyonet.dll 目录中并进行替换
- 下载 [资源](https://gi2.pmagickline.xyz/other/game-data/4.7/resources.zip)，在下载的LunaGC文件夹中创建一个名为resources的新文件夹，然后在新文件夹中解压资源。
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
