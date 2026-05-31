# |<<

**最后一页数据 (gl_lastpagedata / nc.vo.gl.lastPageDate.lastpagedata)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2429.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lastpagedata | 最后一页数据表主键 | pk_lastpagedata | char(20) | √ | 主键 (UFID) |
| 2 | pk_querycondition | 查询条件标识 | pk_querycondition | varchar(20) |  | 查询条件 (querycondition) |
| 3 | year | 年度 | year | char(4) |  | 主键 (UFID) |
| 4 | period | 期间 | period | char(2) |  | 主键 (UFID) |
| 5 | date | 日期 | date | char(10) |  | 日期 (UFDate) |
| 6 | daybak | 显示日期 | daybak | char(10) |  | 日期 (UFDate) |
| 7 | pk_vouchertype | 凭证类别主键 | pk_vouchertype | char(20) |  | 主键 (UFID) |
| 8 | vouchertypename | 凭证类别名称 | vouchertypename | varchar(20) |  | 字符串 (String) |
| 9 | pk_currtype | 币种主键 | pk_currtype | char(20) |  | 主键 (UFID) |
| 10 | currtypename | 币种名称 | currtypename | varchar(20) |  | 字符串 (String) |
| 11 | pk_voucher | 凭证主键 | pk_voucher | char(20) |  | 主键 (UFID) |
| 12 | explanation | 摘要 | explanation | varchar(200) |  | 字符串 (String) |
| 13 | voucherno | 凭证号 | voucherno | varchar(20) |  | 字符串 (String) |
| 14 | excrate1 | 折辅汇率 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) |
| 15 | excrate2 | 折本汇率 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) |
| 16 | price | 单价 | price | decimal(20, 8) |  | 数值 (UFDouble) |
| 17 | averageprice | 平均单价 | averageprice | decimal(20, 8) |  | 数值 (UFDouble) |
| 18 | pk_accsubj | 科目主键 | pk_accsubj | char(20) |  | 主键 (UFID) |
| 19 | subjcode | 科目编码 | subjcode | varchar(30) |  | 字符串 (String) |
| 20 | subjname | 科目名称 | subjname | varchar(40) |  | 字符串 (String) |
| 21 | oppositesubj | 对方科目 | oppositesubj | varchar(200) |  | 字符串 (String) |
| 22 | subjdirect | 科目方向 | subjdirect | int |  | 整数 (Integer) |
| 23 | balancedirect | 余额方向 | balancedirect | int |  | 整数 (Integer) |
| 24 | bothoriflag | 是否双向显示 | bothoriflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | assid | 辅助核算ID | assid | char(20) |  | 主键 (UFID) |
| 26 | settleinfo | 结算信息 | settleinfo | varchar(100) |  | 字符串 (String) |
| 27 | digitnum | 小数位数 | digitnum | int |  | 整数 (Integer) |
| 28 | rowproperty | 行属性 | rowproperty | char(2) |  | 主键 (UFID) |
| 29 | subfieldproperty | 小计合计属性 | subfieldproperty | char(2) |  | 主键 (UFID) |
| 30 | debitquant | 借方数量 | debitquant | decimal(20, 8) |  | 数值 (UFDouble) |
| 31 | debitlocalamount | 借方本币金额 | debitlocalamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 32 | debitamount | 借方原币金额 | debitamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 33 | debitfracamount | 借方辅币金额 | debitfracamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 34 | creditquant | 贷方数量 | creditquant | decimal(20, 8) |  | 数值 (UFDouble) |
| 35 | creditlocalamount | 贷方本币金额 | creditlocalamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 36 | creditamount | 贷方原币金额 | creditamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 37 | creditfracamount | 贷方辅币金额 | creditfracamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 38 | baldebitquant | 借方余额数量 | baldebitquant | decimal(20, 8) |  | 数值 (UFDouble) |
| 39 | baldebitlocalamount | 借方本币余额 | baldebitlocalamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 40 | baldebitamount | 借方原币余额 | baldebitamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 41 | baldebitfracamount | 借方辅币余额 | baldebitfracamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 42 | balcreditquant | 贷方余额数量 | balcreditquant | decimal(20, 8) |  | 数值 (UFDouble) |
| 43 | balcreditlocalamount | 贷方本币余额 | balcreditlocalamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 44 | balcreditamount | 贷方原币余额 | balcreditamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 45 | balcreditfracamount | 贷方辅币余额 | balcreditfracamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 46 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 47 | glbookcode | 帐簿编码 | glbookcode | varchar(60) |  | 字符串 (String) |
| 48 | glbookname | 帐簿名称 | glbookname | varchar(100) |  | 字符串 (String) |
| 49 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 50 | orgcode | 主体编码 | orgcode | varchar(60) |  | 字符串 (String) |
| 51 | orgname | 主体名称 | orgname | varchar(100) |  | 字符串 (String) |
| 52 | pk_setofbook | 核算账簿 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 53 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 54 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 55 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |
| 56 | free4 | 预留字段4 | free4 | varchar(60) |  | 字符串 (String) |
| 57 | free5 | 预留字段5 | free5 | varchar(60) |  | 字符串 (String) |