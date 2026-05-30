# |<<

**常用分录 (gl_commondetail / nc.vo.gl.commonvoucher.commondetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2368.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commondetail | 常用分录标识 | pk_commondetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_commonvoucher | 常用凭证标识 | pk_commonvoucher | char(20) |  | 主键 (UFID) |
| 3 | pk_accasoa | 科目标识 | pk_accasoa | char(20) |  | 主键 (UFID) |
| 4 | pk_currtype | 币种标识 | pk_currtype | char(20) |  | 主键 (UFID) |
| 5 | pk_group | 所属集团 | pk_group | char(4) |  | 主键 (UFID) |
| 6 | detailindex | 序号 | detailindex | int |  | 整数 (Integer) |
| 7 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 8 | explanation | 摘要 | explanation | varchar(300) |  | 字符串 (String) |
| 9 | bankaccount | 银行账号 | bankaccount | char(20) |  | 主键 (UFID) |
| 10 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | excrate1 | 汇率1 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | excrate2 | 汇率2 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | excrate3 | 汇率3 | excrate3 | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | excrate4 | 汇率4 | excrate4 | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | debitquantity | 借方数量 | debitquantity | decimal(20, 8) |  | 金额 (UFMoney) |
| 16 | debitamount | 借方 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | fracdebitamount | 辅币借方 | fracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | localdebitamount | 本币借方 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | creditquantity | 贷方数量 | creditquantity | decimal(20, 8) |  | 金额 (UFMoney) |
| 20 | creditamount | 贷方 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | fraccreditamount | 辅币贷方 | fraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | localcreditamount | 本币贷方 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | groupcreditamount | 集团本币贷方 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | groupdebitamount | 集团本币借方 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | globalcreditamount | 全局本币贷方 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | globaldebitamount | 全局本币借方 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | modifyflag | 修改标志 | modifyflag | varchar(50) |  | 字符串 (String) |
| 28 | recieptclass | 单据处理类 | recieptclass | varchar(60) |  | 字符串 (String) |
| 29 | oppositesubj | 对方科目 | oppositesubj | varchar(200) |  | 字符串 (String) |
| 30 | contrastflag | 对账标志 | contrastflag | int |  | 整数 (Integer) |
| 31 | errmessage | 错误信息 | errmessage | varchar(90) |  | 字符串 (String) |
| 32 | checkstyle | 结算方式 | checkstyle | char(20) |  | 主键 (UFID) |
| 33 | checkno | 结算号 | checkno | char(30) |  | 主键 (UFID) |
| 34 | checkdate | 结算日期 | checkdate | char(19) |  | 日期时间 (UFDateTime) |
| 35 | pk_setofbook | 账簿类型 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 36 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 37 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 38 | billtype | 票据类型 | billtype | char(20) |  | 主键 (UFID) |
| 39 | pk_unit | 业务单元 | pk_unit | char(20) |  | 主键 (UFID) |