# |<<

**账簿归档 (fiarc_accbookarchive / nc.vo.archive.accbookarchive.ArchiveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2207.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accountarchive | 账簿归档主键 | pk_accountarchive | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 账簿主键 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | code | 账簿编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 账簿名称 | name | varchar(300) |  | 字符串 (String) |
| 5 | type | 账簿类型 | type | varchar(50) |  | 账簿类型 (AccountType) |  | 0=总账; |