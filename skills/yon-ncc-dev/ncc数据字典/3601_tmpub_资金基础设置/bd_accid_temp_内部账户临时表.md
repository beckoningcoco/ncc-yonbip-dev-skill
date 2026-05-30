# |<<

**内部账户临时表 (bd_accid_temp / nc.vo.tam.account.accid.AccidTempVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/309.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accid | 主键 | pk_accid | char(20) | √ | 主键 (UFID) |
| 2 | accclass | 账户分类 | accclass | int |  | 内部账户分类 (accclass) |  | 0=个人; |