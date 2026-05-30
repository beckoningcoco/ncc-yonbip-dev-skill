# |<<

**客商 (bd_cust_supplier / nc.vo.bd.cust.CustSupplierVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/430.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cust_sup | 客商主键 | pk_cust_sup | char(20) | √ | 字符串 (String) |
| 2 | code | 客商编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 客商名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | taxpayerid | 纳税人登记号 | taxpayerid | varchar(20) |  | 字符串 (String) |
| 7 | custsupprop | 客商属性 | custsupprop | int |  | 客商属性 (custsupprop) |  | 0=外部单位; |