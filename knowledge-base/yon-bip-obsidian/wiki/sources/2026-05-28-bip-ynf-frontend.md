---
title: 前端开发（YNF）
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/XGNQDKFNYF1
author: 张译帆
version: V3.0 (V5环境Beta版)
date: 2025-08-25
ingested: 2026-05-28
tags: [YNF, 前端扩展, MobX, hooks, index.extend.js]
images: 13
image_paths: []
---

# 前端开发（YNF）

> YNF 前端扩展脚本开发指南：通过 index.extend.js 编写业务逻辑，实现字段状态控制和数据校验。

## 适用场景

仅适用于**私有云/专属云**的客户化定制开发和 ISV 生态开发。公有云和本地部署不适用。

## 核心概念

- **YNF 前端工程**：以 `ynf` 开头的脚手架工程
- **MobX**：状态管理库
- **hooks 钩子**：生命周期钩子函数
- **副作用（reaction）**：自动响应状态变化的逻辑

## 扩展脚本结构

单据扩展文件保存在 `src/pages/{billNo}/index.extend.js`：

```javascript
// Domain Store — 扩展领域、行业的业务 stores
export function ExtendStore (rootStore) {}

// Action — 明确的、静态的 action 动作
export function ExtendAction (rootStore) {}

// Reaction — track 具体状态值，按明确逻辑更新 domain store
export function ExtendReaction (rootStore) {}

// RootStore — 全局 api、utils、pageStore 等扩展，或直接定义业务逻辑
export function ExtendRootStore (rootStore) {}
```

## 配置文件注册

在 `yds.config.js` 的 `tnsConfig.providerEntry` 下注册扩展脚本：

```javascript
'./{单据编码}': path.resolve(__dirname, './src/pages/{单据编码}/index.extend')
```

## 本地调试

- `npm run start` 启动前端服务，端口 **9090**
- 通过 Chrome 插件 **Resource Override** 代理线上脚本到本地
- 代理源路径格式：`***/ynf-{domainKey}/*/**`
- 代理目标：`https://localhost:9090/**`

## 业务场景示例

### 场景一：新增态字段不可编辑 + 默认值

通过 ExtendReaction 给 `init` reaction 增加 afterHook：

```javascript
export function ExtendReaction (rootStore) {
  return {
    init: {
      afterHook(rootStore, res) {
        if (rootStore.cardStore.isAdd) {
          const enteredMethod = rootStore.formStore.get('inputType')
          enteredMethod.setDisabled(true)
          enteredMethod.setValue('1')
        }
      },
    },
  }
}
```

### 场景二：子表物料去重校验

通过 ExtendRootStore 在子表 store 上挂载自定义方法，需配合 UI 协议绑定：

```javascript
export function ExtendRootStore (rootStore) {
  const tableStore = rootStore.fnProductPurchaseReqDetailYnfListStore
  tableStore.onMeterialChange = function (newVal, row) {
    let flag = false
    const tableData = tableStore.getValue()
    const filteredData = tableData.filter(item => item.rowKey !== row.rowStore.rowKey)
    filteredData.forEach(rowStore => {
      if (rowStore.getValue('materialCode') === newVal.code) {
        flag = true
      }
    })
    if (flag) {
      rootStore.utils.message.danger('物料重复，请重新录入')
      return false
    }
  }
}
```

## 常见问题

### 页面跳转

```javascript
rootStore.pageStore.push({
  billNo: '页面编码',
  params: { 参数1: '参数1' }
})
```

### 覆盖默认 action（cardReaction）

详情页不同状态调用不同 action：新增态 → add 接口、浏览/编辑态 → detail 接口、复制态 → detail+copy 接口。通过 cardReaction 配置可覆盖默认行为。

### 自定义弹框

```javascript
rootStore.pageStore.openModal({
  uiType: 'component',
  component: '自定义 DOM',
  bodyStyle: { height: '500px' },
  zIndex: 888,
  containerType: 'drawer',  // 右侧抽屉；不传则为居中弹窗
  onOk: () => {},
  onCancel: () => {}
})
```

## 关键 API 速查

| API | 用途 |
|-----|------|
| `rootStore.cardStore.isAdd` | 判断是否新增态 |
| `rootStore.formStore.get('fieldName')` | 获取主表字段 |
| `rootStore.formStore.setValue('val')` | 设置字段值 |
| `rootStore.formStore.setDisabled(true)` | 设置字段不可编辑 |
| `rootStore.{tableStore}.getValue()` | 获取子表全部数据 |
| `rootStore.utils.message.danger('msg')` | 错误提示 |
| `rootStore.pageStore.push({...})` | 页面跳转 |
| `rootStore.pageStore.openModal({...})` | 打开弹框/抽屉 |

## 与其他文档关联

- [[2026-05-28-bip-ynf-app-dev]] — YNF 框架总览
- [[2026-05-28-bip-ynf-env-setup]] — YNF 环境搭建
- [[2026-05-28-bip-mdf-frontend]] — MDF 前端开发（旧框架对比）
- [[专业开发]] — YNF 核心概念与 MDF 对比表
