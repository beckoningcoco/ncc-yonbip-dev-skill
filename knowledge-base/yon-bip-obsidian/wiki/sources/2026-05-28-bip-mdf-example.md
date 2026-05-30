---
title: 前端典型示例开发（MDF）
date: 2026-05-28
source_url: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/QDKFUIZJ11
version: BIP5
tags: [MDF, FilterViewModel, 查询区, 样式扩展, GridModel, 组件扩展, beforeSearch, CSS]
images: 30
image_paths: []
---

# 前端典型示例开发（MDF）

> 三大典型 MDF 前端扩展示例：查询方案开发、样式扩展、组件/自定义页面开发。适用所有部署方案。

## 一、查询方案开发

### FilterViewModel 生命周期

| 事件 | 触发时机 | 用途 |
|------|----------|------|
| `beforeInit` | 查询区脚本加载之前 | 修改查询返回数据 |
| `afterInit` | 查询脚本加载+组件渲染后 | 设置默认值、监听事件 |
| `beforeSearch` | 点击查询按钮后、查询前 | 过滤操作、修改查询条件 |
| `afterResetClick` | 重置按钮点击后 | 阻止搜索：`return false` |
| `afterInitCommonViewModel` | 查询区脚本加载后 | 获取 FilterViewModel |
| `updateAdvanceModel` | 高级查询配置 | or/and 混合条件场景 |

### 获取模型

```javascript
// 获取查询区模型
const filtervm = viewModel.getCache('FilterViewModel');
// 获取控件的真实模型（between 区间的用 getFromModel/getToModel）
filtervm.get('cItemName').getFromModel();
```

### 常用操作

**显示/隐藏**：
```javascript
// 隐藏查询区方案选择
filtervm.setState('bHideFilterScheme', true);
// 隐藏某查询字段
filtervm.execute('updateViewMeta', { code: '字段编码', visible: false });
```

**设置默认值（参照类型）**：
```javascript
const referModel = filtervm.get('purorg').getFromModel();
cb.utils.triggerReferBrowse(referModel, [{ field:'id', op:'eq', value1: 'xxx' }]);
```

**控制行数**：
```javascript
filtervm.getParams().filterRows = 2; // 显示两行
```

**代码触发的搜索/重置**：
```javascript
filtervm.get('search').fireEvent('click'); // 搜索
filtervm.get('reset').fireEvent('click', {disabledSearch: true}); // 重置但取消自动搜索
```

### op 过滤参数

| op | 含义 | op | 含义 |
|----|------|----|------|
| `eq` | 等于 | `neq` | 不等于 |
| `gt` | 大于 | `lt` | 小于 |
| `between` | 区间(value1~value2) | `in` / `nin` | 包含/不包含 |
| `like` / `rightlike` / `leftlike` | 模糊匹配 | `egt` / `elt` | 大于等于/小于等于 |
| `is_null` / `is_not_null` | 为空/非空 | | |

### 其他技巧

- **必填校验**：`filtervm.on('beforeSearch', args => { filtervm.get('xxx').setState('mustInput', 1) })`
- **自动搜索**：`filtervm.getParams().autoLoad = true`（在 beforeInit 中设置）

## 二、前端样式扩展

### 三种方式

| 方式 | 文件/位置 | 适用场景 |
|------|----------|----------|
| 脚手架样式文件 | `src/client/web/styles/default/extend.less` | 推荐方式，domainKey 隔离 |
| YonBuilder 设计器 | 前端扩展函数动态创建样式表 | 无脚手架权限 |
| 技术中台 MDF 配置 | 三方样式资源 | 全局生效（适用于所有 MDF 页面） |

### GridModel 样式 API

**行样式**：
```javascript
gridModel.setRowState(rowIndex, 'className', 'cssbg-red');
// CSS: .public_fixedDataTableRow_cssbg-red [role="gridcell"]
```

**列样式**：
```javascript
gridModel.setColumnState('purOrg_name', 'style', {backgroundColor:'blue'});
// 或使用 tinper-next 内置样式
gridModel.setColumnState('purOrg_name', 'className', 'bg-purple');
```

**单元格样式**：
```javascript
gridModel.setCellState(1, 'payType', 'style', {'backgroundColor': 'pink'});
```

### tinper-next 内置背景色

`bg-red`、`bg-pink`、`bg-purple`、`bg-indigo`、`bg-blue`、`bg-light-blue`、`bg-cyan`、`bg-green`、`bg-yellow`（无需手动写 CSS）

### CSS 权重（高到低）

`!important` → 内联样式(1000) → ID(100) → 类/伪类/属性(10) → 标签/伪元素(1) → 通配符(0)

### 卡片样式

- 卡片背景色根据状态变化（通过 `modeChange` + `classList.add`）
- 卡片头部提示语：使用 `maintitle` 标题组件 + 脚手架样式覆盖

## 三、前端组件/自定义页面扩展

- **MDF 工程扩展组件**：在 MDF 前端工程自定义基础组件（basic），参考 MDF 前端基础组件扩展
- **自定义扩展页面**：可在 MDF 工程中写页面代码，或用 React/Vue 脚手架开发
- **ISV**：向对应领域申请 MDF 前端脚手架权限，或使用自建引擎前端工程脚手架

## 相关页面

- [[专业开发]]
- [[页面脚本]]
- [[2026-05-28-bip-mdf-frontend]]
- [[搜索查询]]
