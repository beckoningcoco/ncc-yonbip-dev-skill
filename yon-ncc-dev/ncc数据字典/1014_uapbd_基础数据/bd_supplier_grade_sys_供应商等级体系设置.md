# |<<

**供应商等级体系设置 (bd_supplier_grade_sys / nc.vo.bd.supplier.suppliergradesys.SupplierGradeSysVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_suppliergrade | 供应商等级体系设置主键 | pk_suppliergrade | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 等级体系编码 | code | varchar(40) | √ | 字符串 (String) |
| 5 | name | 等级体系名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | remarks | 备注 | remarks | varchar(200) |  | 备注 (Memo) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |