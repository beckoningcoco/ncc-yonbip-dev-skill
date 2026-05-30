# |<<

**供应商申请单 (bd_supplier_pf / nc.vo.bd.supplier.pf.SupplierPfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/981.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplier_pf | 供应商申请单主键 | pk_supplier_pf | char(20) | √ | 字符串 (String) |
| 2 | pk_group | 申请集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 申请组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | vbillno | 申请单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 5 | vgoalorg | 目的组织 | vgoalorg | int |  | 目的组织 (destorg) |  | 0=本组织; |