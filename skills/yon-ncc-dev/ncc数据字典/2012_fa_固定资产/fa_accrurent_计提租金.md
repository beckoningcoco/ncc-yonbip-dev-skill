# |<<

**计提租金 (fa_accrurent / nc.vo.fa.accrual.RentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1984.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrurent | 主键 | pk_accrurent | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | accyear | 年度 | accyear | varchar(50) |  | 字符串 (String) |
| 6 | period | 期间 | period | varchar(50) |  | 字符串 (String) |
| 7 | voucher_date | 凭证日期 | voucher_date | char(19) |  | 日期 (UFDate) |
| 8 | pk_lessor | 出租方 | pk_lessor | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | pk_card | 卡片主键 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 10 | contract_number | 合同号 | contract_number | varchar(50) |  | 字符串 (String) |
| 11 | asset_code | 资产编码 | asset_code | varchar(50) |  | 字符串 (String) |
| 12 | asset_name | 资产名称 | asset_name | varchar(400) |  | 字符串 (String) |
| 13 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 14 | card_model | 型号 | card_model | varchar(400) |  | 字符串 (String) |
| 15 | tax_rate | 税率 | tax_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | localcurr_rate | 折本汇率 | localcurr_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | calculate_renttax | 含税租金（原币） | calculate_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | calculate_renttax_local | 含税租金（本币） | calculate_renttax_local | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | calculate_rentnotax | 无税租金（原币） | calculate_rentnotax | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | calculate_rentnotax_loacal | 无税租金（本币） | calculate_rentnotax_loacal | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | calculate_tax | 税额 | calculate_tax | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | calculate_tax_local | 税额（本币） | calculate_tax_local | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | adjustment_renttax | 调整后租金（原币） | adjustment_renttax | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | adjustment_renttax_local | 调整后租金（本币） | adjustment_renttax_local | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 26 | tax_deductible | 税额可抵扣 | tax_deductible | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | saga_gtxid | 全局事务 | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 28 | saga_btxid | 子事务 | saga_btxid | varchar(64) |  | 字符串 (String) |
| 29 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 30 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) | 0 |