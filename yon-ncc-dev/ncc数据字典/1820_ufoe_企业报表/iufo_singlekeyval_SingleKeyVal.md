# |<<

**SingleKeyVal (iufo_singlekeyval / nc.vo.iufo.mailrule.SingleKeyValVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3507.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_keyval | 主键 | pk_keyval | char(20) | √ | 主键 (UFID) |
| 2 | keyname | 关键字名称 | keyname | varchar(36) |  | 关键字 (KeywordVO) |
| 3 | keyval | 关键字值 | keyval | varchar(50) |  | 字符串 (String) |