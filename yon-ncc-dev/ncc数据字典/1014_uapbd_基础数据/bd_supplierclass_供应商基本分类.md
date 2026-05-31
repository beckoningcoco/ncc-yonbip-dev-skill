# |<<

**供应商基本分类 (bd_supplierclass / nc.vo.bd.supplier.supplierclass.SupplierclassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/983.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierclass | 主键 | pk_supplierclass | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 供应商基本分类编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 供应商基本分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | parent_id | 上级供应商基本分类 | parent_id | varchar(20) |  | 供应商基本分类 (supplierclass) |
| 7 | mnecode | 助记码 | mnecode | char(50) |  | 字符串 (String) |
| 8 | seq | 内部编码序号 | seq | varchar(20) |  | 字符串 (String) |
| 9 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 10 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |