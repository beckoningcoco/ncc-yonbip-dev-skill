# |<<

**明细联查 (arap_detaillinkquery / nc.vo.arap.comreport.DetailLinkQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/172.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detaillinkquery | 主键 | pk_detaillinkquery | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 业务单元主键 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | code_org | 业务单元编码 | code_org | varchar(50) |  | 字符串 (String) |
| 5 | org | 业务单元 | org | varchar(100) |  | 字符串 (String) |
| 6 | qryobj0pk | 查询对象1主键 | qryobj0pk | char(20) |  | 主键 (UFID) |
| 7 | qryobj0code | 查询对象1编码 | qryobj0code | varchar(50) |  | 字符串 (String) |
| 8 | qryobj0 | 查询对象1 | qryobj0 | varchar(100) |  | 字符串 (String) |
| 9 | qryobj1pk | 查询对象2主键 | qryobj1pk | char(20) |  | 主键 (UFID) |
| 10 | qryobj1code | 查询对象2编码 | qryobj1code | varchar(50) |  | 字符串 (String) |
| 11 | qryobj1 | 查询对象2 | qryobj1 | varchar(100) |  | 字符串 (String) |
| 12 | qryobj2pk | 查询对象3主键 | qryobj2pk | char(20) |  | 主键 (UFID) |
| 13 | qryobj2code | 查询对象3编码 | qryobj2code | varchar(50) |  | 字符串 (String) |
| 14 | qryobj2 | 查询对象3 | qryobj2 | varchar(100) |  | 字符串 (String) |
| 15 | qryobj3pk | 查询对象4主键 | qryobj3pk | char(20) |  | 主键 (UFID) |
| 16 | qryobj3code | 查询对象4编码 | qryobj3code | varchar(50) |  | 字符串 (String) |
| 17 | qryobj3 | 查询对象4 | qryobj3 | varchar(100) |  | 字符串 (String) |
| 18 | qryobj4pk | 查询对象5主键 | qryobj4pk | char(20) |  | 主键 (UFID) |
| 19 | qryobj4code | 查询对象5编码 | qryobj4code | varchar(50) |  | 字符串 (String) |
| 20 | qryobj4 | 查询对象5 | qryobj4 | varchar(100) |  | 字符串 (String) |
| 21 | billclass | 单据大类 | billclass | varchar(50) |  | 字符串 (String) |
| 22 | pk_billtype | 单据类型编码 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 23 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 24 | pk_tradetype | 交易类型编码 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 25 | pk_tradetypeid | 交易类型 | pk_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 27 | tallydate | 日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 28 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 29 | confirmdate | 审核日期 | confirmdate | char(19) |  | 日期 (UFDate) |
| 30 | effectdate | 生效日期 | effectdate | char(19) |  | 日期 (UFDate) |
| 31 | invoiceno | 发票号 | invoiceno | varchar(50) |  | 字符串 (String) |
| 32 | voucherid | 凭证号 | voucherid | varchar(50) |  | 字符串 (String) |
| 33 | brief | 摘要 | brief | varchar(200) |  | 字符串 (String) |
| 34 | pk_bill | 单据主键 | pk_bill | char(20) |  | 主键 (UFID) |
| 35 | billno | 单据号 | billno | varchar(50) |  | 字符串 (String) |
| 36 | dealflag | 业务处理标识 | dealflag | varchar(50) |  | 字符串 (String) |
| 37 | pk_dealnum | 业务处理批次号 | pk_dealnum | varchar(50) |  | 字符串 (String) |
| 38 | debt_qua | 本期借方数量 | debt_qua | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | debt_ori | 本期借方原币 | debt_ori | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | debt_loc | 本期借方本币 | debt_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | gr_debt_loc | 本期借方集团本币 | gr_debt_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | gl_debt_loc | 本期借方全局本币 | gl_debt_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | credit_qua | 本期贷方数量 | credit_qua | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | credit_ori | 本期贷方原币 | credit_ori | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | credit_loc | 本期贷方本币 | credit_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | gr_credit_loc | 本期贷方集团本币 | gr_credit_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | gl_credit_loc | 本期贷方全局本币 | gl_credit_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | bal_qua | 期末数量余额 | bal_qua | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | bal_ori | 期末原币余额 | bal_ori | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | bal_loc | 期末本币余额 | bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | gr_bal_loc | 期末集团本币余额 | gr_bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | gl_bal_loc | 期末全局本币余额 | gl_bal_loc | decimal(28, 8) |  | 数值 (UFDouble) |