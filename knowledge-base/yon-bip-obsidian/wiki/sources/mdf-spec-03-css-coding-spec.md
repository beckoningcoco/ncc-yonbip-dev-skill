---
title: "前端CSS编码规范 ☆"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-css-coding-spec"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 3
---

# 前端CSS编码规范 ☆

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-css-coding-spec | 所属：协议

# [](#前端css编码规范-)前端CSS编码规范 ☆

## [](#1-样式文件加载顺序)1. 样式文件加载顺序

工作台  tinpernext  ->  MDF样式文件   ->   领域扩展样式

按照优先级从低到高的顺序，扩展样式优先级最高

## [](#2-mdf框架样式规范)2. MDF框架样式规范

引入CSS Modules 在打包的时候会自动将类名转换成 hash 值，完全杜绝 CSS
类名冲突的问题(CSS
Modules需要在webpack配置中手动开启配置，脚手架默认不开）

### [](#21-样式默认局部)2.1. 样式默认局部

使用了 CSS Modules 后，就相当于给每个 class 名外加加了一个
:local，以此来实现样式的局部化，如果你想切换到全局模式，使用对应的
:global。

.normal {

 color: green;

}

/* 以上与下面等价 */

:local(.normal) {

 color: green;

}

/* 定义全局样式 */

:global(.btn) { 

 color: red;

}

/* 定义多个全局样式 */

:global {

 .link {

 color: green;

 }

 .box {

 color: yellow;

 }

}

### [](#22-class-命名技巧)2.2. class 命名技巧

CSS Modules 的命名规范是从 BEM 扩展而来。BEM 把样式名分为 3
个级别，分别是：

- Block：对应模块名，如 Dialog
- Element：对应模块中的节点名 Confirm Button
- Modifier：对应节点相关的状态，如 disabled、highlight

块即是通常所说的 Web 应用开发中的组件或模块。每个块在逻辑上和功能上都是相互独立的。

.block {

}

元素是块中的组成部分。元素不能离开块来使用。BEM不推荐在元素中嵌套其他元素。

.block__element {

}

修饰符用来定义块或元素的外观和行为。同样的块在应用不同的修饰符之后，会有不同的外观。

.block--modifier {

}

综上，BEM 最终得到的 class 名为
dialog__confirm-button--highlight。使用双符号 __ 和 --
是为了和区块内单词间的分隔符区分开来。虽然看起来有点奇怪，但 BEM
被非常多的大型项目和团队采用。我们实践下来也很认可这种命名方法。

CSS Modules 中 CSS 文件名恰好对应 Block 名，只需要再考虑 Element 和
Modifier。BEM 对应到 CSS Modules 的做法是：

.ConfirmButton--disabled {

}

MDF项目中通常使用 camelCase 的写法把 Block 和 Modifier 放到一起：

/* .dialog.css */

.disabledConfirmButton {

}

### [](#23-设计原则)2.3. 设计原则

- 所有选择器的样式都应写在CSS文件中，尽量少用或不用行内样式和style标签样式。
- 禁止在css中使用*选择器，*选择器因为需要遍历页面的所有元素，所以编译的时候会非常消耗时间。
- 选择器要尽可能短，并且尽量限制组成选择器的元素个数，建议不要超过 3
- 表现与结构分离：尽量不用id选择器做css样式编写，因为id选择器一般用做js选择，有时可能会因为js的原因改动，那么对应的css就会失效。
- 避免使用important，使用大量!important样式会使维护变得更难，因为您打破了样式表中的自然级联。
- 兼容性问题，参考网址 [https://caniuse.com/](https://caniuse.com/)

### [](#24-在项目中使用)2.4. 在项目中使用

在 className 处直接使用 CSS 中 class 名即可。

/* dialog.css */

.root {}

.confirm {}

.disabledConfirm {}

import classNames from 'classnames';

import styles from './dialog.css';

export default class Dialog extends React.Component {

 render() {

 const cx = classNames({

 [styles.confirm]: !this.state.disabled,

 [styles.disabledConfirm]: this.state.disabled

 });

 return <div className={styles.root}>

 <a className={cx}>Confirm</a>

 ...

 </div>

 }

}

### [](#25-全局样式和局部样式和谐共存)2.5. 全局样式和局部样式和谐共存

path.resolve('src/mobile/common/styles/globalCss'),

path.resolve('src/web'),

path.resolve('node_modules/@mdf/formula-designer'),

path.resolve('node_modules/@mdf/bill-setting'),

path.resolve('node_modules/yyuap-formula'),

path.resolve('node_modules/@mdf/baseui'),

path.resolve('node_modules/@mdf/theme-mobile'),

path.resolve('node_modules/@mdf/baseui-mobile'),

path.resolve('node_modules/@mdf/metaui-mobile'),

path.resolve('node_modules/fixed-data-table-2')

上述包括第三方包的全局样式与metaui-web下的组件的局部样式

## [](#3-业务扩展样式规范)3. 业务扩展样式规范

- 为避免后续升级问题和组件优化导致的DOM结构变化，领域及项目扩展样式应尽量通过在模板上配置className的方式对组件进行样式扩展
- 页面、领域及项目级扩展禁止依赖页面DOM结构

### [](#31-组件级样式扩展)3.1. 组件级样式扩展

所有组件都支持在cStyle或设计器上配置className，样式表写在前端脚手架的指定文件中，详见领域、项目级样式扩展->扩展样式文件目录

### [](#32-页面级样式扩展)3.2. 页面级样式扩展

可以在数据库 [bill_customerdef] 表中配置租户要加载的扩展样式

||中文描述||数据库字段||类型||描述|
||单据编码||cbillno||varchar(100)||对应bill_base表的cBillNo字段|
||扩展脚本地址||extscripturl||varchar(100)||xxx/xxx/xxx.css|

### [](#33-领域项目级样式扩展)3.3. 领域、项目级样式扩展

#### [](#331-扩展样式文件目录)3.3.1. 扩展样式文件目录

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanCSSbianmaguifan1.51638973.png)

领域脚手架的extend.less文件找到引入的样式文件即可

#### [](#332-扩展样式隔离方式)3.3.2. 扩展样式隔离方式

.domainkey {

  .header {

    color: red

  }

  //领域各个模块的css样式代码

}

领域自己项目的样式需要做domainkey隔离，避免影响其他全局样式

建议扩展代码中不要直接使用框架里的类名以及绑定事件处理，框架类名带有随机码的后缀形式，需要改的部分自己配classname再加上隔离来复写

这里只做简单的说明，不清楚css如何写可以网上搜下资料

#### [](#333-扩展css示例)3.3.3. 扩展CSS示例

下图为设计图与框架配置的后的扩展样式处理示例

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanCSSbianmaguifan2.4c825064.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanCSSbianmaguifan3.e2e61bee.png)

使用框架配置好显示的列数，扩展样式来修改成所需要的颜色

.groupdef2 { //容器类名需要自己配置 外层可以加上自己的domaikey

 .form-buttons {

 background: #dbebff; //容器颜色块

 }

}

.groupBlue { //容器类名需要自己配置

 .group-title {

 background: #558dce; //标题颜色块

 display: inline-block;

 padding-right: 20px;

 }

 .form-buttons {

 background: #dbebff; //容器颜色块

 border: 2px solid red; //容器边框

 .viewCell {

 border-top: 1px solid #fff;//每个单元格边框颜色

 border-right: 1px solid #fff;

 .label-control {

 // background: #A0ceff;

 }

 label {

 font-size: 14px; //title文本字体

 color: red;

 }

 }

 }

}