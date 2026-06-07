---
title: "弹框 Modal"
source: "https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--modal"
section: "YNF-组件"
date: 2026-06-07
ingested: 2026-06-07
tags: [YNF, 前端框架, 新一代, 组件]
platform_version: "BIP V5"
source_type: ynf-docs
images: 0
---

# 弹框 Modal

> 来源：https://c2.yonyoucloud.com/iuap-yonbuilder-designer/ucf-wh/docs-mdf/ynf/index.html#/components/ynf-lib-base--modal | 所属：YNF-组件

# [](#弹框-modal)弹框 Modal

模态框（Modal）是覆盖在父窗体上的子窗体，位于页面最上层。通常，目的是显示来自一个单独的源的内容，可以在不离开父窗体的情况下有一些互动，子窗体可提供信息、交互，如查看、创建、编辑、向导等

import { Modal } from "ynf-lib-base"

## [](#何时使用)何时使用

- 需要用户处理事务，又不希望跳转页面以致打断工作流程时，可以使用弹窗容器承载信息。当弹窗被触发时，在当前页面中打开一个浮层，承载相应的操作。窗体可承载新增、录入、浏览、编辑、向导等所需要的元素。

## [](#api)API

公共属性和方法见[组件公共属性和方法](#/components/common)

||属性||字段||类型||说明||默认值||使用方法|
||显示标题||header||boolean||开启后, 展示头部内容||true|||
||弹框模板||mode||string||设置弹窗样式模板||default|||
||水平垂直居中||centered||boolean||开启后, 弹窗水平垂直居中展示||false|||
||弹出遮罩层||mask||boolean||开启后, 弹窗存在时背景会被遮罩层覆盖||true|||
||点击遮罩层触发关闭||maskClosable||boolean||开启后, 点击遮罩层关闭弹窗||false|||
||显示关闭||closable||boolean||开启后, 弹窗右上角显示关闭按钮||true|||
||显示底部操作按钮||footer||boolean||开启后, 弹窗底部显示操作按钮||true|||
||支持拖拽位置||draggable||boolean||开启后, 弹窗可拖拽||false|||
||支持改变大小||resizable||boolean||开启后, 弹窗右下角出现三角形阴影, 按住该阴影拖拽可改变弹窗大小||false|||
||支持全屏显示||maximize||boolean||开启后, 弹窗右上角出现放大图标, 点击可全屏显示||false|||
||确定按钮文字||okText||string||自定义确定按钮的文案||确定|||
||取消按钮文字||cancelText||string||自定义取消按钮的文案||取消|||
||提示(确认)弹窗标题||confirmTitle||string||自定义提示(确认)弹窗标题, 只有在弹框模板为提示弹窗或确认弹窗时生效||标题|||
||提示(确认)弹窗内容||confirmContent||string||自定义提示(确认)弹窗内容, 只有在弹框模板为提示弹窗或确认弹窗时生效||描述|||
||内容区样式||bodyStyle||Style||内容区样式||-|||
||标题样式||titleStyle||Style||标题样式||-|||
||Modal所在的外层dom容器id||getPopupContainerId||string||自定义弹窗所挂dom节点的id, 默认为body||-|||
||弹框显示||onShow||||当弹框显示时的回调函数||-|||
||弹框隐藏||onHide||||当弹框隐藏时的回调函数||-|||
||点击确定||onOk||||当点击确定按钮时的回调函数||-|||
||点击取消||onCancel||||当点击取消按钮时的回调函数||-|||
||打开前||onOpenBefore||||当弹框显示前的回调函数||-|||
||关闭前||onCloseBefore||||当弹框关闭前的回调函数||-|||