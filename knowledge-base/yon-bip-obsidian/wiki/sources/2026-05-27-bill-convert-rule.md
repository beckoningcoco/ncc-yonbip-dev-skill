---
tags: [单据转换规则, BusinessConvertService, 推单, ConvertParam, ConvertedBill, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bill-convert-rule.md]
---

# 旗舰版单据转换规则获取下游单据对象

> 通过 BusinessConvertService 将上游单据转换为下游单据对象，含推单逻辑和 VO 拼装。

## 核心流程

1. **查询上游单据**：`billQueryRepository.queryByIDs` 获取上游数据
2. **执行转换**：
   ```java
   ConvertParam convertParam = new ConvertParam();
   convertParam.setMakeBillRuleCode("CZHT001");  // 转换规则编码
   convertParam.setBillNum("RentalContract");     // 上游业务对象编码
   convertParam.setDomain("ctdevelopengine");
   convertParam.setSourceBills(docs);
   DomainMakeBillRuleModel flowRules = businessConvertService.queryMakeBillRule(convertParam);
   ConvertResult result = businessConvertService.convert(convertParam, flowRules);
   ```
3. **解锁**：推单会根据上游单据 ID 加锁（YmsLockFactory），finally 中解锁
4. **取出目标数据**：`convertResult.getConvertedBillList().getTargetData()`
5. **拼装 VO**：使用 `BizObject.fromMap` 组装下游单据对象

## 关键概念

- [[BusinessConvertService]]
- [[ConvertParam]]
- [[推单]]
- [[BizObject]]
