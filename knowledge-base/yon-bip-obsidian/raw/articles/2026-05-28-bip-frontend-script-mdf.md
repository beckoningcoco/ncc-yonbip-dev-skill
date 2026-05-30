# 前端脚本（MDF）开发文档

> 来源：YonBIP 社区文档中心 - c2.yonyoucloud.com
> 抓取时间：2026-05-28
> 原始URL：https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/QDJB12

## 概述

本文介绍MDF前端脚本的开发入门，包括前端开发规范、浏览器调试方法、MDF前端模型的概念介绍和基本使用。并在此基础上展开介绍前端模型中的生命周期和监听事件，以及展示如何通过模型上的api使用页面路由、打开模态框等案例。

关键词：MDF、前端开发、事件、发布订阅模式、MVVM

---

## 前端浏览器调试

打开浏览器调试工具：F12（Mac: Command+Option+I）或右击→检查

控制台介绍：
- 元素(Elements)：查找网页源代码HTML任一元素
- 控制台(Console)：记录开发过程中的信息，输出打印日志
- 源代码(Sources)：断点调试JS代码
- 网络(Network)：分析HTTP请求资源信息

查找扩展脚本：Sources页签 → 三个点 → Open file（Ctrl+P）→ 搜索 `getHpaExtCodeRegister`

debugger调试：在代码中增加 `debugger` 关键字，或在source面板源码行左侧点击行数

控制台调试：通过 `console.log()` 输出日志

---

## MDF前端模型介绍

MDF框架把页面中各种元素（字段输入框、按钮、查询区、弹窗、参照等）都封装成了模型。模型上挂载着组件的属性和方法，通过JS调用模型API来控制UI展示和状态数据。

事件通信采用**发布订阅模式**，通过模型上的 `on` 方法挂载监听回调，`execute` 方法触发事件。

### 模型分类
- **容器级模型**：通过 `cb.viewmodels.register` 注册
- **控件级模型**：通过 `cb.models.register` 注册
- 容器模型内部可以挂载控件级模型

### BaseModel（基础模型）
所有模型的基类，通用方法如 `model.setVisible()`、`model.on()` 等

### viewModel（页面模型）
每个单据页面的容器模型，页面上的各种元素、列表均需通过viewModel上的API获取

**常用方法：**
- `viewModel.get(fieldName)` — 获取详情页某个主表字段的模型
- `viewModel.getGridModel(subFieldName)` — 获取列表页/详情页中的列表模型
- `viewModel.hasFeature(featureName)` — 检查当前单据是否有某个前端特性

**常用事件：**
- `beforeSearch` — 查询区搜索前事件
- `afterLoadData` — 详情页数据加载后
- `afterRule` — 页面规则执行后
- `afterProcessWorkflow` — 流程字段权限加载后
- `afterMasterOrgChange` — 主组织变更后

**动作事件（before/after 模式）：**
save(add/edit/push/delete/submit/unsubmit/movenext) ←→ beforeSave/afterSave 等

### SimpleModel（简单模型）
对标基本控件（输入框、按钮等）

- `model.setValue(value, check)` / `model.getValue()` / `model.clear()`
- 事件：`beforeValueChange` / `afterValueChange`

### ListModel（枚举模型）
对标下拉选框、单选/复选框

- `model.setValue()` / `model.getValue()` / `model.setDataSource([...])`
- 事件：`beforeValueChange` / `afterValueChange` / `beforeSetDataSource` / `afterSetDataSource`

### GridModel（列表模型）
对标表格组件

- `model.getCellValue(rowIndex, cellName)` / `model.setCellValue(rowIndex, cellName, value, check)`
- `model.getData()` / `model.setDataSource([...])` / `model.getSelectedRows()`
- `model.setColumnState(cellName, name, value)` — 设置列状态
- 事件：`beforeCellValueChange` / `afterCellValueChange` / `beforeSetDataSource` / `afterSetDataSource`

### ReferModel（参照模型）
对标参照选框

- `model.setValue()` / `model.getValue()` / `model.browse()` / `model.setFilter(filter)`
- 事件：`beforeBrowse` / `beforeValueChange`

---

## 功能开发

### 页面路由
通过 `cb.loader.runCommandLine` 跳转页面：
```js
cb.loader.runCommandLine('bill', {
  billtype: 'voucher',    // voucherList=列表页, voucher=详情页
  billno: 'b584b8e2List', // 单据号
  domainKey: 'ustock',    // 跳转原厂单据时必填
  params: {
    mode: 'edit',         // edit/add/browse
    id: 'xxxxxxxx',
    carryParams: { test: 123 }
  }
}, viewModel)
```
目标页面通过 `viewModel.getParams()` 接收参数

### 打开模态框
`templateType: 'modal'` + 第四个参数回调获取弹窗模型：
```js
cb.loader.runCommandLine('bill', { ..., params: { templateType: 'modal' } },
  viewModel,
  (subModel) => { return subModel }  // 必须返回
)
```
弹窗中获取父页面模型：`viewModel.getCache('parentViewModel')`

---

## 常见问题
- 监听详情页数据加载完成：`viewModel.on('modeChange', function(mode) {...})`
- 跳转后权限问题：检查 `serviceCode` 和 `busiObj` 参数
- 不支持 ES6 模块化语法（require/import），脚本直接在浏览器端运行
