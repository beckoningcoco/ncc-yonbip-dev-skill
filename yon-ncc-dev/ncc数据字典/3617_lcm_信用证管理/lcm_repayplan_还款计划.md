# |<<

**还款计划 (lcm_repayplan / nc.vo.lcm.docucontract.DocuContractRepayPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3583.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repayplan | 主键 | pk_repayplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_payplan | 放款计划主键 | pk_payplan | varchar(20) |  | 字符串 (String) |
| 3 | paycode | 放款编号 | paycode | varchar(50) |  | 字符串 (String) |
| 4 | repaycode | 还款编号 | repaycode | varchar(50) |  | 字符串 (String) |
| 5 | repaydate | 还款日期 | repaydate | char(19) |  | 日期 (UFDate) |
| 6 | serialno | 序号 | serialno | int |  | 整数 (Integer) |
| 7 | preamount | 预计还本金 | preamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | olcpreamount | 预计还本金本币 | olcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glcpreamount | 集团预计还本金本币 | glcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | gllcpreamount | 全局预计还本金本币 | gllcpreamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | preinterest | 预计付利息 | preinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | olcpreinterest | 预计付利息本币 | olcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glcpreinterest | 集团预计付利息本币 | glcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | gllcpreinterest | 全局预计付利息本币 | gllcpreinterest | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | sumamount | 本利合计 | sumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | olcsumamount | 本利合计本币 | olcsumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | glcsumamount | 集团本利合计本币 | glcsumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | gllcsumamount | 全局本利合计本币 | gllcsumamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | operatedate | 处理日期 | operatedate | char(19) |  | 日期 (UFDate) |
| 20 | operateflag | 还款标志 | operateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 22 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 23 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
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