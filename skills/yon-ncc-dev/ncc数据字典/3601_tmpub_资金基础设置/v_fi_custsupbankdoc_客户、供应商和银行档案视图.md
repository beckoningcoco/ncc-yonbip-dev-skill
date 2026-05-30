# |<<

**客户、供应商和银行档案视图 (v_fi_custsupbankdoc / nc.vo.cdm.cumandoc.customerSupplierBankdoc)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6309.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 客户、供应商或银行档案主键 | pk | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | viewname | 名称 | viewname | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 组织主键 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | prop | 内外部属性 | prop | varchar(50) |  | 内外部属性 (csprop) |  | inner=内部客商; |