# |<<

**收票登记转单明细 (pm_receipttsf_b / nc.vo.pcm.receiptregister.ReceiptTransferBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4524.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receipttsf_b | 收票登记转单子表主键 | pk_receipttsf_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | src_pk_bill | 来源单据主表主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 6 | src_bill_type | 来源单据类型 | src_bill_type | varchar(50) |  | 字符串 (String) |
| 7 | src_bill_typeid | 来源单据类型id | src_bill_typeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | src_bill_code | 来源单据号 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 9 | src_transi_type | 来源交易类型 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 10 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | pk_material_v | 物料编码多版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 13 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 14 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 15 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 16 | accdif_money | 无税结算额 | accdif_money | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 17 | accdif_taxmny | 含税结算额 | accdif_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 18 | invoice_mny | 已票金额 | invoice_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 19 | qual_taxmny | 质保金 | qual_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 20 | prepaid_mny | 冲预付 | prepaid_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 21 | contract_id | 合同主键 | contract_id | varchar(50) |  | 字符串 (String) |
| 22 | contract_body_id | 合同表体行主键 | contract_body_id | varchar(50) |  | 字符串 (String) |
| 23 | contract_name | 合同 | contract_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 24 | contract_code | 合同编号 | contract_code | varchar(50) |  | 字符串 (String) |
| 25 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 26 | nosubtaxrate | 不可抵扣率 | nosubtaxrate | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 27 | material_type_id | 材料结算标识 | material_type_id | int |  | 材料结算页签 (MaterialaccTypeEnum) |  | 1=甲供材; |