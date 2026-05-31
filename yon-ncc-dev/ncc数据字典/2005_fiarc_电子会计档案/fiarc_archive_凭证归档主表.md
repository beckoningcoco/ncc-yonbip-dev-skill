# |<<

**凭证归档主表 (fiarc_archive / nc.vo.archive.voucherarchive.ArchiveVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2209.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_archive | 归档主键 | pk_archive | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 财务核算账簿主键 | pk_accountingbook | varchar(20) | √ | 账簿_财务核算账簿 (accountingbook) |
| 3 | year | 会计年 | year | char(4) | √ | 主键 (UFID) |
| 4 | period | 会计期间 | period | char(2) | √ | 主键 (UFID) |
| 5 | state | 归档状态 | state | varchar(50) | √ | 归档状态 (enum) |  | 0=未归档; |