---
title: "前端JS编码规范 ☆"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-js-coding-spec"
section: "协议"
date: 2026-06-07
ingested: 2026-06-07
tags: [MDF, 前端框架, 协议]
platform_version: "BIP V5"
source_type: mdf-docs
images: 1
---

# 前端JS编码规范 ☆

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/mdf/index.html#/spec/03-js-coding-spec | 所属：协议

# [](#前端js编码规范-)前端JS编码规范 ☆

## [](#1-组件依赖)1. 组件依赖

为减小构建产物体量，组件包不再单独引入，如果需要使用metaui-web或metaui-mobile中的组件，可通过控制台打印cb.components查看支持的内容，引入示例如下：

### [](#11-web端)1.1. Web端

// 不需要单独引入

const { Form, Button, Card } = window.TinperNext;

// 不需要单独引入@mdf/metaui-web

const { TreeRefer, Label, Input } = require(\'mdf-metaui-web\').basic;

### [](#12-移动端)1.2. 移动端

// 需要单独引入@mdf/baseui-mobile

const { Button, DatePicker } = window.AntdMobile;

// 不需要单独引入@mdf/metaui-mobile

const { Refer } = require(\'mdf-metaui-mobile\').basic;

## [](#2-脚本依赖)2. 脚本依赖

为减小构建产物体量，如需使用@mdf/cube，引入示例如下：

// 不需要单独引入@mdf/cube

const { setMode, getWebUrl } = viewmodel.biz.action().common;

## [](#3-构建打包)3. 构建打包

### [](#31-接入tns统一三方包)3.1. 接入TNS统一三方包

- 统一前端三方包TNS接入指南
- 统一前端三方包清单

### [](#32-构建产物混淆压缩)3.2. 构建产物混淆压缩

构建build命令在脚手架package.json添加ZIP参数进行混淆压缩，如下图：

![](https://design.yonyoucloud.com/static/ucf/iuap-yonbuilder-designer.docs-mdf-fe/20250116-135007/mdf/static/qianduanJSbianmaguifan1.3de0ed5f.png)

### [](#33-性能分析工具)3.3. 性能分析工具

- Webpack插件 webpack-bundle-analyzer（分析构建大小）
- speed-measure-webpack-plugin（分析构建速度）
- Chrome插件 PageSpeed、JavaScript
Profiler、LightHouse、Performance、Menony、Layers

## [](#4-保留关键字)4. 保留关键字

以下为框架保留的关键字，业务不要使用

- status
- terminalType
- apptype
- adt
- extend
- locale
- serviceCode
- tplid
- isSum
- transtype
- domainKey
- viewmodel
- model
- busiObj
- businessStepCode
- verifyState
- verifystate
- mode

## [](#5-基础编码)5. 基础编码

- 少用语法糖，如：for in循环。
- 禁止在JS代码中操作DOM。
- 把import Button from 'xxx' 的引入方式，变成import {Button} from
'xxx' 的方式引入，以利于按需打包。
- 原生监听事件、定时器等，必须在componentWillUnmount中清除，大型项目会发生内存泄露，极度影响性能。
- 使用PureComponent代替React.component，这样React机制会自动在shouldComponentUpdate中进行浅比较，决定是否更新，减少渲染次数。
- 对于有性能瓶颈的组件多结合 React.memo ,immetable.js
对shouldComponentUpdate ,PureComponent 进行助力调优。
- React的JSX语法要求必须包裹一层根标签，为了减少不必要的DOM层级，我们使用Fragment标签代替，这样渲染时候不会渲染多余的DOM节点，让DIFF算法更快遍历，减少渲染性能损耗。
- 绑定事件不要使用匿名箭头函数，例如：onClick={(event)=>{...}}
应该改写为 onClick = {this.handleClick}
形式，减少函数的构建次数及内测占用。
- DOM子节点的事件，优先绑定到父节点上，使用事件代理模式，避免事件内存占用随着子节点数量等比增长。
- 多利用React的key属性进行优化，减少渲染dom次数，避免错误用法一：用index做key、错误用法二:用index拼接其他的字段、正确用法：用唯一id作为key。
- HTML 通过 html-webpack-plugin 插件配置 minify 开启压缩。
- JS 通过 terser-webpack-plugin 插件配置 开启压缩。
- CSS 通过 mini-css-extract-plugin
插件提取为独立css文件，不要使用内嵌style样式，通过optimize-css-assets-webpack-plugin
插件配置 开启压缩。
- 图片在渲染前指定大小， img
元素是内联元素，在加载图片后会改变宽高，会导致整个页面重排，验证影响渲染性能，所以最好在渲染前就指定其大小，或者让其脱离文档流。
- 对于脚本与DOM/其它脚本的依赖关系很强：<script>设置defer属性（即脚本会立即下载，但会延迟到页面DOM渲染后再执行，执行有序）(例如:事件类、垫片类、DOM类)。
- 对于脚本与DOM/其它脚本的依赖关系不强：<script>设置async属性（即当前脚本不必等待其他脚本，也不会阻塞文档呈现，执行无序）（例如:采集类、帮助类、聊天类）。
- JS防抖操作，对指定时间内执行的连续事件，只执行最先的一次。
- JS节流操作，对指定时间内执行的连续事件，只执行最后的一次。
- 避免出现超过三层嵌套的CSS规则。
- 使用ID选择器后就不要添加多余类选择器。
- 不要使用标签选择器，而是用类选择器代替。
- 避免滥用float模式、声明过多font-size。
- 将元素设为不可见：visibility:
hidden，这样可以减小重绘的压力，必要的时候再将元素显示。
- 控制DOM节点的嵌套深度，能少一层就少一层。
- 切换样式要提前定义好class，通过class的切换批量修改样式，避免多次重绘重排。
- React下直接DOM操作能避免则避免，避免不了也要将多次的append的DOM操作可以先插入到一个新生成的元素中，再一次性插入到页面中，减少页面重绘重排。
- 能不定义全局变量就不定义全局变量，使用局部变量代替全局变量，减少内存占用，提高查找速度。
- includes、indexOf等API入参中不允许传入未计算好的变量、计算函数、需要转大小写但未提前转好在入参中通过toLowerCase等API转换等参数，需要提前将需要的内容计算好传入参数中