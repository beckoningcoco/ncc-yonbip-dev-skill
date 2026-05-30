# |<<

**供应商基本信息 (bd_supplier / nc.vo.bd.supplier.SupplierVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/978.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplier | 供应商档案主键 | pk_supplier | char(20) | √ | 主键 (UFID) |  | [ , 0] |
| 2 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | code | 供应商编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 供应商名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | shortname | 供应商简称 | shortname | varchar(200) |  | 字符串 (String) |
| 7 | mnecode | 助记码 | mnecode | varchar(50) |  | 字符串 (String) |
| 8 | trade | 所属行业 | trade | varchar(20) |  | 经济行业(自定义档案) (Defdoc-SYS005_0xx) |
| 9 | pk_supplier_main | 上级供应商 | pk_supplier_main | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | supprop | 供应商类型 | supprop | smallint | √ | 供应商类型 (supprop) | 0 | 0=外部单位; |