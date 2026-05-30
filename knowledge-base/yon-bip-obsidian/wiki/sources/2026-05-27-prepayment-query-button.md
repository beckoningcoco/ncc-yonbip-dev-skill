---
tags: [页签按钮, 模态框, DynamicProxy, 数据回显, parentViewModel, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-prepayment-query-button.md]
---

# 核销借款/预付款页签增加查询按钮

> 页签上增加查询按钮，通过模态框弹窗展示借款/预付款数据，选中后回显到父页面页签。

## 实现步骤

1. **页签新增按钮**：在 UI 模板中为页签添加按钮
2. **新建列表模态框**：允许跨服务域（先建实体，再建页面，不需建表）
3. **父页面打开模态框**：`cb.loader.runCommandLine` 跳转，设置 `templateType: 'modal'`
4. **模态框页面脚本**：
   - `dataSourceMode: 'local'` 阻止默认查询
   - DynamicProxy 调用自定义 Controller 获取数据
5. **数据回显**：
   ```js
   var parentGridModel = viewModel.getCache('parentViewModel').getGridModel('ArapCollectLoanCavVOList');
   parentGridModel.insertRows(insertIndex, needInsertRows);
   viewModel.communication({ type: 'modal', payload: { data: false } });
   ```

## 关键概念

- [[parentViewModel]]
- [[模态框]]
- [[数据回显]]
- [[DynamicProxy]]
