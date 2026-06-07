---
title: "--查询方案常见问题及使用解答"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunfanganchangjianwentijishiyongjieda"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# --查询方案常见问题及使用解答

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/05-chaxunfanganchangjianwentijishiyongjieda | 所属：Web组件

# [](#查询方案常见问题及使用解答)查询方案常见问题及使用解答

## [](#1-如何从列表页面获取查询模型)1. 如何从列表页面获取查询模型

列表的扩展脚本中可以拿到当前单据的**viewmodel**,
可以在viewmodel的**afterInitCommonViewModel**周期中通过**viewModel.getCache('FilterViewModel')**的方式获取当前页面的查询区模型。

取到查询模型后监听一下查询模型的**afterInit**即可在**afterInit**中获取对应的子模型；**viewModel.getCache('FilterViewModel').get('new1').getFromModel()**可获取到查询区字段的模型。

## [](#2-如何添加一个查询脚本)2. 如何添加一个查询脚本

查询区常用的几张表分别为**pb_meta_filters、pb_meta_filter_item、pb_filter_solution、pb_filter_solution_common**

在**pb_meta_filters**中存在一个**behaviorObject**字段，我们可以通过这个字段配置一个路径进行查询脚本的配置，默认查询模板参考如下代码：

cb.define(['common/common_VM.Extend.js'], function (common) {

 var xxx_Extend = {

 doAction: function (name, viewmodel) {

 if (this[name])

 this[name](viewmodel);

 },

 init: function (viewmodel) {

 

 }

 }

 try {

 module.exports = xxx_Extend;

 } catch (error) {

 

 }

 return xxx_Extend

});

**注:**

- 

**上面代码块中的xxx_Extend要与behaviorObject字段中配置的对应上**

- 

**需要注意的是查询区里的viewmodel并不是当前单据的viewmodel而是查询模型**

- 

**如果要获取当前单据的viewmodel可通过viewmodel.getCache('parentViewModel')的方式获取**

## [](#3-查询区加载过程中的生命周期)3. 查询区加载过程中的生命周期

- 

**beforeInit**

beforeInit是一个在查询区脚本加载之前的钩子，在这个钩子里我们可以修改查询返回的数据

- 

修改必输
非必输可以在beforeInit的回调参数中中找到itemName对应的数据修改mustInput字段（直接修改当前数组）

- 

**afterInit**

与before对应的就是after，同样的，我们一般在afterInit里处理一些查询条件的挂载事件或者其他事件，**afterInit的执行时机在查询脚本加载之后且组件渲染以后，第一次搜索之前，**这个周期里一般可以处理

**一些查询条件的默认值赋值、设置默认、监听事件等一系列操作
---> viewmodel.get('xxx').getFromModel().setValue**

- 

区间类型的默认值赋值
后面的值使用**viewmodel.get('xxx').getToModel().setValue的方式处理**

- 

**设置单据是否自动搜索 ---->
viewModel.getParams().autoLoad = true**

- 

**设置编辑态查询区是否联动 ---->
viewModel.getParams().designSolutionExtend = true**

- 

**其他事情**

- 

**afterReportInit**

**新报表没有afterInit周期，所以额外支持了一个周期 --->
afterReportInit**

- 

**afterResetClick**

**重置按钮点击之后会将当前方案重置为默认状态，并执行一次搜索，在本次搜索之前会触发一次afterResetClick事件，我们可以监听这个事件来处理一些业务逻辑**

- 

**updateAdvanceModel**

**云采购的高级查询方案中，有一个额外的事件，updateAdvanceModel，我们可以监听这个事件来处理高级查询（父子页签的数据）**

- 

afterClearSaveCallBackCache

保存的方案和当前使用方案是一个的时候会走这个钩子而不走afterInit

## [](#4-查询区的隐藏及必输等修改方式)4. 查询区的隐藏及必输等修改方式

- 

**查询方案列表（左上角）的隐藏**

列表查询区
查询区在UI元数据中对应有一个容器，这个容器的类型是ConvenientQuery
,这个容器在billtpl_group_base表中会有一个对应的容器，我们找到这个容器，在这个容器的cStyle字段中添加一个json结构的属性，"bHideFilterScheme":
true即可，

- 

参照查询区 参照中的查询方案需要在pub_ref表中对应的refentity
的extendField字段添加如上属性，"bHideFilterScheme": true即可

- 

自定义过滤条件
隐藏查询方案中的自定义过滤条件按钮，配置方法如上，**key为bHideAddDefFilterItemBtn**

- 

**查询区默认宽度设置，cStyle中配置filterWidth字段，value是数值类型的数字即可**

- 

**隐藏搜索按钮**

查询区在UI元数据中对应有一个容器，这个容器的类型是ConvenientQuery
,这个容器在billtpl_group_base表中会有一个对应的容器，我们找到这个容器，在这个容器的cStyle字段中添加一个json结构的属性，"bHideSearchStr":
true即可

- 

**按钮禁用**

viewmodel.setState('btnDisabled', true)

- 

**修改显示隐藏**

viewmodel.execute('updateViewMeta', { code: 'xxx', visible: false })

- 

想要在新增和编辑的时候也隐藏调某个特定条件不做展示的话可以参考上面联动的开关，配了开关之后在updateViewMeta的钩子函数中添加参数bHideItemStatesInAddAndEdit:
true即可

参考代码viewmodel.execute('updateViewMeta', { code: 'xxx',
visible: false，bHideItemStatesInAddAndEdit:true })

**查询模型天然支持一些格式**

**如：**

- 

