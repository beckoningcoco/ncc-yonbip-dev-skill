---
tags: [翻译, 用户, BipUser, 编码转ID, QuerySchema, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-translate-user.md]
---

# 旗舰版翻译用户

> 通过用户编码查询 BIP 用户信息（ID、OrgId）。

## 代码

```java
QuerySchema querySchema = QuerySchema.create()
    .addSelect("id").addSelect("orgId")
    .appendQueryCondition(QueryCondition.name("code").in(applyUser));
List<IBillDO> billList = billQueryRepository.queryBySchema("base.user.BipUser", querySchema);
if (billList == null || billList.isEmpty()) {
    throw new RuntimeException("Bip系统中不存在用户编码为 " + applyUser + " 的用户信息。");
}
```

## 关键概念

- [[翻译用户]]
- [[BipUser]]
- [[QuerySchema]]
