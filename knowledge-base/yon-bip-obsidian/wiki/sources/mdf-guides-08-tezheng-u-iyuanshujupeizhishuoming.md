---
title: "特征UI元数据配置说明"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/08-tezheng-u-iyuanshujupeizhishuoming"
section: "指南"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 指南]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 特征UI元数据配置说明

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/guides/08-tezheng-u-iyuanshujupeizhishuoming | 所属：指南

# [](#特征ui元数据配置说明)特征UI元数据配置说明

## [](#一使用说明)一、使用说明

本文档为领域对接特征，UI元数据需要做的相关修改和配置的使用说明。

其中包含元数据xml的样例，列表及卡片的UI模板对应的Excel的样例及相关参数说明。

### [](#1元数据xml配置)1.元数据xml配置

[📎characterTest_2022_05_17(1).xml](https://docs.yonyoucloud.com/l/d60B4656D7E6)

### [](#2ui模板excel样例)2.UI模板Excel样例

[📎特征样例列表.xlsm](https://docs.yonyoucloud.com/l/95D6C2784b7c)

[📎特征样例卡片.xlsm](https://docs.yonyoucloud.com/l/5C2D8bE1cb70)

其中包含列表及卡片的特征配置方式，详细说明见下方描述。

### [](#3样例demo查看)3.样例demo查看

1.登录测试环境，切换租户到 1215全产品

2.左侧菜单栏搜索特征测试单据

## [](#二使用场景)二、使用场景

### [](#1场景一主表存在特征组字段敏感域字段)1.场景一、主表存在特征组字段，敏感域字段

#### [](#展示形态)展示形态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tezhengUIyuanshujupeizhishuoming_image1.6354d522.png)

此时，可以通过点击物料参照，获取特征组和敏感域的结构，特征组的结构会以弹窗的形式展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tezhengUIyuanshujupeizhishuoming_image2.331021c1.png)

#### [](#配置及说明)配置及说明

特征相关的参数控制，均在billitem_base表对应字段的cExtProps中进行配置。

##### [](#excel中配置)excel中配置

||字段cItemName||字段说明||cControlType||cExtProps|
||productId1_name||物料名称||Refer||{"characterType":"productId1","characterEffects":["p1FreeCharacteristics","p1Sensitive"]}|
||p1FreeCharacteristics||自由项特征组||Characteristics||{"type":"FreeCT"}|
||p1Sensitive||敏感域特征组||Characteristics||{"depend":"p1FreeCharacteristics","sensitive":"batchSens"}|

##### [](#如果一个表格中有两个字段需要触发同一个特征组如物料和sku物料同时触发则配置如下)如果一个表格中有两个字段需要触发同一个特征组，如物料和SKU物料同时触发，则配置如下：

||字段cItemName||字段说明||cControlType||cExtProps||cRefRetId|
||productId1_name||物料名称||Refer||{"characterType":"productId1","characterEffects":["p1FreeCharacteristics","p1Sensitive"]}|||
||skuproduct_name||SKU名称||Refer||{"characterEffects":["p1FreeCharacteristics","p1Sensitive"]}||{"productId1":"id"}|
||p1FreeCharacteristics||自由项特征组||Characteristics||{"type":"FreeCT"}|||
||p1Sensitive||敏感域特征组||Characteristics||{"depend":"p1FreeCharacteristics","sensitive":"batchSens"}|||

##### [](#详细参数说明)详细参数说明

##### [](#1物料名称参照类型为特征的触发项通过该参照的值变更来获取特征组相关结构)1.物料名称：参照类型，为特征的触发项，通过该参照的值变更，来获取特征组相关结构。

||参数||参数说明||备注|
||characterType||1.存在该属性时，认为该字段是特征组请求的触发项2.其值为实际请求时对应的参照的id的cName|||
||characterEffects||影响的特征组的cName的数组集合|||
||originRefer（可选）||引用的其他参照时，如想使用参照数据中的某一项，作为特征组的触发id，可以配置该值|||

##### [](#2特征组)2.特征组

||参数||参数说明||备注|
||type||特征组类型字段，枚举类型||物料属性特征组：MaterialPropCTSKU特征组：SkuPropCT自由项特征组：FreeCT选配特征组：OptionCT|

##### [](#3敏感域)3.敏感域

||参数||参数说明||备注|
||depend||此字段表示该敏感域依托于哪一个特征组，对应的值为特征组字段的cName|||
||sensitive||敏感域类型字段，枚举类型||sku敏感：skuSens批次敏感：batchSens序列号敏感：SNSens现存量敏感：stockSens成本敏感：costAffecBOM敏感：BOMAffec工艺敏感：manuAffec销售/采购价格敏感：PriceAffec|

### [](#2场景二子表存在特征组字段敏感域字段特征单独字段)2.场景二、子表存在特征组字段，敏感域字段，特征单独字段

#### [](#展示形态-1)展示形态

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/tezhengUIyuanshujupeizhishuoming_image3.9a9c9e66.png)

此时，可以通过点击物料参照，获取特征组和敏感域的结构。特征组的结构会以弹窗的形式展示；单独的特征字段，会根据特征组中返回的类型，来展示为具体的组件类型。

##### [](#配置及说明-1)配置及说明

特征相关的参数控制，均在billitem_base表对应字段的cExtProps中进行配置。

##### [](#excel中配置-1)excel中配置

||字段cItemName||字段说明||cControlType||cExtProps|
||productId3_name||物料名称||Refer||{"characterType":"productId3","characterEffects":["p1SkuCharacteristics","p1Sensitive"]}|
||p1SkuCharacteristics||特征组||Characteristics||{"type":"FreeCT"}|
||p1Sensitive||敏感域||Characteristics||{"depend":"p1SkuCharacteristics","sensitive":"skuSens"}|
||color||颜色特征||Character||{"depend":"p1SkuCharacteristics","characterKey":"color"}|

##### [](#详细参数说明-1)详细参数说明

##### [](#1物料名称参照类型为特征的触发项通过该参照的值变更来获取特征组相关结构-1)1.物料名称：参照类型，为特征的触发项，通过该参照的值变更，来获取特征组相关结构。

||参数||参数说明||备注|
||characterType||1.存在该属性时，认为该字段是特征组请求的触发项2.其值为实际请求时对应的参照的id的cName||如果使用了新的参照二合一的配置方式，此参数可以忽略。参照二合一配置方式请点击参照配置字段二合一|
||characterEffects||影响的特征组的cName的数组集合|||
||originRefer（可选）||引用的其他参照时，如想使用参照数据中的某一项，作为特征组的触发id，可以配置该值|||

##### [](#2特征组-1)2.特征组

||参数||参数说明||备注|
||type||特征组类型字段，枚举类型||物料属性特征组：MaterialPropCTSKU特征组：SkuPropCT自由项特征组：FreeCT选配特征组：OptionCT|

##### [](#3敏感域-1)3.敏感域

||参数||参数说明||备注|
||depend||此字段表示该敏感域依托于哪一个特征组，对应的值为特征组字段的cName|||
||sensitive||敏感域类型字段，枚举类型||sku敏感：skuSens批次敏感：batchSens序列号敏感：SNSens现存量敏感：stockSens成本敏感：costAffecBOM敏感：BOMAffec工艺敏感：manuAffec销售/采购价格敏感：PriceAffec|

##### [](#4单独特征字段)4.单独特征字段

||参数||参数说明||备注|
||depend||此字段表示该敏感域依托于哪一个特征组，对应的值为特征组字段的cName|||
||characterKey||对应特征组中特征的cName|||

### [](#3场景三支持特征分配到单据)3.场景三、支持特征分配到单据

##### [](#配置及说明-2)配置及说明

支持单据预留结构，然后通过特征分配的方式，在主子表中渲染分配的特征。

##### [](#excel中配置-2)excel中配置

||字段cItemName||字段说明||cControlType||bShowIt|
||userDefineCharacter||弹性字段||userdefinegroup||0|

### [](#4场景四主表特征组平铺方式待补充)4.场景四、主表特征组平铺方式（待补充）

### [](#5场景五主表上的参照影响子表的特征组字段待补充)5.场景五、主表上的参照影响子表的特征组字段（待补充）

### [](#6场景六移动端接入特征待补充)6.场景六、移动端接入特征（待补充）

## [](#三faq)三、FAQ

### [](#1常见报错处理方式)1.常见报错处理方式：

待整理