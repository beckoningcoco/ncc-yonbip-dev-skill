# |<<

**被使用的核算账簿 (bd_usedaccbook / nc.vo.bd.accchart.UsedAccBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1150.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usedaccbook | 主键 | pk_usedaccbook | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 财务核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |