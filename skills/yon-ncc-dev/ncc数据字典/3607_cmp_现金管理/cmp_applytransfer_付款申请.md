# |<<

**付款申请 (cmp_applytransfer / nc.vo.cmp.apply.ApplyTransferVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applytransfer | 主键 | pk_applytransfer | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 付款申请组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_financeorg | 付款财务组织 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(20) |  | 字符串 (String) |
| 5 | pk_srcbill_b | 来源单据表体主键 | pk_srcbill_b | varchar(20) |  | 字符串 (String) |
| 6 | pk_srcbilltypeid | 来源单据类型 | pk_srcbilltypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | srcbilltypecode | 来源单据类型编码 | srcbilltypecode | varchar(50) |  | 字符串 (String) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_financeorg_v | 付款财务组织多版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_org_v | 申请付款组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 11 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | vbillno | 单据号 | vbillno | varchar(50) |  | 字符串 (String) |
| 13 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 14 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 15 | billtypecode | 单据编码 | billtypecode | varchar(50) |  | 字符串 (String) |
| 16 | busistatus | 单据状态 | busistatus | varchar(50) |  | 字符串 (String) |
| 17 | vbillstatus | 申请状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |