---
tags: [物料校验, 组织权限, 分配范围, product_apply_range, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-check-material-org.md]
---

# 旗舰版校验当前物料是否在当前组织下可用

> 校验物料是否在当前组织下有使用权限，通过查询物料分配范围表确认。

## 核心逻辑

通过 SQL 关联查询物料分配范围相关表，检查指定组织是否在物料的分配范围内：

```sql
SELECT ... FROM product
LEFT JOIN product_apply_range_group ON ...
LEFT JOIN pub_org_group ON ...
LEFT JOIN pub_org_group_detail ON ...
WHERE T0.code IN (...) AND T4.org_id IN (...)
```

## 涉及表

| 表 | 说明 |
|----|------|
| `iuap_apdoc_coredoc.product` | 物料主表 |
| `iuap_apdoc_coredoc.product_apply_range_group` | 物料分配范围-组织组关联 |
| `iuap_apdoc_coredoc.pub_org_group` | 组织组 |
| `iuap_apdoc_coredoc.pub_org_group_detail` | 组织组明细（含 org_id） |
| `iuap_apdoc_coredoc.productdetail` | 物料明细 |

未分配物料的物料会抛出 BusinessException 提示。

## 关键概念

- [[物料分配范围]]
- [[组织权限]]
- [[product_apply_range]]
