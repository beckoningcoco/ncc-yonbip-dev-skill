# |<<

**票据帐日发生额余额 (batm_billacc_dailysum / nc.vo.batm.fbmvo.BillAccDailySumVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/211.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dailysum | 主键 | pk_dailysum | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织pk | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | tallydate | 记账日期 | tallydate | char(19) |  | 日期 (UFDate) |
| 4 | billclass | 票据大类 | billclass | int |  | 整数 (Integer) |
| 5 | pk_billtype | 票据类型 | pk_billtype | varchar(20) |  | 票据类型 (notetype) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | direction | 票据帐方向 | direction | int |  | 整数 (Integer) |
| 8 | lendersum | 贷方发生额度 | lendersum | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | glllendersum | 全局贷方发生额度本币 | glllendersum | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | glclendersum | 集团贷方发生额度本币 | glclendersum | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | olclendersum | 组织贷方发生额度本币 | olclendersum | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | debitsum | 借方发生额度 | debitsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | glldebitsum | 全局借方发生额度本币 | glldebitsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | glcdebitsum | 集团借方发生额度 | glcdebitsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | olcdebitsum | 组织借方发生额度 | olcdebitsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 17 | consignbanksum | 托收发生额度 | consignbanksum | decimal(28, 8) |  | 金额 (UFMoney) |
| 18 | gllconsignbanksum | 全局托收发生额度本币 | gllconsignbanksum | decimal(28, 8) |  | 金额 (UFMoney) |
| 19 | glcconsignbanksum | 集团托收发生额度本币 | glcconsignbanksum | decimal(28, 8) |  | 金额 (UFMoney) |
| 20 | olcconsignbanksum | 组织托收发生额度本币 | olcconsignbanksum | decimal(28, 8) |  | 金额 (UFMoney) |
| 21 | endoresum | 背书发生额度 | endoresum | decimal(28, 8) |  | 金额 (UFMoney) |
| 22 | gllendoresum | 全局背书发生额度本币 | gllendoresum | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | glcendoresum | 集团背书发生额度本币 | glcendoresum | decimal(28, 8) |  | 金额 (UFMoney) |
| 24 | olcendoresum | 组织背书发生额度本币 | olcendoresum | decimal(28, 8) |  | 金额 (UFMoney) |
| 25 | discountsum | 贴现发生额度 | discountsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 26 | glldiscountsum | 全局贴现发生额度本币 | glldiscountsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 27 | glcdiscountsum | 集团贴现发生额度本币 | glcdiscountsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 28 | olcdiscountsum | 组织贴现发生额度本币 | olcdiscountsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 29 | redeploysum | 内部调剂发生额度 | redeploysum | decimal(28, 8) |  | 金额 (UFMoney) |
| 30 | gllredeploysum | 全局内部调剂发生额度本币 | gllredeploysum | decimal(28, 8) |  | 金额 (UFMoney) |
| 31 | glcredeploysum | 集团内部调剂发生额度本币 | glcredeploysum | decimal(28, 8) |  | 金额 (UFMoney) |
| 32 | olcredeploysum | 组织内部调剂发生额度本币 | olcredeploysum | decimal(28, 8) |  | 金额 (UFMoney) |
| 33 | innertranssum | 内部转让发生额度 | innertranssum | decimal(28, 8) |  | 金额 (UFMoney) |
| 34 | gllinnertranssum | 全局内部转让发生额度本币 | gllinnertranssum | decimal(28, 8) |  | 金额 (UFMoney) |
| 35 | glcinnertranssum | 集团内部转让发生额度本币 | glcinnertranssum | decimal(28, 8) |  | 金额 (UFMoney) |
| 36 | olcinnertranssum | 组织内部转让发生额度本币 | olcinnertranssum | decimal(28, 8) |  | 金额 (UFMoney) |
| 37 | yesterdaybalance | 昨日余额 | yesterdaybalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 38 | balance | 余额 | balance | decimal(28, 8) |  | 金额 (UFMoney) |
| 39 | olcbalance | 余额本币 | olcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 40 | glcbalance | 余额集团本币 | glcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 41 | gllcbalance | 余额全局本币 | gllcbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 42 | usablebalance | 可用余额 | usablebalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 43 | averageyearbalance | 年平均余额 | averageyearbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 44 | signsum | 签发发生额度 | signsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 45 | gllsignsum | 全局签发发生额度 | gllsignsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 46 | glcsignsum | 集团签发发生额度 | glcsignsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 47 | olcsignsum | 组织签发发生额度 | olcsignsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 48 | acceptsum | 付款发生额度 | acceptsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 49 | gllacceptsum | 全局付款发生额度 | gllacceptsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 50 | glcacceptsum | 集团付款发生额度 | glcacceptsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 51 | olcacceptsum | 组织付款发生额度 | olcacceptsum | decimal(28, 8) |  | 金额 (UFMoney) |
| 52 | balancesum | 余额总和 | balancesum | decimal(28, 8) |  | 金额 (UFMoney) |
| 53 | olcbalancesum | 余额本币总和 | olcbalancesum | decimal(28, 8) |  | 金额 (UFMoney) |
| 54 | glcbalancesum | 余额集团本币总和 | glcbalancesum | decimal(28, 8) |  | 金额 (UFMoney) |
| 55 | gllcbalancesum | 余额全局本币总和 | gllcbalancesum | decimal(28, 8) |  | 金额 (UFMoney) |
| 56 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |