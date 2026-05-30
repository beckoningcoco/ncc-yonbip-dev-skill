# |<<

**单位定期（通知）台账 (ifac_memberjournal / nc.vo.ifac.memberjournal.MemberJournalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3102.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_memberjournal | 单位台账主键 | pk_memberjournal | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | pk_fundorg | 资金组织 | pk_fundorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 8 | billdate | 日期 | billdate | char(19) |  | 日期 (UFDate) |
| 9 | summary | 摘要 | summary | varchar(50) |  | 字符串 (String) |
| 10 | vbillcode | 单据编号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 11 | businessvariety | 业务品种 | businessvariety | varchar(20) |  | 定期品种设置 (DepositVarietiesVO) |
| 12 | depositcode | 存单号 | depositcode | varchar(20) |  | 定期存单 (DepositReceipt) |
| 13 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 14 | pk_depositacc | 存款账户 | pk_depositacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 15 | pk_settleacc | 结算账户 | pk_settleacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 16 | depositamount | 存入原币金额 | depositamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | withdrawamount | 支取原币金额 | withdrawamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | interest | 利息原币金额 | interest | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | redepositamount | 转存原币金额 | redepositamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | olcrate | 组织本币汇率 | olcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | glcrate | 集团本币汇率 | glcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | gllcrate | 全局本币汇率 | gllcrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | olcdepositamount | 存入组织本币金额 | olcdepositamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | olcwithdrawmnt | 支取组织本币金额 | olcwithdrawmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | olcinterest | 利息组织本币金额 | olcinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | olcredepositmnt | 转存组织本币金额 | olcredepositmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | glcdepositamount | 存入集团本币金额 | glcdepositamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | glcwithdrawmnt | 支取集团本币金额 | glcwithdrawmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | glcinterest | 利息集团本币金额 | glcinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | glcredepositmnt | 转存集团本币金额 | glcredepositmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | gllcdepositamount | 存入全局本币金额 | gllcdepositamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | gllcwithdrawmnt | 支取全局本币金额 | gllcwithdrawmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | gllcinterest | 利息全局本币金额 | gllcinterest | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | gllcredepositmnt | 转存全局本币金额 | gllcredepositmnt | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | redepositmode | 转存方式 | redepositmode | varchar(50) |  | 转存类型 (RedepositTypeEnum) |  | NONE=不转存; |