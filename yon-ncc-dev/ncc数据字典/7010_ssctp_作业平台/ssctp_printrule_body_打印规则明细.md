# |<<

**打印规则明细 (ssctp_printrule_body / nc.vo.ssctp.printrule.PrintRuleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5657.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_printrule_body | 主键 | pk_printrule_body | char(20) | √ | 主键 (UFID) |
| 2 | srcsystem | 来源系统 | srcsystem | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | printtemplate | 归档模板 | printtemplate | varchar(50) |  | 字符串 (String) |
| 6 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 7 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 8 | tradetypecode | 交易类型编码 | tradetypecode | varchar(50) |  | 字符串 (String) |