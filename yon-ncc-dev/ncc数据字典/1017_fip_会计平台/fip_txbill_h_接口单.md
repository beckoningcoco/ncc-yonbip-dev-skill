# |<<

**接口单 (fip_txbill_h / nc.vo.fip.txbill.TXBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2261.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_txbill | 主键 | pk_txbill | char(20) | √ | 主键 (UFID) |
| 2 | billno | 单据编号 | billno | varchar(20) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | busidate | 业务日期 | busidate | char(19) |  | 日期 (UFDate) |
| 8 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | pk_subjcode | 收支项目 | pk_subjcode | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 11 | unpaidamt | 未还金额 | unpaidamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 13 | supplier | 供应商 | supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 15 | pk_deptid | 部门 | pk_deptid | varchar(20) |  | 组织_部门 (dept) |
| 16 | pk_deptid_v | 部门版本 | pk_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 17 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 18 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 19 | pk_system | 来源系统 | pk_system | varchar(50) |  | 字符串 (String) |
| 20 | relationid | 来源标识 | relationid | varchar(50) |  | 字符串 (String) |
| 21 | pk_operator | 来源生效用户 | pk_operator | varchar(20) |  | 用户 (user) |
| 22 | billmoney | 来源金额 | billmoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 23 | billexplain | 来源备注 | billexplain | varchar(200) |  | 字符串 (String) |
| 24 | srcbillno | 来源单据编号 | srcbillno | varchar(20) |  | 字符串 (String) |
| 25 | srcbillid | 来源单据主键 | srcbillid | varchar(50) |  | 字符串 (String) |
| 26 | pk_srcbilltypeid | 来源单据类型 | pk_srcbilltypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 27 | pk_srctradetypeid | 来源交易类型 | pk_srctradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 28 | originbillid | 源头单据主键 | originbillid | varchar(50) |  | 字符串 (String) |
| 29 | originbillno | 源头单据编号 | originbillno | varchar(50) |  | 字符串 (String) |
| 30 | pk_originbilltypeid | 源头单据类型 | pk_originbilltypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 31 | pk_originradetypeid | 源头交易类型 | pk_originradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 32 | amount | 原币金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | amount_debit | 借方原币金额 | amount_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | amount_credit | 贷方原币金额 | amount_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | rate | 组织（账簿）本币汇率 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | local_amount | 组织（账簿）本币金额 | local_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | local_amount_debit | 借方组织（账簿）本币金额 | local_amount_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | local_amount_credit | 贷方组织（账簿）本币金额 | local_amount_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | grouprate | 集团本币汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | grouplocal | 集团本币金额 | grouplocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | grouplocal_debit | 借方集团本币金额 | grouplocal_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | grouplocal_credit | 贷方集团本币金额 | grouplocal_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | globalrate | 全局本币汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | globallocal | 全局本币金额 | globallocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | globallocal_debit | 借方全局本币金额 | globallocal_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | globallocal_credit | 贷方全局本币金额 | globallocal_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | period | 会计期间 | period | char(50) |  | 字符串 (String) |
| 48 | year | 年 | year | char(4) |  | 字符串 (String) |
| 49 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 71 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 72 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 73 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 74 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 75 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 76 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 77 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 78 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 79 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 80 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 81 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 82 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 83 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 84 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 85 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 86 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 87 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 88 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 89 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 90 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 91 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 92 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 93 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 94 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 95 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 96 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 97 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 98 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |
| 99 | def51 | 自定义项51 | def51 | varchar(101) |  | 自定义项 (Custom) |
| 100 | def52 | 自定义项52 | def52 | varchar(101) |  | 自定义项 (Custom) |
| 101 | def53 | 自定义项53 | def53 | varchar(101) |  | 自定义项 (Custom) |
| 102 | def54 | 自定义项54 | def54 | varchar(101) |  | 自定义项 (Custom) |
| 103 | def55 | 自定义项55 | def55 | varchar(101) |  | 自定义项 (Custom) |
| 104 | def56 | 自定义项56 | def56 | varchar(101) |  | 自定义项 (Custom) |
| 105 | def57 | 自定义项57 | def57 | varchar(101) |  | 自定义项 (Custom) |
| 106 | def58 | 自定义项58 | def58 | varchar(101) |  | 自定义项 (Custom) |
| 107 | def59 | 自定义项59 | def59 | varchar(101) |  | 自定义项 (Custom) |
| 108 | def60 | 自定义项60 | def60 | varchar(101) |  | 自定义项 (Custom) |
| 109 | def61 | 自定义项61 | def61 | varchar(101) |  | 自定义项 (Custom) |
| 110 | def62 | 自定义项62 | def62 | varchar(101) |  | 自定义项 (Custom) |
| 111 | def63 | 自定义项63 | def63 | varchar(101) |  | 自定义项 (Custom) |
| 112 | def64 | 自定义项64 | def64 | varchar(101) |  | 自定义项 (Custom) |
| 113 | def65 | 自定义项65 | def65 | varchar(101) |  | 自定义项 (Custom) |
| 114 | def66 | 自定义项66 | def66 | varchar(101) |  | 自定义项 (Custom) |
| 115 | def67 | 自定义项67 | def67 | varchar(101) |  | 自定义项 (Custom) |
| 116 | def68 | 自定义项68 | def68 | varchar(101) |  | 自定义项 (Custom) |
| 117 | def69 | 自定义项69 | def69 | varchar(101) |  | 自定义项 (Custom) |
| 118 | def70 | 自定义项70 | def70 | varchar(101) |  | 自定义项 (Custom) |
| 119 | def71 | 自定义项71 | def71 | varchar(101) |  | 自定义项 (Custom) |
| 120 | def72 | 自定义项72 | def72 | varchar(101) |  | 自定义项 (Custom) |
| 121 | def73 | 自定义项73 | def73 | varchar(101) |  | 自定义项 (Custom) |
| 122 | def74 | 自定义项74 | def74 | varchar(101) |  | 自定义项 (Custom) |
| 123 | def75 | 自定义项75 | def75 | varchar(101) |  | 自定义项 (Custom) |
| 124 | def76 | 自定义项76 | def76 | varchar(101) |  | 自定义项 (Custom) |
| 125 | def77 | 自定义项77 | def77 | varchar(101) |  | 自定义项 (Custom) |
| 126 | def78 | 自定义项78 | def78 | varchar(101) |  | 自定义项 (Custom) |
| 127 | def79 | 自定义项79 | def79 | varchar(101) |  | 自定义项 (Custom) |
| 128 | def80 | 自定义项80 | def80 | varchar(101) |  | 自定义项 (Custom) |
| 129 | def81 | 自定义项81 | def81 | varchar(101) |  | 自定义项 (Custom) |
| 130 | def82 | 自定义项82 | def82 | varchar(101) |  | 自定义项 (Custom) |
| 131 | def83 | 自定义项83 | def83 | varchar(101) |  | 自定义项 (Custom) |
| 132 | def84 | 自定义项84 | def84 | varchar(101) |  | 自定义项 (Custom) |
| 133 | def85 | 自定义项85 | def85 | varchar(101) |  | 自定义项 (Custom) |
| 134 | def86 | 自定义项86 | def86 | varchar(101) |  | 自定义项 (Custom) |
| 135 | def87 | 自定义项87 | def87 | varchar(101) |  | 自定义项 (Custom) |
| 136 | def88 | 自定义项88 | def88 | varchar(101) |  | 自定义项 (Custom) |
| 137 | def89 | 自定义项89 | def89 | varchar(101) |  | 自定义项 (Custom) |
| 138 | def90 | 自定义项90 | def90 | varchar(101) |  | 自定义项 (Custom) |
| 139 | def91 | 自定义项91 | def91 | varchar(101) |  | 自定义项 (Custom) |
| 140 | def92 | 自定义项92 | def92 | varchar(101) |  | 自定义项 (Custom) |
| 141 | def93 | 自定义项93 | def93 | varchar(101) |  | 自定义项 (Custom) |
| 142 | def94 | 自定义项94 | def94 | varchar(101) |  | 自定义项 (Custom) |
| 143 | def95 | 自定义项95 | def95 | varchar(101) |  | 自定义项 (Custom) |
| 144 | def96 | 自定义项96 | def96 | varchar(101) |  | 自定义项 (Custom) |
| 145 | def97 | 自定义项97 | def97 | varchar(101) |  | 自定义项 (Custom) |
| 146 | def98 | 自定义项98 | def98 | varchar(101) |  | 自定义项 (Custom) |
| 147 | def99 | 自定义项99 | def99 | varchar(101) |  | 自定义项 (Custom) |
| 148 | def100 | 自定义项100 | def100 | varchar(101) |  | 自定义项 (Custom) |
| 149 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 150 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 151 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 152 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |