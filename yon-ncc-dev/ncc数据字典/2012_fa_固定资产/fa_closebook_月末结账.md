# |<<

**月末结账 (fa_closebook / nc.vo.fa.closebook.CloseBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2002.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closebook | 主键 | pk_closebook | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_accbook | 资产账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | accyear | 年度 | accyear | varchar(10) |  | 字符串 (String) |
| 6 | period | 期间 | period | varchar(10) |  | 字符串 (String) |
| 7 | closebook_flag | 是否结账 | closebook_flag | int |  | 整数 (Integer) |
| 8 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 9 | pk_closebookuser | 结账人 | pk_closebookuser | varchar(20) |  | 用户 (user) |
| 10 | closebook_date | 结账日期 | closebook_date | char(19) |  | 日期 (UFDate) |