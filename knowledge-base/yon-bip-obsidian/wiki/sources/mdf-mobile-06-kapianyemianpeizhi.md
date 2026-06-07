---
title: "卡片页面配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-kapianyemianpeizhi"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 13
---

# 卡片页面配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/06-kapianyemianpeizhi | 所属：移动组件

# [](#卡片页面配置)卡片页面配置

## [](#1-暂无移动模板兼容方案)1. 暂无移动模板兼容方案

当业务领域暂无移动模板时可临时使用此兼容方案，在代办消息的URL上添加
systemCode='print'
可临时走PC端的打印模板预览待办并审批，此方案为临时方案，正确的做法是配置移动端的模板

## [](#2-excel文档)2. Excel文档

[采购订单卡片移动端.xlsm](https://docs.yonyoucloud.com/l/9dF6f47d7854)

移动端使用宏：CreateSQL.CreateSQLByTenantForMobile，只产生指定租户模板，默认0租户

[卡片非0租户.sql](https://docs.yonyoucloud.com/l/2a2c99810d3f)

根据0租户模板刷所有非0租户的移动端模板，需要先执行上面Excel生成的0租户SQL

*以上适用于同一个billno已有PC模板的情况，如果没有PC模板或billno移动和PC不一样，可以按原有PC的方式操作*

## [](#3-标准卡片布局)3. 标准卡片布局

### [](#31-设计图)3.1. 设计图

订单---新增无子表数据和新增有子表数据和详情页面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage1.59216347.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage2.1ea6b285.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage3.000cc8f7.png)

子表页---新增和详情页面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage4.a19a4879.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage5.54aa382e.png)

物料详情页面

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage6.f8e0cfcf.png)

### [](#32-区分按单按料视图)3.2. 区分按单、按料视图

按料视图---列表页面按料视图进入详情页使用

||[billtemplate_base]|||||||||||
||主键*id*||单据IDiBillId||模版名称cName||排序iOrder||模版类型iTplMode||systemCodesystemCode|
||*19*||*4*||移动采购订单按单显示详情模板||10||3|||
||*20*||*4*||移动采购订单按料显示详情模板||20||3||materialMeta|

通过systemCode来标识，materialMeta代表按料视图

## [](#4-按单视图)4. 按单视图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage7.62ad41e0.png)

### [](#41-订单动向-vouchertrendpanel)4.1. 订单动向-VoucherTrendPanel

#### [](#411-模板配置)4.1.1. 模板配置

目前订单动向只在详情页面才会展示，新增和编辑态不展示

||[billtplgroup_base]|||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType|
||*26*||*19*||orderView_trend||订单动向||VoucherTrendPanel|

为了展示图中的效果，需要在billitem_base中配两个control,
根据iBillTplGroupId关联group的容器

||[billitem_base]|||||||
||主键*id*||单据IDiBillId||模板分组IDiBillTplGroupId||控制类型cControlType|
||*165*||*4*||*26*||Input|
||*166*||*4*||*26*||select|

#### [](#412-后端配置)4.1.2. 后端配置

