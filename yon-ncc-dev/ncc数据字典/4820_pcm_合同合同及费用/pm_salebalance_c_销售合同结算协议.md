# |<<

**销售合同结算协议 (pm_salebalance_c / nc.vo.pcm.salebalance.SaleBalanceProtocolBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4529.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_salebalance_c | 销售合同结算单协议子表主键 | pk_salebalance_c | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | showorder | 收款期 | showorder | int |  | 整数 (Integer) |
| 6 | accrate | 收款比例 | accrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | prepayment | 预收款 | prepayment | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isdeposit | 质保金 | isdeposit | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | qual_time | 质保期(月) | qual_time | int |  | 整数 (Integer) |
| 10 | paymentday | 账期天数 | paymentday | int |  | 整数 (Integer) |
| 11 | bal_mny | 无税结算额 | bal_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | tot_bal_taxmny | 含税结算累计额 | tot_bal_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | tot_bal_mny | 无税结算累计额 | tot_bal_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | due_mny | 无税待收额 | due_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | due_taxmny_org | 含税待收额 | due_taxmny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | app_mny | 已申请额 | app_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | due_app_mny | 待申请额 | due_app_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | taxmny_org | 含税结算额 | taxmny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | cha_taxmny_org | 本次预收款冲销 | cha_taxmny_org | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 21 | src_pk_bill | 来源单据主键 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 22 | src_bill_code | 来源单据编码 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 23 | src_bill_type | 来源单据类型 | src_bill_type | varchar(50) |  | 字符串 (String) |
| 24 | src_transi_type | 来源交易类型 | src_transi_type | varchar(50) |  | 字符串 (String) |
| 25 | src_pk_transitype | 来源交易类型主键 | src_pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | pk_mcontr_protocol | 销售合同收款协议主键 | pk_mcontr_protocol | varchar(50) |  | 字符串 (String) |
| 27 | bal_dif_taxmny | 含税差异额 | bal_dif_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |