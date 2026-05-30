# |<<

**客户升级 (bd_custupgrade / nc.vo.bd.cust.upgrade.CustUpgradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/452.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custupgrade | 客户升级信息主键 | pk_custupgrade | char(20) | √ | 主键 (UFID) |
| 2 | sourceorg | 源客户所属组织 | sourceorg | varchar(20) |  | 组织 (org) |
| 3 | sourcecode | 源客户编码 | sourcecode | varchar(40) |  | 字符串 (String) |
| 4 | sourcename | 源客户名称 | sourcename | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | sourcecust | 源客户 | sourcecust | image |  | BLOB (BLOB) |
| 6 | destcust | 目的客户 | destcust | varchar(20) |  | 客户基本信息 (customer) |
| 7 | destorg | 目的客户所属组织 | destorg | varchar(20) |  | 组织 (org) |
| 8 | destcode | 目的客户编码 | destcode | varchar(40) |  | 字符串 (String) |
| 9 | destname | 目的客户名称 | destname | varchar(200) |  | 多语文本 (MultiLangText) |
| 10 | operator | 操作人 | operator | varchar(20) |  | 用户 (user) |
| 11 | operationdate | 操作日期 | operationdate | char(19) |  | 日期 (UFDate) |