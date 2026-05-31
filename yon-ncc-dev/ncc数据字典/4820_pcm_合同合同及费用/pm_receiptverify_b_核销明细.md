# |<<

**核销明细 (pm_receiptverify_b / nc.vo.pcm.receiptverify.ReceiptVerifyBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4526.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_b | 核销明细主键 | pk_verify_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_financeorg | 财务组织版本信息 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_financeorg_v | 财务组织 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_invoice | 发票主键 | pk_invoice | varchar(50) |  | 字符串 (String) |
| 8 | invoice_code | 发票单据编码 | invoice_code | varchar(50) |  | 字符串 (String) |
| 9 | invoice_number | 发票号码 | invoice_number | varchar(8) |  | 字符串 (String) |
| 10 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | pk_contr | 发票合同编码 | pk_contr | varchar(50) |  | 字符串 (String) |
| 12 | invoice_mny | 发票无税核销金额 | invoice_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 13 | invoice_mny_group | 发票无税核销金额（集团币） | invoice_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 14 | invoice_mny_global | 发票无税核销金额（全局币） | invoice_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 15 | invoice_taxmny | 发票核销金额 | invoice_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 16 | invoice_taxmny_group | 发票核销金额（集团币） | invoice_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 17 | invoice_taxmny_global | 发票核销金额（全局币） | invoice_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 18 | invoice_tax | 发票核销税额 | invoice_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 20 | pk_srcbillrowid | 来源单据行主键 | pk_srcbillrowid | varchar(50) |  | 字符串 (String) |
| 21 | tabcode | 来源表体页签 | tabcode | varchar(50) |  | 字符串 (String) |
| 22 | src_bill_type | 单据类型 | src_bill_type | varchar(20) |  | 单据类型 (BilltypeVO) |
| 23 | src_bill_code | 单据编码 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 24 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 25 | src_transi_type | 交易类型编码 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 26 | bill_supplier | 来源单据供应商 | bill_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 27 | pk_billcontr | 业务单据合同编码 | pk_billcontr | varchar(20) |  | 付款合同 (contractheadvo) |
| 28 | pk_billcontr_b | 业务合同子表编码 | pk_billcontr_b | varchar(50) |  | 字符串 (String) |
| 29 | contrtype | 来源合同类型 | contrtype | varchar(50) |  | 字符串 (String) |
| 30 | pk_material | 物料多版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 31 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 32 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 33 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 34 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 35 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 36 | comments | 摘要 | comments | varchar(50) |  | 字符串 (String) |
| 37 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 38 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |