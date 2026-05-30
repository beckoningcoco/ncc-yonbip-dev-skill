前端典型示例开发（YNF）
最后更新时间：2025-09-23
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	否
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	否
公有云	ISV生态开发	否
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	否
业务场景

本文对YNF前端扩展开发中的典型场景：样式扩展、查询方案扩展和自定义组件扩展做介绍。

针对样式扩展，介绍以下案例

实现修改列表页、详情页中列表的行、列、单元格背景色
实现修改卡片页字段的背景色

针对查询方案扩展，介绍以下案例

实现查询区的显示/隐藏
给查询条件字段赋值，实现查询区的过滤等场景

针对自定义组件扩展，介绍YNF工程中组件的开发步骤

关键词

CSS、选择器、优先级、YNF、Mobx状态管理、UI协议、前端组件

样式扩展开发

在YonBIP专业版项目上经常需要对页面样式做扩展，以满足客户的个性化需求。本文主要针对YNF框架下，常见组件、页面进行样式的扩展开发。

CSS基础知识准备工作

可自行参考对应CSS技术文章学习：CSS样式基础

卡片样式扩展

本章节主要描述卡片页的样式扩展。

修改卡片字段的背景色
设计器中点击字段，选择右侧样式页签，选择【外框样式】

增加【渐变背景色】配置，将背景色设置为从蓝色到白色的渐变状态：

点击保存，预览详情页，即可看到效果：

列表样式扩展

目前YNF单据扩展样式的方式，第一种是通过设计器右侧的样式页签进行配置，第二种是修改框架组件暴露出的UI协议来扩展。

本章节讲述的列表样式扩展，将使用第二种方式来进行动态控制。

列表行样式扩展

**需求描述：**让表格某一行的背景颜色变成橙色。

实现步骤：

在列表UI协议中，增加rowClassName这条协议，并将值指向一个mobx表达式：

在扩展脚本里的tableStore中增加getRowClassName这个方法，该方法接收record和index两个入参，其中record表示当前行数据，index即数据索引:
rootStore.tableStore.getRowClassName = function (record, index) {
// 自定义设置背景色的条件
if (index === 1) {
// 返回的className将增加到当前行的class属性上
return 'bg-orange'
}
}


注：由于该条样式注册在行div元素上，若内部单元格元素本身含有背景色(白色)，会导致该样式不生效，需要在样式文件style.css中增加一段清除单元格背景色的样式：

然后导入扩展脚本js中：

预览效果：

列表单元格样式扩展

**需求描述：**让表格某一单元格的字体颜色变成蓝色。

实现步骤：

在列表UI协议中，增加getCellClassName这条协议，并将值指向一个mobx表达式：

在扩展脚本里的tableStore中增加getCellClassName这个方法，该方法接收record、index和column三个入参，其中record表示当前行数据，index即数据索引，column表示单元格所在列的数据：
rootStore.tableStore.getCellClassName = function (record, index, column) {
if (index === 0 && column.dataIndex.includes('verifyState')) {
return 'blue'
}
}


预览效果：

使用Tinper-Next的内置样式

上文案例使用了Tinper-Next的内置样式文件实现。Tinper-Next中内置了许多的背景和文字颜色，可以直接使用。

预置背景样式：

.bg-red {
background-color: #f44336!important
}
.bg-pink {
background-color: #e91e63!important
}
.bg-purple {
background-color: #9c27b0!important
}
.bg-blue {
background-color: #2196f3!important
}
.bg-cyan {
background-color: #00bcd4!important
}
.bg-green {
background-color: #00ba7d!important
}
.bg-yellow {
background-color: #ffeb3b!important
}


预置文字样式：

.blue {
color: #2196f3!important;
}
.pink {
color: #e91e63!important;
}
.yellow {
color: #ffeb3b!important;
}
.purple {
color: #9c27b0!important;
}
.orange {
color: #ffa200!important;
}

