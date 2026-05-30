# |<<

**应收对账单行 (arap_recstatementitem / nc.vo.arap.tally.RecStatementItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/195.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_recstatementitem | 应收对账单行主键 | pk_recstatementitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | tallydate | 日期 | tallydate | varchar(50) |  | 字符串 (String) |
| 5 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 6 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 7 | pk_deptid | 部门 | pk_deptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_psndoc | 业务员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | pk_billtype | 单据类型编码 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 11 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 12 | pk_tradetypeid | 交易类型 | pk_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 13 | brief | 摘要 | brief | varchar(50) |  | 字符串 (String) |
| 14 | pk_bill | 单据主键 | pk_bill | varchar(20) |  | 主键 (UFID) |
| 15 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 16 | invoiceno | 发票号 | invoiceno | varchar(50) |  | 字符串 (String) |
| 17 | debt_qua | 本期借方数量 | debt_qua | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | debt_ori | 本期借方原币 | debt_ori | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | debt_loc | 本期借方本币 | debt_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | gr_debt_loc | 本期借方集团本币 | gr_debt_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | gl_debt_loc | 本期借方全局本币 | gl_debt_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | credit_qua | 本期贷方数量 | credit_qua | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | credit_ori | 本期贷方原币 | credit_ori | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | credit_loc | 本期贷方本币 | credit_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | gr_credit_loc | 本期贷方集团本币 | gr_credit_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | gl_credit_loc | 本期贷方全局本币 | gl_credit_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | bal_qua | 期末数量余额 | bal_qua | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | bal_ori | 期末原币余额 | bal_ori | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | bal_loc | 期末本币余额 | bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | gr_bal_loc | 期末集团本币余额 | gr_bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | gl_bal_loc | 期末全局本币余额 | gl_bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | dealflag | 业务处理类型 | dealflag | int |  | 整数 (Integer) |
| 33 | pk_dealnum | 业务处理批次号 | pk_dealnum | varchar(50) |  | 字符串 (String) |
| 34 | markperiod | 期初标识 | markperiod | int |  | 整数 (Integer) |
| 35 | project | 项目 | project | varchar(20) |  | 项目 (project) |