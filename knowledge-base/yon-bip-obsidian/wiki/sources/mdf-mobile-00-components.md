---
title: "组件汇总清单"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/00-components"
section: "移动组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 移动组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 组件汇总清单

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-mobile/00-components | 所属：移动组件

# [](#组件汇总清单)组件汇总清单

## [](#1-容器组件billtplgroup_base)1. 容器组件【billtplgroup_base】

||类型cType||名称||说明|
||Header||导航栏||头部导航|
||ConvenientQuery||过滤区||过滤区漏斗和面板|
||ListView||列表||复杂列表|
||CardHeaderGroup||卡片-头部组||用于配置多个卡片头部区域|
||CardHeader||卡片-头部区域||用于配置卡片-表单项cStyle中添加{"showNum":4}{"showAll":true}{"showTitle": ture}{"more":true}有收起展开效果，showNum默认为4，当showAll为true，为全展开，无展开收起效果,showTitle 为展示标题项，即为cName属性展示，more参数为页面默认收起---(目前该组件是编辑态默认展开，浏览态默认收起)|
||Group||分组容器||用于卡片区域-分组, cStyle配置collapse为true.组件收起。默认为展开|
||LineTabs||子表页签||用于配置多子表、内嵌其它单据|
||VoucherDetail||子表区域||用于配置卡片-子表区域|
||ScanVoucherDetail||扫码子表区域|||
||VoucherDetailRow||子表区域-行容器||用于配置卡片-子表区域行（有用，无组件，区分子整个子表按钮，和子表行按钮位置的）|
||Footer||底部内容区域||用于配置页面的底部区域|
||Toolbar||工具栏||用于配置工具栏-按钮区域|
||Page||页面组件||用于内嵌其他单据|
||TabPage||页签切换||切换不同billno，展示相应内容|
||GridLayout||网络布局||实现灵活自定义布局|
||TplThreeCols||三列布局容器|||
||Left||左侧||TplThreeCols容器中的左侧部分|
||Middle||中间||TplThreeCols容器中间部分|
||Right||右侧||TplThreeCols容器中的右侧部分|
||MaterialHead||按料视图-列表头|||
||SumSwitch||视图切换|||
||CodeHead||按单视图-列表头|||
||ExtendBody||扩展区域||列表-扩展区域,卡片-子表-扩展区域|
||List||按单物料子列表||简单列表，仅支持ListView扩展|
||HiddenContainer||隐藏区域不展示||空div|
||Modal||弹页区||可通过API弹出Model|
||EMSCard||物流信息|||
||TrendPanel||订单动向组件||用于配置卡片-订单动向组件/物料动向|
||TrendPanelHead||单据头部订单动向||用于配置卡片-订单动向，展示在单据头部|
||Agrregate||合计组件||合计组件|
||CardPanel||卡片面板|||
||Table||简单列表||antd-mobile/List|
||ScanArea||扫码区域|||
||PromotionGroup|||||

### [](#11-gridlayout)1.1 GridLayout

#### [](#111-使用基础)1.1.1 使用基础

- 

GridLayout的cStyle设置columns，默认是3，是将布局分成多少列。

- 

GridLayout下的base_item字段cStyle可以设置width，和height。表示该item占几行几列

width，和height默认都为1，表示在网格占1行1列

- 

注意单个base_item的width不能超过YSGridLayout的columns

- 

排列方式从上到下从左到右紧凑排布

#### [](#112-添加样式)1.1.2 添加样式

GridLayout的cStyle，可以添加props，直接放在在外层div

eg.{"props":{"style":{"padding":12,"background":"#dd"}}}

网格padding是12，背景色#ddd

### [](#12-group)1.2 Group

如何监听group的collapsed

viewmodel.on('toggleGroup',({collapse, meta}) => {

 // 处理代码

 })

### [](#13-page-用于内嵌其他单据)1.3 Page 用于内嵌其他单据

