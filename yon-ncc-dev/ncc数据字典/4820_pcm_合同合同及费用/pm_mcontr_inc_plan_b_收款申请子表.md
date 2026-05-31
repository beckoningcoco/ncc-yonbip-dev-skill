# |<<

**收款申请子表 (pm_mcontr_inc_plan_b / nc.vo.pcm.incomeplan.IncomePlanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_income_plan_b | 收款申请子表主键 | pk_income_plan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_mcontr_works | 合同基本主键 | pk_mcontr_works | varchar(20) |  | 合同基本 (mworks) |
| 7 | income_name | 收入项名称 | income_name | varchar(50) |  | 字符串 (String) |
| 8 | due_shou_mny | 待申请额 | due_shou_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 10 | mctr_mny_orig | 无税合同额(原币) | mctr_mny_orig | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | mctr_mny | 无税合同额 | mctr_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | mctr_taxmny | 含税合同额 | mctr_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | prepayment_enum | 收款性质 | prepayment_enum | int |  | 收款性质 (prepayment) |  | 0=应收款; |