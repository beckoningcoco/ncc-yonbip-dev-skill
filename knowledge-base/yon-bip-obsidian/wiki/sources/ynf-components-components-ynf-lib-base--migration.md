---
title: "迁移清单 Migration"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--migration"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 12
---

# 迁移清单 Migration

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--migration | 所属：YNF-组件

# [](#迁移清单-migration)迁移清单 Migration

迁移数据的组件。

import { Migration } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要迁移数据时。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|

## [](#迁移组件具体使用规则以及action配置)迁移组件具体使用规则以及Action配置

### [](#1拖组件)1.拖组件

首先，在设计器界面先拖一个迁移组件

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1717665769681-e799b8e4-cc65-4dea-8c6e-23284ddb8017.7dacf732.png)

### [](#2导入action)2.导入Action

然后目前迁移组件是有两个action（批量加入迁移清单和单个加入迁移清单）

需要在设计器左侧的action中导入这两个action

先左侧选择数据，再选择Actions

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1717728038944-7d26c9de-1256-430a-ad8f-f1c5b3ab3960.40121354.png)

然后右键Actions，点击插入，选择迁移类，然后导入这两个action

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1717666198544-a76e399d-b0fa-471d-9a2d-ab703e455c32.d5222b2a.png)

### [](#3在组件中配置action)3.在组件中配置Action

迁移组件本身是有单击事件的，需要在这里配置单击事件的action

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1717666447160-7f87b2cc-c373-406d-80fd-0ece47bea9fc.3b1393d8.png)

点击设置，滑动到底部可以看到我们刚在左侧"数据"中添加的action，选择批量加入迁移组件的Action

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/1717666512659-fef7436f-f021-4553-a388-e18e4fdd9de3.4d0d5f56.png)

### [](#4在表格中配置action)4.在表格中配置Action

在子表的行按钮栏中插入一个按钮

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/4-1.050422a4.png)

给新加的按钮在单击事件中配置加入迁移清单的action

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/4-2.0d89e88f.png)

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/4-3.6140234b.png)

### [](#5使用)5.使用

保存单据，然后必须要发布当前单据，才能使用，直接在运行时使用时不生效的

可以去测试环境业务活动节点下体验迁移组件的功能，这些都是已发布的应用

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/5-1.6495de7e.png)

批量加入迁移清单功能，选择表格的数据，点击迁移的按钮，就能加入数据了

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/5-2.cf4ae984.png)

数据的存放地点

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/5-3.37b74e99.png)

单个加入迁移清单的功能，在表格中选取数据，然后点击配置了迁移action的按钮，就能加入数据了

![image-20240823135653542](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/ynf/static/5-4.6d960712.png)