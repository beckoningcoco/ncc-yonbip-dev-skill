---
tags: [联查, 弹框, 模态框, DynamicProxy, local数据源, runCommandLine, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-link-query-modal.md]
---

# 联查弹框功能

> 从单据联查按钮打开模态框列表页面，使用 local 数据源 + DynamicProxy 自定义接口获取数据。

## 实现步骤

1. **新建列表页面**作为弹框载体
2. **父页面打开模态框**：
   ```js
   cb.loader.runCommandLine('bill', {
     billtype: 'VoucherList', billno: '...', domainKey: 'c-kk-lzlj-cwgx',
     params: { templateType: 'modal', mode: 'browse', param1: { ... },
       query: { busiObj: '...', serviceCode: '...' } }
   }, viewModel);
   ```
3. **模态框页面脚本**：
   - `dataSourceMode: 'local'`
   - `afterSetDataSource` 中通过 DynamicProxy 调用自定义接口
   - `setDataSource` 设置数据
4. **关闭弹窗**：`viewModel.communication({ type: 'return', payload: { cParameter: JSON.stringify({ refresh: false }) } })`

## 关键概念

- [[联查]]
- [[模态框]]
- [[DynamicProxy]]
- [[local 数据源]]