自定义扩展样式表

若tinper-next中的内置样式不满足需求，则需要自行增加样式表文件。

**需求描述：**让表格某一单元格的文字变成【加粗样式】，样式变成【斜体】。

实现步骤：

在样式表文件style.css中继续增加样式，在样式表中设置字体为加粗、斜体：

重复3.2.1中的步骤，在列表UI协议中配置getCellClassName,并指向js脚本中 的方法：
rootStore.tableStore.getCellClassName = function (record, index, column) {
if (index === 0 && column.dataIndex.includes('purOrg')) {
return 'my-font-style'
}
}


预览效果：

查询方案开发
YNF查询区FilterStore简介

查询区filterStore 是查询方案对应的操作逻辑store，主要负责组织查询条件的功能。带有查询逻辑的页面，如需要额外增加查询条件，扩展脚本拿到filterStore，在扩展脚本里面增加扩展查询条件。

FilterStore的获取

对于一般列表页，filterStore一般挂在页面rootStore下：

// 获取查询区filterStore
let { filterStore } = rootStore;
// 获取查询区中的某个字段Item
let filterItem = filterStore.getFilterItemByName("code")

查询区扩展案例

本章节描述查询区的常见场景，通过本章节的学习，可以掌握查询区的显示与隐藏、查询区参照赋初始值，手动触发重置和搜索等。

查询区 的显示与隐藏

需求描述：隐藏/显示查询区

实现步骤：在设计器中对查询区的显隐性做配置：

支持使用mobx表达式来控制:

给查询区字段赋初始值
方式一：设置UI协议
可以在字段的属性面板中直接配置：

也可直接在协议面板修改：

方式二：增加前端脚本
// 自定义一个reaction，监听查询区isQueryReady这个钩子
defaultSearchCondition: reaction(() => rootStore?.filterStore.isQueryReady, () => {
rootStore?.filterStore?.getFilterItemByName("inputType").setValue(2)
rootStore?.filterStore?.copyCondition()
rootStore?.filterStore?.setQueryTrigger()
})

自定义组件开发

当平台内置组件满足不了业务需求时，支持开发自行扩展自定义组件。YNF自定义组件通过YNF脚手架开发、调试，最终部署到线上。本章节介绍组件的开发和调试过程。

环境搭建

向脚手架中增加组件和设计器定义的文件和内容，并增加打包入口配置。

增加组件文件

打开YNF前端工程，

在src目录下创建index.share.js和index.designer.js
在src目录下创建components目录，内部增加组件目录（目录名自定义），内部添加index.designer.js、index.js、index.less三个文件

说明：三个文件分别对应设计器配置定义、组件内容定义和样式文件

在YNF工程的根目录下找到yds.config.js文件，在providerEntry对象中增加导入配置，分别将src下新增的index.share.js和index.designer.js导入打包入口：

说明：注意两条配置的属性名和属性值。

增加组件文件内容
在刚才增加的components/{组件名}目录下，找到index.js文件，内部添加组件内容，以下是示例：
import React, { Component } from 'react';
import './index.less'; // 引入组件相关样式
export class MyButton extends Component {
render() {
return (
<button className=”my-button”>测试组件</button>
);
}
}

找到新增的index.less文件，内部添加组件相关样式，在该示例中，对上文组件中的button.my-button元素添加了背景色、文字颜色和字体加粗：
// 组件样式文件index.less
.my-button {
background-color: aquamarine;
color: black;
font-weight: bold;
}

最后，在src下新增的index.share.js中导出组件内容：
// 导出刚才定义的MyButton组件
export * from './components/MyButton';

增加设计器文件内容

设计器文件即src目录下和components/{组件名称}目录下的两个index. designer.js,这两个文件分别用来定义组件在设计器左侧面板的分组，和当前组件在设计器的配置项。对于最新的设计器二方包组件，这两个文件是不可缺少的。

