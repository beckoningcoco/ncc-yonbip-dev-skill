---
url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/YWLRM1?nodeId=6e4a1bd4-c4a0-4d64-b4a4-50178f6cff3e&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN
title: "YonBIP社区文档中心"
language: "zh-CN"
captured_at: "2026-05-29T12:51:25.883Z"
---

# YonBIP社区文档中心

![logo](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/biplogo.fa4fb30c.svg)

社区文档中心

- 首页
- 文档导航
- 开发者社区
- 社区论坛
- 视频教程
- 技术博客

![avator](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/avatar.d348c3b4.svg) 未登录

资料中心

低代码开发

- [产品概述](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/CPGS1?nodeId=7587f994-afce-4a1a-acb7-24be4663fee7&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "产品概述")
- [快速入门](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/KSRM1?nodeId=a834eac4-1d0b-4f92-ad4b-1af6505ed9c5&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "快速入门")
	- [环境准备](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/HJZB1?nodeId=3a675cee-4440-43b2-bf5b-0fa79d8aad3a&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "环境准备")
		- [单据入门](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/DJRM1?nodeId=d7772c1a-65ff-4103-a0c7-6bc96e6ce3dc&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "单据入门")
		- [业务流入门](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/YWLRM1?nodeId=6e4a1bd4-c4a0-4d64-b4a4-50178f6cff3e&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "业务流入门")
		- [审批流入门](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SPLRM1?nodeId=ee878d75-8d18-49ad-9cf4-568c47d2f23c&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "审批流入门")
		- [应用构建升级版快速入门](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/KSRM-YYGJSJB1?nodeId=0ef176bd-5dc8-420b-a8d7-928ea126038f&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "应用构建升级版快速入门")
- [操作指南](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/CZZN1?nodeId=c185cd98-4b1c-47c6-af09-571e557c08a4&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "操作指南")
- [开发指南](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/KFZN1?nodeId=3a101258-f3d9-4b5e-a128-1ffdf0022497&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "开发指南")
- [最佳实践](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/ZJSJ1?nodeId=52c9a9c2-67b2-41ee-b414-d2dcbc69cc72&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "最佳实践")
- [视频教程](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SPJC1?nodeId=9a2cfabd-6961-4f50-b3da-77c9770cc2ab&productline=CommunityDoc&type=enableDoc&localeHelp=zh_CN "视频教程")

1. [低代码开发](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/KSHYYGJ1?nodeId=8827d69c-6d23-4309-80b4-48328123db05&productline=CommunityDoc) /
2. [快速入门](https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/KSRM1?nodeId=a834eac4-1d0b-4f92-ad4b-1af6505ed9c5&productline=CommunityDoc) /
3. 业务流入门 /

## 业务流入门

最后更新时间：2025-04-25

![](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/share.2570fc0c.svg)

## 概述

## 业务场景

本文主要讲解应用构建中业务流功能的相关操作，通过该文档您将学习如何在YonBuilder（可视化应用构建）中实现业务流推单、拉单、回写。

## 关键词

YonBuilder、应用构建、业务流、推单、拉单、回写

## 环境准备

## 创建实体

### 上游单据

业务对象：upData

实体：upData

引用接口：审批、业务流

字段：

编码 ：new1 名称：字段1 类型 ：文本

编码： new2 名称：字段2 类型：日期

编码： new3 名称：字段3 类型：数值

编码 ：adminOrgVO 名称： 部门 类型：单选引用（部门）

编码： new5 名称：字段5 类型：附件

### 下游单据

业务对象：downData

实体：downData

引用接口：审批、业务流

字段：

编码 ：new1 名称：字段1 类型 ：文本

编码： new2 名称：字段2 类型：日期

编码： new3 名称：字段3 类型：数值

编码 ：adminOrgVO 名称： 部门 类型：单选引用（部门）

编码： new5 名称：字段5 类型：附件

## 创建页面

上游单据和下游单据的创建方式相同

1. 应用构建->页面建模中点击“新建页面“，选择”单卡“，点击”下一步“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/d9da5c80-dabb-4f22-854d-3ba43831f77b.png)

1. 弹框中“页面名称“输入单据名称，”页面编码“不用修改，”元数据“选择实体，勾选”生成列表页面“，点击”完成“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/e5d9f1a6-d3d2-4978-a322-ab646c721e04.png)

## 创建业务流

1. 应用构建->流程&自动化->业务流中点击“新建“，位置如图：

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/20305b0f-0479-49e1-9427-890026c709d7.png)

1. 输入业务流编码和名称，“启用版本控制“和”启用业务泳道“默认即可

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/ca4eb9a1-ae3e-47ee-a580-eeac974b9303.png)

1. 点击行内“设计“按钮，进入业务流设计器，可将左侧的”上游单据“和”下游单据“拖入画布进行设计

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/1466e6d7-7354-4877-b372-570016cf7edb.png)

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/925f9618-d445-4144-aa4a-b2280b94fa54.png)

## 推单

## 创建规则

1. 鼠标选中上游单据，点击右侧边框小白框标志向下游单据拖拽连接

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/2f219adc-d88e-4ce8-91be-70636d85ff92.png)

1. 鼠标选中连线中间的“+“，右侧规则信息->推单下点击”新建规则“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/27402d46-a899-4de9-9a76-6bddcd454d6e.png)

## 规则配置

### 基本信息

输入规则名称，比如“推下游“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/bcb43955-aa06-4a7e-b769-23450eca54f7.png)

### 过滤设置

过滤设置中可以配置公式，实现满足公式条件的上游数据才能下推，否则拦截提示。比如设置字段new1不等于0才能下推

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/40e58587-83c5-4078-9749-05f471c03ce9.png)

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/cfe04ba0-8310-4356-b82b-dbe56321eb8d.png)

### 触发设置

触发设置中有多个选项，入门案例设置“手工触发“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/31fc950a-a1ef-4f5b-8a10-7ea7ca722427.png)

### 生单方式

推送方式：新增单据；

推单过程：勾选转单画面

新建单据状态：开立态

新建单据制单人：推送触发人

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/222c5fbc-2862-403c-8362-581947dd0e33.png)

### 转换规则

转换规则中配置字段映射关系

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/14c0bdc8-9857-4632-96ae-7b88001c98ec.png)

### 分单规则

分单规则用于配置业务流拆单或合单，可视化应用构建-开发文档-业务流文档会有详细介绍，入门案例不配置。

### 消息设置

消息设置可配置实现在业务流动作执行后发送待办消息

## 推单操作

1. 打开上游单据列表页，新增一条数据，选中数据，点击“下推“按钮，下拉按钮中会出现创建的规则按钮”推下游“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/6ba769a2-3da4-475a-bad6-c0d3dc89b4ec.png)

1. 点击规则按钮“推下游“，出现下游单据的详情页，点击保存，推单完成

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/d6806820-4d1b-4b10-aca8-bb3e9f102f27.png)

## 拉单

## 创建规则

鼠标选中推下游，右侧规则信息->拉单下点击”新建规则“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/8d991014-f4f1-468c-8770-88d33814d952.png)

## 规则配置

### 基本信息

输入规则名称，比如“拉上游“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/23a1cc15-efa7-4eef-84e4-8bd24b24e1a7.png)

### 过滤设置

过滤设置不用配置，如需过滤，一般是在拉单画面中进行过滤

### 生单方式

拉单画面选择：依据上游单据实体单独创建列表页作为拉单画面

1. 应用构建->页面建模点击“新建页面“，选择”列表“，点击”下一步“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/60c5e0c0-3ff8-41e0-a569-863588292052.png)

1. 页面名称自定义，页面编码需要加后缀，元数据选择上游单据

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/68c7a28f-dbb3-4e63-b6ec-2d365825f75d.png)

1. 打开转单画面列表设计器，左侧层级中删除列表头部栏中的SinpleTableHeader，页面模板下增加底部栏->按钮栏，按钮栏下增加一个按钮，一个自动规则

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/069fa895-e88f-45e5-95ea-95a449b8ba81.png)

1. 底部按钮栏中“按钮“名称修改为”取消“，绑定”取消“动作，”自动规则“名称修改为”生单“，右侧属性：业务操作中选择”生单“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/53137a8f-e5fa-4b51-9663-0e46eebd81be.png)

拉单画面选择配置上一步创建的列表页

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/8f2dd244-06a2-4c89-91ad-a9795959b1c5.png)

推送方式：新增单据

推单过程：勾选 拉单画面

新建单据状态：开立态

新建单据制单人：推送触发人

### 转换规则

转换规则中设置上下游单据的字段匹配关系

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/ac0d7896-7821-4b11-bcd9-b5d22ce01113.png)

### 分单规则

分单规则用于配置业务流拆单或合单，可视化应用构建-开发文档-业务流文档会有详细介绍，入门案例不配置。

### 消息设置

消息设置可配置实现在业务流动作执行后发送待办消息

## 拉单操作

1. 打开下游单据列表设计器，列表头部按钮栏中增加“自动规则“，修改名称为”拉单“，属性-业务操作选中”拉单“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/30c74ac2-b651-4b5f-92d3-a258fb6c6ef8.png)

1. 打开下游单据列表页，点击“拉单“按钮，会弹出”拉上游“规则按钮

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/11ac717c-d546-48bb-a72b-25afcac53c29.png)

1. 点击“拉上游“，会切换到创建的拉单转单列表，选择数据，点击”生单“，保存生成下游单据。

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/888c3f5a-c136-401e-96fa-7ce9ba7f0e5d.png)

## 回写

## 创建规则

1. 鼠标选中下游单据，点击底部边框小白框标志向上游单据拖拽连接

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/a27708c2-89fc-4912-9666-b79cb96f8c21.png)

1. 鼠标选中连线中间的“+“，右侧规则信息->回写下点击”新建规则“

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/cf816375-c022-4595-8f8e-22a69b1d6bd0.png)

## 规则配置

### 基本信息

输入规则名称，比如“回写 “

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/6bb7dac1-4b64-41be-a18a-8a139200f3ed.png)

### 触发设置

触发设置中选择单据动作：保存

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/23637de1-9b46-48ae-a4e9-3c46f6b2242d.png)

### 回写规则

回写规则中配置需要回写的字段，下游单据保存后就会更新此处配置的上游单据的字段。

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/0aeb3de5-d6d1-4a09-9c00-8401c1583d51.png)

### 消息设置

消息设置可配置实现在业务流动作执行后发送待办消息

## 回写操作

1. 打开上游单据列表，选择数据，点击下推，下游单据详情页中修改“字段3“的值，保存

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/81251114-6b8c-46d8-99b5-d048e1796ae4.png)

1. 观察上游单据“字段3“的值是否回写成功

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/b7e3db67-a5ab-4ef9-b576-73ec6577100f.png)

**问题1：下游单据保存后能否不自动返回上游单据列表页**

答：

可以。打开下游的单据详情页设计器，左侧层级选择最上层，右侧属性中开启“保存停留当前页“。

![](https://ncc-pub-ublim.oss-cn-beijing.aliyuncs.com/help/photo/d9a4b251-c8c3-46ab-8a20-1ea8bb7cfc33.png)

**问题2：创建并启用业务流后，上游单据中点击下推提示“无可用操作，请先配置业务流“**

答：

1. 确保业务流已经保存并发布
2. 检查上游单据页面编码是否和业务对象编码一致，创建页面时页面编码必须和业务对象编码一致

**问题3：附件字段支持推拉单吗**

答：

支持。应用构建单据之间推拉单支持附件字段转换

**问题4：业务流支持跨单据回写吗？比如单据1推单据2，单据2推单据3，单据3能回写单据1吗？**

答：

不支持。单据3中只记录了单据2的id，只能回写单据2，不能回写单据1。

**问题5：业务流转换规则中选不到单据的某些字段怎么办？**

答：

1. 打开“单据注册“菜单刷新单据
2. 打开“业务对象“菜单编辑实体，场景支持中勾选”转换规则“，保存并发布

文档内容是否对您有所帮助？

为帮助文档评分：

页内目录

1\. 概述

1.1 业务场景

1.2 关键词

2\. 环境准备

2.1 创建实体

2.1.1 上游单据

2.1.2 下游单据

2.2 创建页面

2.3 创建业务流

3\. 推单

3.1 创建规则

3.2 规则配置

3.2.1 基本信息

3.2.2 过滤设置

3.2.3 触发设置

3.2.4 生单方式

3.2.5 转换规则

3.2.6 分单规则

3.2.7 消息设置

3.3 推单操作

4\. 拉单

4.1 创建规则

4.2 规则配置

4.2.1 基本信息

4.2.2 过滤设置

4.2.3 生单方式

4.2.4 转换规则

4.2.5 分单规则

4.2.6 消息设置

4.3 拉单操作

5\. 回写

5.1 创建规则

5.2 规则配置

5.2.1 基本信息

5.2.2 触发设置

5.2.3 回写规则

5.2.4 消息设置

5.3 回写操作

文档反馈

![](https://design.yonyoucloud.com/static/ucf/iuap-hc-client-fe/latest/client/assets/images/yonHelp.d5d8ea31.svg)

北京市海淀区北清路68号用友产业园

4006-600-588

- 友情链接
	[用友官网](https://www.yonyou.com/)
	[用友YonHelp](https://help.yonyou.com/)
	[用友iuap平台](https://iuap.yonyoucloud.com/)
	[用友云市场](https://market.yonyoucloud.com/)
	[用友云注册协议](https://cdn.yonyoucloud.com/pro/yht/cas/doc/registerAgreement.cdn.html)
	[隐私条款](https://euc.yonyoucloud.com/agreementDetail?version=v-01xy20251025&code=2389110055722811397&locale=zh_CN)

Copyright ©2020 用友网络科技股份有限公司版权所有 [京ICP备05007539号-24](https://beian.miit.gov.cn/) [京公网安备11010802021935号](http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=11010802021935)

返回顶部