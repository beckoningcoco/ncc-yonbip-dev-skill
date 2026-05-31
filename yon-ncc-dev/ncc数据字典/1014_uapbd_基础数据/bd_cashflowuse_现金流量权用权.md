# |<<

**现金流量权用权 (bd_cashflowuse / nc.vo.bd.cashflow.CashflowUseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/388.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashflowuse | 主键 | pk_cashflowuse | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 分配组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |