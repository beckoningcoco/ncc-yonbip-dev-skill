# |<<

**首要规则 (ps_primaryrule / nc.vo.ps.rule.PrimaryRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4689.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_primaryrule | 主键 | pk_primaryrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_doc | 档案主键 | pk_doc | varchar(20) |  | 资金计划项目 (fundplan) |
| 3 | rate | 排程比率 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | memo | 说明 | memo | varchar(181) |  | 字符串 (String) |
| 5 | pk_rule | 主表主键 | pk_rule | char(20) |  | 主键 (UFID) |