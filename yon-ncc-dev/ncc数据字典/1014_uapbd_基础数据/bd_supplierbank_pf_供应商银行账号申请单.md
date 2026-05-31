# |<<

**供应商银行账号申请单 (bd_supplierbank_pf / nc.vo.bd.supplier.supplierbankpf.SupplierBankPfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/982.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplierbankpf | 供应商银行账号申请单主键 | pk_supplierbankpf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 申请集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 申请组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | billno | 单据号 | billno | varchar(50) | √ | 字符串 (String) |
| 5 | targetorg | 供应商所属组织 | targetorg | int | √ | 供应商所属组织 (targetorg) |  | 0=本组织; |