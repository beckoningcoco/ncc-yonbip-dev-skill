# |<<

**委托借款还本 (cdmc_consignrepayprcpl / nc.vo.cdmc.ccm.consigndebitrepayprcpl.ConsignDebitRepayPrcplVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1368.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayprcpl | 主键 | pk_repayprcpl | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_financepay | 放款编号 | pk_financepay | varchar(20) |  | 委托借款放款 (ConsignDebitFinancepayVO) |
| 6 | vbillno | 还本编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 8 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 10 | busistatus | 单据状态 | busistatus | int |  | 委托借款还本单据状态 (ConsignDebitPrcplStatusEnum) |  | 0=待提交; |