---
tags: [影像上传, img_task, appKey, appSecret, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-image-upload-billtype-error.md]
---

# 上传影像报错：根据单据主键获取不到对应单据类型唯一标识

> 上传影像时根据单据主键查询不到单据影像任务。

## 排查

```sql
SELECT * FROM ssc_img.img_task WHERE billid = 'xxx'
```

如果任务已被创建但仍报错，检查调用 OpenAPI 时使用的 `appKey` / `appSecret` 是否正确 — 可能用了开发环境的而非 UAT 环境的。

## 关键概念

- [[img_task]]
- [[影像上传]]
- [[appKey]]
