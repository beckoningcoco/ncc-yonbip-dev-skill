# |<<

**内部账户日发生额 (fts_account_dailydetail / nc.vo.fts.account.AccDailyDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2295.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailydetail | 内转单日发生额标识 | pk_dailydetail | char(20) | √ | 主键 (UFID) |
| 2 | busdate | 发生额日期 | busdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 3 | debitnum | 账面收入笔数 | debitnum | int |  | 整数 (Integer) |
| 4 | creditnum | 账面支出笔数 | creditnum | int |  | 整数 (Integer) |
| 5 | inmoney | 收入金额 | inmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | gllcinmoney | 收入金额(全局本币) | gllcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | glcinmoney | 收入金额(集团本币) | glcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | olcinmoney | 收入金额(组织本币) | olcinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | outmoney | 支出金额 | outmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | gllcoutmoney | 支出金额(全局本币) | gllcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | glcoutmoney | 支出金额(集团本币) | glcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | olcoutmoney | 支出金额(组织本币) | olcoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pk_account | 账户 | pk_account | varchar(20) |  | 内部账户 (bd_accid) |
| 14 | realinnum | 实时收入笔数 | realinnum | int |  | 整数 (Integer) |
| 15 | realoutnum | 实时支出笔数 | realoutnum | int |  | 整数 (Integer) |
| 16 | realinmoney | 实时收入金额 | realinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcrealinmoney | 实时收入金额(全局本币) | gllcrealinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | glcrealinmoney | 实时收入金额(集团本币) | glcrealinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | olcrealinmoney | 实时收入金额(组织本币) | olcrealinmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | realoutmoney | 实时支付金额 | realoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | gllcrealoutmoney | 实时支付金额(全局本币) | gllcrealoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | glcrealoutmoney | 实时支付金额(集团本币) | glcrealoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | olcrealoutmoney | 实时支付金额(组织本币) | olcrealoutmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | detailtype | 日发生额类型 | detailtype | varchar(30) |  | 日发生额类型 (DailyDetailType) |  | normaldailydetail=正常; |