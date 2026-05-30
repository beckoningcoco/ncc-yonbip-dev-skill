# |<<

**预提明细 (er_accrued_detail / nc.vo.erm.accruedexpense.AccruedDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1872.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrued_detail | 主键 | pk_accrued_detail | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | int |  | 整数 (Integer) |
| 3 | assume_org | 费用承担单位 | assume_org | varchar(20) | √ | 组织 (org) |
| 4 | assume_dept | 费用承担部门 | assume_dept | varchar(20) | √ | 组织_部门 (dept) |
| 5 | pk_iobsclass | 收支项目 | pk_iobsclass | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 6 | pk_pcorg | 利润中心 | pk_pcorg | varchar(20) |  | 利润中心 (profitcenter) |
| 7 | pk_resacostcenter | 成本中心 | pk_resacostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 8 | pk_checkele | 核算要素 | pk_checkele | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 9 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 10 | pk_wbs | 项目任务 | pk_wbs | varchar(20) |  | 项目任务 (WBS) |
| 11 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 13 | pk_proline | 产品线 | pk_proline | varchar(20) |  | 产品线 (prodline) |
| 14 | pk_brand | 品牌 | pk_brand | varchar(20) |  | 品牌档案 (branddoc) |
| 15 | org_currinfo | 组织本币汇率 | org_currinfo | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | group_currinfo | 集团本币汇率 | group_currinfo | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | global_currinfo | 全局本币汇率 | global_currinfo | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | org_amount | 组织本币金额 | org_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | group_amount | 集团本币金额 | group_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | global_amount | 全局本币金额 | global_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | verify_amount | 核销金额 | verify_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | org_verify_amount | 组织本币核销金额 | org_verify_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | group_verify_amount | 集团本币核销金额 | group_verify_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | global_verify_amount | 全局本币核销金额 | global_verify_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | predict_rest_amount | 预计余额 | predict_rest_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | rest_amount | 余额 | rest_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | org_rest_amount | 组织本币余额 | org_rest_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | group_rest_amount | 集团本币余额 | group_rest_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | global_rest_amount | 全局本币余额 | global_rest_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | src_accruedpk | 来源预提单pk | src_accruedpk | varchar(50) |  | 字符串 (String) |
| 32 | srctype | 来源单据类型 | srctype | varchar(50) |  | 字符串 (String) |
| 33 | src_detailpk | 来源预提detailpk | src_detailpk | varchar(50) |  | 字符串 (String) |
| 34 | red_amount | 红冲金额 | red_amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | src_ybz_id | 友报账id | src_ybz_id | varchar(50) |  | 字符串 (String) |
| 36 | defitem1 | 自定义项1 | defitem1 | varchar(101) |  | 自定义项 (Custom) |
| 37 | defitem2 | 自定义项2 | defitem2 | varchar(101) |  | 自定义项 (Custom) |
| 38 | defitem3 | 自定义项3 | defitem3 | varchar(101) |  | 自定义项 (Custom) |
| 39 | defitem4 | 自定义项4 | defitem4 | varchar(101) |  | 自定义项 (Custom) |
| 40 | defitem5 | 自定义项5 | defitem5 | varchar(101) |  | 自定义项 (Custom) |
| 41 | defitem6 | 自定义项6 | defitem6 | varchar(101) |  | 自定义项 (Custom) |
| 42 | defitem7 | 自定义项7 | defitem7 | varchar(101) |  | 自定义项 (Custom) |
| 43 | defitem8 | 自定义项8 | defitem8 | varchar(101) |  | 自定义项 (Custom) |
| 44 | defitem9 | 自定义项9 | defitem9 | varchar(101) |  | 自定义项 (Custom) |
| 45 | defitem10 | 自定义项10 | defitem10 | varchar(101) |  | 自定义项 (Custom) |
| 46 | defitem11 | 自定义项11 | defitem11 | varchar(101) |  | 自定义项 (Custom) |
| 47 | defitem12 | 自定义项12 | defitem12 | varchar(101) |  | 自定义项 (Custom) |
| 48 | defitem13 | 自定义项13 | defitem13 | varchar(101) |  | 自定义项 (Custom) |
| 49 | defitem14 | 自定义项14 | defitem14 | varchar(101) |  | 自定义项 (Custom) |
| 50 | defitem15 | 自定义项15 | defitem15 | varchar(101) |  | 自定义项 (Custom) |
| 51 | defitem16 | 自定义项16 | defitem16 | varchar(101) |  | 自定义项 (Custom) |
| 52 | defitem17 | 自定义项17 | defitem17 | varchar(101) |  | 自定义项 (Custom) |
| 53 | defitem18 | 自定义项18 | defitem18 | varchar(101) |  | 自定义项 (Custom) |
| 54 | defitem19 | 自定义项19 | defitem19 | varchar(101) |  | 自定义项 (Custom) |
| 55 | defitem20 | 自定义项20 | defitem20 | varchar(101) |  | 自定义项 (Custom) |
| 56 | defitem21 | 自定义项21 | defitem21 | varchar(101) |  | 自定义项 (Custom) |
| 57 | defitem22 | 自定义项22 | defitem22 | varchar(101) |  | 自定义项 (Custom) |
| 58 | defitem23 | 自定义项23 | defitem23 | varchar(101) |  | 自定义项 (Custom) |
| 59 | defitem24 | 自定义项24 | defitem24 | varchar(101) |  | 自定义项 (Custom) |
| 60 | defitem25 | 自定义项25 | defitem25 | varchar(101) |  | 自定义项 (Custom) |
| 61 | defitem26 | 自定义项26 | defitem26 | varchar(101) |  | 自定义项 (Custom) |
| 62 | defitem27 | 自定义项27 | defitem27 | varchar(101) |  | 自定义项 (Custom) |
| 63 | defitem28 | 自定义项28 | defitem28 | varchar(101) |  | 自定义项 (Custom) |
| 64 | defitem29 | 自定义项29 | defitem29 | varchar(101) |  | 自定义项 (Custom) |
| 65 | defitem30 | 自定义项30 | defitem30 | varchar(101) |  | 自定义项 (Custom) |
| 66 | defitem31 | 自定义项31 | defitem31 | varchar(101) |  | 自定义项 (Custom) |
| 67 | defitem32 | 自定义项32 | defitem32 | varchar(101) |  | 自定义项 (Custom) |
| 68 | defitem33 | 自定义项33 | defitem33 | varchar(101) |  | 自定义项 (Custom) |
| 69 | defitem34 | 自定义项34 | defitem34 | varchar(101) |  | 自定义项 (Custom) |
| 70 | defitem35 | 自定义项35 | defitem35 | varchar(101) |  | 自定义项 (Custom) |
| 71 | defitem36 | 自定义项36 | defitem36 | varchar(101) |  | 自定义项 (Custom) |
| 72 | defitem37 | 自定义项37 | defitem37 | varchar(101) |  | 自定义项 (Custom) |
| 73 | defitem38 | 自定义项38 | defitem38 | varchar(101) |  | 自定义项 (Custom) |
| 74 | defitem39 | 自定义项39 | defitem39 | varchar(101) |  | 自定义项 (Custom) |
| 75 | defitem40 | 自定义项40 | defitem40 | varchar(101) |  | 自定义项 (Custom) |
| 76 | defitem41 | 自定义项41 | defitem41 | varchar(101) |  | 自定义项 (Custom) |
| 77 | defitem42 | 自定义项42 | defitem42 | varchar(101) |  | 自定义项 (Custom) |
| 78 | defitem43 | 自定义项43 | defitem43 | varchar(101) |  | 自定义项 (Custom) |
| 79 | defitem44 | 自定义项44 | defitem44 | varchar(101) |  | 自定义项 (Custom) |
| 80 | defitem45 | 自定义项45 | defitem45 | varchar(101) |  | 自定义项 (Custom) |
| 81 | defitem46 | 自定义项46 | defitem46 | varchar(101) |  | 自定义项 (Custom) |
| 82 | defitem47 | 自定义项47 | defitem47 | varchar(101) |  | 自定义项 (Custom) |
| 83 | defitem48 | 自定义项48 | defitem48 | varchar(101) |  | 自定义项 (Custom) |
| 84 | defitem49 | 自定义项49 | defitem49 | varchar(101) |  | 自定义项 (Custom) |
| 85 | defitem50 | 自定义项50 | defitem50 | varchar(101) |  | 自定义项 (Custom) |
| 86 | defitem51 | 自定义项51 | defitem51 | varchar(101) |  | 自定义项 (Custom) |
| 87 | defitem52 | 自定义项52 | defitem52 | varchar(101) |  | 自定义项 (Custom) |
| 88 | defitem53 | 自定义项53 | defitem53 | varchar(101) |  | 自定义项 (Custom) |
| 89 | defitem54 | 自定义项54 | defitem54 | varchar(101) |  | 自定义项 (Custom) |
| 90 | defitem55 | 自定义项55 | defitem55 | varchar(101) |  | 自定义项 (Custom) |
| 91 | defitem56 | 自定义项56 | defitem56 | varchar(101) |  | 自定义项 (Custom) |
| 92 | defitem57 | 自定义项57 | defitem57 | varchar(101) |  | 自定义项 (Custom) |
| 93 | defitem58 | 自定义项58 | defitem58 | varchar(101) |  | 自定义项 (Custom) |
| 94 | defitem59 | 自定义项59 | defitem59 | varchar(101) |  | 自定义项 (Custom) |
| 95 | defitem60 | 自定义项60 | defitem60 | varchar(101) |  | 自定义项 (Custom) |
| 96 | defitem61 | 自定义项61 | defitem61 | varchar(101) |  | 自定义项 (Custom) |
| 97 | defitem62 | 自定义项62 | defitem62 | varchar(101) |  | 自定义项 (Custom) |
| 98 | defitem63 | 自定义项63 | defitem63 | varchar(101) |  | 自定义项 (Custom) |
| 99 | defitem64 | 自定义项64 | defitem64 | varchar(101) |  | 自定义项 (Custom) |
| 100 | defitem65 | 自定义项65 | defitem65 | varchar(101) |  | 自定义项 (Custom) |
| 101 | defitem66 | 自定义项66 | defitem66 | varchar(101) |  | 自定义项 (Custom) |
| 102 | defitem67 | 自定义项67 | defitem67 | varchar(101) |  | 自定义项 (Custom) |
| 103 | defitem68 | 自定义项68 | defitem68 | varchar(101) |  | 自定义项 (Custom) |
| 104 | defitem69 | 自定义项69 | defitem69 | varchar(101) |  | 自定义项 (Custom) |
| 105 | defitem70 | 自定义项70 | defitem70 | varchar(101) |  | 自定义项 (Custom) |
| 106 | defitem71 | 自定义项71 | defitem71 | varchar(101) |  | 自定义项 (Custom) |
| 107 | defitem72 | 自定义项72 | defitem72 | varchar(101) |  | 自定义项 (Custom) |
| 108 | defitem73 | 自定义项73 | defitem73 | varchar(101) |  | 自定义项 (Custom) |
| 109 | defitem74 | 自定义项74 | defitem74 | varchar(101) |  | 自定义项 (Custom) |
| 110 | defitem75 | 自定义项75 | defitem75 | varchar(101) |  | 自定义项 (Custom) |
| 111 | defitem76 | 自定义项76 | defitem76 | varchar(101) |  | 自定义项 (Custom) |
| 112 | defitem77 | 自定义项77 | defitem77 | varchar(101) |  | 自定义项 (Custom) |
| 113 | defitem78 | 自定义项78 | defitem78 | varchar(101) |  | 自定义项 (Custom) |
| 114 | defitem79 | 自定义项79 | defitem79 | varchar(101) |  | 自定义项 (Custom) |
| 115 | defitem80 | 自定义项80 | defitem80 | varchar(101) |  | 自定义项 (Custom) |