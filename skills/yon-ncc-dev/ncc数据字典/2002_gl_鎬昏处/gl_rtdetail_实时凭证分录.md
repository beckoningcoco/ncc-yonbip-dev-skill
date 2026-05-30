# |<<

**实时凭证分录 (gl_rtdetail / nc.vo.gl.aggvoucher.MDDetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2472.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 分录主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(0) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_unit_v | 业务单元版本信息 | pk_unit_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | unitname | 业务单元名称 | unitname | varchar(50) |  | 字符串 (String) |
| 7 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 8 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 9 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 10 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 11 | explanation | 摘要内容 | explanation | varchar(150) |  | 字符串 (String) |
| 12 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | excrate2 | 账簿汇率 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) |
| 14 | excrate3 | 集团汇率 | excrate3 | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | excrate4 | 全局汇率 | excrate4 | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | debitquantity | 借方数量 | debitquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 17 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | fracdebitamount | 辅币借发生额 | fracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | localdebitamount | 账簿本币借发生额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | groupdebitamount | 集团本币借发生额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | globaldebitamount | 全局本币借发生额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | creditquantity | 贷方数量 | creditquantity | decimal(20, 8) |  | 数值 (UFDouble) |
| 23 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | fraccreditamount | 辅币贷发生额 | fraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | localcreditamount | 账簿本币贷发生额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | groupcreditamount | 集团本币贷发生额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | globalcreditamount | 全局本币贷发生额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | modifyflag | 修改标志 | modifyflag | varchar(20) |  | 控制规则 (ControlRuleVO) |
| 29 | recieptclass | 单据处理类 | recieptclass | varchar(60) |  | 字符串 (String) |
| 30 | oppositesubj | 对方科目 | oppositesubj | varchar(200) |  | 字符串 (String) |
| 31 | contrastflag | 对账标志 | contrastflag | int |  | 整数 (Integer) |
| 32 | errmessage | 错误信息 | errmessage | varchar(90) |  | 字符串 (String) |
| 33 | checkstyle | 结算方式 | checkstyle | varchar(20) |  | 字符串 (String) |
| 34 | checkno | 票据编码 | checkno | varchar(30) |  | 字符串 (String) |
| 35 | checkdate | 结算业务日期 | checkdate | char(19) |  | 日期 (UFDate) |
| 36 | pk_innersob | 交易单位帐簿主键 | pk_innersob | varchar(20) |  | 字符串 (String) |
| 37 | pk_innerorg | 内部交易单位 | pk_innerorg | varchar(20) |  | 字符串 (String) |
| 38 | verifyno | 核销号 | verifyno | varchar(60) |  | 字符串 (String) |
| 39 | verifydate | 业务日期 | verifydate | char(19) |  | 日期 (UFDate) |
| 40 | billtype | 票据类型 | billtype | varchar(60) |  | 字符串 (String) |
| 41 | innerbusdate | 内部交易业务日期 | innerbusdate | char(19) |  | 日期 (UFDate) |
| 42 | innerbusno | 内部交易业务号 | innerbusno | varchar(60) |  | 字符串 (String) |
| 43 | bankaccount | 银行账户 | bankaccount | char(20) |  | 字符串 (String) |
| 44 | pk_sourcepk | 折算来源凭证PK | pk_sourcepk | char(20) |  | 主键 (UFID) |
| 45 | convertflag | 是否折算凭证标志 | convertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 46 | direction | 发生额方向 | direction | char(1) |  | 布尔类型 (UFBoolean) |
| 47 | pk_vouchertypev | 凭证类别主键 | pk_vouchertypev | varchar(20) |  | 凭证类别 (vouchertype) |
| 48 | yearv | 会计年度 | yearv | char(4) |  | 主键 (UFID) |
| 49 | periodv | 会计期间 | periodv | char(2) |  | 主键 (UFID) |
| 50 | nov | 凭证编码 | nov | int |  | 整数 (Integer) |
| 51 | prepareddatev | 制单日期 | prepareddatev | char(19) |  | 日期 (UFDate) |
| 52 | pk_managerv | 记账人 | pk_managerv | varchar(20) |  | 字符串 (String) |
| 53 | discardflagv | 作废标志 | discardflagv | char(1) |  | 布尔类型 (UFBoolean) |
| 54 | voucherkindv | 凭证类型 | voucherkindv | int |  | 整数 (Integer) |
| 55 | errmessage2 | 错误信息2 | errmessage2 | varchar(60) |  | 字符串 (String) |
| 56 | adjustperiod | 调整期间 | adjustperiod | varchar(3) |  | 字符串 (String) |
| 57 | signdatev | 签字日期 | signdatev | char(19) |  | 日期 (UFDate) |
| 58 | pk_systemv | 制单系统 | pk_systemv | char(20) |  | 主键 (UFID) |
| 59 | pk_offerdetail | 被冲销的分录标识 | pk_offerdetail | char(20) |  | 主键 (UFID) |
| 60 | isdifflag | 是否差异凭证 | isdifflag | char(1) |  | 布尔类型 (UFBoolean) |
| 61 | busireconno | 业务系统协同号 | busireconno | varchar(60) |  | 字符串 (String) |
| 62 | errmessageh | 标错的历史信息 | errmessageh | varchar(90) |  | 字符串 (String) |
| 63 | pk_othercorp | 内部客商对方公司pk | pk_othercorp | varchar(4) |  | 字符串 (String) |
| 64 | pk_otherorgbook | 内部客商对方公司pk_glorgbook | pk_otherorgbook | char(20) |  | 主键 (UFID) |
| 65 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 66 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 67 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 68 | netbankflag | 银行对账标识 | netbankflag | varchar(30) |  | 字符串 (String) |
| 69 | tempsaveflag | 暂存标志 | tempsaveflag | char(1) |  | 布尔类型 (UFBoolean) |
| 70 | cashflowitem | 现金流量项目 | cashflowitem | varchar(20) |  | 现金流量项目 (cashflow) |
| 71 | pk_innercorp | 内部单位 | pk_innercorp | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 72 | pk_liabilitycenter | 利润中心 | pk_liabilitycenter | varchar(20) |  | 利润中心 (profitcenter) |
| 73 | pk_liabilitycenter_v | 利润中心版本 | pk_liabilitycenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 74 | free1 | 自由项1 | free1 | varchar(60) |  | 字符串 (String) |
| 75 | free2 | 自由项2 | free2 | varchar(60) |  | 字符串 (String) |
| 76 | free3 | 自由项3 | free3 | varchar(60) |  | 字符串 (String) |
| 77 | free4 | 自由项4 | free4 | varchar(60) |  | 字符串 (String) |
| 78 | free5 | 自由项5 | free5 | varchar(60) |  | 字符串 (String) |
| 79 | free6 | 自由项6 | free6 | varchar(60) |  | 字符串 (String) |
| 80 | free7 | 自由项7 | free7 | varchar(60) |  | 字符串 (String) |
| 81 | free8 | 自由项8 | free8 | varchar(60) |  | 字符串 (String) |
| 82 | free9 | 自由项9 | free9 | varchar(60) |  | 字符串 (String) |
| 83 | free10 | 自由项10 | free10 | varchar(60) |  | 字符串 (String) |
| 84 | freevalue1 | 分录自定义项1 | freevalue1 | varchar(50) |  | 字符串 (String) |
| 85 | freevalue2 | 分录自定义项2 | freevalue2 | varchar(50) |  | 字符串 (String) |
| 86 | freevalue3 | 分录自定义项3 | freevalue3 | varchar(50) |  | 字符串 (String) |
| 87 | freevalue4 | 分录自定义项4 | freevalue4 | varchar(50) |  | 字符串 (String) |
| 88 | freevalue5 | 分录自定义项5 | freevalue5 | varchar(50) |  | 字符串 (String) |
| 89 | freevalue6 | 分录自定义项6 | freevalue6 | varchar(50) |  | 字符串 (String) |
| 90 | freevalue7 | 分录自定义项7 | freevalue7 | varchar(50) |  | 字符串 (String) |
| 91 | freevalue8 | 分录自定义项8 | freevalue8 | varchar(50) |  | 字符串 (String) |
| 92 | freevalue9 | 分录自定义项9 | freevalue9 | varchar(50) |  | 字符串 (String) |
| 93 | freevalue10 | 分录自定义项10 | freevalue10 | varchar(50) |  | 字符串 (String) |
| 94 | freevalue11 | 分录自定义项11 | freevalue11 | varchar(50) |  | 字符串 (String) |
| 95 | freevalue12 | 分录自定义项12 | freevalue12 | varchar(50) |  | 字符串 (String) |
| 96 | freevalue13 | 分录自定义项13 | freevalue13 | varchar(50) |  | 字符串 (String) |
| 97 | freevalue14 | 分录自定义项14 | freevalue14 | varchar(50) |  | 字符串 (String) |
| 98 | freevalue15 | 分录自定义项15 | freevalue15 | varchar(50) |  | 字符串 (String) |
| 99 | freevalue16 | 分录自定义项16 | freevalue16 | varchar(50) |  | 字符串 (String) |
| 100 | freevalue17 | 分录自定义项17 | freevalue17 | varchar(50) |  | 字符串 (String) |
| 101 | freevalue18 | 分录自定义项18 | freevalue18 | varchar(50) |  | 字符串 (String) |
| 102 | freevalue19 | 分录自定义项19 | freevalue19 | varchar(50) |  | 字符串 (String) |
| 103 | freevalue20 | 分录自定义项20 | freevalue20 | varchar(50) |  | 字符串 (String) |
| 104 | freevalue21 | 分录自定义项21 | freevalue21 | varchar(50) |  | 字符串 (String) |
| 105 | freevalue22 | 分录自定义项22 | freevalue22 | varchar(50) |  | 字符串 (String) |
| 106 | freevalue23 | 分录自定义项23 | freevalue23 | varchar(50) |  | 字符串 (String) |
| 107 | freevalue24 | 分录自定义项24 | freevalue24 | varchar(50) |  | 字符串 (String) |
| 108 | freevalue25 | 分录自定义项25 | freevalue25 | varchar(50) |  | 字符串 (String) |
| 109 | freevalue26 | 分录自定义项26 | freevalue26 | varchar(50) |  | 字符串 (String) |
| 110 | freevalue27 | 分录自定义项27 | freevalue27 | varchar(50) |  | 字符串 (String) |
| 111 | freevalue28 | 分录自定义项28 | freevalue28 | varchar(50) |  | 字符串 (String) |
| 112 | freevalue29 | 分录自定义项29 | freevalue29 | varchar(50) |  | 字符串 (String) |
| 113 | freevalue30 | 分录自定义项30 | freevalue30 | varchar(50) |  | 字符串 (String) |