# |<<

**等级信息 (bd_supplier_grade / nc.vo.bd.supplier.suppliergradesys.SupplierGradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/979.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_grade_info | 等级信息主键 | pk_grade_info | char(20) | √ | 主键 (UFID) |
| 2 | pk_suppliergrade | 供应商等级体系主键 | pk_suppliergrade | varchar(20) | √ | 供应商等级体系设置 (supplier_grade_sys) |
| 3 | suppliergrade | 等级 | suppliergrade | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | supstatus | 状态 | supstatus | int |  | 状态信息 (supStatus) |  | 1=合格; |