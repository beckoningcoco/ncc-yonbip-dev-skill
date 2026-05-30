---
tags: [超链接, 文本字段, 页面跳转, beforeCellJointQuery, jDiwork, GridModel]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-text-hyperlink-jump.md]
---

# 文本字段超链接跳转页面功能

> 将表格中的文本字段设置为超链接样式，点击后动态跳转到其他单据（跳转地址非固定）。

## 实现步骤

1. **字段类型保持为"文本"**（不要设成超链接类型，后者只能配固定地址）
2. **设置 joinQuery 属性**：
   ```js
   gridModel.setColumnState('LJ', 'bJointQuery', true);
   gridModel.setColumnState('LJ', 'enableJointQuery', true);
   ```
3. **监听超链点击事件**：
   ```js
   gridModel.on('beforeCellJointQuery', (args) => {
     if (args.cellName == 'LJ') {
       jDiwork.openService('serviceCode', { billtype: 'voucher', billno: '...' },
         { title: '标题', data: { id: args.row.LJ, mode: 'browse' }, code: args.row.LJ });
       return false;
     }
   });
   ```

推荐使用 `jDiwork.openService`（可在新页签中打开），而非 `window.open`。

## 关键概念

- [[GridModel]]
- [[beforeCellJointQuery]]
- [[jDiwork.openService]]
