---
title: "公式问题排查指南"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-gongshiwentipaichazhinan"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 公式问题排查指南

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/13-gongshiwentipaichazhinan | 所属：指南

# [](#公式问题排查指南)公式问题排查指南

## [](#1-排查步骤)1. 排查步骤

### [](#11-查看公式是否配置正确)1.1 查看公式是否配置正确

参考配置文档 [https://docs.diwork.com/l/31a3F3909ee1](https://docs.diwork.com/l/31a3F3909ee1)

### [](#12-配置没问题的话查看单据上是否有设置公式)1.2 配置没问题的话，查看单据上是否有设置公式

（下面三选一 进行查看即可）

#### [](#121-安装谷歌插件mdf-developer-tool点击查看公式可看到所有公式和公式对应的因子)1.2.1 安装谷歌插件MDF-developer-tool，点击【查看公式】可看到所有公式和公式对应的因子

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshiwentipaichazhinanimage1.8a8f8db1.png)

#### [](#122-控制台执行-__rebuildformulayya)1.2.2 控制台执行 `__reBuildFormula(yya)`

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshiwentipaichazhinanimage2.291895b9.png)

#### [](#123-meta接口返回字段的ui元数据是否有formula)1.2.3 meta接口返回字段的UI元数据是否有formula

### [](#13-如果没看到配置的公式)1.3 如果没看到配置的公式

#### [](#131-看下模版是否加载正确)1.3.1 看下模版是否加载正确。

打开UI模板，找到客户配置公式对应的模版，再打开运行时点击左上角蓝色图标可对比是否是同一个模版.
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshiwentipaichazhinanimage3.9418b4ca.png)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshiwentipaichazhinanimage4.f867a365.png)

#### [](#132-检查是否有模版缓存导致模版配置没生效)1.3.2 检查是否有模版缓存，导致模版配置没生效。

修改完配置，大刷一下浏览器。如果还未生效，在设计器随便修改字段标题保存后预览打开，查看字段标题是否生效可判断是否是后端缓存问题。

### [](#14-如果看到公式但是计算没生效)1.4 如果看到公式，但是计算没生效

#### [](#141-打开调试模式)1.4.1 打开调试模式

安装谷歌插件MDF-developer-tool 或控制台输入cb.debugRule=true

#### [](#142-查看公式因子)1.4.2 查看公式因子

（不知道如何查看因子可以看上面步骤1），修改公式因子看控制台是否有打印或者是否有接口调用
![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshiwentipaichazhinanimage5.a149f6d9.png)

#### [](#143-如果控制台没有打印公式调试信息)1.4.3 如果控制台没有打印公式调试信息

考虑公式配错了因子生成的不对，可以检查下公式配置是否正确[https://docs.diwork.com/l/31a3F3909ee1](https://docs.diwork.com/l/31a3F3909ee1)，如果觉得正确可以拿着公式和因子信息联系公式产品-赵丽娜。

#### [](#144-如果控制台有打印公式调试信息)1.4.4 如果控制台有打印公式调试信息

如果是前端公式，公式调试模式下查看控制台打印信息， 如果是后端公式，分析下接口入参和返回值。前端公式不调接口，后端公式调用接口，如何区分参考文档第五节
[公式-运行时](#/guides/13-gongshiyunxingshi)![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshiwentipaichazhinanimage6.d4207b06.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gongshiwentipaichazhinanimage7.01e67741.png)

#### [](#145-如果是公式返回值结构不对)1.4.5 如果是公式返回值结构不对

data层级不对，得领域后端开发处理，将公式引擎改为mdd的，领域不要自己扩展。

#### [](#146-如果是公式返回值不对)1.4.6 如果是公式返回值不对

是后端没将公式计算出来，联系公式MDD或YPD框架后端（梁瑞超）

#### [](#147-如果公式返回值正确页面没有回显)1.4.7 如果公式返回值正确，页面没有回显

考虑扩展脚本影响到字段赋值，先把扩展脚本禁掉，再重试。url上加?extend=false（[http://xx.com?extend=false）可以禁用扩展脚本，或者使用上面提到的谷歌应用插件。](http://xx.com?extend=false%EF%BC%89%E5%8F%AF%E4%BB%A5%E7%A6%81%E7%94%A8%E6%89%A9%E5%B1%95%E8%84%9A%E6%9C%AC%EF%BC%8C%E6%88%96%E8%80%85%E4%BD%BF%E7%94%A8%E4%B8%8A%E9%9D%A2%E6%8F%90%E5%88%B0%E7%9A%84%E8%B0%B7%E6%AD%8C%E5%BA%94%E7%94%A8%E6%8F%92%E4%BB%B6%E3%80%82)

#### [](#148-如果扩展脚本禁掉了公式返回也正确页面还是没回显)1.4.8 如果扩展脚本禁掉了，公式返回也正确，页面还是没回显

最后再联系MDF框架开发 （李明阳）

## [](#2-常见问题分析)2. 常见问题分析

### [](#21-公式因子不能是公式字段本身)2.1 公式因子不能是公式字段本身

参考这个工单 QDKJ-52420。

WineSize字段配置公式
原来为：
iif(equalsIgnoreCase("W",childs.quoteDefineCharacter.SPFLBM),"1830575733304459270",childs.quoteDefineCharacter.WineSize)
改为：
iif(equalsIgnoreCase("W",childs.quoteDefineCharacter.SPFLBM),"1830575733304459270","")

### [](#22-手动修改字段可触发公式但是扩展脚本赋值没触发公式)2.2 手动修改字段可触发公式，但是扩展脚本赋值没触发公式

一般扩展脚本赋值不会触发公式，需要扩展脚本手动触发一下。参考公式文档7.1.1和7.1.2： [公式-运行时](#/guides/13-gongshiyunxingshi)。

### [](#23-公式接口乱码怎么查看参数)2.3 公式接口乱码怎么查看参数

控制台输入cb.debug=true，就能看到真实参数

### [](#24-公式触发时机有哪些)2.4 公式触发时机有哪些

参考公式文档 5 [公式-运行时](#/guides/13-gongshiyunxingshi)

### [](#25-公式精度计算有问题)2.5 公式精度计算有问题

公式套一个函数用来返回固定精度，比如要保留2位小数，a*b 改为 numToFixed(a*b,2)

### [](#26-列表页voucherlist公式没生效)2.6 列表页voucherlist公式没生效

列表页公式是/bill/list计算返回，不是前端进行计算。有问题可以联系MDD后端。