除了在前端配置动向组件，还需要在数据库bill_process和bill_process_node表中配置动向展示的节点，详细文档参考：[《扩展 -
单据状态模版配置》](https://www.yuque.com/docs/share/532b0dcd-1858-4ddd-936f-eec9e0552f94)

其它文档：[订单状态模版配置说明.pdf](file:////download/attachments/22512981/%25E8%25AE%25A2%25E5%258D%2595%25E7%258A%25B6%25E6%2580%2581%25E6%25A8%25A1%25E7%2589%2588%25E9%2585%258D%25E7%25BD%25AE%25E8%25AF%25B4%25E6%2598%258E.pdf%3fversion=1&modificationDate=1676727803920&api=v2)

### [](#42-基本信息-cardheader)4.2. 基本信息-CardHeader

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*25*||*19*||orderView_head||||CardHeader|||

#### [](#421-cstyle属性)4.2.1. cStyle属性

该容器组件有展开收起的效果

showNum、showAll、showTitle、more

showNum默认为4，

showAll为true，为全展开，无展开收起效果,

showTitle 为展示标题项，即为cName属性展示，

more参数为页面默认收起

例子 {"showNum":4,"showAll":true,"showTitle": ture,"more":true}

#### [](#422-规范)4.2.2. 规范

目前该组件是编辑态默认展开，浏览态默认收起

### [](#43-子表明细-概要-voucherdetail)4.3. 子表明细-概要-VoucherDetail

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*27*||*19*||orderView_body||采购明细||VoucherDetail||{"groupField":"rowStatus”}|
||*28*||*19*||orderView_body_row||整单表体概要||VoucherDetailRow|||
||*29*||*19*||orderView_body_row_detail_head||整单表体概要_展示-头部区域||TplThreeCols||{"detail":"detailrows"}|
||*30*||*19*||orderView_body_row_detail_left||整单表体概要_展示_左||Left|||
||*31*||*19*||orderView_body_row_detail_middle||整单表体概要_展示_中||Middle|||
||*32*||*19*||orderView_body_row_detail_right||整单表体概要_展示_右||Right|||
||*34*||*19*||orderView_body_row_add_head||整单表体概要_新增-头部区域||TplThreeCols|||
||*35*||*19*||orderView_body_row_add_left||整单表体概要_新增_左||Left|||
||*36*||*19*||orderView_body_row_add_middle||整单表体概要_新增_中||Middle|||
||*33*||*19*||orderView_body_row_add_right||整单表体概要_新增_右||Right|||
||*38*||*19*||orderView_body_details||商品详情||table|||

上图为展示时的布局，需要在cStyle中设置{"detail":"detailrows"}。如果没有设置，默认为新增+展示共用的布局。

### [](#44-子表明细-详情-table)4.4. 子表明细-详情-table

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*38*||*19*||orderView_body_details||商品详情||table|||

| ** | * | **模板分组编码** | *模板 | 模板 | 排列 |
| 主 | 模板 | | 分组名称* | 类型 | 方式 |
| 键 | ID* | **cCode** | | | |
| ** | | | **cName** | **c | cS |
| | iTp | | | Type** | tyle |
| ** | lId | | | | |
| * | | | | | |
| id | | | | | |
| * | | | | | |
| ** | | | | | |
+----+-------+-----------------------+-------------+--------+--------+
| * | | o | 商品详情 | table | |
| 38 | *19* | rderView_body_details | | | |
| * | | | | | |
+----+-------+-----------------------+-------------+--------+--------+

卡片页中配置table为子表明细页面的容器

### [](#45-底部容器-footer)4.5. 底部容器-Footer

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*58*||*19*||Footer||底部按钮区||Footer|||

||[bill_toolbar]|||||||
||主键*id*||名字name||父亲节点parent||布局align|
||*705*||FooterToolbar_left||Footer||left|
||*706*||FooterToolbar_right||Footer||right|

||[bill_toolbaritem]|||||||||||
||主键*id*||分组toolbar||名称name||命令command||类型type||类型style|
||*756*||FooterToolbar_left||btnAttachment||cmdAttachment||AttachmentButton||0|
||*757*||FooterToolbar_right||btnUrge||cmdUrge||Button||0|

style 0为图标加文字，1为纯文字，2为纯图标

## [](#5-按料视图)5. 按料视图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage8.aa2d3a97.png)

### [](#51-物料概要-voucherdetail)5.1. 物料概要-VoucherDetail

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*39*||*20*||productView||物料详情||view|||
||*40*||*20*||productView_body||||VoucherDetail|||
||*41*||*20*||productView_body_row||行详情表体_物料||VoucherDetailRow|||
||*42*||*20*||productView_body_row_product_head||行详情表体_物料_头部区域||TplThreeCols|||
||*43*||*20*||productView_body_row_product_left||行详情表体_物料_左||Left|||
||*44*||*20*||productView_body_row_product_middle||行详情表体_物料_中||Middle|||
||*45*||*20*||productView_body_row_product_right||行详情表体_物料_右||Right|||
||*48*||*20*||productView_trend||物料动向||VoucherTrendPanel|||
||*49*||*20*||productView_card_group||详情分组||CardHeaderGroup|||
||*50*||*20*||productView_card_headdetail||详情||CardHeader||{"showAll":true}|
||*51*||*20*||productView_card_rowdetail||物料详情||CardHeader||{"showAll":true}|

### [](#52-执行状态-cardpanel)5.2. 执行状态-CardPanel

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*47*||*20*||productView_status||执行状态||CardPanel|||

||[billitem_base]|||||||||
||模板分组IDiBillTplGroupId||字段名称cFieldName||显示标题cShowCaption||控制类型cControlType||样式cStyle|
||*47*||surplusQty||待收||CardPanelItem||{"icon":"daishou","unit":"unit_name","type":"warning"}|
||*47*||totalRecieveQty||已签收||CardPanelItem||{"icon":"yiqianshou","unit":"unit_name"}|
||*47*||totalInQty||已入库||CardPanelItem||{"type":"success","icon":"yirku","unit":"unit_name"}|

卡片按料视图的执行状态布局中使用。

- 

状态名称根据cShowCaption显示

- 

cStyle中{"icon":"daishou","unit":"unit_name","type":"warning"}

icon为状态名称前的图标。

- 

unit指定单位名称关联字段。

- 

type为状态名称字段颜色。

### [](#53-物料动向-vouchertrendpanel)5.3. 物料动向-VoucherTrendPanel

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*48*||*20*||productView_trend||物料动向||VoucherTrendPanel|||

### [](#54-详情区域-cardheadergroup)5.4. 详情区域-CardHeaderGroup

||[billtplgroup_base]|||||||||||
||主键*id*||模板IDiTplId||模板分组编码cCode||模板分组名称cName||模板类型cType||排列方式cStyle|
||*49*||*20*||productView_card_group||详情分组||CardHeaderGroup|||
||*50*||*20*||productView_card_headdetail||详情||CardHeader||{"showAll":true}|
||*51*||*20*||productView_card_rowdetail||物料详情||CardHeader||{"showAll":true}|

按料视图中详情包含表头和表体信息，所以这块区域是由CardHeaderGroup嵌套俩个CardHeader来实现的，默认展示第一个CardHeader的名称。

### [](#55-底部容器-footer)5.5. 底部容器-Footer

同 3.5

## [](#6-移动专有action)6. 移动专有Action

- 

协同-单据附件上传 attachment

- 

子表行-新增行-进入修改子表详情页 addrowdetail

- 

子表行-修改-进入修改子表详情页 editrow

- 

子表行-复制-进入修改子表详情页 copyrow

- 

子表行-弹窗新增行 addrowmodal

- 

子表行-弹窗编辑行 editrowmodal

- 

子表行-弹窗复制行 copyrowmodal

- 

移动端的审批 workflow

- 

移动端审批历史 workflowhistory

- 

分享 share

- 

打印预览PDF printpreview

- 

打印预览图片 printpreviewimg

### [](#61-printpreview-打印预览pdf)6.1. printpreview 打印预览PDF

action上的参数是cmdParameter:
"{"printcode":"SCM9974731560922140000",
"classifyCode":"PU.pu_applyorder",

"serverUrl":"/bill/getPrintData","params":

{"billno":"pu_applyorder"}

,"meta":0}"类似于这种--参考请购配置-与pc上配置打印预览参数一致。

然后找友空间的申项文，让他给你提供一个销售领域的appId，

需要使用appId找姚磊让他给你注册一下wps的预览的wpsAppId。

采购领域的appId为'607d6fffd71b240040036f52'

### [](#62-printpreviewimg-打印预览图片)6.2. printpreviewimg 打印预览图片

## [](#7-其它)7. 其它

### [](#71-底部弹窗组件)7.1. 底部弹窗组件

viewmodel.communication({

 type: 'modal',

 payload: {

 key: 'HtmlContentModal',

 parentViewModel: viewmodel,

 data: {

 type: 'fragment', // 类型 fragment代码片段，默认值为fragment，支持[fragment｜url-暂不支持]

 title: '使用规则', // 标题

 closePosition: 'right', // 关闭按钮位置,默认为right, 支持[right|left]

 value: '<div>aaaaaaa</div>' // html代码片段

 }

 }

});

### [](#72-关于字段拼接)7.2. 关于字段拼接

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage9.ba15ae86.png)

- 接静态值

cStyle中{"props":{"after":"/"}}、{"props":{"before":" "}}，after是在字段后拼接，before是在字段前拼接，特殊字符需要转移。

- 拼接动态字段

首先配置动态字段的隐藏显示区域，使用hiddenContainer布局，hiddenContainer布局配置的字段会隐藏显示。

在需要拼接字段cStyle中添加{"related":"hiddenContainer|currency_name"}，hiddenContainer为隐藏布局的code,
currency_name为拼接的字段cName。

支持拼接多个字段，例如：

{"related":["productView_hiddenContainer|currency_name","productView_hiddenContainer|unit_name"]}

### [](#73-字段名称显示)7.3. 字段名称显示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage10.c4c30344.png)

字段的显示名称由cShowCapition控制，不需要显示的地方不配置即可。

### [](#74-子表详情-编辑-stepper)7.4. 子表详情-编辑-Stepper

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage11.bb277d0a.png)

- 

在表体行中概要区域使用，cStyle中{"unit":"unit_name"}指定**单位名称**关联字段。

- 

可通过bListEdit控制字段是否在列表上编辑，目前仅支持Stepper和Checkbox

### [](#75-保存反馈页面)7.5. 保存反馈页面

#### [](#751-设计图)7.5.1. 设计图

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage12.469897ea.png)

#### [](#752-规范)7.5.2. 规范

目前反馈页面是需要配置在save保存动作的command中

paramter配{"showFeedback":true}

### [](#76-子表汇总展示)7.6. 子表汇总展示

在bill_template_base表的cExtProps字段中配置{"isSum":
true}，detail接口会增加isSum参数，返回的数据是按设置的汇总条件汇总后的数据

## [](#8-卡片详情页去掉背景)8. 卡片详情页去掉背景

cControlType 为view的cStyle中增加

{"className": "light"}

如下图位置:

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/kapianyemianpeizhiimage13.7212e0f7.png)

## [](#9-卡片详情页去掉自动刷新)9. 卡片详情页去掉自动刷新

cControlType 为view的cStyle中增加

{"disableRefresh": true}

## [](#10-卡片页不显示header)10. 卡片页不显示header

cControlType 为view的cStyle中增加

{"bShowHeader": false}

## [](#11-隐藏导航栏返回按钮)11. 隐藏导航栏返回按钮

在单据的url添加noShowLeft=true参数