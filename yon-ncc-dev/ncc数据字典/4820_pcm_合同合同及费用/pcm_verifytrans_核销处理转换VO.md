# |<<

**核销处理转换VO (pcm_verifytrans / nc.vo.pcm.receiptverify.VerifyTransHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4353.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verifytrans | 核销处理转换VO主键 | pk_verifytrans | char(20) | √ | 主键 (UFID) |
| 2 | pk_srcbill | 来源单据主键 | pk_srcbill | varchar(50) |  | 字符串 (String) |
| 3 | pk_srcbillrow | 来源单据表体主键 | pk_srcbillrow | varchar(50) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 6 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 7 | billtype_code | 单据类型编码 | billtype_code | varchar(50) |  | 字符串 (String) |
| 8 | bill_code | 来源单据号 | bill_code | varchar(50) |  | 字符串 (String) |
| 9 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | pk_material | 物料编码多版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 11 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 12 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 13 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 14 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 15 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 16 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 17 | pk_contr | 合同编码 | pk_contr | varchar(50) |  | 字符串 (String) |
| 18 | pk_contr_b | 合同子表编码 | pk_contr_b | varchar(50) |  | 字符串 (String) |
| 19 | comments | 摘要 | comments | varchar(50) |  | 字符串 (String) |
| 20 | pk_currtype_org | 组织币种 | pk_currtype_org | varchar(20) |  | 币种 (currtype) |
| 21 | verify_mny | 核销金额 | verify_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 22 | verify_mny_group | 核销金额（集团币种） | verify_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 23 | verify_mny_global | 核销金额（全局币种） | verify_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 24 | verify_tax | 核销税额 | verify_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | spare_mny | 剩余金额 | spare_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 26 | spare_mny_group | 剩余金额（集团币种） | spare_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 27 | spare_mny_global | 剩余金额（全局币种） | spare_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 28 | curr_mny | 无税本次核销金额 | curr_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 29 | curr_mny_group | 无税本次核销金额（集团币种） | curr_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 30 | curr_mny_global | 无税本次核销金额（全局币种） | curr_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 31 | curr_tax | 本次核销税额 | curr_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | curr_taxmny | 本次核销金额 | curr_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 33 | curr_taxmny_group | 本次核销金额（集团币种） | curr_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 34 | curr_taxmny_global | 本次核销金额（全局币种） | curr_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 35 | bal_mny | 无税结算额 | bal_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 36 | bal_mny_group | 无税结算额(集团币) | bal_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 37 | bal_mny_global | 无税结算额(全局币) | bal_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 38 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 39 | bal_taxmny | 含税结算额 | bal_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 40 | bal_taxmny_group | 含税结算额(集团币) | bal_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 41 | bal_taxmny_global | 含税结算额(全局币) | bal_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 42 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |