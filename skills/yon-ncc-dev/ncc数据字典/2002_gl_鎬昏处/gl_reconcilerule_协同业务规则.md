# |<<

**协同业务规则 (gl_reconcilerule / nc.vo.gl.reconcile.rule.ReconcileRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2457.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilerule | 协同业务规则标识 | pk_reconcilerule | char(20) | √ | 主键 (UFID) |
| 2 | code | 协同业务编码 | code | varchar(40) |  | 字符串 (String) |
| 3 | name | 协同业务名称 | name | varchar(100) |  | 字符串 (String) |
| 4 | startdate | 启用日期 | startdate | char(19) |  | 日期 (UFDate) |
| 5 | dealmethod | 处理方式 | dealmethod | char(1) |  | 处理方式 (ReconcileRuleDealMethod) |  | A=自动; |