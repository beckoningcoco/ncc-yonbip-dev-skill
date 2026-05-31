# |<<

**计提利息 (fa_accrual / nc.vo.fa.accrual.AccrualVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1983.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrual | 主键 | pk_accrual | char(20) | √ | 主键 (UFID) |
| 2 | pk_card | 卡片主键 | pk_card | varchar(20) |  | 资产卡片 (asset) |
| 3 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 4 | asset_code | 资产编码 | asset_code | varchar(40) |  | 字符串 (String) |
| 5 | asset_name | 资产名称 | asset_name | varchar(400) |  | 字符串 (String) |
| 6 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 7 | card_model | 型号 | card_model | varchar(400) |  | 字符串 (String) |
| 8 | begin_liability | 期初租赁负债 | begin_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | end_liability | 期末租赁负债 | end_liability | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | origin_interest | 利息（原币） | origin_interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | local_interest | 利息（本币） | local_interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | accu_interest | 累计计提利息 | accu_interest | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 14 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 15 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 16 | accyear | 年度 | accyear | varchar(50) |  | 字符串 (String) |
| 17 | period | 期间 | period | varchar(50) |  | 字符串 (String) |
| 18 | voucher_date | 凭证日期 | voucher_date | char(19) |  | 日期 (UFDate) |
| 19 | saga_gtxid | 全局事务 | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 20 | saga_btxid | 子事务 | saga_btxid | varchar(64) |  | 字符串 (String) |
| 21 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) | 0 |
| 22 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) | 0 |