# |<<

**收票登记明细 (pm_receiptreg_b / nc.vo.pcm.receiptregister.ReceiptRegisterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4522.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptreg_b | 收票登记子表主键 | pk_receiptreg_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织版本信息 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 6 | src_pk_bill | 来源单据主表主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 7 | src_pk_bill_b | 来源单据子表主键 | src_pk_bill_b | varchar(50) |  | 字符串 (String) |
| 8 | src_bill_type | 来源单据类型 | src_bill_type | varchar(50) |  | 字符串 (String) |
| 9 | src_contr_type | 上游单据来源合同类型 | src_contr_type | varchar(50) |  | 字符串 (String) |
| 10 | src_bill_typeid | 来源单据类型id | src_bill_typeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | src_bill_code | 来源单据号 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 12 | src_transi_type | 来源交易类型 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 13 | contract_name | 合同 | contract_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 14 | contract_id | 合同主键 | contract_id | varchar(50) |  | 字符串 (String) |
| 15 | contract_body_id | 合同表体行主键 | contract_body_id | varchar(50) |  | 字符串 (String) |
| 16 | contract_code | 合同编号 | contract_code | varchar(50) |  | 字符串 (String) |
| 17 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 18 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 19 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 20 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 21 | pk_material_v | 物料编码多版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 22 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 23 | accdif_money | 无税结算额 | accdif_money | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 24 | accdif_money_group | 无税结算额(集团币) | accdif_money_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 25 | accdif_money_global | 无税结算额(全局币) | accdif_money_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 26 | accdif_taxmny | 含税结算额 | accdif_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 27 | accdif_taxmny_group | 含税结算额(集团币) | accdif_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 28 | accdif_taxmny_global | 含税结算额(全局币) | accdif_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 29 | invoice_mny | 已票金额 | invoice_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 30 | invoice_mny_group | 已票金额(集团币) | invoice_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 31 | invoice_mny_global | 已票金额(全局币) | invoice_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 32 | curr_mny | 发票金额 | curr_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 33 | curr_mny_group | 发票金额(集团币) | curr_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 34 | curr_mny_global | 发票金额(全局币) | curr_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 35 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 36 | tax | 发票税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 37 | tot_taxmny | 发票价税合计 | tot_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 38 | tot_taxmny_group | 发票价税合计(集团币) | tot_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 39 | tot_taxmny_global | 发票价税合计(全局币) | tot_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 40 | verify_mny | 无税本次核销金额 | verify_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 41 | verify_mny_group | 无税本次核销金额(集团币) | verify_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 42 | verify_mny_global | 无税本次核销金额(全局币) | verify_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 43 | verify_tax | 核销税额 | verify_tax | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 44 | veri_taxmny | 核销金额 | veri_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 45 | veri_taxmny_group | 核销金额(集团币) | veri_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 46 | veri_taxmny_global | 核销金额(全局币) | veri_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 47 | is_verify | 业务核销完成 | is_verify | varchar(1) |  | 布尔类型 (UFBoolean) | Y |
| 48 | qual_taxmny | 质保金 | qual_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 49 | prepaid_mny | 冲预付金额 | prepaid_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 50 | prepaid_mny_group | 冲预付金额(集团币) | prepaid_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 51 | prepaid_mny_global | 冲预付金额(全局币) | prepaid_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 52 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |