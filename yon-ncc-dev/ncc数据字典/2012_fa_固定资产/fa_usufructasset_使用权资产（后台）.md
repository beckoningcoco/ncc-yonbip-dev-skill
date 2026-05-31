# |<<

**使用权资产（后台） (fa_usufructasset / nc.vo.fa.assetcard.UsufructAssetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2071.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usufructasset | 主键 | pk_usufructasset | char(20) | √ | 主键 (UFID) |
| 2 | begin_liability | 期初租赁负债 | begin_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 3 | init_direct_cost | 初始直接费用 | init_direct_cost | decimal(28, 8) |  | 金额 (UFMoney) |
| 4 | expect_restore_cost | 预计还原成本 | expect_restore_cost | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | expect_liabilities | 预计负债 | expect_liabilities | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | contract_number | 合同号 | contract_number | varchar(50) |  | 字符串 (String) |
| 7 | contract_name | 合同名称 | contract_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 8 | pk_lessor | 出租方 | pk_lessor | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | pk_tenantry | 承租方 | pk_tenantry | varchar(20) |  | 客户基本信息 (customer) |
| 10 | pk_handledept | 经办部门 | pk_handledept | varchar(20) |  | 组织_部门 (dept) |
| 11 | pk_transactor | 经办人 | pk_transactor | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | sign_place | 签订地点 | sign_place | varchar(50) |  | 字符串 (String) |
| 13 | contract_sign_date | 合同签订日期 | contract_sign_date | char(19) |  | 日期 (UFDate) |
| 14 | contract_effect_date | 合同生效日期 | contract_effect_date | char(19) |  | 日期 (UFDate) |
| 15 | contract_end_date | 合同结束日期 | contract_end_date | char(19) |  | 日期 (UFDate) |
| 16 | rentstart_date | 起租日期 | rentstart_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 17 | starting_date | 起算日期 | starting_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 18 | ending_date | 止租日期 | ending_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 19 | lease_incentive_amount | 租赁激励金额 | lease_incentive_amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | payment_type | 付款类型 | payment_type | int |  | 付款类型 (payment_type) |  | 1=期初; |