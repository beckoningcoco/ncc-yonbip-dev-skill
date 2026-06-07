---
title: "--高级查询二级菜单使用及数据库配置"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-gaojichaxunerjicaidanshiyongjishujukupeizhi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 6
---

# --高级查询二级菜单使用及数据库配置

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-gaojichaxunerjicaidanshiyongjishujukupeizhi | 所属：Web组件

# [](#高级查询二级菜单使用及数据库配置)高级查询二级菜单使用及数据库配置

通常情况下，我们使用的查询区可设置多个条件，条件之间均以and进行拼接进行sql查询，但在某种特定的业务场景下无法满足or与and的混用场景，为了应对此场景，可以通过配置advanceModel高级查询模型实现，具体使用方式如下：

## [](#1-配置开关)1. 配置开关

修改查询区容器的UI元数据配置，将billtplgroup_base表中对应的查询区容器的cStyle字段中增加属性**"enableAdvanceModel":true**

## [](#2-数据库配置示例)2. 数据库配置示例

简单示例：[高级查询二级菜单示意图及示例数据](#/components-web/05-gaojichaxunerjicaidanshiyitujishilishuju)

数据库配置pb_filter_solution_advance表,配置如下

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaojichaxunerjicaidanshiyongjishujukupeizhiimage1.c45c7996.png)

- **字段含义对照表：**
| id | 唯一标识 | |
|------------------------|---------------|---------------------------------------------------------|
| parentId | 父节点的id | |
| filterId | 过滤器id | 单据级的高级方案需要有此字段 |
| solutionId | 方案id | 方案级的高级方案需要有此字段 |
| logicSymbol | 逻辑拼接符 | 当前节点下所有子节点的逻辑拼接关系 |
| itemId | filterItem的id | 所有查询项必须是在pb_meta_filter_item表中定义的过滤项，此字段记录了二者之间的对应关系 |
| itemName | | 查询条件拼接的key部分 |
| itemTitle | | 页面展示的条件的名称 |
| compareLogic | 比较符 | |
| value1 | 值1 | 查询条件拼接的value部分  如果初始化的时候不需要选中的节点则将此值设为null |
| value2 | 值2 | 比较符为between时的第二个值  如果初始化的时候不需要选中的节点则将此值设为null |
| iorder | | 排序 |
| pubts | | 生成时间 |
| itemTitle_resid | | 多语资源 |
| valueKey | | 此值为选中某个条件时回填到该节点的value1中的内容，开发态需保证此值的准确性，须与value1保持一致 |
| valueTitle | | 条件在页面展示的名称 |
| bHidden | | 是否隐藏页签/条件项 |
| bAutoFlt | | 是否在点击后自动搜索 |
| bRelatedSolutionCommon | | 是否将此条件关联到普通查询区，如设置关联（true），条件拼接时使用普通查询区的值对高级查询区的值进行覆盖 |
| value2Key | | 预留字段  |
| vlaue2Title | | 预留字段  |
| vlaueTitle_resid | | 多语预留字段  |
| vlaue2Title_resid | | 多语预留字段  |

**配置示例：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaojichaxunerjicaidanshiyongjishujukupeizhiimage2.cdb37d63.png)

**上图条件：tab页签代表单据状态status等于已审核，条件项有三个：单据编码（code）、创建人（creator）、单据日期（voucherdate），页面中三个条件的
关系为单据编码为XXX并且（创建人为XXX或单据日期为XXX）**

**则最后生成的条件为 已审核 and（单据编码 and（创建人 or单据日期））**

1、配置好单据其他表，找到单据对应的filterId和solutionId，下面所有的配置数据均需填写filterId
或solutionId字段，如想配置单据级的二级菜单，则配置filterId，如配置方案级的高级查询条件则配置solutionId

2、配置根节点，下面所有配置均为除filterId / solutionId
外的必须字段，其余字段选配

||id: 1||logicSymbol: "or"||iOrder: 0||parentId: null|
||唯一标识||子节点直接关系，根节点的子节点为tab页签，不同页签之间的关系默认为or||同级排序||根节点没有父id|

3、配置页签虚拟节点id：

||id: 10||logicSymbol: "and"||iOrder: 1||parentId: 1|
||id: 11||logicSymbol: "and"||iOrder: 2||parentId: 1|
||id: 12||logicSymbol: "and"||iOrder: 3||parentId: 1|
||唯一标识||页签与页签下条件之间的关系，页签与条件默认为and||同级排序||根节点id|

4、配置页签数据

