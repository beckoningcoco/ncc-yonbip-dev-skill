# |<<

**无票暂估单明细 (pm_surbillestimate_b / nc.vo.pcm.surbillestimate.SurBillEstimateBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4538.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_surbillestimate_b | 无票暂估单子表主键 | pk_surbillestimate_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 6 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 7 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 8 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 9 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 10 | pk_material_v | 物料编码多版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 11 | comments | 摘要 | comments | varchar(200) |  | 字符串 (String) |
| 12 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 13 | curr_num | 暂估数量 | curr_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | estimate_price | 无税暂估价 | estimate_price | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | estimate_taxprice | 含税暂估价 | estimate_taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | estimate_mny | 无税暂估额 | estimate_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 18 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |