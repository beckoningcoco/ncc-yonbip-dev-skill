# |<<

**次要规则 (ps_minorrule / nc.vo.ps.rule.MinorRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4673.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_minorrule | 主键 | pk_minorrule | char(20) | √ | 主键 (UFID) |
| 2 | pk_doc | 档案主键 | pk_doc | varchar(20) |  | 客商 (custsupplier) |
| 3 | result | 备注 | result | varchar(181) |  | 字符串 (String) |
| 4 | arrangerate | 排程比率 | arrangerate | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | pk_rule | 主表主键 | pk_rule | char(20) |  | 主键 (UFID) |