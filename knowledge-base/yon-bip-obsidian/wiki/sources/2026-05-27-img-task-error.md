---
tags: [问题处理, 影像上传, img_task, appKey]
created: 2026-05-27
updated: 2026-05-27
sources: [问题处理/上传影像报错根据单据主键获取不到对应单据类型唯一标识]
---

# 上传影像报错：根据单据主键获取不到对应单据类型

## 排查

```sql
SELECT * FROM ssc_img.img_task WHERE billid = '单据ID';
```

如果任务已创建但仍报错，检查调用 OpenAPI 时使用的 `appKey`/`appSecret` 是否正确（是否错用了开发环境的而非 UAT/生产环境）。
