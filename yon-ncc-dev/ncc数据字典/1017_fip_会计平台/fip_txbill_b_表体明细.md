# |<<

**表体明细 (fip_txbill_b / nc.vo.fip.txbill.TXBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2260.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_txitem | 明细主键 | pk_txitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | rowno | 表体行号 | rowno | int |  | 整数 (Integer) |
| 6 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 7 | interestbegindate | 起息日期 | interestbegindate | char(19) |  | 日期 (UFDate) |
| 8 | interestenddate | 结息日期 | interestenddate | char(19) |  | 日期 (UFDate) |
| 9 | days | 结息天数 | days | int |  | 整数 (Integer) |
| 10 | rate | 利率 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | capitalamt | 本金 | capitalamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | interestamt | 利息 | interestamt | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | operator | 计息操作人 | operator | varchar(20) |  | 用户 (user) |
| 14 | demo | 摘要 | demo | varchar(200) |  | 字符串 (String) |
| 15 | pk_subjcode | 收支项目 | pk_subjcode | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 16 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 17 | pk_psndoc | 人员 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 18 | supplier | 供应商 | supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | pk_deptid | 部门 | pk_deptid | varchar(20) |  | 组织_部门 (dept) |
| 20 | pk_deptid_v | 部门版本 | pk_deptid_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 21 | material | 物料 | material | varchar(20) |  | 物料基本信息 (material_v) |
| 22 | material_src | 物料版本 | material_src | varchar(20) |  | 物料基本信息（多版本） (material) |
| 23 | checktype | 票据类型 | checktype | varchar(20) |  | 票据类型 (notetype) |
| 24 | contractno | 合同号 | contractno | varchar(50) |  | 字符串 (String) |
| 25 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 26 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 27 | subjcode | 会计科目 | subjcode | varchar(20) |  | 会计科目 (accasoa) |
| 28 | taxcodeid | 税码 | taxcodeid | varchar(20) |  | 增值税税码税率 (taxcode) |
| 29 | taxrate | 税率 | taxrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | tax | 税额 | tax | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | quantity | 数量 | quantity | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | price | 单价（含税） | price | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | price_notax | 单价（无税） | price_notax | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | amount | 原币金额（含税） | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | amout_notax | 原币金额（无税） | amout_notax | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | amount_debit | 借方原币金额 | amount_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | amount_credit | 贷方原币金额 | amount_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | localrate | 组织（账簿）本币汇率 | localrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | local_amount | 组织（账簿）本币金额（含税） | local_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | local_amount_notax | 组织（账簿）本币金额（无税） | local_amount_notax | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | local_amount_debit | 借方组织（账簿）本币金额 | local_amount_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | local_amount_credit | 贷方组织（账簿）本币金额 | local_amount_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | grouprate | 集团本币汇率 | grouprate | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | grouplocal | 集团本币金额（含税） | grouplocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | grouplocal_notax | 集团本币金额（无税） | grouplocal_notax | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | grouplocal_debit | 借方集团本币金额 | grouplocal_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | grouplocal_credit | 贷方集团本币金额 | grouplocal_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | globalrate | 全局本币汇率 | globalrate | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | globallocal | 全局本币金额（含税） | globallocal | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | globallocal_notax | 全局本币金额（无税） | globallocal_notax | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | globallocal_debit | 借方全局本币金额 | globallocal_debit | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | globallocal_credit | 贷方全局本币金额 | globallocal_credit | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | pk_srcbilltypeid | 来源单据类型 | pk_srcbilltypeid | varchar(50) |  | 字符串 (String) |
| 54 | srcbillid | 来源单据主键 | srcbillid | varchar(50) |  | 字符串 (String) |
| 55 | srcitemid | 来源单据行主键 | srcitemid | varchar(50) |  | 字符串 (String) |
| 56 | uniqueid | 来源单据行标识 | uniqueid | varchar(50) |  | 字符串 (String) |
| 57 | pk_originbilltypeid | 源头单据类型 | pk_originbilltypeid | varchar(50) |  | 字符串 (String) |
| 58 | originbillid | 源头单据主键 | originbillid | varchar(50) |  | 字符串 (String) |
| 59 | originitemid | 源头单据行主键 | originitemid | varchar(50) |  | 字符串 (String) |
| 60 | year | 年 | year | char(4) |  | 字符串 (String) |
| 61 | pk_paytype | 付款业务类型 | pk_paytype | varchar(20) |  | 收付款类型 (recpaytype) |
| 62 | payproperty | 付款性质 | payproperty | varchar(50) |  | 字符串 (String) |
| 63 | pk_rectype | 收款业务类型 | pk_rectype | varchar(20) |  | 收付款类型 (recpaytype) |
| 64 | recproperty | 收款性质 | recproperty | varchar(50) |  | 字符串 (String) |
| 65 | checkno | 票据号 | checkno | varchar(50) |  | 字符串 (String) |
| 66 | pk_costcomponent | 成本组件 | pk_costcomponent | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 67 | pk_cost | 成本域 | pk_cost | varchar(20) |  | 组织_成本域 (costregion) |
| 68 | vmocode | 订单号 | vmocode | varchar(50) |  | 字符串 (String) |
| 69 | vmotype | 订单类型 | vmotype | int |  | 整数 (Integer) |
| 70 | crcid | 工序 | crcid | varchar(50) |  | 字符串 (String) |
| 71 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 72 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 73 | cmarcostclassid | 产品成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 74 | cprojectid | 产品项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 75 | ccustomerid | 产品客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 76 | cvendorid | 产品供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 77 | cproductorid | 产品生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 78 | cinventorystate | 产品库存状态 | cinventorystate | varchar(50) |  | 字符串 (String) |
| 79 | ctype | 产品类型 | ctype | int |  | 整数 (Integer) |
| 80 | mainproduct | 主产品 | mainproduct | varchar(20) |  | 物料基本信息 (material_v) |
| 81 | mainprojectid | 主产品项目 | mainprojectid | varchar(20) |  | 项目 (project) |
| 82 | maincustomer | 主产品客户 | maincustomer | varchar(20) |  | 客户基本信息 (customer) |
| 83 | mainsupplier | 主产品供应商 | mainsupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 84 | mainproductorid | 主产品生产厂商 | mainproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 85 | maininventorystate | 主产品库存状态 | maininventorystate | varchar(50) |  | 字符串 (String) |
| 86 | mcfree1 | 主产品自由辅助属性1 | mcfree1 | varchar(101) |  | 自由项 (Custom) |
| 87 | mcfree2 | 主产品自由辅助属性2 | mcfree2 | varchar(101) |  | 自由项 (Custom) |
| 88 | mcfree3 | 主产品自由辅助属性3 | mcfree3 | varchar(101) |  | 自由项 (Custom) |
| 89 | mcfree4 | 主产品自由辅助属性4 | mcfree4 | varchar(101) |  | 自由项 (Custom) |
| 90 | mcfree5 | 主产品自由辅助属性5 | mcfree5 | varchar(101) |  | 自由项 (Custom) |
| 91 | mcfree6 | 主产品自由辅助属性6 | mcfree6 | varchar(101) |  | 自由项 (Custom) |
| 92 | mcfree7 | 主产品自由辅助属性7 | mcfree7 | varchar(101) |  | 自由项 (Custom) |
| 93 | mcfree8 | 主产品自由辅助属性8 | mcfree8 | varchar(101) |  | 自由项 (Custom) |
| 94 | mcfree9 | 主产品自由辅助属性9 | mcfree9 | varchar(101) |  | 自由项 (Custom) |
| 95 | mcfree10 | 主产品自由辅助属性10 | mcfree10 | varchar(101) |  | 自由项 (Custom) |
| 96 | materialid | 材料 | materialid | varchar(20) |  | 物料基本信息 (material_v) |
| 97 | mprojectid | 材料产品项目 | mprojectid | varchar(20) |  | 项目 (project) |
| 98 | mcustomer | 材料产品客户 | mcustomer | varchar(20) |  | 客户基本信息 (customer) |
| 99 | msupplier | 材料产品供应商 | msupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 100 | mproductorid | 材料产品生产厂商 | mproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 101 | minventorystate | 材料库存状态 | minventorystate | varchar(50) |  | 字符串 (String) |
| 102 | mfree1 | 材料辅助属性1 | mfree1 | varchar(101) |  | 自由项 (Custom) |
| 103 | mfree2 | 材料辅助属性2 | mfree2 | varchar(101) |  | 自由项 (Custom) |
| 104 | mfree3 | 材料辅助属性3 | mfree3 | varchar(101) |  | 自由项 (Custom) |
| 105 | mfree4 | 材料辅助属性4 | mfree4 | varchar(101) |  | 自由项 (Custom) |
| 106 | mfree5 | 材料辅助属性5 | mfree5 | varchar(101) |  | 自由项 (Custom) |
| 107 | mfree6 | 材料辅助属性6 | mfree6 | varchar(101) |  | 自由项 (Custom) |
| 108 | mfree7 | 材料辅助属性7 | mfree7 | varchar(101) |  | 自由项 (Custom) |
| 109 | mfree8 | 材料辅助属性8 | mfree8 | varchar(101) |  | 自由项 (Custom) |
| 110 | mfree9 | 材料辅助属性9 | mfree9 | varchar(101) |  | 自由项 (Custom) |
| 111 | mfree10 | 材料辅助属性10 | mfree10 | varchar(101) |  | 自由项 (Custom) |
| 112 | fcalcthreadbizflag | 计算线索的业务类型 | fcalcthreadbizflag | int |  | 整数 (Integer) |
| 113 | breworkflag | 是否返修 | breworkflag | char(1) |  | 布尔类型 (UFBoolean) |
| 114 | fdatagetflag | 数据获取方式 | fdatagetflag | int |  | 整数 (Integer) |
| 115 | vfree1 | 产品自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 116 | vfree2 | 产品自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 117 | vfree3 | 产品自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 118 | vfree4 | 产品自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 119 | vfree5 | 产品自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 120 | vfree6 | 产品自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 121 | vfree7 | 产品自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 122 | vfree8 | 产品自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 123 | vfree9 | 产品自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 124 | vfree10 | 产品自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 125 | def100 | 自定义项100 | def100 | varchar(101) |  | 自定义项 (Custom) |
| 126 | def99 | 自定义项99 | def99 | varchar(101) |  | 自定义项 (Custom) |
| 127 | def98 | 自定义项98 | def98 | varchar(101) |  | 自定义项 (Custom) |
| 128 | def97 | 自定义项97 | def97 | varchar(101) |  | 自定义项 (Custom) |
| 129 | def96 | 自定义项96 | def96 | varchar(101) |  | 自定义项 (Custom) |
| 130 | def95 | 自定义项95 | def95 | varchar(101) |  | 自定义项 (Custom) |
| 131 | def94 | 自定义项94 | def94 | varchar(101) |  | 自定义项 (Custom) |
| 132 | def93 | 自定义项93 | def93 | varchar(101) |  | 自定义项 (Custom) |
| 133 | def92 | 自定义项92 | def92 | varchar(101) |  | 自定义项 (Custom) |
| 134 | def91 | 自定义项91 | def91 | varchar(101) |  | 自定义项 (Custom) |
| 135 | def90 | 自定义项90 | def90 | varchar(101) |  | 自定义项 (Custom) |
| 136 | def89 | 自定义项89 | def89 | varchar(101) |  | 自定义项 (Custom) |
| 137 | def88 | 自定义项88 | def88 | varchar(101) |  | 自定义项 (Custom) |
| 138 | def87 | 自定义项87 | def87 | varchar(101) |  | 自定义项 (Custom) |
| 139 | def86 | 自定义项86 | def86 | varchar(101) |  | 自定义项 (Custom) |
| 140 | def85 | 自定义项85 | def85 | varchar(101) |  | 自定义项 (Custom) |
| 141 | def84 | 自定义项84 | def84 | varchar(101) |  | 自定义项 (Custom) |
| 142 | def83 | 自定义项83 | def83 | varchar(101) |  | 自定义项 (Custom) |
| 143 | def82 | 自定义项82 | def82 | varchar(101) |  | 自定义项 (Custom) |
| 144 | def81 | 自定义项81 | def81 | varchar(101) |  | 自定义项 (Custom) |
| 145 | def80 | 自定义项80 | def80 | varchar(101) |  | 自定义项 (Custom) |
| 146 | def79 | 自定义项79 | def79 | varchar(101) |  | 自定义项 (Custom) |
| 147 | def78 | 自定义项78 | def78 | varchar(101) |  | 自定义项 (Custom) |
| 148 | def77 | 自定义项77 | def77 | varchar(101) |  | 自定义项 (Custom) |
| 149 | def76 | 自定义项76 | def76 | varchar(101) |  | 自定义项 (Custom) |
| 150 | def75 | 自定义项75 | def75 | varchar(101) |  | 自定义项 (Custom) |
| 151 | def74 | 自定义项74 | def74 | varchar(101) |  | 自定义项 (Custom) |
| 152 | def73 | 自定义项73 | def73 | varchar(101) |  | 自定义项 (Custom) |
| 153 | def72 | 自定义项72 | def72 | varchar(101) |  | 自定义项 (Custom) |
| 154 | def71 | 自定义项71 | def71 | varchar(101) |  | 自定义项 (Custom) |
| 155 | def70 | 自定义项70 | def70 | varchar(101) |  | 自定义项 (Custom) |
| 156 | def69 | 自定义项69 | def69 | varchar(101) |  | 自定义项 (Custom) |
| 157 | def68 | 自定义项68 | def68 | varchar(101) |  | 自定义项 (Custom) |
| 158 | def67 | 自定义项67 | def67 | varchar(101) |  | 自定义项 (Custom) |
| 159 | def66 | 自定义项66 | def66 | varchar(101) |  | 自定义项 (Custom) |
| 160 | def65 | 自定义项65 | def65 | varchar(101) |  | 自定义项 (Custom) |
| 161 | def64 | 自定义项64 | def64 | varchar(101) |  | 自定义项 (Custom) |
| 162 | def63 | 自定义项63 | def63 | varchar(101) |  | 自定义项 (Custom) |
| 163 | def62 | 自定义项62 | def62 | varchar(101) |  | 自定义项 (Custom) |
| 164 | def61 | 自定义项61 | def61 | varchar(101) |  | 自定义项 (Custom) |
| 165 | def60 | 自定义项60 | def60 | varchar(101) |  | 自定义项 (Custom) |
| 166 | def59 | 自定义项59 | def59 | varchar(101) |  | 自定义项 (Custom) |
| 167 | def58 | 自定义项58 | def58 | varchar(101) |  | 自定义项 (Custom) |
| 168 | def57 | 自定义项57 | def57 | varchar(101) |  | 自定义项 (Custom) |
| 169 | def56 | 自定义项56 | def56 | varchar(101) |  | 自定义项 (Custom) |
| 170 | def55 | 自定义项55 | def55 | varchar(101) |  | 自定义项 (Custom) |
| 171 | def54 | 自定义项54 | def54 | varchar(101) |  | 自定义项 (Custom) |
| 172 | def53 | 自定义项53 | def53 | varchar(101) |  | 自定义项 (Custom) |
| 173 | def52 | 自定义项52 | def52 | varchar(101) |  | 自定义项 (Custom) |
| 174 | def51 | 自定义项51 | def51 | varchar(101) |  | 自定义项 (Custom) |
| 175 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |
| 176 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 177 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 178 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 179 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 180 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 181 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 182 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 183 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 184 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 185 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 186 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 187 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 188 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 189 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 190 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 191 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 192 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 193 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 194 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 195 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 196 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 197 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 198 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 199 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 200 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 201 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 202 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 203 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 204 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 205 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 206 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 207 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 208 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 209 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 210 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 211 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 212 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 213 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 214 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 215 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 216 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 217 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 218 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 219 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 220 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 221 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 222 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 223 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 224 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |