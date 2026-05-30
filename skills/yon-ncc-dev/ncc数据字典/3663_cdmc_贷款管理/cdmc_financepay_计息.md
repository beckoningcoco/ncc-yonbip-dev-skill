# |<<

**计息 (cdmc_financepay / nc.vo.cdmc.calculintst.CalculintstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1373.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_financepay | 主键 | pk_financepay | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | contractid | 贷款合同号 | contractid | varchar(20) |  | 贷款合同 (contract) |
| 5 | vbillno | 放款单号 | vbillno | varchar(20) |  | 贷款放款 (FinancepayVO) |
| 6 | financecorpid | 借款单位 | financecorpid | varchar(50) |  | 字符串 (String) |
| 7 | pk_loanunit | 贷款单位 | pk_loanunit | varchar(50) |  | 字符串 (String) |
| 8 | invstfincvartyid | 融资品种 | invstfincvartyid | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 9 | fininstitutionid | 贷款机构 | fininstitutionid | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 10 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | loanmny | 放款金额 | loanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | intstmny | 利息金额 | intstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | pk_rate | 利率 | pk_rate | varchar(50) |  | 字符串 (String) |
| 14 | pk_returnmethod | 还款方式 | pk_returnmethod | varchar(20) |  | 还款方式 (RepaymentMethod) |
| 15 | calculdaynum | 计息天数 | calculdaynum | int |  | 整数 (Integer) |
| 16 | curriadate | 当前结息日 | curriadate | char(19) |  | 日期 (UFDate) |
| 17 | nextiadate | 下次结息日 | nextiadate | char(19) |  | 日期 (UFDate) |
| 18 | loandate | 放款日期 | loandate | char(19) |  | 日期时间 (UFDateTime) |
| 19 | contenddate | 放款结束日期 | contenddate | char(19) |  | 日期时间 (UFDateTime) |
| 20 | pk_settledate | 结息日 | pk_settledate | varchar(20) |  | 结息日 (fi_settledate) |
| 21 | pk_consignunit | 受托单位 | pk_consignunit | varchar(50) |  | 字符串 (String) |
| 22 | trusteefing | 受托金融机构 | trusteefing | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 23 | olcloanmny | 放款本币金额 | olcloanmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | initflag | 期初 | initflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | busitype | 业务类型 | busitype | varchar(50) |  | 字符串 (String) |
| 26 | datacomefrom | 数据来源 | datacomefrom | varchar(50) |  | 字符串 (String) |
| 27 | pk_borrowunit | 委托借款单位 | pk_borrowunit | varchar(50) |  | 字符串 (String) |
| 28 | trusteeutil | 受托外部单位 | trusteeutil | varchar(50) |  | 字符串 (String) |
| 29 | trusteinterutil | 受托内部单位 | trusteinterutil | varchar(50) |  | 字符串 (String) |
| 30 | errmsg | 计息异常信息 | errmsg | varchar(2000) |  | 字符串 (String) |
| 31 | startdate | 开始日期 | startdate | char(19) |  | 日期 (UFDate) |
| 32 | enddate | 结束日期 | enddate | char(19) |  | 日期 (UFDate) |
| 33 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 34 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 35 | saga_btxid | 本地事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 36 | saga_status | saga事务状态 | saga_status | int |  | 整数 (Integer) |
| 37 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 38 | calcultype | 计息方式 | calcultype | varchar(50) |  | 字符串 (String) |
| 39 | offshorerate | 境外计息利率 | offshorerate | varchar(50) |  | 字符串 (String) |