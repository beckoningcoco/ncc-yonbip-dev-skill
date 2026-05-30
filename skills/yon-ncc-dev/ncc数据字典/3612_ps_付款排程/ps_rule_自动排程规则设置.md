# |<<

**自动排程规则设置 (ps_rule / nc.vo.ps.rule.RuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4690.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 主键 | pk_rule | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | useagemny | 可用资金 | useagemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | prioritydegree | 计划项目优先级别高于 | prioritydegree | int |  | 整数 (Integer) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |