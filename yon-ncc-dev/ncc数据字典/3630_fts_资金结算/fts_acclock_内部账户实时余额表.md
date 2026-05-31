# |<<

**内部账户实时余额表 (fts_acclock / nc.vo.fts.account.AccLockVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2293.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acclock | 主键 | pk_acclock | char(20) | √ | 主键 (UFID) |
| 2 | pk_account | 账户 | pk_account | varchar(20) |  | 字符串 (String) |
| 3 | balance | 余额 | balance | decimal(31, 8) |  | 数值 (UFDouble) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |