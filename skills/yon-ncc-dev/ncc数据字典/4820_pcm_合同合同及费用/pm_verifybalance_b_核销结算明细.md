# |<<

**核销结算明细 (pm_verifybalance_b / nc.vo.pcm.verifybalance.VerifyBalanceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4549.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_verify_bala_b | 核销结算单子表主键 | pk_verify_bala_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 5 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 6 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 7 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 8 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 9 | pk_material | 物料多版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | pk_checkfactor | 核算要素 | pk_checkfactor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 12 | bill_mny | 业务无税核销金额 | bill_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 13 | bill_mny_group | 业务无税核销金额（集团币） | bill_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 14 | bill_mny_global | 业务无税核销金额（全局币） | bill_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 15 | bill_tax | 业务核销税额 | bill_tax | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 16 | bill_taxmny | 业务核销金额 | bill_taxmny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 17 | bill_taxmny_group | 业务核销金额（集团币） | bill_taxmny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 18 | bill_taxmny_global | 业务核销金额（全局币） | bill_taxmny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 19 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 20 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |