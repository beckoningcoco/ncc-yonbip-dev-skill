# |<<

**能力素质等级组 (hr_cppe_rule / nc.vo.cp.graderule.GradeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2660.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scorule | 等级主键 | pk_scorule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | name | 等级组名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | sourcetype | 数据源类型 | sourcetype | int |  | 能力绩效类型 (capatype) |  | 0=能力素质; |