增加组件级设计器文件：

在components/{组件名称}下的index.designer.js中增加内容，定义当前组件的code、name以及需要在设计器右侧属性面板里增加的配置项。

以下是示例：

import { CompMeta } from 'iuap-ap-coresdk-fe';
export default class MyButtonMeta extends CompMeta {
code = 'MyButton';
name = '自定义按钮';
constructor() {
super();
this.addBoolProp({ code: 'ifVisible', name: '是否可见', defaultValue: true });
this.addGroup({ code: 'group_base', name: '基础属性' }).addProps(this.getProps(['ifVisible']))
}
}


说明：this.addBoolProp方法规定在属性面板中增加一个名为“是否可见”的配置，对应的属性编码是ifVisible,默认值是true;this.addGroup方法规定向属性面板的“基础属性”分组中增加该配置项。配置生效后可在组件内部的Props中获取该属性。

增加外层组件包级别的设计器文件：

在src下的index.designer.js中增加内容,引入组件设计器文件，并规定该组件包在哪些场景(MDF或YNF、PC或Mobile)中生效。

import { LibraryMeta } from 'iuap-ap-coresdk-fe';
import MyButtonMeta from './components/MyButton/index.designer'
export default class YnfCKkFnDemoMeta extends LibraryMeta {
code = 'ynf-c-kk-fn-demo';
name = '客开赋能YNF组件库';
constructor() {
super();
this.addGroup({ code: "baseCompGroup", name: "基础" }).addComps([
MyButtonMeta.create(),
]);
this.isPc = true; // PC组件库
this.isMobile = true; // MOBILE组件库
this.isYnf = true; // YNF组件库
this.isMdf = true; // MDF组件库
this.isNoc = true; // 零代码组件库
}
}


说明：this.addGroup方法向设计器右侧面板的“基础”分组中添加组件定义。

开发完毕，提交git后通过流水线部署到线上，即可在环境上生效。

资源中心注册
资源部署完毕，打开环境上的资源中心节点，点击新建按钮，在弹出的输入框中填好二方包编码(ynf-{domainKey}),组件名称。
组件来源选择“设计器二方包”，然后点击校验按钮，若出现图中“验证信息成功”提示，即表示组件资源已可访问。
继续填写选项，最后点确定，可在资源中心看到新添加的组件库。

组件库下方点击发布图标，完毕后即可在设计器中引入组件。
调试过程

可以通过YNF脚手架开启本地服务，将线上资源通过浏览器插件代理到本地来进行调试。

配置浏览器插件Resource Override的代理规则，如下图所示：

说明：代理源路径格式为：***/ynf-{domainKey}/*/**；

代理的目标路径格式为https://localhost:9090/**

打开线上预览页面，可以看到本地组件内容已生效：

常见问题
UI协议增加的mobx表达式没有调用？
mobx表达式里配置的是一个函数，在mobx里不要加()调用
检查mobx表达式中函数的挂载位置和扩展脚本里是否一致
给查询区字段设置默认值不生效？

设置完默认值后，需执行一下两端代码，保证查询动作重新执行：

rootStore?.filterStore?.copyCondition()

rootStore?.filterStore?.setQueryTrigger()

如何修改查询条件为必填

方式一： 在设计器中配置必填选项

方式二： 在扩展脚本中设置

export default function (rootStore: any) {
return {
init: {
afterHook: (rootStore: any, res: any) => {
// 设置必填
const inputItem = rootStore?.filterStore?.getFilterItemByName("inputType")
inputItem.meta.required = true;
}
}
}

目前平台内置了哪些样式class？

可以在控制台打开源代码（source）页签，通过ctrl+P查找相应的css文件来查找。一般可以查找的文件：tinper-next.css

自定义组件时，可以给设计器中添加哪些配置项？

本文档示例中添加的是一个布尔值选项，更多选项类型，可参考文档：

YNF自定义组件支持的设计器配置说明