**inputnumber的精度可以配置precision字段实现**

- 

**时间的format格式可以通过配置cFormatData字段实现**

## [](#5-查询条件如何在扩展脚本中拼接or条件)5. 查询条件如何在扩展脚本中拼接or条件

**利用simpleVOs可以进行查询条件or的拼接，示例如下：**

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/ChaXunFangAnChangJianWenTiJiShiYongJieDaimage1.933ca8be.png)

## [](#6-手动触发搜索)6. 手动触发搜索

const schemeId = viewmodel.getCache('schemeId')

viewmodel.get('search').fireEvent('click', { solutionid: schemeId})

## [](#7-查询条件占多列配置方式)7. 查询条件占多列配置方式

修改pb_filter_solution_common（只对当前方案生效）/pb_meta_filter_item（所用新增的方案中对应的查询条件都生效）表中对应查询条件的cExpprops/extendField字段
增加cols属性 配置占列

## [](#8-设置查询方案列表权限是否可以增删改查是否展示新增自定义过滤条件按钮)8. 设置查询方案列表权限（是否可以增删改查、是否展示新增自定义过滤条件按钮）

慎用。。。。。 需要确定用户本身是否存在此权限
否则不可随意更改，会出现权限问题！！！！！

可以通过动态修改查询区的state中User的权限进行动态修改

修改方式viewmodel.setState('User',{userdef_filterItem:false,userdef_schemaSetting:false})

userdef_schemaSetting为方案增删改查权限（公共方案，个人方案不做限制）

userdef_filterItem:false 为自定义过滤条件按钮权限

对此权限进行动态 修改之前一定要判断此租户本身是否存在权限

判断方法为

viewmodel.getState('User')
获取User对象，查看其原来权限对象中的userdef_filterItem与userdef_schemaSetting的值

## [](#9-方案设置比较符禁用)9. 方案设置比较符禁用

设置**pb_meta_filter_item**表中的**allowUpdateCompare**字段为**2**

## [](#10-参照怎么配置查询区)10. 参照怎么配置查询区

参照配置查询条件，只需在参照返回实体上配置cFilterId即可将把参照上面搜索区变为查询区，其余配法和单据查询区一样

查询方案input搜索多个字段
配置pb_meta_filter_item表中对应条件的datasource字段

## [](#11-默认展示多行查询条件)11. 默认展示多行查询条件

FilterViewModel.getParams().filterRows = 3（要展示几行 直接设置即可）

## [](#12-查询条件之---多包含)12. 查询条件之---多包含

查询条件可以设置为多包含格式，多包含的意思即，使用当前字段，模糊匹配多个值，录入的时候多个值直接默认使用空格切割，如果业务场景不想用空格也可修改，配置过滤条件中的cExtProps字段，增加属性splitIcon即可，多包含的配置方式为在比较符的枚举列表中增加multlike

## [](#13-如何隐藏方案设置下拉按钮)13. 如何隐藏方案设置下拉按钮

FilterViewModel.setState('bHideFilterScheme', true)

## [](#14-隐藏查询区导航树)14. 隐藏查询区导航树

拦截beforeFilterTreeUpdate钩子
这个钩子接收一个参数，参数为导航树的数组，可以遍历此数组，将不需要在导航展示的数据的refType改为0或者1
然后在通过splice修改原数组直接删除数组中指定元素即可

## [](#15-进入页面时加载特定的方案)15. 进入页面时加载特定的方案

一般情况下这种情景是利用的穿透的方式进入的页面，那么就需要在穿透的时候在viewmodel的params中注入一个参数handoffSchemeKey
他的值就是目标单据中的查询方案的id
，此中情况如果目标方案被删除了或者目标方案是个系统方案就会存在问题，首先我们要保证这个目标方案是个租户方案，（因为系统方案在编辑的时候会生成一个租户方案，再次查询的时候就不会在将这个系统方案查出来了），然后将对应的方案id注入即可，但是如果有人删除了这个方案，那么再次新增的时候方案id还是会变化，此时我们可以配合另外一个参数 **`prohibitDeletion,`这个参数的作用是让特定方案不可删除，当你的方案是个租户方案的时候，在方案的pb_filter_solution表的cExtProps字段中配置一个json字符串格式的** prohibitDeletion:
true即可让此方案不可删除

## [](#16-设置特定方案不可删除)16. 设置特定方案不可删除

**当你的方案是个租户方案的时候，在方案的pb_filter_solution表的cExtProps字段中配置一个json字符串格式的**prohibitDeletion:
true即可让此方案不可删除

## [](#17-值改变自动搜索)17. 值改变自动搜索

pb_meta_filter_item表中bAutoflt 配为1

## [](#18-适配默认组织)18. 适配默认组织

查询区支持设置默认组织作为条件进行查询，设置默认组织需要几个必要条件：

- 

工作台我的首选项中设置默认组织

- 

有方案的编辑权限，可对方案进行设置

- 

方案中存在主组织参照（数据库中pb_meta_filter_item表中的isMasterOrg为1）

- 

设置方案中主组织字段的默认值为默认组织

## [](#19-适配默认人员)19. 适配默认人员

查询区也支持设置默认人员作为条件进行查询，设置默认人员需要几个必要条件：

- 

有方案的编辑权限，可对方案进行设置

- 

方案中存在当前登陆人参照（数据库中pb_meta_filter_item表中的cExtProps配置fxType为'user'，格式要为json字符串）-----也可配置extendfields字段，配置方式和cExtProps一样

- 

设置方案中参照的字段的默认值为当前登陆人