---
title: "页面交互样式升级"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-yemianjiaohuyangshishengji"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 页面交互样式升级

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-yemianjiaohuyangshishengji | 所属：移动组件

# [](#页面交互样式升级)页面交互样式升级

针对按原有交互开发的页面升级，以上文档都是按新的交互样式写的，如果和以上文档中的图片不一样，则为旧的，请以此文档升级

# [](#1-列表页)1 列表页

## [](#11-按单视图)1.1 按单视图

去掉YSList，ListBody

YSExtendBody至少绑定三个字段，cStyle添加一个属性{"vision":"byorder"}

## [](#12-按料视图)1.2 按料视图

YSMaterialHead => TplThreeCols

HeadLeft => Left，left是图片

HeadMiddle => Middle，middle至少六个字段

HeadRight => Right，right至少两个字段

YSExtendBody下的数据移动到Middle

删除YSExtendBody

## [](#13-pb_meta_filter_item表)1.3 pb_meta_filter_item表

itemType：input => searchbox（按需调整）

## [](#14-bill_toolbar表)1.4 bill_toolbar表

删除YSListViewToolBar_left

## [](#15-billitem_base表)1.5 billitem_base表

删除【规格】字段（按需调整）

product_cCode调整到hiddenContainer

product_cName添加item.cStyle='{"related":"hiddenContainer|product_cCode"}'

**按单视图：**

清除【code（单据号）】的cShowCaption，cShowCaption_resid

**按料视图：**

删除【code（单据号）】（按需调整）

# [](#2-卡片页)2 卡片页

## [](#21-按单视图)2.1 按单视图

### [](#211-详情态)2.1.1 详情态

**billitem_base表**

2、billitem_base表，记录行【orderStatus】去掉该状态{"classname":"YSStatus"}

3、orderView_trend添加单据号【code】和单据状态【orderStatus】

6、YSExtendBody字段调整到middle（修改前为HeadMiddle）并删除该组件

7、middle组件下的product_cCode去掉

**billtplgroup_base表**

1、orderView_head和orderView_trend互换一下位置

4、orderView_body添加cStyle='{"groupField":"rowStatus"}'

5、YSMaterialHead，HeadLeft，HeadMiddle，HeadRight调整改用新组件

### [](#222-编辑态)2.2.2 编辑态

**billitem_base表**

3、YSExtendBody数据调整，除qty移动到right组件（并添加【item.cShowCaption=null,item.cStyle=null】），其他移动到middle组件，并删除YSExtendBody

4、middle组件下的product_cCode移到hiddenContainer

**billtplgroup_base表**

1、添加right组件

2、YSMaterialHead，HeadLeft，HeadMiddle调整改用新组件

### [](#223-详情态和编辑态共有)2.2.3 详情态和编辑态共有

1、middle组件中的字段添加【item.cShowCaption=item.cCaption,item.cShowCaption_resid=null】

2、billitem_base表中，middle组件下，product_cName记录行，修改【item.cShowCaption=null,item.cShowCaption_resid=null,item.cStyle='{"related":"hiddenContainerRow|product_cCode"}'

## [](#22-按料视图)2.2 按料视图

1、YSMaterialHead，HeadLeft，HeadMiddle，HeadRight调整改用新组件

2、YSExtendBody字段调整到middle并删除该组件

3、billitem_base表【rowStatus】记录行，清除cStyle【{"classname":"YSStatus"}】

4、middle组件中的记录行添加cShowCaption

5、billitem_base表中，middle组件下，product_cName记录行，item.cStyle='{"related":"productView_hiddenContainerRow|product_cCode"}'

6、product_cCode移到hiddenContainer