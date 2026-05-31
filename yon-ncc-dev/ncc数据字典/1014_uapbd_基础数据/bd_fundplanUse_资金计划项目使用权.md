# |<<

**资金计划项目使用权 (bd_fundplanUse / nc.vo.bd.fundplan.FundPlanUseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/852.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundplanuse | 主键 | pk_fundplanuse | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |