# |<<

**费用结算单明细 (pm_feebalance_b / nc.vo.pcm.feebalance.FeeBalanceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4465.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feebalance_b | 费用结算单子表主键 | pk_feebalance_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_project | 项目 | pk_project | varchar(20) |  | 项目(项目管理) (pmproject) |
| 6 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 7 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 8 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | pk_material_v | 物料编码多版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 11 | verify_mny | 核销金额 | verify_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 12 | service_prc_ratio | 服务价格系数 | service_prc_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 14 | qual_mny_prop | 质保金比例（%） | qual_mny_prop | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | qual_verify_mny | 质保金核销金额 | qual_verify_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 16 | qual_mny_date | 质保金起算日期 | qual_mny_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | qual_length | 质保期（月） | qual_length | int |  | 整数 (Integer) |
| 18 | apply_mny | 申请金额 | apply_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 19 | qual_apply_mny | 质保金申请金额 | qual_apply_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 20 | pay_mny | 实付金额 | pay_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 21 | qual_pay_mny | 质保金实付金额 | qual_pay_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 22 | qual_mny_deadline | 质保金到期日 | qual_mny_deadline | char(19) |  | 日期(结束) (UFDateEnd) |
| 23 | qual_mny | 无税质保金 | qual_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 24 | qual_taxmny | 含税质保金 | qual_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | curr_num | 数量 | curr_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | price | 无税单价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | taxprice | 含税单价 | taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | curr_mny | 无税金额 | curr_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 30 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) | 1 | 1=应税外加; |