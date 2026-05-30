---
tags: [规则链, IYpdCommonRule, 命令管理, 扩展, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-rule-chain.md]
---

# 规则链扩展规则写法

> 在命令管理（动作页签）中新增规则链规则，实现 IYpdCommonRule 接口。

## 配置路径

应用构建 → 页面建模 → 命令管理 → 动作页签 → 新增规则

规则命名：无 `@Component("xxx")` 时填类名首字母小写，有注解则填注解名。

## 规则类示例

```java
@Component("afterAudit2jhxRule")
public class AfterAudit2jhxRule implements IYpdCommonRule {
    @Override
    public Object execute(RulCtxVO rulCtxVO, Map<String, Object> params) {
        BillContext billContext = new BillContext(rulCtxVO.getBillnum(), rulCtxVO.getFullname());
        List<BizObject> bills = CommonRuleUtils.getBills(billContext, params);
        // 执行业务逻辑
        return new RuleExecuteResult();
    }
}
```

或继承 `AbstractCommonRule`。部署后直接可用，无需额外配置。

## 关键概念

- [[规则链]]
- [[IYpdCommonRule]]
- [[命令管理]]
