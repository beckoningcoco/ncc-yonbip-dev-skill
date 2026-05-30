---
tags: [页签导入导出, xlsx, 文件选择, 批量翻译, gridModel, 页面脚本, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-tab-custom-import-export.md]
---

# 页面脚本实现页签导入导出

> 通过页面脚本实现页签的自定义导入导出：Excel 读取、档案编码翻译为 ID、数据插入 GridModel。

## 导入流程

1. 动态加载 xlsx.js 库
2. 创建隐藏文件选择框，触发 Excel 选择
3. 读取 Excel 解析工作表数据（跳过表头）
4. 收集参照字段的编码 → 调用后端 API 批量翻译为 ID
5. 翻译后的数据插入 `gridModel.insertRows()`

## 关键配置

```js
const TEMPLATE_FIELD_MAP = { /* Excel字段 → 系统字段 */ };
const REFERENCE_ARCHIVE_TYPE = { /* 档案类型映射 */ };
const REFERENCE_ARCHIVE_DOMAIN = { /* 领域映射 */ };
```

## 后端批量翻译示例

根据不同档案类型调用 `ObjectStore.queryByYonQL` 将名称翻译为 ID。

## 导出按钮

动作配置：命令 `cmdTempexport`，请求方式 `tempexport`。

## 关键概念

- [[xlsx 库]]
- [[页签导入导出]]
- [[批量翻译]]
- [[GridModel]]
