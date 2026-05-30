# |<<

**全时当量规则 (hr_fte_rule / nc.vo.hi.FteRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fte_role | 主键 | pk_fte_role | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 3 | pk_period | 期间 | pk_period | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | role_type | 规则类型 | role_type | int |  | FTE规则类型 (fteenum) |  | 0=手工录入; |