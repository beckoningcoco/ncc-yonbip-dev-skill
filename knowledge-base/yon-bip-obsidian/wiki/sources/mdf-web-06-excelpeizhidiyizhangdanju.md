---
title: "Excel配置第一张单据"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/06-excelpeizhidiyizhangdanju"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 17
---

# Excel配置第一张单据

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/06-excelpeizhidiyizhangdanju | 所属：Web组件

# [](#excel配置第一张单据)Excel配置第一张单据

## [](#1-元数据创建)1. 元数据创建

编写元数据xml，xml导入到元数据管理平台，导出建表sql，数据库中执行建表语句。

## [](#2-ui元数据创建)2. UI元数据创建

UI元数据创建主要是编写excel。

注意事项：

### [](#21-bill_base)2.1. [bill_base]：

1、单据编码：cBillNo要唯一

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image1.6b0ca8ce.png)

2、类型：cBillType，列表配置为VoucherList，卡片配置为Voucher

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image2.51593e7c.png)

3、过滤ID：cFilterId，列表一般都有查询区，如果需要展示查询区，此项不能为空，值为[pb_meta_filters]表中的主键id，卡片可以为空

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image3.cedd648b.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image4.ed119c7b.png)

### [](#22-billentity_base)2.2. [billentity_base]：

- 实体编码：cCode要唯一

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image5.d60037e0.png)

      2. bMain 1：代表主表 0：子表

cForeignKey取xml中对应的roleB字段

cParentCode取主表的cCode

childrenField取xml中子表的name

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image6.3ddc4ef6.png)

**cForeignKey：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image7.ca554a86.png)

**childrenField：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image8.374feb0e.png)

     3. 数据源名称：cDataSourceName，取值为xml文件中[moduleName.name.name](http://moduleName.name.name)，其他表中此字段也是这样的方法赋值，注意主子表要区分。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image9.3c6d744c.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image10.fb1d1d9f.jpeg)

### [](#23-billtplgroup_base)2.3. [billtplgroup_base]

- 此表可以理解为页面的容器组件，主要关注cType和iParentID字段。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image11.148e4aae.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image12.5bd00088.png)

cType：对应mdf的容器类型

iParentID：表示当前的容器的上一个相邻容器是哪一个

### [](#24-billitem_base)2.4. [billitem_base]

此表对应页面上具体的组件

- iBillEntityId：单据实体ID，区分是主表还是子表的字段。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image13.f06c178c.jpeg)

- BillTplGroupId：模板分组ID，表示组件是属于哪个容器。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image14.9268cf78.jpeg)

- 其余字段

||属性名称||属性含义||值类型||属性说明|
||bMustSelect||是否必选|||||
||bHidden||是否隐藏||1：隐藏 0：显示|||
||cControlType||组件类型|||||
||cStyle||扩展配置|||||
||bIsNull||是否可以为空||1：非必填 0：必填|||

### [](#25-查询区表)2.5. 查询区表

filtersId要与[pb_meta_filters]表中的主键id一致；

itemId要与[pb_meta_filter_item]表中的主键id一致；

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image15.3baf09eb.png)

### [](#26-按钮区表)2.6. 按钮区表

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image16.c0f60214.jpeg)

**[bill_toolbar]：** 定义按钮的容器，并且通过parent字段指明该容器是属于哪个区域的按钮。

**[bill_toolbaritem]：** 定义按钮的类型，通过分组字段指明该按钮属于哪个容器。

**[bill_command]：** 定义按钮具体执行的动作。

## [](#3-创建sql)3. 创建sql

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Excelpeizhidiyizhangdanju_image17.a1d5136e.jpeg)

点完确定，会生成sql文件，在数据里执行生成的sql即可。

## [](#4-浏览器访问)4. 浏览器访问

列表：https://<工作台域名>/mdf-node/meta/**voucherlist**/mdd_logicdeletelist?domainKey=iuap-metadata-mdd

卡片：https://<工作台域名>/mdf-node/meta/**voucher**/mdd_saleordercard/add?domainKey=iuap-metadata-mdd

voucherlist 、voucher字段代表单据的cBillType。

mdd_logicdeletelist、mdd_saleordercard字段代表单据的cBillNo。

## [](#5-常见问题)5. 常见问题

- 为什么我输入的url正确，但是在浏览器访问不到页面？

检查[bill_base]表中的单据类型cBillType是否配置正确，检查[billentity_base]表中的实体编码cCode是否唯一。

- 卡片保存数据主表和子表的数据都保存成功了，但是从列表进详情查不到子表数据？

检查卡片[billitem_base]表是否配置id字段，列表和卡片都需要配置id字段。

- 列表运行出来以后所有的单元格都挤压在一起该怎么处理？

检查[billitem_base]表中的iColWidth列宽是否配置正确，一般配置为150。

- 查询区数据过滤不生效?

[pb_meta_filter_item]表中的dr字段要配置为0。

- 数据编辑的时候点保存报错?

检查列表和卡片[billitem_base]表的id字段的bMustSelect是否设置为1。

- 卡片运行出来之后输入框独占一行，特别长?

检查controls里边的这些字段的iColWidth是否是1，并且父级容器iCols是否是3，3代表一行三列显示。