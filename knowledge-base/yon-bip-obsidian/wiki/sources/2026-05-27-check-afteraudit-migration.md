---
tags: [审核后函数, 扩展配置, 迁移排查, SQL, uimeta_extension_tenant, hpa_extcode, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-check-afteraudit-migration.md]
---

# 排查审批后函数是否正确迁移到测试环境

> 收款单审核动作扩展的函数在 UAT 环境未生效，通过 SQL 排查扩展配置是否迁移。

## 排查 SQL

```sql
-- 查看扩展配置
SELECT * FROM iuap_metadata_service.uimeta_extension_tenant
WHERE biz_object = 'collection' AND extension_point_code = 'afterAudit' AND dr = 0;

-- 查看扩展函数代码
SELECT * FROM iuap_yonbuilder_service.hpa_extcode
WHERE id = (SELECT script_id FROM ...);

-- 查看扩展函数内容
SELECT * FROM iuap_yonbuilder_service.hpa_extcode_content
WHERE fk_ext_code = (SELECT script_id FROM ...);
```

## 关键概念

- [[uimeta_extension_tenant]]
- [[hpa_extcode]]
- [[扩展迁移排查]]
