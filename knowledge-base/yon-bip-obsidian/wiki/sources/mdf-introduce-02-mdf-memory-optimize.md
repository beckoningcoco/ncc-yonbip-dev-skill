---
title: "--MDF内存泄漏优化记录"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-memory-optimize"
section: "介绍"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 介绍]
platform_version: "BIP V5"
source_type: mdf-docs
images: 22
---

# --MDF内存泄漏优化记录

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/introduce/02-mdf-memory-optimize | 所属：介绍

# [](#mdf内存泄漏优化记录)MDF内存泄漏优化记录

## [](#1-优化原则)1. 优化原则

- **组件和模型绑定addListener，组件卸载时必须removeListener**
- **组件绑定字段模型或单据模型事件on，组件卸载时必须解绑un**
- **组件绑定cb.events事件on，组件卸载时必须解绑un**
- **组件绑定DOM事件，组件卸载时必须解绑removeEventListener**
- **单个组件隐藏时建议return null**
- **代码要减少深拷贝的使用，非得使用时在循环外面用不要在循环里面**
- **定时器使用要小心尽量不要将viewmodel泄漏**
- **尽量减少所有函数的调用次数**

## [](#2-示例代码)2. 示例代码：

### [](#21-react组件)2.1. react组件

参考代码如下

import addEventListener from 'rc-util/lib/Dom/addEventListener';

class Input extends Component {

 constructor(props) {

 super(props);

 this.state = {

 visible: true

 }

 // 页面模型

 this.viewmodel = props.model?.getRootParent();

 // 字段模型

 this.model = props.model;

 }

 componentDidMount() {

 // 模型绑定组件事件

 this.model?.addListener(this);

 // cb.events事件

 cb.events.on('workBenchCollapse', this.workBenchCollapse);

 // model事件

 this.model?.on('modelEvent', this.modelEvent);

 // viewmodel事件

 this.viewmodel?.on('viewmodelEvent', this.viewmodelEvent);

 // DOM事件 方式1

 this.onMouseDown = addEventListener(document, 'keydown', this.onKeyDown);

 // DOM事件 方式2

 document.body.addEventListener('click', this.handleBodyClick);

 }

 componentWillUnmount() {

 // 模型绑定组件事件

 this.model?.removeListener(this);

 // cb.events事件

 cb.events.un('workBenchCollapse', this.workBenchCollapse);

 // model事件

 this.model?.un('modelEvent', this.modelEvent);

 // viewmodel事件

 this.viewmodel?.un('viewmodelEvent', this.viewmodelEvent);

 // DOM事件 方式1

 this.onMouseDown.remove();

 this.onMouseDown = null;

 // DOM事件 方式2

 document.body.removeEventListener('click', this.handleBodyClick);

 }

 // 事件标准写法 箭头函数

 workBenchCollapse = () => {

 this.setState({

 test: 'hello world'

 })

 }

 render () {

 const { visible } = this.state;

 if (!visible) return null

 return (

 <div>

 <input/>

 </div>

 )

 }

}

## [](#3-优化记录)3. 优化记录

### [](#31-表格侧滑卡片)3.1. 表格侧滑卡片

打开关闭后，内存得不到释放。弹窗打开时，组件跟模型双向绑定，弹窗关闭后，组件销毁时并未解绑模型导致组件在浏览器内存中得不到释放。

下面1-6记录都是验证表格侧滑面板打开关闭，通过观察TableEditRowModel对象是否销毁，内存是否有增长来判断内存是否泄漏。

#### [](#311-整体优化效果)3.1.1. 整体优化效果

优化前：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu1.45a73821.png)

优化后：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu2.2bbc0eae.png)

#### [](#312-优化过程)3.1.2. 优化过程

##### [](#3121-哈勃埋点ubajs绑定了pointerevent事件)3.1.2.1. 哈勃埋点uba.js绑定了PointerEvent事件

去掉dom监听事件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu3.c235451d.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu4.fc2fbed0.png)

##### [](#3122-文件服务fileservce-manjs绑定了mouseevent事件)3.1.2.2. 文件服务fileservce-man.js绑定了mouseEvent事件

去掉dom监听事件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu5.1c3ddc80.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu6.7c3b6f14.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu7.1d45c4c9.png)

##### [](#3123-协同ykj-widgetsjs绑定了mouseevent事件)3.1.2.3. 协同ykj-widgets.js绑定了mouseEvent事件

去掉dom监听事件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu8.be419ec6.png)

##### [](#3124-mdf侧滑组件隐藏时改变了组件树层级结构)3.1.2.4. MDF侧滑组件隐藏时改变了组件树层级结构

组件A内引用了组件B，组件B被显隐时组件树层级不能变。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu9.6c78017c.png)

##### [](#3125-钉耙input组件自定义事件enforceevent没删除)3.1.2.5. 钉耙Input组件自定义事件enforceEvent没删除

组件卸载时删掉enforceEvent事件

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu10.5f1ecb5f.png)

##### [](#3126-mdf组件模型event事件没删除)3.1.2.6. MDF组件模型event事件没删除

组件上所有模型事件，在组件卸载时得删掉

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu11.b499c77d.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu12.83f8ab23.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu13.f5323ac6.png)

### [](#32-splitpane组件泄漏)3.2. splitPane组件泄漏

经过录制发现是splitPane组件存在泄漏，跟进代码发现dom有新增事件但是没有卸载事件，需要在组件卸载时卸载事件。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu14.955747e2.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu15.fc3a8470.png)

#### [](#321-销售出库卡片进入返回5次)3.2.1. 销售出库卡片进入返回5次

内存增长几乎为0！

优化前：增长61M

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu16.4a0d1a5b.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu17.83db2a7e.png)

优化后：增长6M

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu18.03807c7c.png)

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu19.218f390a.png)

## [](#4-内存泄漏排查方法)4. 内存泄漏排查方法

查看侧滑打开关闭是否有内存泄漏，预期：内存增长为0

### [](#41-清空console)4.1. 清空console

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu20.1848abd1.png)

### [](#42-到memory里点删除按钮手动回收内存)4.2. 到Memory里点删除按钮手动回收内存

下面显示的内存大小就是浏览器执行垃圾回收后内存大小。可以看到日常环境目前187M。不手动回收等待10s左右也可以。如果是单据页签关闭，得等待60s再执行垃圾回收。

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu21.5492c769.png)

### [](#43-鼠标光标聚焦到一个不相关地方)4.3. 鼠标光标聚焦到一个不相关地方

光标之前聚焦的input会导致input内存暂时释放不掉

### [](#44-重复操作打开侧滑再关闭侧滑操作前后比较内存大小)4.4. 重复操作，打开侧滑再关闭侧滑操作，前后比较内存大小

如果后面内存大于前面内存，就是存在内存泄漏。鼠标可以点击一下别的区域，

### [](#45-如果发现有内存泄漏录制分析)4.5. 如果发现有内存泄漏，录制分析

分析方法参考文档[https://juejin.cn/post/6844903934235148296](https://juejin.cn/post/6844903934235148296)

- Heap snapshot ---- 分析出组件是否泄漏，占用内存大的资源。
- Allocation instrumenation on timeline ---- 分析当前操作或静置状态下内存增长情况
- Allocation sampling 简单录制判断是否存在泄露

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/MDFneicunxielouyouhuajilu22.85057f1a.png)

## [](#5-sonar的扫描规则)5. Sonar的扫描规则

- 所有React组件文件里on的数量和componentWillUnmount里un的数量要保持一致
- 所有React组件里addListener的数量和componentWillUnmount里removeListener的数量要保持一致
- 所有React组件里document.body.addEventListener
的数量和componentWillUnmount里的document.body.removeEventListener的数量要保持一致
- 所有React组件三方包rc-util里的addEventListener的事件必须要解绑,componentWillUnmount里需要执行this.onMouseDown.remove()
this.onMouseDown = null