||菜单页签节点|||||||
||全部页签||已审核页签||开立页签|||
||valueKey: "all"||valueKey: "0"||valueKey: "1"||此值为搜索时拼接的条件内容为all时会对同级所有兄弟进行拼接|
||IOrder: 10||IOrder: 11||IOrder: 12||同级排序|
||itemName: "status"||itemName: "status"||itemName: "status"||此值为搜索时拼接的条件key的部分|
||itemTitle: "状态"||itemTitle: "状态"||itemTitle: "状态"|||
||value1: "all"||value1: "0"||value1: "1"||此值为null则不拼接条件，此值有内容才会进行条件拼接|
||id: 111||id: 102||id: 121||id|
||compareLogic: "eq"||compareLogic: "eq"||compareLogic: "eq"||比较符，用于拼接搜索条件的key与value|
||value2: ""||value2: ""||value2: ""|||
||valueTitle: "全部"||valueTitle: "已审核"||valueTitle: "开立"||页面展示文字|
||itemId: 0||itemId: 0||itemId: 0||对应的pb_meta_filter_item表中的过滤项id 此处仅做举例，根据具体业务场景实现，务必保证该值准确性|
||parentId: 11||parentId: 10||parentId: 12||父id|
||bHidden: false||bHidden: false||bHidden: false||是否隐藏页签 隐藏的内容会恒拼到查询条件中，非业务场景必须情况下请谨慎使用|
||autoFlt: true||autoFlt: true||autoFlt: true||点击页签后是否立即进行搜索|

5、配置条件

每个页签下只有一个条件的情况正常配置，如有多个条件时，则需要以二叉树的原理进行节点配置，即每个父节点只能有至多两个子节点，如果超过两个条件则每两个子节点需要新增一个虚拟父节点，上图所表示的是三个条件，且条件直接逻辑拼接符不同，需要对创建人和单据日期节点增加虚拟父节点：

 条件配置图解：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaojichaxunerjicaidanshiyongjishujukupeizhiimage3.8d52b55a.png)

三个条件之间的关系如图所示，对应配置如下：

||所有条件虚拟的父节点|||||||
||id: 101||logicSymbol: "and"||iOrder: 12||parentId: 10|
||单据编码虚拟节点 （此节点所有的孩子均为可选的值）|||||||
||id: 10101||logicSymbol: "or"||iOrder: 121||parentId: 101|
||创建人+单据日期的虚拟节点|||||||
||id: 10102||logicSymbol: "or"||iOrder: 122||parentId: 101|
||创建人虚拟节点|||||||
||id: 1010201||logicSymbol: "or"||iOrder: 1221||parentId: 10102|
||单据日期虚拟节点|||||||
||id: 1010202||logicSymbol: "or"||iOrder: 1222||parentId: 10102|

具体条件配置：

||含义及规则 ||单据编码全部||单据编码包含1的tag||单据编码包含2的tag||创建人全部||创建人包含建的||创建人包含刘的||单据日期2020年||单据日期六月|
||条件拼接时的内容，all为特殊标识，代表了全部兄弟条件||valueKey: "all"||valueKey: "0"||valueKey: "1"||valueKey: "全部"||valueKey: "建"||valueKey: "刘"||valueKey: "2020"||valueKey: "06"|
||同级排序||iOrder: 1211||iOrder: 1212||iOrder: 1213||iOrder: 12211||iOrder: 12212||iOrder: 12213||iOrder: 12221||iOrder: 12222|
||此值为搜索时拼接的条件key的部分||itemName: "code"||itemName: "code"||itemName: "code"||itemName: "creator"||itemName: "creator"||itemName: "creator"||itemName: "vouchdate"||itemName: "vouchdate"|
||itemname相同的条件，前面展示的label标签内容||itemTitle: "单据编码"||itemTitle: "单据编码"||itemTitle: "单据编码"||itemTitle: "创建人"||itemTitle: "创建人"||itemTitle: "创建人"||itemTitle: "单据日期"||itemTitle: "单据日期"|
||条件拼接的内容部分，应与ValueKey相同，但有值的时候才会进行条件拼接||value1: "全部"||value1: "1"||value1: "2"||value1: null||value1: null||value1: "刘"||value1: null||value1: null|
||||id: 1010101||id: 1010102||id: 1010103||id: 101020101||id: 101020102||id: 101020103||id: 101020201||id: 101020202|
||比较符||compareLogic: "eq"||compareLogic: "eq"||compareLogic: "eq"||compareLogic: "eq"||compareLogic: "eq"||compareLogic: "eq"||compareLogic: "like"||compareLogic: "like"|
||比较符为between时可能用到到值2||value2: ""||value2: ""||value2: ""||value2: ""||value2: ""||value2: ""||value2: ""||value2: ""|
||页面展示的文字内容||valueTitle: "全部"||valueTitle: "包含1的"||valueTitle: "包含2的"||valueTitle: "全部"||valueTitle: "包含建的"||valueTitle: "包含刘的"||valueTitle: "2020年"||valueTitle: "六月"|
||对应的pb_meta_filter_item表中的过滤项id 此处仅做举例，根据具体业务场景实现，务必保证该值准确性||itemId: 0||itemId: 0||itemId: 0||itemId: 0||itemId: 0||itemId: 0||itemId: 0||itemId: 0|
||父id||parentId: 10101||parentId: 10101||parentId: 10101||parentId: 1010201||parentId: 1010201||parentId: 1010201||parentId: 1010202||parentId: 1010202|
||是否隐藏页签||bHidden: false||bHidden: false||bHidden: false||bHidden: false||bHidden: false||bHidden: false||bHidden: false||bHidden: false|
||点击页签后是否立即进行搜索||autoFlt: true||autoFlt: true||autoFlt: true||autoFlt: true||autoFlt: true||autoFlt: true||autoFlt: true||autoFlt: true|

## [](#3-设置默认打开页面展示的页签)3. 设置默认打开页面展示的页签

扩展脚本中监听**getDefaultActiveTabKey这个钩子函数，框架会把map映射传递给脚本，脚本中通过业务逻辑筛选出需要设置默认的页签的id
写在入参对象中，即新增一个defaultId的key value即为筛选后的id值**

**看示例代码：**

viewModel.on('afterInitCommonViewModel',function(){

 // 获取页面上的过滤模型

 let filterViewModel = viewModel.getCache('FilterViewModel')

 // 通过过滤模型的getDefaultActiveTabKey事件，通过传进来的args来修改页签数据

 filterViewModel.on('getDefaultActiveTabKey',function(args) { 

 const defaultId = XXX // 这里的id不要直接写死，因为id会变化，请根据args中的data拿到全量的页签数据，然后根据itemName和valueKey反查对应的id进行赋值 

 args.defaultId = defaultId 

 })

})

## [](#4-设置数量)4. 设置数量

- 自行获取数量

扩展脚本getAdvanceTitles
这个钩子函数，框架会把**map映射传递给脚本，脚本处理好业务逻辑之后调用入参中的callback把组装好的数量传递回框架即可,
map的结构：key为条件的valueKey value为数值**

FilterViewModel.on('getAdvanceTitles', (args) => {

 const { callback } = args;

 callback({'status_0': XXX, 'status_1': XXX, ......}) // status_0 status_1 都是你配置的 `${itemName}_${valueKey}`

})

- 框架自动获取数量

配置特性开关autoGetAdvanceTitles

## [](#5-隐藏页签数量)5. 隐藏页签数量

查询区组件的cStyle中配置hideAdvanceTitles为true

或者扩展脚本中

FilterViewModel.getParams().hideAdvanceTitles = true

### [](#51-隐藏某个页签数量)5.1. 隐藏某个页签数量

在advance表中配置页签数据的时候，在要隐藏数量对应项中的cExtProps配置hideTitle为true即可

{"hideTitle": true}

## [](#6-监听页签切换)6. 监听页签切换

FilterViewModel.on('beforeTabsChanged', function (key){

// key为页签的key

})

## [](#7-隐藏某些页签)7. 隐藏某些页签

 
监听getDefaultActiveTabKey事件，该事件会传递一个参数tabs，然后tabs的结构是：{data:
{}}

  然后自行根据业务需求去设置对应项的bHidden为true即可，下面是代码示例：
 ![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaojichaxunerjicaidanshiyongjishujukupeizhiimage4.d97139ec.png)

## [](#8-开了autogetadvancetitles特性后获取的数量不对后端list接口查回来没问题但是前端渲染出了问题)8. 开了autoGetAdvanceTitles特性后获取的数量不对（后端list接口查回来没问题，但是前端渲染出了问题）

经典bug，这个是因为页签中其中某个第一级的配置配了兄弟，而这对兄弟和其他页签中的一级的配置撞上了，说这个可能难理解，直接上数据来看：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaojichaxunerjicaidanshiyongjishujukupeizhiimage5.19f73c7d.png)

就会有下面这种现象：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/gaojichaxunerjicaidanshiyongjishujukupeizhiimage6.e5c21f5d.png)

为什么明明全部是17条，按项目检验是2条，为啥都显示17了呢？

这里数字显示的逻辑是解析的二级页签配置数据，那么如上图所见，三个页签刚好所有的itemName都是inspectRule，而这样解析出来的tabs的三个标识就是inspectRule_1、inspectRule_1、inspectRule_0，这样区分不开全部页签和按项目检验这两个页签，因此回显的时候就会错乱。

"全部"这个页签的条件包含了他的兄弟条件，因此全部这个页签需要修改配置为itemName:
inspectRule,
valueKey和value1都是all即可，这样全部这个条件会带上所有的条件。