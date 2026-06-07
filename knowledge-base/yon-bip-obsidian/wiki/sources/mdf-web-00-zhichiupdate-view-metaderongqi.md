---
title: "支持updateViewMeta的容器"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/00-zhichiupdate-view-metaderongqi"
section: "Web组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, Web组件]
platform_version: "BIP V5"
source_type: mdf-docs
images: 0
---

# 支持updateViewMeta的容器

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/components-web/00-zhichiupdate-view-metaderongqi | 所属：Web组件

# [](#支持updateviewmeta的容器)**支持updateViewMeta的容器**

## [](#1-updateviewmeta产生背景)**1. updateViewMeta产生背景**

    由于MDF框架的底层设计中，页面均由模型进行驱动，但是模型的绑定关系仅在业务组件中进行建立，容器类组件并没有进行模型绑定，随着业务的发展，产生了越来越多的操作容器的需求，于是MDF框架使用页面单据模型viewModel与容器组件进行通信，来实现对应的扩展业务。这种通信方式就是通过在容器组件中监听页面模型的updateViewMeta事件，由viewModel来触发事件。由于事件是个列表，并且一个单据中可以有很多个容器组件，所以监听和触发updateViewMeta的时候，必须使用code进行隔离，避免产生不必要的额外渲染。

## [](#2-updateviewmeta用法)**2. updateViewMeta用法**

viewModel.execute('updateViewMeta', args)

## [](#3-支持updateviewmeta容器列表及参数说明)**3. 支持updateViewMeta容器列表及参数说明**

**注：以下属性仅用来描述组件内支持了哪些属性，具体组件使用方式不在此文档中进行描述及解答，如需了解具体属性含义或对应数据结构请参考具体组件所对应的使用文档或咨询对接人**

## [](#4-pc端)**4. PC端**

- **TimeLine**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||值为布尔类型，true/false|

- **GroupOnePage**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||值为布尔类型，true/false|
||underline||是否展示下划线||布尔类型|
||containers||自定义容器显示内容||meta协议|

- **ContractWrapper**

||**属性名**||**含义**||**备注**|
||contractWrapperObj|||||

- **TableEditRowModal**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||值为布尔类型，true/false|

- **Toolbar**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||...states||组件state中的所有key，具体有哪些key参考组件内部实现代码||此方法同步了组件的state，理论上组件内接收的state里的key均支持|

- **TableLayout**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||显示隐藏||布尔类型|
||...states||组件state中的所有key，具体有哪些key参考组件内部实现代码||此方法同步了组件的state，理论上组件内接收的state里的key均支持|

- **SplitContainer**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||显示隐藏||布尔类型|
||splitSwitch||切换折叠状态||布尔类型|
||leftVisible||左侧隐藏||布尔类型|
||rightVisible||右侧隐藏||布尔类型|
||hideSplitContainer||保持收起状态||布尔类型|
||subtractHeight||扣除高度||数字类型|

- **ProcessPage**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||disabledTabs||设置个别tabs的显示隐藏||对象结构|
||activeKey||激活状态||字符类型|
||next||下一步||布尔类型|
||previous||上一步||布尔类型|
||metaData||元数据||meta协议|

- **Page**

||**属性名**||**含义**||**备注**|
||pageCode||编码||对应元数据协议中容器的cGroupCode|
||billnum||单据编码||billNo|
||billtype||单据类型||字符类型|
||params||参数||对象结构|
||force||是否强制刷新||布尔类型|
||skipVisibleValidate||跳过显示校验||布尔类型|

- **LineTabs**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||显示隐藏||布尔类型|
||disabledTabs||页签禁用状态||对象结构|
||tabItemSort||页签排序状态||数组结构|
||tabsVisible||页签显示状态||对象结构|

- **Guide**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||显隐||布尔类型|
||guideData||引导内容||数组|
||curPopIndex||当前引导索引||数字类型|
||confirmInfo||引导提示显示内容||字符类型|
||extendLayOutClassName||扩展类名||字符类型|
||mask||是否显示遮罩层||布尔类型|

- **GroupContainer**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||containers||自定义容器显示内容||meta协议|
||visible||显隐||布尔类型|
||...states||组件state中的所有key，具体有哪些key参考组件内部实现代码||此方法同步了组件的state，理论上组件内接收的state里的key均支持|

- **Group**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||containers||自定义容器显示内容||meta协议|
||visible||显隐||布尔类型|
||...states||组件state中的所有key，具体有哪些key参考组件内部实现代码||此方法同步了组件的state，理论上组件内接收的state里的key均支持|

- **GridLayout**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||值为布尔类型，true/false|

- **Form**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||值为布尔类型，true/false|

- **Footer**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||值为布尔类型，true/false|

- **FileList**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||privateAuth|||||
||bIsNull||必输状态||布尔类型|

- **CardTabs**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||forceRender||强制刷新||布尔类型|
||activeKey||激活页签||字符类型|
||visible||显示隐藏||布尔类型|

- **CardHeader**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||值为布尔类型，true/false|

- **FilterModal**

||**属性名**||**含义**||**备注**|
||bHideItemStatesInAddAndEdit||新增/编辑态方案设置弹窗里隐藏对应条件 |||
||code||要处理显隐状态的字段的itemName||字符类型|
||visible||显示状态||布尔类型|

- **ConvenientQuery**

||**属性名**||**含义**||**备注**|
||code||要处理显隐状态的字段的itemName||字符类型|
||visible||显示状态||布尔类型|

## [](#5-mobile端)**5. Mobile端**

- **ListPanelPicker**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|

- CardHeader

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|

- **CardHeaderGroup**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|

- **CardTabs**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||forceRender||强制刷新||布尔类型|
||visible||显隐||布尔类型|
||disabled||禁用||布尔类型|
||refresh||刷新||布尔类型|
||active||激活||布尔类型|

- **Carousel**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||显隐||布尔类型|
||controls||组件||数组结构|

- **ContractWrapper**

||**属性名**||**含义**||**备注**|
||contractWrapperObj|||||

- **ConvenientQuery**

||**属性名**||**含义**||**备注**|
||code||要处理显隐状态的字段的itemName||字符类型|
||visible||显示状态||布尔类型|

- **Flex**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|

- **Group**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|
||collapse||折叠状态||布尔类型|

- **Guide**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||显隐||布尔类型|
||guideData||引导内容||数组|
||curPopIndex||当前引导索引||数字类型|
||confirmInfo||引导提示显示内容||字符类型|
||extendLayOutClassName||扩展类名||字符类型|
||mask||是否显示遮罩层||布尔类型|

- **LineTabs**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||显隐||布尔类型|
||caption||显示名称||字符类型|
||forceRender||强制刷新||布尔类型|

- **Page**

||**属性名**||**含义**||**备注**|
||billnum||单据编码||billNo|
||billtype||单据类型||字符类型|
||params||参数||对象结构|
||force||是否强制刷新||布尔类型|
||skipVisibleValidate||跳过显示校验||布尔类型|

- **ProcessPage**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||disabledTabs||禁用页签的列表||数组类型|
||activeKey||激活页签key||字符类型|
||next||下一步||布尔类型|
||prevision||上一步||布尔类型|
||hideStep||隐藏||布尔类型|

- **TableLayout**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|

- **TableList**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|

- **VoucherDetail**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|
||cName||展示名称||字符类型|
||collapse||折叠状态||布尔类型|

- **Workflow**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|
||updateWorklfow||更新工作流||布尔类型|

- **ExtendBody**

||**属性名**||**含义**||**备注**|
||code||编码||对应元数据协议中容器的cGroupCode|
||visible||控制容器的显示隐藏||布尔类型|