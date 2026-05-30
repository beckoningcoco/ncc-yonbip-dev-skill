# |<<

**现金缴存单子实体 (fts_cashgather_b / nc.vo.fts.cashgather.CashGatherBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2302.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashgather_b | 现金缴存单明细标识 | pk_cashgather_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_cashgather_h | 现金缴存单标识 | pk_cashgather_h | varchar(20) |  | 现金缴存办理单 (cashgather_h) |
| 3 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 4 | pk_payfinanceorg | 缴款财务组织 | pk_payfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_payfinanceorg_v | 缴款财务组织版本 | pk_payfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_accid | 内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 7 | pk_cashbankacc | 收款现金账户 | pk_cashbankacc | varchar(20) |  | 现金账户 (cashaccount) |
| 8 | pk_bankacc | 收款银行账户 | pk_bankacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 10 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 11 | pk_planitem | 资金组织计划项目 | pk_planitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 12 | amount | 原币金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcamount | 组织本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 17 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 19 | remark | 摘要 | remark | varchar(200) |  | 字符串 (String) |
| 20 | pk_sourcebillid | 来源单据标识 | pk_sourcebillid | varchar(20) |  | 主键 (UFID) |
| 21 | pk_sourcebillrowid | 来源单据明细标识 | pk_sourcebillrowid | varchar(20) |  | 主键 (UFID) |
| 22 | busioperator | 缴款人 | busioperator | varchar(20) |  | 字符串 (String) |
| 23 | busidate | 缴款日期 | busidate | char(19) |  | 日期 (UFDate) |
| 24 | busitime | 缴款时间 | busitime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | notetype | 票据类型 | notetype | varchar(20) |  | 票据类型 (notetype) |
| 26 | notenumber | 票据编号 | notenumber | varchar(50) |  | 字符串 (String) |
| 27 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 28 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 29 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 30 | vuserdef1 | 自定义项1 | vuserdef1 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vuserdef2 | 自定义项2 | vuserdef2 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vuserdef3 | 自定义项3 | vuserdef3 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vuserdef4 | 自定义项4 | vuserdef4 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vuserdef5 | 自定义项5 | vuserdef5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vuserdef6 | 自定义项6 | vuserdef6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vuserdef7 | 自定义项7 | vuserdef7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vuserdef8 | 自定义项8 | vuserdef8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vuserdef9 | 自定义项9 | vuserdef9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vuserdef10 | 自定义项10 | vuserdef10 | varchar(101) |  | 自定义项 (Custom) |