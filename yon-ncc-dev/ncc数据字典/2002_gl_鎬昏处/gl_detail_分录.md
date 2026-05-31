# |<<

**分录 (gl_detail / nc.vo.gl.voucher.DetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2402.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 分录主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) | √ | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 6 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | unitname | 业务单元名称 | unitname | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 8 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 11 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 12 | explanation | 摘要内容 | explanation | varchar(400) |  | 字符串 (String) |
| 13 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 14 | excrate1 | 汇率1 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 15 | excrate2 | 汇率2 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 16 | excrate3 | 集团汇率 | excrate3 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 17 | excrate4 | 全局汇率 | excrate4 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 18 | debitquantity | 借方数量 | debitquantity | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 19 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 20 | fracdebitamount | 辅币借发生额 | fracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 21 | localdebitamount | 账簿本币借发生额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 22 | groupdebitamount | 集团本币借发生额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 23 | globaldebitamount | 全局本币借发生额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 24 | creditquantity | 贷方数量 | creditquantity | decimal(20, 8) |  | 数值 (UFDouble) | 0 |
| 25 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 26 | fraccreditamount | 辅币贷发生额 | fraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 27 | localcreditamount | 账簿本币贷发生额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 28 | groupcreditamount | 集团本币贷发生额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 29 | globalcreditamount | 全局本币贷发生额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 30 | modifyflag | 修改标志 | modifyflag | varchar(50) |  | 字符串 (String) |
| 31 | recieptclass | 单据处理类 | recieptclass | varchar(60) |  | 字符串 (String) |
| 32 | oppositesubj | 对方科目 | oppositesubj | varchar(200) |  | 字符串 (String) |
| 33 | contrastflag | 对账标志 | contrastflag | int |  | 整数 (Integer) |
| 34 | errmessage | 错误信息 | errmessage | varchar(90) |  | 字符串 (String) |
| 35 | errmessageh | 标错的历史信息 | errmessageh | varchar(90) |  | 字符串 (String) |
| 36 | checkstyle | 结算方式 | checkstyle | varchar(20) |  | 结算方式 (balatype) |
| 37 | checkno | 票据编码 | checkno | varchar(30) |  | 字符串 (String) |
| 38 | checkdate | 票据日期 | checkdate | char(19) |  | 日期 (UFDate) |
| 39 | verifyno | 核销号 | verifyno | varchar(60) |  | 字符串 (String) |
| 40 | verifydate | 核销日期 | verifydate | char(19) |  | 日期 (UFDate) |
| 41 | billtype | 票据类型 | billtype | varchar(20) |  | 票据类型 (notetype) |
| 42 | bankaccount | 银行帐户 | bankaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 43 | pk_sourcepk | 折算来源 | pk_sourcepk | char(20) |  | 主键 (UFID) |
| 44 | convertflag | 是否折算 | convertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | direction | 发生额方向 | direction | char(1) |  | 布尔类型 (UFBoolean) |
| 46 | pk_vouchertypev | 凭证类别主键 | pk_vouchertypev | varchar(20) |  | 凭证类别 (vouchertype) |
| 47 | yearv | 会计年度 | yearv | char(4) | √ | 主键 (UFID) |
| 48 | periodv | 会计期间 | periodv | char(2) | √ | 主键 (UFID) |
| 49 | nov | 凭证编码 | nov | int |  | 整数 (Integer) |
| 50 | prepareddatev | 制单日期 | prepareddatev | char(19) |  | 日期 (UFDate) |
| 51 | pk_managerv | 记账人 | pk_managerv | varchar(20) |  | 用户 (user) |
| 52 | discardflagv | 作废标志 | discardflagv | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | voucherkindv | 凭证类型 | voucherkindv | int |  | 整数 (Integer) |
| 54 | adjustperiod | 调整期间 | adjustperiod | varchar(3) |  | 字符串 (String) |
| 55 | signdatev | 签字日期 | signdatev | char(19) |  | 日期 (UFDate) |
| 56 | pk_systemv | 制单系统 | pk_systemv | char(20) |  | 主键 (UFID) |
| 57 | pk_offerdetail | 被冲销的分录 | pk_offerdetail | char(20) |  | 主键 (UFID) |
| 58 | isdifflag | 是否差异凭证 | isdifflag | char(1) |  | 布尔类型 (UFBoolean) |
| 59 | busireconno | 业务系统协同号 | busireconno | varchar(60) |  | 字符串 (String) |
| 60 | netbankflag | 网银对账标识码 | netbankflag | varchar(50) |  | 字符串 (String) |
| 61 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 62 | cashflow | 现金流量 | cashflow | varchar(50) |  | 字符串 (String) |
| 63 | pk_unit_v | 业务单元版本 | pk_unit_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 64 | pk_liabilitycenter | 利润中心 | pk_liabilitycenter | varchar(20) |  | 利润中心 (profitcenter) |
| 65 | pk_liabilitycenter_v | 利润中心版本 | pk_liabilitycenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 66 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 67 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 68 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |
| 69 | free4 | 预留字段4 | free4 | varchar(60) |  | 字符串 (String) |
| 70 | free5 | 预留字段5 | free5 | varchar(60) |  | 字符串 (String) |
| 71 | free6 | 预留字段6 | free6 | varchar(60) |  | 字符串 (String) |
| 72 | free7 | 预留字段7 | free7 | varchar(60) |  | 字符串 (String) |
| 73 | free8 | 预留字段8 | free8 | varchar(60) |  | 字符串 (String) |
| 74 | free9 | 预留字段9 | free9 | varchar(60) |  | 字符串 (String) |
| 75 | free10 | 预留字段10 | free10 | varchar(60) |  | 字符串 (String) |
| 76 | free11 | 预留字段11 | free11 | varchar(60) |  | 字符串 (String) |
| 77 | free12 | 预留字段12 | free12 | varchar(60) |  | 字符串 (String) |
| 78 | free13 | 预留字段13 | free13 | varchar(60) |  | 字符串 (String) |
| 79 | free14 | 预留字段14 | free14 | varchar(60) |  | 字符串 (String) |
| 80 | free15 | 预留字段15 | free15 | varchar(60) |  | 字符串 (String) |
| 81 | free16 | 预留字段16 | free16 | varchar(60) |  | 字符串 (String) |
| 82 | free17 | 预留字段17 | free17 | varchar(60) |  | 字符串 (String) |
| 83 | free18 | 预留字段18 | free18 | varchar(60) |  | 字符串 (String) |
| 84 | free19 | 预留字段19 | free19 | varchar(60) |  | 字符串 (String) |
| 85 | free20 | 预留字段20 | free20 | varchar(60) |  | 字符串 (String) |
| 86 | free21 | 预留字段21 | free21 | varchar(60) |  | 字符串 (String) |
| 87 | free22 | 预留字段22 | free22 | varchar(60) |  | 字符串 (String) |
| 88 | free23 | 预留字段23 | free23 | varchar(60) |  | 字符串 (String) |
| 89 | free24 | 预留字段24 | free24 | varchar(60) |  | 字符串 (String) |
| 90 | free25 | 预留字段25 | free25 | varchar(60) |  | 字符串 (String) |
| 91 | free26 | 预留字段26 | free26 | varchar(60) |  | 字符串 (String) |
| 92 | free27 | 预留字段27 | free27 | varchar(60) |  | 字符串 (String) |
| 93 | free28 | 预留字段28 | free28 | varchar(60) |  | 字符串 (String) |
| 94 | free29 | 预留字段29 | free29 | varchar(60) |  | 字符串 (String) |
| 95 | free30 | 预留字段30 | free30 | varchar(60) |  | 字符串 (String) |