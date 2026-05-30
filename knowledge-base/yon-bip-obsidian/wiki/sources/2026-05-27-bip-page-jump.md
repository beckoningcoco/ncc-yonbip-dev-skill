---
tags: [页面跳转, runCommandLine, 模态框, communication, 页面脚本]
created: 2026-05-27
updated: 2026-05-27
sources: [2026-05-27-bip-page-jump]
---

# 20个页面跳转代码片段

> BIP 页面跳转的完整方案：单据跳转、模态框通信、外部跳转。

## 跳转方式

### cb.loader.runCommandLine（最常用）
```javascript
let request = {
    billtype: 'Voucher',       // Voucher/VoucherList
    billno: '0b50d1b4',        // 单据号
    params: {
        mode: 'add',           // add/edit/browse
        readOnly: false,
        id: '123',             // 记录ID
        data: { ... }          // 业务数据
    }
};
cb.loader.runCommandLine('bill', request, viewModel);
```

### 模态框通信
```javascript
// 关闭并返回数据
viewModel.communication({ type: 'return', payload: { data: selectedRows } });
// 关闭不返回
viewModel.communication({ type: 'modal', payload: { data: false } });
```

### 其他方式
- `window.open(url, '_blank')` — 外部系统
- `rootStore.pageStore.push({...})` — rootStore 跳转
- `jDiwork.openService(code, dt, param)` — 新标签页

## 接收父页面参数
```javascript
const val = viewModel.getParams().paramName || viewModel.getParams().query.paramName;
```
<!-- confidence: EXTRACTED -->