cStyle: "{"billnum":"mka_summarylist","key":"id","filter":"activity","params":{"domainKey":"yycrm"}}"

参数解析

||属性||解析|
||billnum||单据billno|
||billtype||单据类型-不传默认是voucherlist|
||filter||过滤项的itemName|
||key||当前过滤项取值需要的key|

注：filter和key是初始加载该页面时的查询条件---需要和查询方案一起使用

## [](#2-基础组件billitem_base)2. 基础组件【billitem_base】

||类型cControlType||名称||说明|
||Input||文本框|||
||Textarea||文本域||TextareaItem|
||InputNumber||数字选择器||支持区间选择compareLogic=between|
||Stepper||计步器（数值）|||
||InputMultiLang||多语输入框|||
||CheckBox||复选框||antd-mobile/Checkbox|
||Radio||单选框|||
||Switch||行带选择器||antd-mobile/Switch, InputItem|
||Select||选择标签||cStyle:{"className":"YSStatus"} subuitype 默认flat：可选select  展示在cardheader右上角|
||Picker||选择器||属性在cStyle的config配置，dataSource数据源|
||DatePicker||年月日（底部弹框）|||
||TimePicker||时分（底部弹框）|||
||DateTimPicker||年月日时分（底部弹框）|||
||PredicateDatePicker||日期下拉分组||popover+calendar|
||Calendar||日历||DatePicker+compareLogic=‘between’,以calendar形式展示|
||Refer||参照||cStyle配置bCanHandleInput：false 可控制参照输入框不能录入，只能选择|
||TreeRefer||树参照|||
||Image||图片展示|||
||Attachment||多图片上传|||
||IdCard||身份证|||
||ScanBar||扫码框|||
||ProgressBar||进度条|||
||AMap||高德地图|||
||Link||超链接||cStyle中配置cAction，最外层viewmodel触发操作|
||Sign||标记|||
||FieldHelp||帮助功能||无实现，返回null（pc端有）|
||ListItem||纯文字展示|||
||Label||文本|||
||Tips||提示|||
||SearchBox||搜索框||antd-mobile/SearchBar|
||TagButton||Tag组件||不展示，return null|
||CardPanelItem||卡片面板项||与CardPanel容器一起使用|
||HtmlContent||HTML片段|||
||PictureUpload||文件上传|||
||FileList||附件||图片|

### [](#21-列表行上-基础组件-属性)2.1 列表行上-基础组件-属性

base_item设置：

- 

iAlign：{ 1: 'left', 2: 'center', 3: 'right' }

- 

className

- 

hasCopyBtn:是否有复制按钮

- 

cStyle中，props中添加属性

textAlign，支持left，center，right

- 

paddingTop

- 

paddingLeft

- 

paddingRight

- 

paddingBottom

- 

fontColor

- 

fontSize

- 

fontWeight

- 

before：前缀

- 

after：后缀

必须是字符串

- 

支持dom元素，如''

- 

文字

## [](#3-按钮组件bill_toolbaritem)3. 按钮组件【bill_toolbaritem】

||类型type||名称||适用范围||说明||style|
||Button||按钮||toolbar||按钮||0|
||FixedButton||固定悬浮按钮||toolbar||固定悬浮按钮，支持配置子按钮下拉展示||0|
||PrimaryButton||主要按钮||toolbar||红色主题按钮||0|
||AttachmentButton||附件按钮||toolbar||附件按钮-协同附件||2|
||style 解析0图标加文字，1纯文字，2纯图标|||||||||
||style为2或0,配置改icon有效|||||||||

## [](#4-select)4. Select

### [](#ysstatus样式展示-盖章的样式)YSStatus样式展示-盖章的样式

- 

cControlType = select，

- 

cstyle:{"className":"YSStatus"} 

展示在cardheader右上角

<!-- -->

- 枚举值{nameType:"text',icon:'bg_xxx',value:'开立'....}是支持有背景色

icon支持bg_green，仅支持green

- 

bg_rgba(255,0,0,0.5)规格，通用