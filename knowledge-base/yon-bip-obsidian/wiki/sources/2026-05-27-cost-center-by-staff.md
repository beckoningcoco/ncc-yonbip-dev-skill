---
tags: [成本中心, 员工编码, 组织编码, BaseInfoUtils, userCostCenter, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-cost-center-by-staff.md]
---

# 根据员工编码和组织编码自动带出成本中心

> 通过员工编码和组织编码自动查询并带出成本中心，优先获取默认成本中心。

## 实现

```java
if (StringUtils.isNotBlank(cfinacecostcenter)) {
    BizObject costCenter = BaseInfoUtils.queryByCode(MetaDataEnum.CostCenter, "id", cfinacecostcenter);
    dto.setCfinacecostcenter(costCenter.getId().toString());
} else {
    String costCenterByStaffCode = baseDocService.getCostCenterByStaffCode(staffCode, orgCode, null);
}
```

## getCostCenterByStaffCode 逻辑

1. 通过 `BaseInfoUtils.queryListByMap(MetaDataEnum.userCostCenter, ...)` 查询员工成本中心列表
2. 优先返回 `isDefault=true` 的成本中心
3. 无默认时返回第一个成本中心

## 关键概念

- [[成本中心]]
- [[userCostCenter]]
- [[BaseInfoUtils]]
