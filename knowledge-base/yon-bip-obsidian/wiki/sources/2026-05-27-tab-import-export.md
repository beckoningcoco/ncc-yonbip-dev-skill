---
tags: [导入导出, 页签, cmdFTMXTempExport, cmdFTMXTempImport, 动作管理, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-tab-import-export.md]
---

# 旗舰版单据页签增加导入导出功能

> 在单据页签上配置导入导出按钮和动作。

## 配置步骤

1. **加按钮**：在 UI 模板设计器中添加导入/导出按钮
2. **配置导出动作**：
   - 命令：`cmdFTMXTempExport`
   - 请求方式：`openexportworkbench`，POST
   - 扩展参数：`{"supportUri": "实体uri", "exportType": "4"}`
3. **配置导入动作**：
   - 命令：`cmdFTMXTempImport`
   - 请求方式：`uploadandrender`，POST
   - 请求地址：`/bill/editImport`
   - 扩展参数：`{"supportUri": "实体uri"}`
4. **绑定按钮**：将动作绑定到按钮

命令、请求方式、请求地址固定，只修改 uri。

## 关键概念

- [[导入导出]]
- [[动作管理]]
- [[UI 模板设计器]]
