# |<<

**开票申请单 (sscivm_ivapplication / nc.vo.sscivm.ivsale.IVApplicationHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5555.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ivapplication | 主键 | pk_ivapplication | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 申请组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 申请组织版本 | pk_org_v | varchar(20) | √ | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_dept | 申请部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 6 | pk_billtype | 单据类型 | pk_billtype | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 7 | pk_tradetype | 交易类型 | pk_tradetype | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 8 | billno | 单据号 | billno | varchar(50) | √ | 字符串 (String) |
| 9 | src_pkbusibill | 业务单据主键 | src_pkbusibill | varchar(50) |  | 字符串 (String) |
| 10 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | src_tradetype | 来源交易类型 | src_tradetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | src_billno | 来源单据编号 | src_billno | varchar(50) |  | 字符串 (String) |
| 13 | fplx | 发票类型 | fplx | int | √ | 发票类型 (invoicetype) |  | 1=增值税电子普通发票; |