---
title: 前端典型示例开发（YNF）
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/XGNQDYSYNF1
author: 张译帆
date: 2025-09-23
ingested: 2026-05-28
tags: [YNF, 样式扩展, 查询方案, 自定义组件, CSS, MobX, UI协议]
images: 30
image_paths: []
---

# 前端典型示例开发（YNF）

> YNF 前端扩展三大典型场景：样式扩展、查询方案扩展、自定义组件开发。

## 适用场景

仅适用于**私有云/专属云**的客户化定制开发和 ISV 生态开发。

## 样式扩展开发

### 卡片字段背景色

设计器选中字段 → 右侧样式页签 → 外框样式 → 渐变背景色 → 保存。

### 列表行样式（UI 协议 + MobX 表达式）

在列表 UI 协议中增加 `rowClassName`，指向 MobX 表达式；在 `tableStore` 中实现 `getRowClassName`：

```javascript
rootStore.tableStore.getRowClassName = function (record, index) {
  if (index === 1) return 'bg-orange'
}
```

注意：行 div 上的背景色可能被内部单元格的白色背景覆盖，需在 `style.css` 中清除单元格背景色。

### 列表单元格样式

在列表 UI 协议中增加 `getCellClassName`：

```javascript
rootStore.tableStore.getCellClassName = function (record, index, column) {
  if (index === 0 && column.dataIndex.includes('verifyState')) return 'blue'
}
```

### Tinper-Next 内置样式

**背景色类**：`bg-red`(#f44336), `bg-pink`, `bg-purple`, `bg-blue`, `bg-cyan`, `bg-green`, `bg-yellow`（均带 `!important`）

**文字色类**：`blue`, `pink`, `yellow`, `purple`, `orange`（均带 `!important`）

### 自定义样式表

在 `style.css` 中定义自定义样式类，然后通过 `getCellClassName` 引用：

```css
.my-font-style { font-weight: bold; font-style: italic; }
```

## 查询方案开发

### FilterStore 获取

```javascript
let { filterStore } = rootStore
let filterItem = filterStore.getFilterItemByName("code")
```

### 常用操作

- **查询区显隐**：设计器配置 + MobX 表达式控制
- **给查询字段赋初始值**（两种方式）：
  1. 设计器属性面板/协议面板直接配置
  2. 前端脚本监听 `isQueryReady` 钩子：
     ```javascript
     defaultSearchCondition: reaction(() => rootStore?.filterStore.isQueryReady, () => {
       rootStore?.filterStore?.getFilterItemByName("inputType").setValue(2)
       rootStore?.filterStore?.copyCondition()
       rootStore?.filterStore?.setQueryTrigger()
     })
     ```
- **设置必填后必须执行** `copyCondition()` + `setQueryTrigger()` 重新触发查询

### 查询条件设为必填

```javascript
ExtendReaction(rootStore) {
  return {
    init: {
      afterHook: (rootStore, res) => {
        const item = rootStore?.filterStore?.getFilterItemByName("inputType")
        item.meta.required = true
      }
    }
  }
}
```

## 自定义组件开发

### 脚手架文件结构

```
src/
├── index.share.js          # 导出组件内容
├── index.designer.js       # 组件库设计器元数据（LibraryMeta）
└── components/{组件名}/
    ├── index.js            # 组件内容定义（React Component）
    ├── index.less          # 组件样式
    └── index.designer.js   # 组件级设计器配置（CompMeta）
```

### 设计器文件关键点

**组件级** (`components/{name}/index.designer.js`)：
- 继承 `CompMeta`，定义 `code`、`name`
- `this.addBoolProp({code, name, defaultValue})` — 添加布尔配置项
- `this.addGroup({code, name}).addProps(...)` — 分组管理属性

**库级** (`src/index.designer.js`)：
- 继承 `LibraryMeta`，定义 `code`（`ynf-{domainKey}`）、`name`
- `this.addGroup({code, name}).addComps([Meta.create()])`
- 场景开关：`this.isPc/isMobile/isYnf/isMdf/isNoc = true`

### 打包配置

`yds.config.js` 的 `providerEntry` 中导入 `index.share.js` 和 `index.designer.js`。

### 资源中心注册

1. 资源中心 → 新建 → 二方包编码 `ynf-{domainKey}`
2. 组件来源选"设计器二方包" → 点击校验
3. 确定后发布 → 设计器即可引入

### 调试

Resource Override 代理源：`***/ynf-{domainKey}/*/**` → 目标：`https://localhost:9090/**`

## 常见坑

| 问题 | 原因/解决 |
|------|-----------|
| MobX 表达式不调用 | 表达式配置的是函数，不要加 `()` 调用；检查挂载位置 |
| 查询区默认值不生效 | 设值后必须执行 `copyCondition()` + `setQueryTrigger()` |
| 单元格背景不显示 | 行 div 背景被内部白色覆盖，需在 style.css 清除 |
| 内置样式有哪些 | 控制台 Sources 面板 Ctrl+P 查找 `tinper-next.css` |

## 与其他文档关联

- [[2026-05-28-bip-ynf-app-dev]] — YNF 框架总览
- [[2026-05-28-bip-ynf-frontend]] — YNF 前端扩展脚本 API
- [[2026-05-28-bip-ynf-env-setup]] — YNF 环境搭建
- [[2026-05-28-bip-mdf-example]] — MDF 典型示例（旧框架对比）
