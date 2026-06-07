---
title: "按钮组 Toolbar"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-toolbar"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 7
---

# 按钮组 Toolbar

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/02-toolbar | 所属：Web组件

# [](#按钮组-toolbar)按钮组 Toolbar

## [](#1-功能说明)1. 功能说明

此组件主要用来展示一些按钮。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbar_image1.a726b613.jpeg)

## [](#3-基本属性)3. 基本属性

## [](#4-扩展属性-cstyle)4. 扩展属性 cStyle

||属性名称||属性含义||值类型||属性说明|
||属性名称||属性含义||值类型||属性说明|
||width||组件宽度||string||自定义宽度|
||height||组件高度||string||自定义高度|
||flex||按钮排列方向||string||end，center，start|
||className||自定义类名||string|||
||pageTitleStaticContent||标题区标题自定义内容||string||在配置Toolbar标题区的时候通过此字段控制标题展示的自定义内容，无需单独增加pagetitle组件|
||pageTitleKey||标题区标题字段名称||string||在配置Toolbar标题区的时候通过此字段控制标题展示的内容，比如要展示主表上的单据编码，主表单据编码字段为‘bill_code’，则在cStyle中配置pageTitleKey: "bill_code"|
||newAlign||ListHeader中配置Toolbar位置的新参数||string||用于解决ListHeader中配置多个Toolbar问题，在Toolbar的cStyle中配置一个{"newAlign": "left"}就等同于之前的align: left|

### [](#41-toolbar的显示与隐藏是怎么控制的)4.1. Toolbar的显示与隐藏是怎么控制的？

这个问题是经常遇到的一些bug，toolbar是通过是否有hide类名来控制显示与隐藏的。

hide: this.state.hide || !this.state.visible || this.state.delayShow

hide的类名主要是由上面三个属性控制，只有有一个为true，那么该组件就会隐藏
，用的最多的是this.state.hide，下面介绍下这个属性是怎么控制显示与隐藏的，看下面代码。

handleVisibleChange (controlKey, visible) {

 if (this.visibleMap.hasOwnProperty(controlKey))

 this.visibleMap[controlKey] = visible;

 let hideCount = 0;

 const { controls } = this.state;

 controls.forEach(item => {

 const { cItemName } = item;

 if (this.visibleMap[cItemName]) return;

 hideCount++;

 });

 const hide = hideCount === controls.length;

 this.setState({ hide, controlKey, controlKeyvisible: visible });

 if (this.props.onVisibleChange)

 this.props.onVisibleChange(!hide);

}

从上面代码不难看出，hide只有在hideCount===
controls.length的时候才会是true，具体含义就是循环controls，如果controls中的每个按钮的bVisible都是false，那么hideCount会一直加加，当bVisible=false的按钮数量刚好等于controls.length的时候，那么hide就会变为true，此时整个toolbar就被隐藏了，下面看下bVisible的来源。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbar_image2.54b482a3.png)

调用setVisible方法，最终会执行上面的handleVisibleChange方法。

### [](#42-toolbar标题区配置)4.2. Toolbar标题区配置

Toolbar支持卡片页的编辑态和浏览态标题区配置，默认效果如下图左上角部分，具体以编辑态卡片页进行说明。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbar_image3.87d4caff.jpeg)

如下图所示，框架会默认配置一部分标题区组件，从左到右依次是图标、标题、tag标签、只看必填项checkbox。

其中，图标是默认yonbip单色图标**yonbip-danju；**标题默认取的主表中的单据编码，字段为'code'，如果取不到code字段，则展示为"单据名称"+"详情"字样；tag标签默认取主表中的单据状态，字段为'status'，如果取不到status则不展示tag；只看必填项checkbox在浏览态和编辑态一直存在，可以对必填项进行单独筛选展示。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbar_image4.b7d0a193.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbar_image5.81e90436.png)

#### [](#421-excel配置说明)4.2.1. Excel配置说明

[bill_toolbar]：定义一块区域用来展示标题区域，cStyle中配置{"pageTitleKey": "xxx"}，xxx表示你要展示标题的字段，比如{"pageTitleKey": "code"}代表code是这个页面的标题。

[bill_toolbaritem]：增加一行，表中的type定义为pagetitle即可。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbar_image6.41eba9a0.jpeg)

#### [](#422-ypd设计器配置教程视频视频)4.2.2. YPD设计器配置教程视频[视频](https://docs.yonyoucloud.com/l/79bBEf81da73)

#### [](#423-toolbar标题区灵活配置)4.2.3. Toolbar标题区灵活配置

Toolbar标题区支持配置多种组件，具体映射关系见下表（特殊组件下文说明配置方式）：

||cControlType||组件|
||cControlType||组件|
||dropdownbuttongroup||DropdownButtonGroup|
||dropdownbutton||DropdownButton|
||dropdown||Dropdown|
||printtemplate||PrintTemplate|
||printbutton||Print|
||sumsettingbutton||SumAreaSetting|
||menupublishbutton||PublishMenu|
||summarysetting||SummarySetting|
||progressbar||ProgressBar|
||scancode||ScanCode|
||draftbutton||Draftbutton|
||datatempbutton||Templatebutton|
||input||Input|
||checkbox||CheckBox|
||acprint||ACPrint|
||button||Button|
||primarybutton||Button|
||workflowbtn||WorkFlowBtn|
||agreement||Agreement|
||aggregatesummarylabel||AggregateSummaryLabel|
||tablequantitysummary||TableQuantitySummary|
||spliter||特殊组件单独说明|
||icon||特殊组件单独说明|
||pagetitle||特殊组件单独说明|
||pageicon||特殊组件单独说明|
||pagecode||特殊组件单独说明|
||tag||特殊组件单独说明|

上述配置UI元数据结构为：

{

 "icon":"rollback",

 "cItemName":"btnAbandonBrowse",

 "cCaption":"返回",

 "cCaptionResid":"P_YS_FED_FW_0000021766",

 "cShowCaption":"返回",

 "cShowCaptionResid":"P_YS_FED_FW_0000021766",

 "bEnum":false,

 "cControlType":"button",

 "iOrder":10,

 "iStyle":0,

 "enterDirection":0,

 "bEnableFormat":false,

 "key":"Control.ToolbarItem.731046010",

 "cExtProps":"{\"cShowCaptionResId\":\"P_YS_FED_FW_0000021766\"}",

 "cShowCaptionResId":"P_YS_FED_FW_0000021766"

}

#### [](#424-配置说明)4.2.4. 配置说明

一般组件参考上述元数据配置方式配置即可，需要注意的是必须配置组件对应的model。

#### [](#425-特殊组件说明)4.2.5. 特殊组件说明

**（1）spliter**

spliter为分割栏，配置cControlType即可，其他的不需要配置，因为它本质上是一个span标签；

**（2） icon**

icon除了默认图标是yonbip单色图标外，同时支持yonbip单色/彩色图标，默认是彩色图标#icon-danju，可以在UI元数据中cShowCaption字段或icon字段配置，配置不需要写#icon，直接写图标symbol名称即可，[图标库地址](https://at.alicdn.com/t/project/2408217/753caf9d-0c00-438c-96bf-d08c54d7b580.html?spm=a313x.7781069.1998910419.77)（symbol是彩色图标，其余为单色），如果想配置单色图标，需要在UI元数据配置cExtProps {"singleColor": true},然后指定cShowCaption字段或icon字段即可。

**（3）pagetitle**

pageTitle默认取主表中的code字段值，如果取不到显示“单据名称”+“详情”，如果自定义显示主表字段，需要进行配置，在Toolbar 的UI元数据中cStyle字段添加{"pageTitleKey": "主表字段名"}，框架会解析pageTitleKey并从对应字段的模型中取值，如果能取到会展示对应值，取不到就会显示“单据名称”+“详情”。

pageTitle过长可能会有样式问题，因此pageTitle限制默认最大宽度520px，可以自行扩展宽度，通过在pageTitle组件UI元数据配置cExtProps {"titleWidth": "?????px"}即可

如果没有配过pageTitle组件，走的默认标题，需要在Toolbar 的UI元数据中cStyle字段添加{"titleWidth": "XXXpx"}即可，XXX是数字

**（4）tag**

tag不配置的情况下默认读取主表中的‘status’或‘verifyState’字段，如果配置，支持tag内容和颜色配置。

内容：需要在对应的tag组件UI元数据中的cExtProps字段配置{"tagItemKey": "主表字段名"}，之后会解析tagItemKey并从对应模型取值，如果取不到则展示UI元数据中的cShowCaption字段值。

颜色：UI元数据中配置color字段即可。

**（5）aggregatesummarylabel**

对于显示在linetabs中的toolbar, 配置 aggregatesummarylabel 组件可用于 在 toolbar 中显示子表字段的合计值。配置规则：

cAline: 'left' 显示在loolbar左侧，不配或者配其他值都展示在右侧

cStyle: '{"className": "toolbar-aggregate"}' 可配置自定义类名用于拓展样式

childrenField: 'xxx' 值为实体表的childrenField对应的值，必须配置，用于控制展示哪个对应子表的合计数据

cShowCaption: '子表字段1合计<%字段1的cItemName%>, 子表字段2合计<%字段2的cItemName%>' 可自定义展示的文本， <%%>里的内容会根据子表的字段值自动替换

**（6）tablequantitysummary**

对于显示在linetabs中的toolbar, 配置 tablequantitysummary 组件可用于 在 toolbar 中显示子表字段的合计数。配置规则：

cAline: 'left' 显示在loolbar左侧，不配或者配其他值都展示在右侧

cStyle: '{"className": "toolbar-count"}' 可配置自定义类名用于拓展样式

childrenField: 'xxx' 值为实体表的childrenField对应的值，必须配置，用于控制展示哪个对应子表的总数

cShowCaption: '共<%count%>条'，count 是固定值，显示模板可以自定义

配置示例：

"controls": [

 {

 "tenant_id": "0000KWU1QVO65WJ0AM0000",

 "auth_level": 3,

 "icon": "rollback",

 "nid": "nid_1650335240974_6",

 "enterDirection": 0,

 "uiObject": "controls",

 "subid": "GT9374AT32",

 "bMerge": true,

 "children": [],

 "authcontrol": true,

 "cCommand": "cmdAbandon",

 "id": "10379450",

 "pubts": "1650335237000",

 "iOrder": 1,

 "order": 10,

 "isMain": false,

 "cShowCaption": "返回",

 "uiTable": "BillToolbarItem",

 "uitype": "button",

 "toolbar": "SingleCardLeftHeader",

 "ytenant_id": "0000KWU1QVO65WJ0AM0000",

 "system": 1,

 "uiisview": true,

 "cControlType": "button",

 "billnumber": "eb0a8a06",

 "style": 0,

 "cItemName": "btnAbandonBrowst",

 "iStyle": 0,

 "uititle": "返回",

 "cCaption": "返回",

 "UI#isShow": true

 },

 {

 "auth_level": 5,

 "icon": "",

 "nid": "nid_1654073554848_0",

 "enterDirection": 0,

 "UI#designType": "ysmdd",

 "virtualField": true,

 "uiObject": "controls",

 "ideDesignType": "ysmdd",

 "children": [],

 "id": "29205",

 "iOrder": 3,

 "order": 20,

 "cSubId": "GT9374AT32",

 "isMain": false,

 "cShowCaption": "标题配置",

 "uiTable": "BillToolbarItem",

 "uikey": "button19ca",

 "uitype": "pagetitle",

 "authid": "eb0a8a061654073554850_1",

 "toolbar": "SingleCardLeftHeader",

 "system": 0,

 "uiisview": true,

 "cControlType": "pagetitle",

 "style": 0,

 "cItemName": "title",

 "iStyle": 0,

 "uititle": "标题配置",

 "cCaption": "标题配置",

 "UI#isShow": true

 }

]

### [](#43-常见配置问题)4.3. 常见配置问题

#### [](#431-在某些场景想隐藏标题区怎么办)4.3.1. 在某些场景想隐藏标题区怎么办？

支持传入参数隐藏，具体代码如下：

viewModel.getParams().hideDefaultToolbar = true // 隐藏默认标题区

#### [](#432-如果要隐藏只看必填项怎么做)4.3.2. 如果要隐藏只看必填项怎么做？

通过开启特性开关**hideMustInput**进行配置，支持单据级特性开关，具体文档参考[MDF特性单据级配置修改方案](https://www.yuque.com/yonbip/node/cguu6k)。

#### [](#433-如何隐藏默认的标题tag以及图标不是必要请不要隐藏)4.3.3. 如何隐藏默认的标题，tag以及图标（不是必要请不要隐藏）？

通过在扩展脚本编写下面代码：

viewModel.execute('updateViewMeta', {code: cGroupCode, showTag: false}

// 如果是title就改成showTitle false,icon是showIcon

// cGroupCode是UI元数据Toolbar的cGroupCode，是开发者自行配置的

// 如果是title就改成showTitle false,icon是showIcon

// cGroupCode是UI元数据Toolbar的cGroupCode，是开发者自行配置的

#### [](#434-自定义tag颜色怎么做)4.3.4. 自定义tag颜色怎么做？

先配置好tag组件，然后需要在扩展脚本编写下面代码，在拿到枚举值的时候同步颜色

（扩展里可以在init的时候直接switch case根据不同值改颜色，或者别的更优雅的写法，有领域的同事写完可以评论区分享出来，开源 == 1+1 >> 2）

viewModel.execute('updateViewMeta', {code: cGroupCode, tagColor: '#00ff00'})

// tagColor直接写颜色值就行了 这个cGroupCode就是Toolbar容器的cGroupCode，某些领域Excel中可能叫name，可能叫code之类的，最好用SQL查出表看看field名字

#### [](#435-listheader中怎么配多个toolbar列表页怎么配左边的toolbar按钮或者其他组件)4.3.5. ListHeader中怎么配多个Toolbar（列表页怎么配左边的Toolbar按钮或者其他组件）？

ListHeader中新增一个Toolbar，然后align配left，在cStyle中配置{"newAlign": "left"}，Toolbar就到左边了

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/Toolbar_image7.c58230ac.jpeg)

#### [](#436-卡片页左上角标题区标题想动态修改)4.3.6. 卡片页左上角标题区标题想动态修改

（看清楚是动态动态动态动态动态，就是根据业务变化而变化的操作
比如不同交易类型之类的）自定义内容怎么做（有风险，最好不要自定义，设计规范是统一的，如果大规模领域都有此需求，请和设计师黄赫沟通是否做成公共特性）？
需要UI模板配置配合扩展脚本完成，具体步骤如下：

// a: 首先UI模板上配置pageTitle组件，并且已经配置好pageTitleKey为一个主表字段，具体怎么配置翻翻上面；

 

// b: 用单据模型拿到这个字段值（最好这个模型对应的组件没有在主表显示，因为标题组件和主表组件是共用一个模型，一修改模型的值对应组件内容都会被修改），具体代码如下：

viewModel.get('主表具体字段的模型').setValue('这是一个自定义标题')

 

// c: 修改完模型值后需要刷新标题区容器，使用下面代码：

viewModel.execute('updateViewMeta', {code: cGroupCode, needRender: true})

// cGroupCode是Toolbar容器的编码，配UI模版的时候就能知道是啥

 

// d: 如果有的领域想在某些状态下修改不同的值，请在modeChange钩子下做上面的事情：

viewModel.on('modeChange', (args) => {

 if (args === 'add') {

 // TODO

 }

})

#### [](#437-标题区配了tag却显示未知是怎么回事)4.3.7. 标题区配了tag却显示"未知"是怎么回事？

a. 请首先检查配了tagItemKey了没有，如果没有，请加上；

b. 配的这个tagItemKey对应的主表字段是不是个多选，如果是，请修改为单选。

#### [](#438-单纯想标题区自定义内容怎么做)4.3.8. 单纯想标题区自定义内容怎么做？

toolbar容器增加个属性pageTitleStaticContent，value是自定义内容即可

扩展脚本可以通过updateViewMeta更新state，来更新自定义内容

viewmodel.execute('updateViewMeta', {

 code: 'cGroupCode', // toolbar对应的cGroupCode bill_toolbar表中对应的是name字段 

 pageTitleStaticContent: 'XXX'

});

#### [](#439-动态控制显示隐藏)4.3.9. 动态控制显示隐藏

viewmodel.execute('updateViewMeta', {

 code: 'cGroupCode',

 visible: false

});

#### [](#4310-标题区只看必填项有无事件可以提供给扩展脚本)4.3.10. 标题区只看必填项有无事件可以提供给扩展脚本？

有，用单据模型viewModel监听hideBisNullItems事件即可，demo：

viewModel.on('hideBisNullItems', value => console.log(value)) // value为true/false 选中为true，不选为false

#### [](#4311-标题区业务方想自定义拼接文本如何处理)4.3.11. 标题区业务方想自定义拼接文本如何处理？

思路就是拼接好文本然后通过updateViewMeta的方式修改state

viewModel.on('afterLoadData', () => {

 const valueA = viewModel.get('itemNameA').getValue();

 const valueB = viewModel.get('itemNameB').getValue();

 const titleString = `${valueA}__${valueB}`

 viewModel.execute('updateViewMeta', {

 code: 'cGroupCode', // 这里别照抄，根据你的cGroupCode来 toolbar对应的cGroupCode bill_toolbar表中对应的是name字段

 pageTitleStaticContent: titleString

 }

})

#### [](#4312-标题区默认取编码如果我不想要编码只想要单据名称详情怎么办)4.3.12. 标题区默认取编码，如果我不想要编码，只想要单据名称+详情怎么办？

直接在返回按钮所在的标题区Toolbar中，对应的（bill_toolbar表）toolbar容器的cStyle中配置一个{"pageTitleKey": "一个不存在的字段，比如XXX、ABC等等"}即可。