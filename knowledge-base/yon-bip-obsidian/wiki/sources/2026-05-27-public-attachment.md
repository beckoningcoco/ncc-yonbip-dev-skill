---
tags: [公共附件, 文件上传, 单据扩展, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-public-attachment.md]
---

# 旗舰版文件上传到公共附件组件

> 当单据使用了公共附件套件但业务对象上无附件字段时，使用文件上传 API 处理。

## 场景

单据（如应收发票）页面上使用了公共附件组件，但业务对象上没有 `attachment` 相关字段来存储 `businessId`。

## 方案

根据集团老师建议，使用文件上传 API（`/yonbip/uspace/iuap-apcom-file/rest/v1/file`）处理文件，而非依赖业务对象的附件字段。

## 关键概念

- [[公共附件组件]]
- [[文件上传 API]]
- [[单据扩展]]
