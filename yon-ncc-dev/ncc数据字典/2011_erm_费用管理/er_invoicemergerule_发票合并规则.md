# |<<

**发票合并规则 (er_invoicemergerule / nc.vo.erm.invoicemergerule.ErmInvoiceMergeRule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1904.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_erminvoicemerge | 主键 | pk_erminvoicemerge | char(20) | √ | 主键 (UFID) |
| 2 | code | 规则编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 规则名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | djlxbm | 交易类型编码 | djlxbm | varchar(50) |  | 字符串 (String) |
| 7 | pk_tradtypeid | 单据类型 | pk_tradtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | fplx | 发票类型 | fplx | varchar(50) |  | 发票类型 (ErmInvoiceType) |  | invoice001=增值税普通发票; |