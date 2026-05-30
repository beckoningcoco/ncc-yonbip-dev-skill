---
tags: [物料查询, 自定义特征, 弹性字段, extendData, 组织优先级, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-query-custom-feature.md]
---

# 旗舰版查询物料业务信息上的自定义特征值

> 查询物料业务信息（产品明细）上的自定义特征值（弹性字段），按组织优先级取值。

## 核心逻辑

1. **查询 global00 业务单元 ID**（企业级物料的 orgId）
2. **查询所有物料的管理组织**：`pc.product.Product` 获取每个物料 code 对应的 orgId
3. **OR 查询三种组织**：企业级（global00）、当前组织、物料自身管理组织
4. **取值优先级**：物料自身管理组织 > 当前组织 > 企业级

## 读取自定义特征

从 `extendData.productDetail_productExtendCharacterDef` 中获取：
```java
Map<String, Object> extendData = (Map<String, Object>) billDO.getAttrValue("extendData");
Map<String, Object> def = (Map<String, Object>) extendData.get("productDetail_productExtendCharacterDef");
BigDecimal value = new BigDecimal(def.get("MGPM07").toString());
```

## 关键概念

- [[弹性字段]]
- [[extendData]]
- [[物料管理组织]]
