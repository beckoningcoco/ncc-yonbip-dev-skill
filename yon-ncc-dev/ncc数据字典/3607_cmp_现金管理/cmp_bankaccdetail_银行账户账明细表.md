# |<<

**银行账户账明细表 (cmp_bankaccdetail / nc.vo.cmp.bankaccbook.BankAccDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1532.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bankaccdetail | 主键 | pk_bankaccdetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_account | 本方帐户 | pk_account | varchar(50) |  | 字符串 (String) |
| 3 | systemcode | 来源系统 | systemcode | varchar(50) |  | 字符串 (String) |
| 4 | pk_transtype | 交易类型 | pk_transtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtype | 来源单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 6 | billtypecode | 来源单据类型编号 | billtypecode | varchar(50) |  | 字符串 (String) |
| 7 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | oribillno | 原始单据号 | oribillno | varchar(50) |  | 字符串 (String) |
| 9 | note | 备注 | note | varchar(181) |  | 字符串 (String) |
| 10 | pk_curr | 币种 | pk_curr | varchar(50) |  | 字符串 (String) |
| 11 | olcrate | 组织本币汇率 | olcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | glcrate | 集团本币汇率 | glcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 13 | gllcrate | 全局本币汇率 | gllcrate | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | paymoney | 付款原币金额 | paymoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcpaymoney | 付款组织本币金额 | olcpaymoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | glcpaymoney | 付款集团本币金额 | glcpaymoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 17 | gllcpaymoney | 付款全局本币金额 | gllcpaymoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | recmoney | 收款原币金额 | recmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | olcrecmoney | 收款组织本币金额 | olcrecmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | glcrecmoney | 收款集团本币金额 | glcrecmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | gllcrecmoney | 收款全局本币金额 | gllcrecmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | oppunit | 对方单位 | oppunit | varchar(300) |  | 字符串 (String) |
| 23 | pk_opporg | 对方单位主键 | pk_opporg | varchar(50) |  | 字符串 (String) |
| 24 | pk_oppaccount | 对方帐户主键 | pk_oppaccount | varchar(50) |  | 字符串 (String) |
| 25 | pk_oppbank | 对方银行主键 | pk_oppbank | varchar(50) |  | 字符串 (String) |
| 26 | oppbank | 对方银行 | oppbank | varchar(300) |  | 字符串 (String) |
| 27 | oppbankacc | 对方银行账号 | oppbankacc | varchar(300) |  | 字符串 (String) |
| 28 | direction | 方向 | direction | int |  | 整数 (Integer) |
| 29 | pk_bill | 单据主键 | pk_bill | varchar(50) |  | 字符串 (String) |
| 30 | pk_bill_b | 单据明细主键 | pk_bill_b | varchar(50) |  | 字符串 (String) |
| 31 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 32 | pk_org | 所属组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 33 | pk_org_v | 所属组织版本 | pk_org_v | varchar(50) |  | 字符串 (String) |
| 34 | tallyperson | 记账人 | tallyperson | varchar(50) |  | 字符串 (String) |
| 35 | tallytime | 记账时间 | tallytime | char(19) |  | 日期 (UFDate) |
| 36 | tallydate | 记账日期 | tallydate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 37 | useflag | 在途标志 | useflag | int |  | 整数 (Integer) |
| 38 | isreverse | 是否已核销 | isreverse | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | pk_planitem | 资金计划项目 | pk_planitem | varchar(50) |  | 字符串 (String) |
| 40 | pk_cashflow | 现金流量项目 | pk_cashflow | varchar(50) |  | 字符串 (String) |
| 41 | fundstype | 收付类型 | fundstype | int |  | 整数 (Integer) |
| 42 | transtype | 交易种类 | transtype | int |  | 整数 (Integer) |
| 43 | pk_notetype | 票据类型 | pk_notetype | varchar(50) |  | 字符串 (String) |
| 44 | pk_balancetype | 结算方式 | pk_balancetype | varchar(50) |  | 字符串 (String) |
| 45 | pk_projecttask | 项目任务 | pk_projecttask | varchar(50) |  | 字符串 (String) |
| 46 | pk_project | 项目 | pk_project | varchar(50) |  | 字符串 (String) |
| 47 | pk_invcl | 物料分类 | pk_invcl | varchar(50) |  | 字符串 (String) |
| 48 | pk_material | 物料 | pk_material | varchar(50) |  | 字符串 (String) |
| 49 | pk_inout | 收支项目 | pk_inout | varchar(50) |  | 字符串 (String) |
| 50 | fundformcode | 资金形态 | fundformcode | int |  | 整数 (Integer) |
| 51 | opptradetype | 对方类型 | opptradetype | int |  | 整数 (Integer) |
| 52 | onlyclueno | 唯一线索号 | onlyclueno | varchar(300) |  | 字符串 (String) |
| 53 | checkcount | 对账次数 | checkcount | int |  | 整数 (Integer) |
| 54 | checkdate | 对账时间 | checkdate | char(19) |  | 日期 (UFDate) |
| 55 | bankrelated_code | 对账标识码 | bankrelated_code | varchar(100) |  | 字符串 (String) |
| 56 | account_name | 账户名称 | account_name | varchar(300) |  | 字符串 (String) |
| 57 | pk_deptdoc | 部门 | pk_deptdoc | varchar(50) |  | 字符串 (String) |
| 58 | pk_psndoc | 人员档案 | pk_psndoc | varchar(50) |  | 字符串 (String) |
| 59 | pk_busiorg | 业务单元 | pk_busiorg | varchar(20) |  | 组织 (org) |
| 60 | pk_busiorg_v | 业务单元版本 | pk_busiorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 61 | transerial | 交易流水号 | transerial | varchar(50) |  | 字符串 (String) |
| 62 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |