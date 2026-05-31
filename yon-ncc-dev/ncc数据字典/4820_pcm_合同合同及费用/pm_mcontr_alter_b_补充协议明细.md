# |<<

**补充协议明细 (pm_mcontr_alter_b / nc.vo.pcm.martcontalter.MContr_AlterBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4487.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mcontr_alter_b | 补充协议明细主键 | pk_mcontr_alter_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_mcontr_works | 合同行号 | pk_mcontr_works | varchar(20) |  | 合同基本 (mworks) |
| 7 | income_name | 收入项名称 | income_name | varchar(50) |  | 字符串 (String) |
| 8 | pk_checkfactor | 核算要素 | pk_checkfactor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | mcontr_mny | 无税合同额 | mcontr_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | mcontr_taxmny | 含税合同额 | mcontr_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | alter_mny | 本次无税额 | alter_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 13 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | taxtype | 扣税类别 | taxtype | int |  | 扣税类别 (taxtype) |  | 1=应税外加; |