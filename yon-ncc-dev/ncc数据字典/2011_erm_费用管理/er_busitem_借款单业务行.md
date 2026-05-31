# |<<

**借款单业务行 (er_busitem / nc.vo.ep.bx.JKBusItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1877.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busitem | 借款单业务行标识 | pk_busitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_reimtype | 报销类型标识 | pk_reimtype | varchar(20) |  | 报销类型 (ReimType) |
| 3 | pk_jkbx | 借款单标识 | pk_jkbx | char(20) |  | 借款单 (jkzb) |
| 4 | tablecode | 页签编码 | tablecode | varchar(20) |  | 字符串 (String) |
| 5 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | szxmid | 收支项目 | szxmid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 7 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 8 | ybje | 原币金额 | ybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | bbje | 本币金额 | bbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | bbye | 本币余额 | bbye | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | hkybje | 还款金额 | hkybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | hkbbje | 还款本币金额 | hkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | zfybje | 支付金额 | zfybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | zfbbje | 支付本币金额 | zfbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | cjkybje | 冲借款金额 | cjkybje | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | cjkbbje | 冲借款本币金额 | cjkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | globalbbje | 全局本币金额 | globalbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | globalhkbbje | 全局还款本币金额 | globalhkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | globalzfbbje | 全局支付本币金额 | globalzfbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | globalcjkbbje | 全局冲借款本币金额 | globalcjkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | groupbbje | 集团本币金额 | groupbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | grouphkbbje | 集团还款本币金额 | grouphkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | groupzfbbje | 集团支付本币金额 | groupzfbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | groupcjkbbje | 集团冲借款本币金额 | groupcjkbbje | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ybye | 原币余额 | ybye | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | yjye | 预计余额 | yjye | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 28 | pk_pcorg_v | 利润中心版本 | pk_pcorg_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 29 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 30 | jobid | 项目 | jobid | varchar(20) |  | 项目 (project) |
| 31 | projecttask | 项目任务 | projecttask | varchar(20) |  | 项目任务 (WBS) |
| 32 | pk_resacostcenter | 成本中心 | pk_resacostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 33 | pk_item | 费用申请单 | pk_item | varchar(50) |  | 字符串 (String) |
| 34 | srcbilltype | 来源单据类型 | srcbilltype | varchar(50) |  | 字符串 (String) |
| 35 | srctype | 来源类型 | srctype | varchar(50) |  | 字符串 (String) |
| 36 | groupbbye | 集团本币余额 | groupbbye | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | globalbbye | 全局本币余额 | globalbbye | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | pk_mtapp_detail | 费用申请单明细 | pk_mtapp_detail | varchar(50) |  | 字符串 (String) |
| 39 | pk_proline | 产品线 | pk_proline | varchar(20) |  | 产品线 (prodline) |
| 40 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 41 | fctno | 合同号 | fctno | varchar(20) |  | 付款合同 (fct_ap) |
| 42 | pk_crmdetail | pk_crm | pk_crmdetail | varchar(20) |  | 字符串 (String) |
| 43 | bzbm | 币种 | bzbm | varchar(20) |  | 币种 (currtype) |
| 44 | bbhl | 汇率 | bbhl | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | groupbbhl | 集团本币汇率 | groupbbhl | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | globalbbhl | 全局本币汇率 | globalbbhl | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | sfcb | 是否超标 | sfcb | varchar(50) |  | 字符串 (String) |
| 48 | src_ybz_id | 报账id | src_ybz_id | varchar(50) |  | 字符串 (String) |
| 49 | jsfs | 结算方式 | jsfs | varchar(50) |  | 字符串 (String) |
| 50 | autograph | 防篡改签名 | autograph | varchar(200) |  | 字符串 (String) |
| 51 | defitem50 | 自定义项50 | defitem50 | varchar(101) |  | 自定义项 (Custom) |
| 52 | defitem49 | 自定义项49 | defitem49 | varchar(101) |  | 自定义项 (Custom) |
| 53 | defitem48 | 自定义项48 | defitem48 | varchar(101) |  | 自定义项 (Custom) |
| 54 | defitem47 | 自定义项47 | defitem47 | varchar(101) |  | 自定义项 (Custom) |
| 55 | defitem46 | 自定义项46 | defitem46 | varchar(101) |  | 自定义项 (Custom) |
| 56 | defitem45 | 自定义项45 | defitem45 | varchar(101) |  | 自定义项 (Custom) |
| 57 | defitem44 | 自定义项44 | defitem44 | varchar(101) |  | 自定义项 (Custom) |
| 58 | defitem43 | 自定义项43 | defitem43 | varchar(101) |  | 自定义项 (Custom) |
| 59 | defitem42 | 自定义项42 | defitem42 | varchar(101) |  | 自定义项 (Custom) |
| 60 | defitem41 | 自定义项41 | defitem41 | varchar(101) |  | 自定义项 (Custom) |
| 61 | defitem40 | 自定义项40 | defitem40 | varchar(101) |  | 自定义项 (Custom) |
| 62 | defitem39 | 自定义项39 | defitem39 | varchar(101) |  | 自定义项 (Custom) |
| 63 | defitem38 | 自定义项38 | defitem38 | varchar(101) |  | 自定义项 (Custom) |
| 64 | defitem37 | 自定义项37 | defitem37 | varchar(101) |  | 自定义项 (Custom) |
| 65 | defitem36 | 自定义项36 | defitem36 | varchar(101) |  | 自定义项 (Custom) |
| 66 | defitem35 | 自定义项35 | defitem35 | varchar(101) |  | 自定义项 (Custom) |
| 67 | defitem34 | 自定义项34 | defitem34 | varchar(101) |  | 自定义项 (Custom) |
| 68 | defitem33 | 自定义项33 | defitem33 | varchar(101) |  | 自定义项 (Custom) |
| 69 | defitem32 | 自定义项32 | defitem32 | varchar(101) |  | 自定义项 (Custom) |
| 70 | defitem31 | 自定义项31 | defitem31 | varchar(101) |  | 自定义项 (Custom) |
| 71 | defitem30 | 自定义项30 | defitem30 | varchar(101) |  | 自定义项 (Custom) |
| 72 | defitem29 | 自定义项29 | defitem29 | varchar(101) |  | 自定义项 (Custom) |
| 73 | defitem28 | 自定义项28 | defitem28 | varchar(101) |  | 自定义项 (Custom) |
| 74 | defitem27 | 自定义项27 | defitem27 | varchar(101) |  | 自定义项 (Custom) |
| 75 | defitem26 | 自定义项26 | defitem26 | varchar(101) |  | 自定义项 (Custom) |
| 76 | defitem25 | 自定义项25 | defitem25 | varchar(101) |  | 自定义项 (Custom) |
| 77 | defitem24 | 自定义项24 | defitem24 | varchar(101) |  | 自定义项 (Custom) |
| 78 | defitem23 | 自定义项23 | defitem23 | varchar(101) |  | 自定义项 (Custom) |
| 79 | defitem22 | 自定义项22 | defitem22 | varchar(101) |  | 自定义项 (Custom) |
| 80 | defitem21 | 自定义项21 | defitem21 | varchar(101) |  | 自定义项 (Custom) |
| 81 | defitem20 | 自定义项20 | defitem20 | varchar(101) |  | 自定义项 (Custom) |
| 82 | defitem19 | 自定义项19 | defitem19 | varchar(101) |  | 自定义项 (Custom) |
| 83 | defitem18 | 自定义项18 | defitem18 | varchar(101) |  | 自定义项 (Custom) |
| 84 | defitem17 | 自定义项17 | defitem17 | varchar(101) |  | 自定义项 (Custom) |
| 85 | defitem16 | 自定义项16 | defitem16 | varchar(101) |  | 自定义项 (Custom) |
| 86 | defitem15 | 自定义项15 | defitem15 | varchar(101) |  | 自定义项 (Custom) |
| 87 | defitem14 | 自定义项14 | defitem14 | varchar(101) |  | 自定义项 (Custom) |
| 88 | defitem13 | 自定义项13 | defitem13 | varchar(101) |  | 自定义项 (Custom) |
| 89 | defitem12 | 自定义项12 | defitem12 | varchar(101) |  | 自定义项 (Custom) |
| 90 | defitem11 | 自定义项11 | defitem11 | varchar(101) |  | 自定义项 (Custom) |
| 91 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 92 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 93 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 94 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 95 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 96 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 97 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 98 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 99 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 100 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |
| 101 | defitem51 | 自定义项51 | defitem51 | varchar(101) |  | 自定义项 (Custom) |
| 102 | defitem59 | 自定义项59 | defitem59 | varchar(101) |  | 自定义项 (Custom) |
| 103 | defitem58 | 自定义项58 | defitem58 | varchar(101) |  | 自定义项 (Custom) |
| 104 | defitem57 | 自定义项57 | defitem57 | varchar(101) |  | 自定义项 (Custom) |
| 105 | defitem56 | 自定义项56 | defitem56 | varchar(101) |  | 自定义项 (Custom) |
| 106 | defitem55 | 自定义项55 | defitem55 | varchar(101) |  | 自定义项 (Custom) |
| 107 | defitem54 | 自定义项54 | defitem54 | varchar(101) |  | 自定义项 (Custom) |
| 108 | defitem53 | 自定义项53 | defitem53 | varchar(101) |  | 自定义项 (Custom) |
| 109 | defitem52 | 自定义项52 | defitem52 | varchar(101) |  | 自定义项 (Custom) |
| 110 | defitem60 | 自定义项60 | defitem60 | varchar(101) |  | 自定义项 (Custom) |
| 111 | defitem69 | 自定义项69 | defitem69 | varchar(101) |  | 自定义项 (Custom) |
| 112 | defitem68 | 自定义项68 | defitem68 | varchar(101) |  | 自定义项 (Custom) |
| 113 | defitem67 | 自定义项67 | defitem67 | varchar(101) |  | 自定义项 (Custom) |
| 114 | defitem66 | 自定义项66 | defitem66 | varchar(101) |  | 自定义项 (Custom) |
| 115 | defitem65 | 自定义项65 | defitem65 | varchar(101) |  | 自定义项 (Custom) |
| 116 | defitem64 | 自定义项64 | defitem64 | varchar(101) |  | 自定义项 (Custom) |
| 117 | defitem63 | 自定义项63 | defitem63 | varchar(101) |  | 自定义项 (Custom) |
| 118 | defitem62 | 自定义项62 | defitem62 | varchar(101) |  | 自定义项 (Custom) |
| 119 | defitem61 | 自定义项61 | defitem61 | varchar(101) |  | 自定义项 (Custom) |
| 120 | defitem70 | 自定义项70 | defitem70 | varchar(101) |  | 自定义项 (Custom) |
| 121 | defitem79 | 自定义项79 | defitem79 | varchar(101) |  | 自定义项 (Custom) |
| 122 | defitem78 | 自定义项78 | defitem78 | varchar(101) |  | 自定义项 (Custom) |
| 123 | defitem77 | 自定义项77 | defitem77 | varchar(101) |  | 自定义项 (Custom) |
| 124 | defitem76 | 自定义项76 | defitem76 | varchar(101) |  | 自定义项 (Custom) |
| 125 | defitem75 | 自定义项75 | defitem75 | varchar(101) |  | 自定义项 (Custom) |
| 126 | defitem74 | 自定义项74 | defitem74 | varchar(101) |  | 自定义项 (Custom) |
| 127 | defitem73 | 自定义项73 | defitem73 | varchar(101) |  | 自定义项 (Custom) |
| 128 | defitem72 | 自定义项72 | defitem72 | varchar(101) |  | 自定义项 (Custom) |
| 129 | defitem71 | 自定义项71 | defitem71 | varchar(101) |  | 自定义项 (Custom) |
| 130 | defitem80 | 自定义项80 | defitem80 | varchar(101) |  | 自定义项 (Custom) |