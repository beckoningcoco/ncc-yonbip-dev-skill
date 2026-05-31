# |<<

**特转付款单子实体 (fts_spepay_b / nc.vo.fts.spepay.SpePayBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2325.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spepay_b | 特转付款单明细标识 | pk_spepay_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_spepay_h | 特转付款单标识 | pk_spepay_h | varchar(20) |  | 现金支取办理单 (cashpay_h) |
| 3 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 4 | pk_getfinanceorg | 收款财务组织 | pk_getfinanceorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_getfinanceorg_v | 收款财务组织版本 | pk_getfinanceorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | pk_accid | 内部账户 | pk_accid | varchar(20) |  | 内部账户 (bd_accid) |
| 7 | fundtype | 货币形态 | fundtype | varchar(20) |  | 资金类型(自定义档案) (Defdoc-BD005_0xx) |
| 8 | pk_planitem | 计划项目 | pk_planitem | varchar(20) |  | 资金计划项目 (fundplan) |
| 9 | amount | 原币金额 | amount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | gllcamount | 全局本币金额 | gllcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | glcamount | 集团本币金额 | glcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | olcamount | 组织本币金额 | olcamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | remark | 常用摘要 | remark | varchar(200) |  | 字符串 (String) |
| 17 | memo | 备注 | memo | varchar(181) |  | 字符串 (String) |
| 18 | pk_sourcebillid | 来源财务单据标识 | pk_sourcebillid | varchar(20) |  | 主键 (UFID) |
| 19 | pk_sourcebillrowid | 来源财务单据明细标识 | pk_sourcebillrowid | varchar(20) |  | 主键 (UFID) |
| 20 | busioperator | 付款人 | busioperator | varchar(20) |  | 用户 (user) |
| 21 | busidate | 付款日期 | busidate | char(19) |  | 日期 (UFDate) |
| 22 | busitime | 付款时间 | busitime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | pk_balatype | 结算方式主键 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 24 | notetype | 票据类型 | notetype | varchar(20) |  | 票据类型 (notetype) |
| 25 | notenumber | 票据编号 | notenumber | varchar(50) |  | 字符串 (String) |
| 26 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 27 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 28 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 29 | vuserdef1 | 自定义项1 | vuserdef1 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vuserdef2 | 自定义项2 | vuserdef2 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vuserdef3 | 自定义项3 | vuserdef3 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vuserdef4 | 自定义项4 | vuserdef4 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vuserdef5 | 自定义项5 | vuserdef5 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vuserdef6 | 自定义项6 | vuserdef6 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vuserdef7 | 自定义项7 | vuserdef7 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vuserdef8 | 自定义项8 | vuserdef8 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vuserdef9 | 自定义项9 | vuserdef9 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vuserdef10 | 自定义项10 | vuserdef10 | varchar(101) |  | 自定义项 (Custom) |