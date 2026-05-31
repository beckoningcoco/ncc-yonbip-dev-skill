# |<<

**债券计息 (bond_register / nc.vo.bond.bondmanage.calcintst.BondCalcIntstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1251.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bondissueregister | 主键 | pk_bondissueregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | bondregistercode | 发行编号 | bondregistercode | varchar(20) |  | 债券发行 (BondRegisterVO) |
| 6 | bondcontractno | 债券编码 | bondcontractno | varchar(20) |  | 发债契约 (BondContractVO) |
| 7 | pk_finvariety | 发债品种 | pk_finvariety | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 8 | issuancemny | 发行金额 | issuancemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | issuemny | 发行本币金额 | issuemny | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | bondregisterdate | 发行日期 | bondregisterdate | char(19) |  | 日期时间 (UFDateTime) |
| 11 | issueenddate | 发行结束日期 | issueenddate | char(19) |  | 日期时间 (UFDateTime) |
| 12 | repaymentmodeid | 还款方式 | repaymentmodeid | varchar(20) |  | 还款方式 (RepaymentMethod) |
| 13 | bondyearrate | 债券年利率 | bondyearrate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 14 | monthrate | 债券月利率 | monthrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | dayrate | 债券日利率 | dayrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | expirydate | 结息日 | expirydate | varchar(20) |  | 结息日 (fi_settledate) |
| 17 | currexpirydate | 当前结息日 | currexpirydate | char(19) |  | 日期(开始) (UFDateBegin) |
| 18 | nextexpirydate | 下一结息日 | nextexpirydate | char(19) |  | 日期(开始) (UFDateBegin) |
| 19 | periodloan | 发债期间 | periodloan | varchar(50) |  | 发债期间 (BondPeriod) |  | 1=短期; |