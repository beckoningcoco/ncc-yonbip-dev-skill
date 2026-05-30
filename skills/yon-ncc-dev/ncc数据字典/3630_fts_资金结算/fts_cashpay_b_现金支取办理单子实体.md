# |<<

**现金支取办理单子实体 (fts_cashpay_b / nc.vo.fts.cashpay.CashPayBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2305.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cashpay_b | 现金支取单明细标识 | pk_cashpay_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_cashpay_h | 现金支取单标识 | pk_cashpay_h | varchar(20) |  | 现金缴存办理单 (cashgather_h) |
| 3 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 4 | pk_getfinanceorg | 支取财务组织 | pk_getfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_getfinanceorg_v | 支取财务组织版本 | pk_getfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_accid | 内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 7 | pk_cashbankacc | 现金银行账户 | pk_cashbankacc | varchar(20) |  | 现金账户 (cashaccount) |
| 8 | pk_bankacc | 银行账户 | pk_bankacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 9 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 10 | pk_planitem | 计划项目 | pk_planitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 11 | amount | 原币金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | olcamount | 组织本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 17 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 18 | remark | 常用摘要 | remark | varchar(200) |  | 字符串 (String) |
| 19 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |
| 20 | pk_sourcebillid | 来源单据标识 | pk_sourcebillid | varchar(20) |  | 主键 (UFID) |
| 21 | pk_sourcebillrowid | 来源单据明细标识 | pk_sourcebillrowid | varchar(20) |  | 主键 (UFID) |
| 22 | busioperator | 付款人 | busioperator | varchar(20) |  | 字符串 (String) |
| 23 | busidate | 付款日期 | busidate | char(19) |  | 日期 (UFDate) |
| 24 | busitime | 付款时间 | busitime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | pk_balatype | 结算方式主键 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 26 | notetype | 票据类型 | notetype | varchar(20) |  | 票据类型 (notetype) |
| 27 | notenumber | 票据编号 | notenumber | varchar(50) |  | 字符串 (String) |
| 28 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 29 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 30 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 31 | pk_drawer | 领票人 | pk_drawer | varchar(20) |  | 人员基本信息 (psndoc) |
| 32 | vuserdef1 | 自定义项1 | vuserdef1 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vuserdef2 | 自定义项2 | vuserdef2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vuserdef3 | 自定义项3 | vuserdef3 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vuserdef4 | 自定义项4 | vuserdef4 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vuserdef5 | 自定义项5 | vuserdef5 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vuserdef6 | 自定义项6 | vuserdef6 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vuserdef7 | 自定义项7 | vuserdef7 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vuserdef8 | 自定义项8 | vuserdef8 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vuserdef9 | 自定义项9 | vuserdef9 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vuserdef10 | 自定义项10 | vuserdef10 | varchar(101) |  | 自定义项 (Custom) |