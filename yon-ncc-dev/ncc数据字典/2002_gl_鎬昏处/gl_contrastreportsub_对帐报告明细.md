# |<<

**对帐报告明细 (gl_contrastreportsub / nc.vo.gl.contrast.report.ContrastReportSubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2379.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastreportsub | 对帐报告明细标识 | pk_contrastreportsub | char(20) | √ | 主键 (UFID) |
| 2 | pk_contrastreport | 对帐报告标识 | pk_contrastreport | char(20) |  | 主键 (UFID) |
| 3 | pk_selfconfirm | 本方确认人 | pk_selfconfirm | char(20) |  | 主键 (UFID) |
| 4 | pk_otherconfirm | 对方确认人 | pk_otherconfirm | char(20) |  | 主键 (UFID) |
| 5 | pk_contrastrule | 内部交易规则标识 | pk_contrastrule | char(20) |  | 主键 (UFID) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 字符串 (String) |
| 7 | un_debitamountself | 本方借方未对原币 | un_debitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 8 | un_creditamountself | 本方贷方未对原币 | un_creditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 9 | un_localdebitamountself | 本方借方未对账簿本币 | un_localdebitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 10 | un_localcreditamountself | 本方贷方未对账簿本币 | un_localcreditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | un_groupdebitamountself | 本方借方未对集团本币 | un_groupdebitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 12 | un_groupcreditamountself | 本方贷方未对集团本币 | un_groupcreditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 13 | un_globalcreditamountself | 本方贷方未对全局本币 | un_globalcreditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 14 | un_globaldebitamountself | 本方借方未对全局本币 | un_globaldebitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 15 | un_debitquantityself | 本方借方未对数量 | un_debitquantityself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 16 | un_creditquantityself | 本方贷方未对数量 | un_creditquantityself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 17 | un_debitamountother | 对方借方未对原币 | un_debitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 18 | un_creditamountother | 对方贷方未对原币 | un_creditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 19 | un_localdebitamountother | 对方借方未对账簿本币 | un_localdebitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 20 | un_localcreditamountother | 对方贷方未对账簿本币 | un_localcreditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 21 | un_groupcreditamountother | 对方贷方未对集团本币 | un_groupcreditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 22 | un_groupdebitamountother | 对方借方未对集团本币 | un_groupdebitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 23 | un_globalcreditamountother | 对方贷方未对全局本币 | un_globalcreditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 24 | un_globaldebitamountother | 对方借方未对全局本币 | un_globaldebitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 25 | un_creditquantityother | 对方贷方未对数量 | un_creditquantityother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 26 | un_debitquantityother | 对方借方未对数量 | un_debitquantityother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 27 | debitamountself | 本方借方对符金额 | debitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 28 | creditamountself | 本方贷方对符数据 | creditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 29 | localdebitamountself | 本方借方已对账簿本币 | localdebitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 30 | localcreditamountself | 本方贷方已对账簿本币 | localcreditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 31 | groupdebitamountself | 本方借方已对集团本币 | groupdebitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 32 | groupcreditamountself | 本方贷方已对集团本币 | groupcreditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 33 | globaldebitamountself | 本方借方已对全局本币 | globaldebitamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 34 | globalcreditamountself | 本方贷方已对全局本币 | globalcreditamountself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 35 | debitquantityself | 本方借方已对数量 | debitquantityself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 36 | creditquantityself | 本方贷方已对数量 | creditquantityself | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 37 | debitamountother | 对方借方已对原币 | debitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 38 | creditamountother | 对方贷方已对原币 | creditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 39 | localdebitamountother | 对方借方已对账簿本币 | localdebitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 40 | localcreditamountother | 对方贷方已对账簿本币 | localcreditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 41 | groupcreditamountother | 对方贷方已对集团本币 | groupcreditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 42 | groupdebitamountother | 对方借方已对集团本币 | groupdebitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 43 | globalcreditamountother | 对方贷方已对全局本币 | globalcreditamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 44 | globaldebitamountother | 对方借方已对全局本币 | globaldebitamountother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 45 | debitquantityother | 对方借方已对数量 | debitquantityother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 46 | creditquantityother | 对方贷方已对数量 | creditquantityother | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 47 | selfdirection | 本方方向 | selfdirection | char(1) |  | 字符串 (String) |
| 48 | otherdirection | 对方方向 | otherdirection | char(1) |  | 字符串 (String) |
| 49 | assid | 辅助核算 | assid | char(20) |  | 主键 (UFID) |
| 50 | self_accountingbook | 本方核算账簿 | self_accountingbook | char(20) |  | 主键 (UFID) |
| 51 | other_accountingbook | 对方核算账簿 | other_accountingbook | char(20) |  | 主键 (UFID) |
| 52 | isbuilded | 是否生成 | isbuilded | int |  | 整数 (Integer) |
| 53 | isconfirmed | 是否确认 | isconfirmed | char(1) |  | 布尔类型 (UFBoolean) |
| 54 | typevalue1 | 档案类型值1 | typevalue1 | varchar(220) |  | 字符串 (String) |
| 55 | typevalue2 | 档案类型值2 | typevalue2 | varchar(220) |  | 字符串 (String) |
| 56 | typevalue3 | 档案类型值3 | typevalue3 | varchar(220) |  | 字符串 (String) |
| 57 | typevalue4 | 档案类型值4 | typevalue4 | varchar(220) |  | 字符串 (String) |
| 58 | typevalue5 | 档案类型值5 | typevalue5 | varchar(220) |  | 字符串 (String) |
| 59 | typevalue6 | 档案类型值6 | typevalue6 | varchar(220) |  | 字符串 (String) |
| 60 | typevalue7 | 档案类型值7 | typevalue7 | varchar(220) |  | 字符串 (String) |
| 61 | typevalue8 | 档案类型值8 | typevalue8 | varchar(220) |  | 字符串 (String) |
| 62 | isself | 是否本方 | isself | char(1) |  | 布尔类型 (UFBoolean) |