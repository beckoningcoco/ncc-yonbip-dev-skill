---
tags: [BillContext, 保存接口, UI元数据, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-billcontext-null.md]
---

# 构建BillContext为空

> 代码中调用客开节点保存接口报"构建BillContext为空，请检查UI元数据定义"。

## 解决

检查调用地址的参数是否正确，调整后即可解决。常见原因是 URL 中的参数（如 `serviceCode`、`busiObj`、`billnum`）传错或遗漏。

## 关键概念

- [[BillContext]]
- [[保存接口]]
- [[UI 元数据]]
