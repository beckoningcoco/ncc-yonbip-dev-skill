# |<<

**供应商升级 (bd_supupgrade / nc.vo.bd.supplier.SupUpgradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/991.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supupgrade | 主键 | pk_supupgrade | char(20) | √ | 主键 (UFID) |
| 2 | sourceorg | 源供应商所属组织 | sourceorg | varchar(20) |  | 组织 (org) |
| 3 | sourcesupcode | 源供应商编码 | sourcesupcode | varchar(40) |  | 字符串 (String) |
| 4 | sourcesupname | 源供应商名称 | sourcesupname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | sourcesup | 源供应商 | sourcesup | image |  | BLOB (BLOB) |
| 6 | destsup | 目的供应商 | destsup | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | destcode | 目的供应商编码 | destcode | varchar(40) |  | 字符串 (String) |
| 8 | destname | 目的供应商名称 | destname | varchar(200) |  | 多语文本 (MultiLangText) |
| 9 | destorg | 目的供应商所属组织 | destorg | varchar(20) |  | 组织 (org) |
| 10 | operator | 操作人 | operator | varchar(20) |  | 用户 (user) |
| 11 | operationdate | 操作日期 | operationdate | char(19) |  | 日期 (UFDate) |