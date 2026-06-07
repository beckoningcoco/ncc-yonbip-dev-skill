---
title: "组件公共属性和方法"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/common"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 组件公共属性和方法

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/common | 所属：YNF-组件

# [](#组件公共属性和方法)组件公共属性和方法

表单组件是用于收集和处理用户输入的界面元素，广泛应用于网页和应用程序中。这些组件允许用户输入数据，提交信息，并与系统进行交互。表单组件包括各种输入字段、选择框、按钮等元素，帮助用户完成任务，如注册账户、提交反馈、搜索信息等。

## [](#表单组件公共属性)表单组件公共属性:

||**属性**||**字段**||**类型**||**说明**||**默认值**|
||标识||alias||string||组件在UI模板上的唯一标识|||
||显示标题||showLabel||boolean||是否显示标题, 开启后在组件左侧显示标题||true|
||标题||caption||string||展示在组件左侧的字段名称, 只有在开启显
示标题时生效|||
||标题位置||singleLine||"true" | "false"||设置标题的展示位置, "true"为左右布局即标
题展示在组件左侧, "false"为上下布局即标
题展示在组件上方, 只有在开启显示标题时
生效||"true"|
||字段说明||tips||string||有字段说明时以小问号气泡提示形式展示在
标题旁|||
||组件类型||controlType||string||组件的类型|||
||布局占比||iColWidth||1 | 2 | 3 | 4 | 5 | 6||组件在布局(Layout)容器中占据的宽度, 只
在布局容器时显示此项||1|
||显示||visible||boolean||组件是否显示||true|
||必填||required||boolean||组件绑定的字段是否为必填字段, 开启后显
示红色*号||false|
||只读||readOnly||boolean||组件是否为只读状态, 开启后不可编辑||false|
||禁用||disabled||boolean||组件是否为禁用状态, 开启后不可编辑且组
件为置灰样式||false|
||不允许复制||uncopyable||boolean||复制单据数据时, 组件绑定的字段是否可
被复制, 开启后复制单据时不会复制组件绑定的字段||false|
||数据源||modelPath||||设计器属性面板中用来绑定实体字段的属
性, 不会写入协议中, 协议中会以store和
storeField属性来表示实体字段|||
||默认值||defaultValue||string||组件绑定的字段无值时, 显示默认值|||
||外观样式||wrapStyle||CSSProperties||设置组件整体外观样式的style对象|||
||标题样式||labelStyle||CSSProperties||设置组件标题样式的style对象|||
||文本样式||contentStyle||CSSProperties||设置组件内容样式的style对象|||
||缺省文本||placeholder||string||当未输入任何内容时, 显示在输入框中的
文本, 一旦开始输入内容, 文本就会消失|||
||边框样式||bordered||0 | 1 | 2||设置组件边框的展示形式
0(默认样式) | 1(下划线样式) | 2(无边框)||0|
||显示超链接||showLink||boolean||开启后内容值显示为超链接样式, 值就是
链接地址, 如果需要跳转别的链接请配置
"超链接点击(onClick)"回调使用, 该属性
只在只读态生效||false|

## [](#表单组件只在表格table容器中时具有的公共属性)表单组件只在表格(Table)容器中时具有的公共属性:

||**属性**||**字段**||**类型**||**说明**||**默认值**|
||列宽(px)||colWidth||string||组件在表格中显示的宽度||"160"|
||表头对齐||titleAlign||"left" | "center" | "right"||组件在表格中时该列表头的对齐方式||"left"|
||表体对齐||contentAlign||"left" | "center" | "right"||组件在表格中时该列表体的对齐方式||"left"|
||排序||sorter||boolean||组件在表格中时该列数据是否可
排序(当前页排序)||true|
||是否固定||fixed||boolean||组件在表格中时该列是否固定不可随
滚动条滚动, 开启后, 当表水平滚动
时, 此列将被固定||false|
||开启定位||singleFind||boolean||组件在表格中时该列是否启用查找
定位||true|
||开启过滤||singleFilter||boolean||组件在表格中时该列是否启用过滤||true|

## [](#查询区组件公共属性)查询区组件公共属性:

查询区组件是一个特殊的表单组件, 只用于在查询区中使用, 并且可以配置查询方案, 支持查询方案过滤、排序、重置等操作, 表单组件的属性都可以用于查询区组件, 查询区组件比表单组件多了一些属性，如下:

||**编码**||**名称**||**类型**||**描述**||**默认值**|
||isSolution||是否为默认方案字段||boolean||是否为默认方案字段||false|
||allowUpdateCompare||修改比较符||boolean||在查询方案中是否可以修改比较符||true|
||bAutoflt||自动过滤||boolean||值改变后是否自动执行过滤查询||false|
||compareLogic||比较符||string||设置组件绑定的字段在过滤数据时使用的比较符|||

## [](#公共事件)公共事件:

||**编码**||**名称**||**描述**|
||onBeforeChange||值改变前||在组件绑定的字段值改变前触发的钩子函数|
||onAfterChange||值改变后||在组件绑定的字段值改变后触发的钩子函数|
||onClick||超链接点击||在开启了显示超链接的组件中, 点击超链接时触发的钩子函数|