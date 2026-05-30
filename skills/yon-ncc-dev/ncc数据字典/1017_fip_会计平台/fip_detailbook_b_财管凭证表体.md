# |<<

**财管凭证表体 (fip_detailbook_b / nc.vo.fip.detailbook.DetailBookItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2230.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dbitem | 表体主键 | pk_dbitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_fiorg | 财务组织 | pk_fiorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_fiorg_v | 财务组织版本 | pk_fiorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织 (org) |
| 8 | pk_unit_v | 业务单元版本 | pk_unit_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 10 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 11 | rowno | 转换模板分录行号 | rowno | int |  | 整数 (Integer) |
| 12 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 13 | pk_accasoa2 | 管理科目 | pk_accasoa2 | varchar(20) |  | 会计科目 (accasoa) |
| 14 | pk_factorasoa | 要素 | pk_factorasoa | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 15 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 16 | assid | 辅助核算 | assid | char(20) |  | 字符串 (String) |
| 17 | explanation | 摘要内容 | explanation | varchar(400) |  | 字符串 (String) |
| 18 | price | 单价 | price | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 19 | excrate1 | 汇率1 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 20 | excrate2 | 折本汇率 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 21 | excrate3 | 集团汇率 | excrate3 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 22 | excrate4 | 全局汇率 | excrate4 | decimal(15, 8) |  | 数值 (UFDouble) | 0 |
| 23 | debitquantity | 借方数量 | debitquantity | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 24 | debitamount | 原币借发生额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 25 | fracdebitamount | 辅币借发生额 | fracdebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 26 | localdebitamount | 组织本币借发生额 | localdebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 27 | groupdebitamount | 集团本币借发生额 | groupdebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 28 | globaldebitamount | 全局本币借发生额 | globaldebitamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 29 | creditquantity | 贷方数量 | creditquantity | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 30 | creditamount | 原币贷发生额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 31 | fraccreditamount | 辅币贷发生额 | fraccreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 32 | localcreditamount | 组织本币贷发生额 | localcreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 33 | groupcreditamount | 集团本币贷发生额 | groupcreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 34 | globalcreditamount | 全局本币贷发生额 | globalcreditamount | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 35 | oppositesubj | 对方科目 | oppositesubj | varchar(200) |  | 字符串 (String) |
| 36 | direction | 发生额方向 | direction | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | pk_vouchertypev | 总账凭证类别 | pk_vouchertypev | varchar(20) |  | 凭证类别 (vouchertype) |
| 38 | resavouchertypev | 责任凭证类别 | resavouchertypev | varchar(20) |  | 字符串 (String) |
| 39 | yearv | 会计年度 | yearv | char(4) |  | 字符串 (String) |
| 40 | periodv | 会计期间 | periodv | char(2) |  | 字符串 (String) |
| 41 | prepareddatev | 制单日期 | prepareddatev | char(19) |  | 日期 (UFDate) |
| 42 | voucherkindv | 凭证类型 | voucherkindv | int |  | 整数 (Integer) |
| 43 | pk_systemv | 制单系统 | pk_systemv | varchar(50) |  | 字符串 (String) |
| 44 | pk_subjcode | 收支项目 | pk_subjcode | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 45 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 46 | supplier | 供应商 | supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 47 | pk_cust_supplier | 客商 | pk_cust_supplier | varchar(20) |  | 客商 (custsupplier) |
| 48 | pk_insidesupplier | 内部客商 | pk_insidesupplier | varchar(20) |  | 客商 (custsupplier) |
| 49 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 50 | pk_deptid | 部门 | pk_deptid | varchar(20) |  | 组织_部门 (dept) |
| 51 | pk_deptid_v | 部门版本 | pk_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 52 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 53 | pk_material_v | 物料版本 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 54 | pk_marbasclass | 物料基本分类 | pk_marbasclass | char(20) |  | 主键 (UFID) |
| 55 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 56 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 57 | modifyflag | 修改标志 | modifyflag | char(20) |  | 字符串 (String) |
| 58 | unitname | 业务单元名称 | unitname | varchar(50) |  | 字符串 (String) |
| 59 | checkstyle | 结算方式 | checkstyle | varchar(20) |  | 结算方式 (balatype) |
| 60 | checkno | 票据编码 | checkno | varchar(30) |  | 字符串 (String) |
| 61 | checkdate | 票据日期 | checkdate | char(19) |  | 日期 (UFDate) |
| 62 | verifyno | 核销号 | verifyno | varchar(60) |  | 字符串 (String) |
| 63 | verifydate | 业务日期 | verifydate | char(19) |  | 日期 (UFDate) |
| 64 | billtype | 票据类型 | billtype | varchar(20) |  | 票据类型 (notetype) |
| 65 | innerbusdate | 内部交易业务日期 | innerbusdate | char(19) |  | 日期 (UFDate) |
| 66 | innerbusno | 内部交易业务号 | innerbusno | varchar(60) |  | 字符串 (String) |
| 67 | bankaccount | 银行账户 | bankaccount | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 68 | busireconno | 业务系统协同号 | busireconno | varchar(60) |  | 字符串 (String) |
| 69 | netbankflag | 银行对账标识 | netbankflag | varchar(50) |  | 字符串 (String) |
| 70 | cashflowitem | 现金流量项目 | cashflowitem | varchar(20) |  | 现金流量项目 (cashflow) |
| 71 | pk_innercorp | 内部单位 | pk_innercorp | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 72 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 73 | pk_pcenter_v | 利润中心版本 | pk_pcenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 74 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 75 | unit | 计量单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 76 | unit2 | 辅计量单位 | unit2 | varchar(20) |  | 计量单位 (measdoc) |
| 77 | debitquantity2 | 借方辅数量 | debitquantity2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 78 | creditquantity2 | 贷方辅数量 | creditquantity2 | decimal(28, 8) |  | 数值 (UFDouble) |
| 79 | srcbillid | 来源单据主键 | srcbillid | varchar(50) |  | 字符串 (String) |
| 80 | srcrowid | 来源单据行主键 | srcrowid | varchar(50) |  | 字符串 (String) |
| 81 | uniqueid | 来源单据行标识 | uniqueid | varchar(50) |  | 字符串 (String) |
| 82 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 83 | istrans2gl | 是否传总账 | istrans2gl | char(1) |  | 布尔类型 (UFBoolean) |
| 84 | istrans2ra | 是否传责任账 | istrans2ra | char(1) |  | 布尔类型 (UFBoolean) |
| 85 | istrans2cm | 是否传成本凭证单 | istrans2cm | char(1) |  | 布尔类型 (UFBoolean) |
| 86 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 87 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 88 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 89 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 90 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 91 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 92 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 93 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 94 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 95 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 96 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 97 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 98 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 99 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 100 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 101 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 102 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 103 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 104 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 105 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 106 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 107 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 108 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 109 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 110 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 111 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 112 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 113 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 114 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 115 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 116 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 117 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 118 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 119 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 120 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 121 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 122 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 123 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 124 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 125 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 126 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 127 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 128 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 129 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 130 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 131 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 132 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 133 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 134 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 135 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |