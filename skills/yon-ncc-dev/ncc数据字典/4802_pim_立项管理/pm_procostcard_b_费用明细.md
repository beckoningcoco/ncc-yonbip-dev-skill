# |<<

**费用明细 (pm_procostcard_b / nc.vo.pcm.procostcard.ProCostCardBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_procostcard_b | 费用明细主键 | pk_procostcard_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_wbs_busi | 业务项目任务 | pk_wbs_busi | varchar(20) |  | 项目任务 (WBS) |
| 7 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 8 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | detaildesc | 备注 | detaildesc | varchar(200) |  | 字符串 (String) |
| 10 | detail_date | 日期 | detail_date | char(19) |  | 日期 (UFDate) |
| 11 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 12 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 13 | curr_mny | 无税金额 | curr_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | curr_mny_group | 无税金额(集团币) | curr_mny_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | curr_mny_global | 无税金额(全局币) | curr_mny_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 17 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |