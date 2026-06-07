---
title: "应用发布"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g022-publish"
section: "YNF-介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 介绍]
platform_version: "BIP V5"
source_type: ynf-docs
images: 15
---

# 应用发布

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/introduce/g022-publish | 所属：YNF-介绍

# [](#应用发布)应用发布

开发⼈员在开发租户下完成应⽤开发后，通过发布管理发布到对应环境下。

应用发布区分低代码和零代码端，且可以实现在工作台和友空间发布四种类型的应用，以实现不同需求，以下将详细介绍各种类型的应用发布流程。

## [](#1-低代码应用发布)1 低代码应用发布

低代码应用发布需要在对应应用的“发布管理”页面操作，以下是低代码应用发布的几种主要类型及其步骤：

首先，应用发布前都需要先到“发布管理”--“应用信息”，点击“新增服务”，选择需要发布的应用。
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low.29df39c7.png)
接下来，区分PC端和移动端介绍如何发布。

### [](#11-ynf-pc-native-应用发布去iframe)1.1 ynf PC native 应用发布(去Iframe)

**选择应用首页**：在发布管理页面，选择“应用首页”。通过应该首页可以将当前已经发布为服务的业务按分组组织成一个默认的首页页面，然后将这个首页页面发布到工作台指定菜单路径下。此种形式常用于用户个性化组织应用菜单，而不使用BIP工作台大菜单方式的场景。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low-pci.619ea038.png)**添加服务**：可以自行创建分组，在分组内可以添加前面页签中已经发布为服务的pc页面，右侧可随时看到首页的结构示意图。从服务列表中选择需要发布的服务（支持多选），并将其添加到首页中。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low-homepage.0770779c.png)
**发布为首页**：将首页结构组织好之后，可以点击右上角“发布为首页”，在弹框中定义首页名称、发布到BIP工作台的指定菜单路径、修改服务图标等。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low-pci2.e67c9936.png)

### [](#12-ynf-h5应用和小程序发布)1.2 ynf H5应用和小程序发布

移动端应用首页指将当前应用下的移动页面发布到友空间，并支持按分组结构生成移动首页发布到友空间，也支持指定某个页面发布。
**选择移动端应用首页**：在发布管理页面，选择“移动端应用首页”。
**添加服务**：从服务列表中选择需要发布的服务，可以选择“按分组结构生成首页”或“指定服务为首页”的方式添加服务。

- **按分组结构生成首页**：指的由开发者自行组织首页分组结构，每个分组中可以添加前面步骤中已经发布为服务的移动页面，右侧可随时看到分组结构的示意图。
- **指定服务为首页**：指的是将前面步骤中已经发布为服务的移动页面中的任意一个页面作为首页进行发布。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low-mobile.a77c2d40.png)

**发布到移动端**：完成服务添加后，在右上角点击“发布到移动端”按钮，在弹出页面中输入移动端页面名称、移动应用所属应用类别、服务图标、以及发布的具体终端。

- **友空间APP**：指的是友空间公有云版；
- **友空间私有版APP**：指的是私有版的友空间；
- **友空间微信小程序**：指的是友空间公有云版的微信小程序。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low-mobile2.d4c28ee9.png)

### [](#13-链接发布iframe)1.3 链接发布(iframe)

链接指的是将应用中的页面可以发布为第三方链接地址，用于第三方进行访问。支持添加多个页面的链接地址。
**选择发布类型**：在发布管理页面，选择“链接发布”选项，点击“添加链接”。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low-iframe.b0511b63.png)
**配置页面、有效期与登录方式**：支持选择列表页面或者指定单据编码的详情页，也可支持选择移动页面。支持配置链接地址的有效期、登录方式。

登录方式默认为友互通，也可选择手机号登录，如果是手机号登录，需要配置映射的友互通账号信息，才能保证该链接地址在通过手机号登录时能拿到友互通的口令进行访问该页面。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-low-iframe2.257b60f1.png)**生成链接**：完成上述设置后，点击“生成链接”按钮即可添加一条链接地址信息 。移动页面支持二维码直接扫码，pc页面仅支持链接地址。

## [](#2-零代码应用发布)2 零代码应用发布

零代码应用发布也在对应应用的发布管理页面操作，且发布操作更加清晰，以下是零代码应用发布的几种主要类型及其步骤：

### [](#21-ynf-pc-native-应用发布去iframe)2.1 ynf PC native 应用发布(去Iframe)

在应用发布页面填写发布PC端配置项，包括：
**导航目录**：该配置项可将应用添加到你所选择的导航目录下。
**菜单分组**：

- **按应用目录生成菜单**：按应用左侧目录生成菜单，融合显示于系统大菜单中。
- **单入口**：应用中不生成左侧页面菜单。

**入口页面**：当选择单入口菜单分组后，需要配置该项，选择入口页面，被指定页面将作为应用入口。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-zero-pc.72d21996.png)

### [](#2-2-ynf-h5-应用和小程序发布)2 2 ynf H5 应用和小程序发布

在应用发布页面填写发布移动端配置项，包括：
**移动分组**：该配置项可将应用添加到你所选择的分组下。
**发布终端**： 该配置项可选择你需要添加的终端，可以多选。

- **友空间APP**：指的是友空间公有云版；
- **友空间私有版APP**：指的是私有版的友空间；
- **友空间微信小程序**：指的是友空间公有云版的微信小程序。

**入口页面**：对于多页面应用可以配置应用的入口页面。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-zero-mobile.320839b5.png)

## [](#3-应用信息)3 应用信息

应用信息可以查看当前应用下所有已发布的服务清单、应用基本信息、桌面端和移动端的首页发布信息。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-inf.e235b649.png)
在该入口可以将应用下的页面发布为服务。

点击“新增服务”，弹窗选择指定业务对象下需要发布为服务的页面。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-inf2.d2d6bf27.png)
左侧按照业务对象进行选择，右侧为当前选中业务对象下的所有可被发布为服务的页面。
操作说明：

||操作||操作说明|
||页面组编码||页面建模中的一组页面（pc和移动）的页面编码|
||页面组名称||页面建模中的一组页面（pc和移动）的页面名称|
||页面终端||指页面建模中的一组页面中所包含的终端，图标展示|
||页面类型||标识该组页面的页面类型，如列表、详情、一主多子等|
||终端合并||勾选此项表示将不同终端的页面合并为一个服务进行发布。默认不勾选|

下一步，定义服务图标、服务编码和名称，确定发布。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-inf3.851cb3de.png)**注意：发布时，仅需要发布列表页即可，因为列表页发布后，会同时将列表页和详情页的按钮同时进行注册。无需单独再发布详情页。**

已发布的服务支持编辑、删除和加入迁移清单。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-inf4.ac72a178.png)
编辑可以更新已发布服务的图标、编码、名称。如果之前添加服务时没有合并终端发布，则编辑时可以选择合并的页面进行再次合并后发布。

删除则将该服务删除，从工作台中进行删除。
加入迁移清单确保迁移过程的顺利进行并减少潜在风险。

**工作台菜单管理**：指的是将已经发布为服务的页面挂接到BIP工作台中的各个菜单下，该按钮是一个快捷跳转方式，点击后直接进入到工作台的菜单管理界面，由开发者自行组织菜单，在菜单中可关联该应用中已发布的服务。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/publish-inf5.eb5c604d.png)

## [](#qa)Q&A

## [](#参考)参考