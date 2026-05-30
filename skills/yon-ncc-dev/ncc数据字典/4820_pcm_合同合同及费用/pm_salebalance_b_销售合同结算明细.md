# |<<

**销售合同结算明细 (pm_salebalance_b / nc.vo.pcm.salebalance.SaleBalanceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sale_balance_b | 销售合同结算单子表主键 | pk_sale_balance_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_mcontr_works | 合同基本 | pk_mcontr_works | varchar(20) |  | 合同基本 (mworks) |
| 6 | pk_mcontr_alter_b | 补充协议基本 | pk_mcontr_alter_b | varchar(20) |  | 补充协议明细 (mcontr_alterbody) |
| 7 | income_name | 收入项名称 | income_name | varchar(80) |  | 字符串 (String) |
| 8 | pk_cbsnode | CBS | pk_cbsnode | varchar(20) |  | 成本分解结构成员 (cbsnode) |
| 9 | pk_checkfactor | 核算要素 | pk_checkfactor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 10 | mny_org | 无税结算额 | mny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | pk_taxcode | 税码 | pk_taxcode | varchar(20) |  | 增值税税码税率 (taxcode) |
| 12 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | tax | 税额 | tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | taxmny_org | 含税结算额 | taxmny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | cha_taxmny_org | 本次预收款冲销 | cha_taxmny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | due_taxmny_org | 含税待收额 | due_taxmny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | app_taxmny_org | 含税申请额 | app_taxmny_org | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 18 | tot_bal_mny | 无税累计结算额 | tot_bal_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | tot_bal_taxmny | 含税累计结算额 | tot_bal_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | app_mny | 已申请额 | app_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | due_app_mny | 待申请额 | due_app_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | due_mny_org | 无税代收额 | due_mny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 24 | src_bill_code | 来源单据编码 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 25 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 26 | src_bill_type | 来源单据类型 | src_bill_type | varchar(50) |  | 字符串 (String) |
| 27 | src_transi_type | 来源交易类型 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 28 | src_pk_transitype | 来源交易类型主键 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | src_rowno | 来源行号 | src_rowno | varchar(50) |  | 字符串 (String) |
| 30 | bal_dif_mny | 无税差异额 | bal_dif_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | bal_dif_taxmny | 含税差异额 | bal_dif_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |