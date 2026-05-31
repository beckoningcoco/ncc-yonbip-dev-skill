# |<<

**客户基本信息 (bd_customer / nc.vo.bd.cust.CustomerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/444.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_customer | 客户基本信息主键 | pk_customer | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | code | 客户编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 客户名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | shortname | 客户简称 | shortname | varchar(200) |  | 字符串 (String) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | pk_custclass | 客户基本分类 | pk_custclass | char(20) | √ | 客户基本分类 (custclass) |
| 9 | pk_areacl | 地区分类 | pk_areacl | varchar(20) |  | 地区分类 (areaclass) |
| 10 | issupplier | 供应商 | issupplier | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 11 | pk_supplier | 对应供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | custprop | 客户类型 | custprop | smallint | √ | 客户类型 (custprop) | 0 | 0=外部单位; |