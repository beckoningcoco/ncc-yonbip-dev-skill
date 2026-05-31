# |<<

**内贷计息 (icdmc_financepay / nc.vo.icdmc.icdmc.calculintst.CalculintstVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3041.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerloanpay | 主键 | pk_innerloanpay | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | contractid | 贷款合同号 | contractid | varchar(20) |  | 内部贷款合同 (icontract) |
| 5 | vbillno | 放款单号 | vbillno | varchar(20) |  | 内贷放款 (FinancepayVO) |
| 6 | financecorpid | 借款单位 | financecorpid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | invstfincvartyid | 融资品种 | invstfincvartyid | varchar(20) |  | 投融资品种 (FinVarietyVO) |
| 8 | fininstitutionid | 贷款机构 | fininstitutionid | varchar(20) |  | 非银行金融机构 (NonbankFinInstitution) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | loanmny | 放款金额 | loanmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | intstmny | 利息金额 | intstmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | pk_rate | 利率 | pk_rate | varchar(20) |  | 利率编码 (fi_ratecode) |
| 13 | pk_returnmethod | 还款方式 | pk_returnmethod | varchar(20) |  | 还款方式 (RepaymentMethod) |
| 14 | calculdaynum | 计息天数 | calculdaynum | int |  | 整数 (Integer) |
| 15 | curriadate | 当前结息日 | curriadate | char(19) |  | 日期 (UFDate) |
| 16 | nextiadate | 下次结息日 | nextiadate | char(19) |  | 日期 (UFDate) |
| 17 | loandate | 放款日期 | loandate | char(19) |  | 日期 (UFDate) |
| 18 | contenddate | 放款结束日期 | contenddate | char(19) |  | 日期 (UFDate) |
| 19 | pk_settledate | 结息日 | pk_settledate | varchar(20) |  | 结息日 (fi_settledate) |
| 20 | saga_gtxid | 全局事务id | saga_gtxid | varchar(64) |  | 字符串 (String) |
| 21 | saga_btxid | 本地事务id | saga_btxid | varchar(64) |  | 字符串 (String) |
| 22 | saga_frozen | 冻结状态 | saga_frozen | int |  | 整数 (Integer) |
| 23 | saga_status | 事务状态 | saga_status | int |  | 整数 (Integer) |
| 24 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |