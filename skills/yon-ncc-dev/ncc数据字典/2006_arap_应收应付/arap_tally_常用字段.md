# |<<

**常用字段 (arap_tally / nc.vo.arap.tally.TallyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/196.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tally | 主键 | pk_tally | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | accyear | 会计年度 | accyear | char(4) |  | 字符串 (String) |
| 6 | accperiod | 会计期间 | accperiod | char(7) |  | 字符串 (String) |
| 7 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 8 | brief | 摘要 | brief | varchar(20) |  | 常用摘要 (summary) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | objtype | 往来对象 | objtype | int |  | 往来对象 (objtype) |  | 0=客户; |