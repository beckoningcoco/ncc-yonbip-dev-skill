---
title: "查询区 ConvenientQuery"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-convenientquery"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 12
---

# 查询区 ConvenientQuery

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-convenientquery | 所属：Web组件

# [](#查询区-convenientquery)查询区 ConvenientQuery

【文档作者】：杨月、张昊等

## [](#1-功能说明)1. 功能说明

通过多个条件的组合进行搜索，查询出目标数据。

## [](#2-效果展示)2. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage1.b6f07832.png)

## [](#3-基本属性)3. 基本属性

### [](#31-单据配置)3.1. 单据配置

||属性名称||属性含义||值类型||属性说明|
||bHideFilterScheme||是否隐藏方案列表||boolean||true - 隐藏查询方案列表|
||bHideSearchStr||是否隐藏搜索按钮||boolean||true - 隐藏搜索按钮|
||designSolutionExtend||编辑/新增态联动脚本||boolean||true - 脚本联动|
||autoLoad||自动搜索||boolean||true - 初始化方案自动搜索|
||btnAdvanceIsHidden||是否隐藏高级按钮||boolean||true - 隐藏“高级”按钮|
||btnRestoreIsHidden||是否隐藏重置按钮||boolean||true - 隐藏“重置”按钮|
||bHideSimpleSetting||是否隐藏调整按钮||boolean||true - 隐藏“调整”按钮|
||searchboxLogicOption||searchbox精确搜索模式拼接条件的逻辑符号||string||默认条件拼接逻辑符号是'and'， 可以根据需求改为'or'以决定条件并集还是交集|
||hideShowMoreInFilter||是否隐藏更多按钮||boolean||true - 隐藏更多按钮|
||extFilterComp||查询区按钮区扩展组件||Array[string]||查询区按钮区扩展组件，字符串数组，配置对应组件的controlType就行，示例：{"extFilterComp": ['button1', 'button2']}|
||iLabelNum||查询区各条件的label字数长度||number||最小为4，最大为12|
||bForbidAddScheme||禁止新增查询方案||boolean||没有默认值，配成true的话不允许新增查询方案|

在billtplgroup_base表中ConvenientQuery容器的cStyle字段中配置，配置示例：{"bHideFilterScheme":
true}

### [](#32-参照配置)3.2. 参照配置

||属性名称||属性含义||值类型||属性说明|
||bHideFilterScheme||是否隐藏方案列表||boolean||true - 隐藏查询方案列表|

在pub_ref表中对应的refentity
的extendField字段中配置，配置示例：{"bHideFilterScheme": true}

### [](#33-查询区各条件扩展属性配置)3.3. 查询区各条件扩展属性配置

在pb_meta_filter_item表中对应配置extendField字段即可，配置示例：{"扩展属性名":
'扩展属性值'}

### [](#34-查询区时间区间组件控制日期快捷选项数量配置方式)3.4. 查询区时间区间组件控制日期快捷选项数量配置方式

在pb_meta_filter_item表中对应配置extendField，其中，需要传入固定的rangesArr来控制显示哪些日期快捷项，框架提供了24个快捷日期，对照关系见下文（展开代码）。

示例：{"rangesArr":["0","-1","thisWeek","lastWeek"]}

扩展脚本配置写法：

filterViewModel.on('beforeInit', filterModels => {

 // 大前提，你没有配过extendField，否则会覆盖原来的配置，最好打印出来看看原有配置，如果有原配置，请自行处理合并，extendField是字符串类型字段

 filterModels[filterModels.findIndex(item => item.itemName === '你的条件的itemName')].extendField = '{"rangesArr":["0","-1","thisWeek","lastWeek"]}'

})

效果图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage2.793804a5.png)

具体的key和value对照关系见下JSON：

[

 {

 "key": "0",

 "label": "今天"

 },

 {

 "key": "1",

 "label": "明天"

 },

 {

 "key": "-1",

 "label": "昨天"

 },

 {

 "key": "-2",

 "label": "前天"

 },

 {

 "key": "-3",

 "label": "近3天"

 },

 {

 "key": "-7",

 "label": "近7天"

 },

 {

 "key": "-30",

 "label": "近30天"

 },

 {

 "key": "-60",

 "label": "近60天"

 },

 {

 "key": "-90",

 "label": "近90天"

 },

 {

 "key": "-120",

 "label": "近120天"

 },

 {

 "key": "-180",

 "label": "近180天"

 },

 {

 "key": "-360",

 "label": "近360天"

 },

 {

 "key": "thisWeek",

 "label": "本周"

 },

 {

 "key": "lastWeek",

 "label": "上周"

 },

 {

 "key": "nextWeek",

 "label": "下周"

 },

 {

 "key": "thisMonth",

 "label": "本月"

 },

 {

 "key": "lastMonth",

 "label": "上月"

 },

 {

 "key": "nextMonth",

 "label": "下月"

 },

 {

 "key": "thisSeason",

 "label": "本季"

 },

 {

 "key": "lastSeason",

 "label": "上季"

 },

 {

 "key": "thisYear",

 "label": "本年"

 },

 {

 "key": "lastYear",

 "label": "上年"

 },

 {

 "key": "start",

 "label": "至过去"

 },

 {

 "key": "end",

 "label": "至未来"

 }

]

**隐藏枚举列表：**

**rangesArr的值配置为['empty']即可**

**如果上方的二十多个快捷选项都不满足用户的需求，那么可以通过扩展脚本进行注入，以下是示例：**

// 在查询区扩展脚本中

rangesArr = [

 { value: [moment().startOf('day'), moment().endOf('day')], label: 自定义日期1, key: 'XXX'} // 具体请参考tinperNext基础组件文档的rangepicker的ranges属性：https://yondesign.yonyou.com/website/#/detail/component/wui-datepicker/other?tab=api

]

viewModel.on('afterInit', () => {

 viewModel.get('对应的日期条件的ItemName').getFromModel().setState('ranges', rangesArr)

})

### [](#35-rangetimepicker控制首次选择日期时面板默认值)3.5. rangetimepicker控制首次选择日期时面板默认值

有些场景需要在日期面板第一次选择日期时间的时候，时间面板默认是00:00:00或23:59:59，这个配置需要按照钉耙文档配置showTime属性，showTime对象组装好转换成JSON字符串配置到查询区对应条件的extendfield字段即可，示例如下：

extendField中配置 '{"showTime":{"defaultValue":["00:00:00","23:59:59"]}}' 即可

具体查看tinper-next 日期时间组件文档https://yondesign.yonyou.com/website/#/detail/component/wui-datepicker/api 中的showtime-options部分

## [](#4-高级方案适配)4. 高级方案适配

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage3.00de669c.png)

打开特性开关advanceFilterExpression即可，或者扩展脚本中写

viewModel.enableFeature('advanceFilterExpression')

## [](#5-从列表页面获取查询模型)5. 从列表页面获取查询模型

// viewmodel为当前列表的页面模型

viewmodel.on('afterInitCommonViewModel', function () {

 const filterViewModel = viewModel.getCache('FilterViewModel');

})

## [](#6-查询条件占多列)6. 查询条件占多列

### [](#61-只修改某个方案)6.1. 只修改某个方案

pb_filter_solution_common表中对应条件的cExtprops字段，增加cols属性

{"cols": 2}

### [](#62-修改所有方案)6.2. 修改所有方案

pb_meta_filter_item表中对应条件的extendField字段，增加cols属性

{"cols": 2}

## [](#7-设置比较符禁用)7. 设置比较符禁用

pb_meta_filter_item表中的allowUpdateCompare字段为2

## [](#8-默认展示多行查询条件)8. 默认展示多行查询条件

// 设置默认展示三行

viewmodel.getParams().filterRows = 3

## [](#9-查询条件-多包含)9. 查询条件-多包含

- 查询条件可以设置为多包含格式，即使用当前字段模糊匹配多个值，录入的时候多个值默认使用空格切割。
- 多包含的配置方式：在aa_enum表中修改比较符的枚举列表，key为multlike
- 如果业务场景不想用空格作为分割符可在过滤条件中的cExtProps字段增加属性splitIcon进行修改
- 多包含是使用数据库中pb_meta_filter_item表中的dataSource字段进行匹配的，设置多包含的时候，dataSource字段不可为多个字段的逗号拼接

### [](#91-指定方案不可删除)9.1. 指定方案不可删除

在pb_filter_solution表对应方案的cExtProps字段配置{"prohibitDeletion":

true}

### [](#92-指定条件配置隐藏)9.2. 指定条件配置隐藏

// 一般情况下隐藏需要在查询模型的afterInit中处理

filterViewModel.on('afterInit', function () {

 // code 为要隐藏条件的itemName

 filterViewModel.execute('updateViewMeta', { code: 'xxx', visible: false })

})

## [](#10-隐藏整个查询区)10. 隐藏整个查询区

FilterViewModel.setState('bHideFilterScheme', true)

## [](#11-适配默认组织)11. 适配默认组织

查询区支持设置默认组织作为条件进行查询，设置默认组织需要几个必要条件：

- 

工作台我的首选项中设置默认组织

- 

有方案的编辑权限，可对方案进行设置

- 

方案中存在主组织参照（数据库中pb_meta_filter_item表中的isMasterOrg为1）

- 

设置默认值为对应默认组织（数据库中pb_filter_solution_common表中的value1为<%defaultOrg%>）

- 

设为默认组织的参照和工作台的参照数据结构需一致（唯一标识结构）

- 

fxType配为org也可以实现默认组织功能，非主组织参照时使用，与主组织二选一即可

## [](#12-适配默认人员)12. 适配默认人员

查询区支持设置默认人员作为条件进行查询，设置默认人员需要几个必要条件：

- 

有方案的编辑权限，可对方案进行设置

- 

方案中存在当前登陆人参照（数据库中pb_meta_filter_item表中的extendField字段配置fxType为'user')

- 

默认登陆人是使用getLoginUser接口返回的id该参照进行数据匹配，领域开发需自行保证id的一致性

## [](#13-高级查询数据库配置)13. 高级查询数据库配置

### [](#131-效果展示)13.1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage4.cdb37d63.png)

参考文档

[高级查询二级菜单使用及数据库配置](#/components-web/05-gaojichaxunerjicaidanshiyongjishujukupeizhi)

## [](#14-查询区配置多选枚举)14. 查询区配置多选枚举

查询区可以配置多选枚举作为查询条件，配置方式及注意事项如下：

- 

配置pb_meta_filter_item表和pb_filter_solution_common表中条件相关字段，配置方式与tagbutton类似

- 

将步骤1表中的cControlType设置为checkboxenum

- 

使用pb_meta_filter_item表中的bAutoFlt字段配置选中后是否自动搜索

- 

多选枚举默认占用一行，如枚举项较少想将其仅占一列，配置pb_meta_filter_item中的extendField

配置示例：{'cols': 1}

### [](#141-效果展示)14.1. 效果展示

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage5.b9ef8487.png)

日期

predicateDatepicker

特有组件配置

tagbutton

脚本可干预代码描述

导航区配置

## [](#15-区间日期适配)15. 区间日期适配

pb_meta_filter_item表中增加type是datepicker的组件，然后比较符compareLogic改成between即可

## [](#16-查询区包含下级配置)16. 查询区包含下级配置

### [](#161-参照使用方配置)16.1. 参照使用方配置

- 

在pb_meta_filter_item表中预制一个参照作为过滤条件，比较符配为左包含（leftlike）

- 

pb_meta_filter_item表中的extendField字段增加配置{"associatedSubordinate":
true}

- 

pb_meta_filter_item表中refReturn字段配置为参照提供方path相关的字段

- 

pb_meta_filter_item表中dataSource字段配置为参照提供方path相关的字段

### [](#162-参照提供方配置)16.2. 参照提供方配置

将path相关(可以代表上下级存在关系的字段，如父节点path为01，子节点path为01-01)在getRefData接口进行返回即可

## [](#17-导航区搜索框支持搜索全量数据服务端过滤)17. 导航区搜索框支持搜索全量数据（服务端过滤）

查询字段pb_meta_filter_item表中的extendField字段增加配置{"lazySearch":
true}

## [](#18-导航区支持包含下级)18. 导航区支持包含下级

导航区支持包含下级功能分两种情况，参照提供方和参照使用方

### [](#181-参照提供方设置包含下级)18.1. 参照提供方设置包含下级

提供方统一提供包含下级功能，则需要提供方在pub_ref表中对应的refentity
的extendField字段中配置特性开关，开关key为filterSearchIncludesSub，值为布尔值true，另外默认使用path做包含下级搜索，如果path字段不存在需要补全，如果原有数据中其他的key可以替代path的功能，则需要仿照filterSearchIncludesSub的配置方式，额外配置一个key为pathField，值则为替代path的字段名，如{"pathField":
"fullpath"}

### [](#182-参照使用方设置包含下级)18.2. 参照使用方设置包含下级

提供方不做统一功能提供的时候，使用方可以单独开启包含下级功能，可以在pb_meta_filter_item表中配置filteritem对应字段的cExtProps，key也为filterSearchIncludesSub和pathField。

## [](#19-查询区支持tips提示)19. 查询区支持tips提示

查询区组件可以支持tips提示，配置方式为：在pb_meta_filter_item表中配置filteritem对应字段的extendField，如果想要设置控件的提示，则配置tips字段，如果想设置label的提示，则配置label_tips字段。

配置示例1：{"tips": "这是一个控件的tips提示"}

配置示例2：{"label_tips": "这是一个label的tips提示"}

![](data:image/png;base64,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)

## [](#20-查询区做简版普通版切换)20. 查询区做简版/普通版切换

开启这个功能有几个必要条件：

- 首先需要在getInitFilterInfo接口返回的数据中第0个对象中返回字段cExtProps

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage7.739259e8.png)

cExtProps的值为："{"simpleFltSwitch":
true}"，true代表开启切换功能，false代表关闭。

- 需要预制一个ctrlType为"searchbox"的查询条件，然后根据此文档进行配置[查询区Searchbox模糊搜索/精确搜索多模式组件](#/components-web/05-chaxunqusearchboxmohusousuo)

配置完成效果：

     简版：

![](data:image/png;base64,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AAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUUKAAAAAABADUXKaW733oPF3v2HsufONoeOfJ89DgAAAAAAp4oipZ9WrFxTLF22InsuLFi4pHh80uTyn/G6Y9HS4he/+EUx7vY7eo3tryhRRo8eXd5n2mtvZMcMxtZt3cUFF1xQPDZxUnHw0LHsmM9mfVlcfPElxRNPPpU9P5Senfp8cf755xe3/W1c9jwAAAAAAJwqZ02RMvHxycWECfectC2d23vde+36TeUX/VFofPn1nF7nw9ixt5Xnpzz1TPk6CpV4fe211/Ua2x8xO+OWW8eW94j33rS5q9i5a1+tgcxaid8x7hslTTo248OPik8/+6LYs+/4faa/+3455q5/jK/GtMvCntIp7Ozemx0DAAAAAACnwllTpPzud7+vvow/GStWre1174OHvyvuv//BakyUDo3n48v/dG7l6nXlsZMtUp6c8nR1z/6I2SO5+7Q6cOhYORslrnnz7enlsR3de6r7RCkTx4aqSNl34Eg5q+VE0vuPG3d79nyjWZ9/lX0vAAAAAAAYamdNkfLFl7OLGTM/HrRULuSKlOSll1+tvvBvXGrr5Vdeq45feOGFpXS/xmPJ8y+81HTfVnHvdO2ll/6/4qqrrs667LI/VeOuvuaa7L1azfzok3J8/H5RcsSxTz77vDw2ZsyYatxQFSlRzKTfcajcd/8D2fcCAAAAAIChZo+UHn/4wx/LL+n7KlLC62+8VX2hv2XrjnI2R1r2q79iL5XcvaPYiOKiceyVf7mq2LRlW6+xa9dtKmehxJhYoqtr+65eY3L+fOWV5TWTn3iyOvbggw+Xx+697/7qWDuKlOnvfnBS7rjj7+V9FCkAAAAAAAyXs6pIic3gFy9dnj13Iv0tUsIrr75WzJ4zr/w5vtSP62JpsVjiKzaID199/U15/Jq/XlsdS/Yf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)

    普通版：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage9.99d40f17.png)

## [](#21-修改比较符列表)21. 修改比较符列表

- 

配置脚本联动（参考文档[查询区逻辑扩展](#/guides/02-chaxunquluojikuozhan)）

- 

监听afterGetCompareLogic，接收参数，直接修改

## [](#22-查询方案新增默认带出条件条件必选)22. 查询方案新增默认带出条件（条件必选）

在pb_meta_filter_item表中找到对应条件，配置cExtProps属性：'{"mustSelect":true}'

## [](#23-查询方案设置按钮和自定义过滤条件按钮缺失问题)23. 查询方案设置按钮和自定义过滤条件按钮缺失问题

直接原因是因为此用户没有查询方案相关权限，具体设置方法请参考下面的步骤开启权限（可以由管理员进行）：

1.打开授权节点，输入当前用户的信息（手机号/用户名/邮箱）检索到该用户被分配的角色，记住对应角色编码：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage10.eec66d4d.png)

2.输入刚才的角色，如果是管理类，点击行上的编辑按钮进入管理页面：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage11.0049456b.png)

3.在左侧功能权限中搜索查询方案，右侧自定义过滤项和查询方案设置权限勾选上保存即可，只有管理类角色能设置此权限并保存，业务类角色无法设置此功能权限：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ConvenientQuerychaxunquimage12.d320172c.png)

## [](#24-查询区扩展自定义组件并且指定具体modeltype用于生成对应业务模型)24. 查询区扩展自定义组件，并且指定具体modelType用于生成对应业务模型

pb_meta_filter_item表、pb_filter_solution_common表中找到这个对应条件，改cExtProps中的extModelType即可，具体参数如下：

{

 extModelType: "ReferModel" / "ListModel" // 仅支持这两种

}

如果这个组件的比较符是between，但是组件只想渲染一个，在cExtProps中增加这个属性即可：

{

 isSingleComponent: true

}