# |<<

**对帐数据 (gl_ContrastData / nc.vo.gl.contrast.data.ContrastDataVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2373.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastdata | 对账分录数据标识 | pk_contrastdata | char(20) | √ | 主键 (UFID) |
| 2 | pk_detail | 分录标识 | pk_detail | char(20) | √ | 主键 (UFID) |
| 3 | pk_voucher | 凭证标识 | pk_voucher | char(20) |  | 主键 (UFID) |
| 4 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 5 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 6 | debitquantity | 借方数量 | debitquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | localdebitamount | 账簿本币借发生额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | groupdebitamount | 集团本币借发生额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | globaldebitamount | 全局本币借发生额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | creditquantity | 贷方数量 | creditquantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | localcreditamount | 账簿本币贷发生额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | groupcreditamount | 集团本币贷发生额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | globalcreditamount | 全局本币贷发生额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | pk_vouchertypev | 凭证类别主键 | pk_vouchertypev | varchar(20) |  | 凭证类别 (vouchertype) |
| 17 | yearv | 会计年度 | yearv | varchar(4) |  | 字符串 (String) |
| 18 | periodv | 会计期间 | periodv | varchar(2) |  | 字符串 (String) |
| 19 | prepareddatev | 制单日期 | prepareddatev | char(19) |  | 日期 (UFDate) |
| 20 | pk_managerv | 记账人 | pk_managerv | char(20) |  | 主键 (UFID) |
| 21 | pk_othercorp | 内部客商对方公司pk | pk_othercorp | char(20) |  | 主键 (UFID) |
| 22 | pk_otherorgbook | 内部客商对方公司pk_glorgbook | pk_otherorgbook | char(20) |  | 主键 (UFID) |
| 23 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 24 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 25 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 26 | assidarray | 辅助核算项 | assidarray | char(20) |  | 主键 (UFID) |
| 27 | pk_innerorg | 内部交易单位 | pk_innerorg | char(20) |  | 主键 (UFID) |
| 28 | pk_innersob | 交易单位帐簿主键 | pk_innersob | char(20) |  | 主键 (UFID) |
| 29 | innerbusdate | 内部交易业务日期 | innerbusdate | char(19) |  | 字符串 (String) |
| 30 | innerbusno | 内部交易业务号 | innerbusno | varchar(60) |  | 字符串 (String) |
| 31 | iscontrasted | 是否对帐 | iscontrasted | char(1) |  | 布尔类型 (UFBoolean) |
| 32 | pk_customer | 客商档案标识 | pk_customer | char(20) |  | 主键 (UFID) |
| 33 | voucherno | 凭证号 | voucherno | int |  | 整数 (Integer) |
| 34 | detailno | 分录号 | detailno | int |  | 整数 (Integer) |
| 35 | explanation | 分录摘要 | explanation | varchar(150) |  | 字符串 (String) |
| 36 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 37 | checkstyle | 结算方式 | checkstyle | char(20) |  | 主键 (UFID) |
| 38 | checkno | 结算号 | checkno | varchar(30) |  | 字符串 (String) |
| 39 | checkdate | 结算日期 | checkdate | char(19) |  | 日期 (UFDate) |
| 40 | isinit | 是否期初 | isinit | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | yearinit | 是否年初 | yearinit | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | pk_contrastrule | 内部交易规则标识 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 43 | pk_corpcontrast | 对账主表标识 | pk_corpcontrast | char(20) |  | 主键 (UFID) |
| 44 | accountprop | 账簿属性 | accountprop | char(20) |  | 主键 (UFID) |
| 45 | discardflag | 作废标记 | discardflag | char(1) |  | 布尔类型 (UFBoolean) |
| 46 | totalcredit | 凭证贷方合计 | totalcredit | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | totaldebit | 凭证借方合计 | totaldebit | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | vouchexplanation | 凭证摘要 | vouchexplanation | varchar(150) |  | 字符串 (String) |
| 49 | pk_sourcepk | 源凭证标识 | pk_sourcepk | char(20) |  | 主键 (UFID) |
| 50 | voucherkind | 凭证类别 | voucherkind | int |  | 整数 (Integer) |
| 51 | errmessage | 错误消息 | errmessage | varchar(60) |  | 字符串 (String) |
| 52 | busireconno | 业务协同号 | busireconno | varchar(60) |  | 字符串 (String) |
| 53 | convertflag | 折算标记 | convertflag | char(1) |  | 布尔类型 (UFBoolean) |
| 54 | pk_reconcilerule | 协同业务标识 | pk_reconcilerule | char(20) |  | 主键 (UFID) |
| 55 | pk_checked | 审核人 | pk_checked | char(20) |  | 主键 (UFID) |
| 56 | pk_prepared | 制单人 | pk_prepared | char(20) |  | 主键 (UFID) |
| 57 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | amountequal | 金额两清 | amountequal | char(1) |  | 布尔类型 (UFBoolean) |
| 59 | quantityequal | 数量两清 | quantityequal | char(1) |  | 布尔类型 (UFBoolean) |
| 60 | isreconcile | 是否协同 | isreconcile | char(1) |  | 布尔类型 (UFBoolean) |
| 61 | pk_system | 来源系统 | pk_system | varchar(50) |  | 字符串 (String) |