# |<<

**补充协议明细 (pm_contr_alter_b / nc.vo.pcm.contractalter.ContrAlterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_alter_b | 合同基本变更主键 | pk_contr_alter_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_contr_works | 合同基本主键 | pk_contr_works | varchar(20) |  | 合同基本 (works) |
| 6 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 7 | pk_material | 编码 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | pk_material_v | 物料 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 10 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 11 | price | 单价 | price | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | service_prc_ratio | 服务价格系数 | service_prc_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | cont_num | 数量 | cont_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | curr_num | 本次协议数量 | curr_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | cont_mny | 无税金额 | cont_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | cont_taxmny | 含税金额 | cont_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 18 | oprnum | 操作次数 | oprnum | int |  | 整数 (Integer) | 0 |
| 19 | tax | 税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | taxprice | 含税单价 | taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 22 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |