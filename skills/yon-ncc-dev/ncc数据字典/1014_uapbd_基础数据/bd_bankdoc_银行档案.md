# |<<

**银行档案 (bd_bankdoc / nc.vo.bd.bankdoc.BankdocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/355.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankdoc | 银行档案主键 | pk_bankdoc | char(20) | √ | 主键 (UFID) |
| 2 | code | 银行编码 | code | varchar(40) |  | 字符串 (String) |
| 3 | name | 银行名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | shortname | 简称 | shortname | varchar(200) |  | 字符串 (String) |
| 5 | pk_banktype | 银行类别 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 6 | pk_fundorg | 对应资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | pk_fatherbank | 上级银行 | pk_fatherbank | varchar(20) |  | 银行档案 (bankdoc) |
| 8 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | address | 地址 | address | varchar(20) |  | 地址簿 (address) |
| 10 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 11 | seq | 次序 | seq | varchar(20) |  | 字符串 (String) |
| 12 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |