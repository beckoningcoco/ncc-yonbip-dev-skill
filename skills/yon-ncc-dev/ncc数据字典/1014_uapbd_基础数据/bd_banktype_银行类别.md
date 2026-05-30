# |<<

**银行类别 (bd_banktype / nc.vo.bd.banktype.BankTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/357.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_banktype | 银行类别主键 | pk_banktype | char(20) | √ | 主键 (UFID) |
| 2 | code | 银行类别编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 银行类别名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |