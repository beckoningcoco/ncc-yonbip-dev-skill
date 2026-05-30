---
tags: [翻译, 业务单元, IOrgUnitQueryService, 编码转ID, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-translate-org-unit.md]
---

# 旗舰版翻译业务单元

> 通过编码翻译业务单元（OrgUnit），使用 IOrgUnitQueryService 将编码转换为 ID。

## 根据编码批量获取 ID

```java
@Resource
private IOrgUnitQueryService orgUnitQueryService;

List<String> idList = orgUnitQueryService.listIdsByCodes(tenantId, Collections.singletonList(orgId), Collections.singletonList(1));
if (CollectionUtils.isNotEmpty(idList)) {
    reqBody.replace("orgId", idList.get(0));
}
```

## 根据编码查询会计主体

```java
ConditionDTO conditionDTO = new ConditionDTO();
conditionDTO.andCodeIn(Collections.singletonList(accentity));
List<OrgUnitDTO> queryList = orgUnitQueryService.getByCondition(tenantId, conditionDTO);
reqBody.put("accentity", queryList.get(0).getId());
```

## 关键概念

- [[IOrgUnitQueryService]]
- [[业务单元翻译]]
- [[翻译档案]]
