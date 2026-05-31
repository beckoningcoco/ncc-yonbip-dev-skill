# |<<

**委托借款放款版本 (cdmc_consignfinancepay_v / nc.vo.cdmc.ccm.consigndebitfinancepay.version.ConsignDebitFinancepayVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1336.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 主键 | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_financepay | 放款主键 | pk_financepay | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | vbillno | 放款编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | busistatus | 单据状态 | busistatus | int |  | 放款单状态 (ConsignFinancepayBillStatusEnum) |  | -1=待提交; |