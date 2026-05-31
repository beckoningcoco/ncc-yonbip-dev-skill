# |<<

**期间结存 (ia_periodnab / nc.vo.ia.monthaccount.entity.PeriodnabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2854.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 2 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 3 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 4 | caccountperiod | 会计期间 | caccountperiod | char(7) |  | 主键 (UFID) |
| 5 | ccalcrangeid | 计算维度主键 | ccalcrangeid | varchar(20) |  | 计算维度表 (ia_calcrange) |
| 6 | cinventoryid | 物料主键 | cinventoryid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | fpricemodeflag | 计价方式 | fpricemodeflag | int |  | 整数 (Integer) |
| 8 | nabnum | 结存数量 | nabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nabmny | 结存金额 | nabmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nabvarymny | 结存差异 | nabvarymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nabplanedmny | 结存计划金额 | nabplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | cvendorid | 供应商主键 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | cdeptid | 部门主键 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 14 | cdeptvid | 部门版本主键 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | cstordocmanid | 库管员主键 | cstordocmanid | varchar(20) |  | 人员基本信息 (psndoc) |
| 16 | cpsnid | 业务员主键 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 17 | ccustomerid | 开票客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 18 | cstordocid | 仓库主键 | cstordocid | varchar(20) |  | 仓库 (stordoc) |
| 19 | cprofitcenterid | 利润中心主键 | cprofitcenterid | varchar(20) |  | 字符串 (String) |
| 20 | cprofitcentervid | 利润中心版本主键 | cprofitcentervid | varchar(20) |  | 字符串 (String) |
| 21 | cstockorgvid | 库存组织版本主键 | cstockorgvid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 22 | cstockorgid | 库存组织主键 | cstockorgid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 23 | vtrantypecode | 交易类型 | vtrantypecode | varchar(20) |  | 出入库类型 (出入库类型) |
| 24 | nabglobalmny | 结存全局本币金额 | nabglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nabgroupmny | 结存集团本币金额 | nabgroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 27 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 28 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 29 | nabppv | 结存PPV | nabppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | nabipv | 结存IPV | nabipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | nabupmny | 上层结存金额 | nabupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | nabupppv | 上层结存PPV | nabupppv | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | nabupipv | 上层结存IPV | nabupipv | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | nabupplanedmny | 上层标准金额 | nabupplanedmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 37 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 45 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef21 | 自定义项21 | vdef21 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef22 | 自定义项22 | vdef22 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef23 | 自定义项23 | vdef23 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef24 | 自定义项24 | vdef24 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef25 | 自定义项25 | vdef25 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vdef26 | 自定义项26 | vdef26 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vdef27 | 自定义项27 | vdef27 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vdef28 | 自定义项28 | vdef28 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vdef29 | 自定义项29 | vdef29 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vdef30 | 自定义项30 | vdef30 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vdef31 | 自定义项31 | vdef31 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vdef32 | 自定义项32 | vdef32 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vdef33 | 自定义项33 | vdef33 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vdef34 | 自定义项34 | vdef34 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vdef35 | 自定义项35 | vdef35 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vdef36 | 自定义项36 | vdef36 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vdef37 | 自定义项37 | vdef37 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vdef38 | 自定义项38 | vdef38 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vdef39 | 自定义项39 | vdef39 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vdef40 | 自定义项40 | vdef40 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vdef41 | 自定义项41 | vdef41 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vdef42 | 自定义项42 | vdef42 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vdef43 | 自定义项43 | vdef43 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vdef44 | 自定义项44 | vdef44 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vdef45 | 自定义项45 | vdef45 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vdef46 | 自定义项46 | vdef46 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vdef47 | 自定义项47 | vdef47 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vdef48 | 自定义项48 | vdef48 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vdef49 | 自定义项49 | vdef49 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vdef50 | 自定义项50 | vdef50 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 字符串 (String) |
| 96 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 字符串 (String) |
| 97 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 字符串 (String) |
| 98 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 字符串 (String) |
| 99 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 字符串 (String) |
| 100 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 字符串 (String) |
| 101 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 字符串 (String) |
| 102 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 字符串 (String) |
| 103 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 字符串 (String) |
| 104 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 字符串 (String) |
| 105 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 字符串 (String) |
| 106 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 字符串 (String) |
| 107 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 字符串 (String) |
| 108 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 字符串 (String) |
| 109 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 字符串 (String) |
| 110 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 字符串 (String) |
| 111 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 字符串 (String) |
| 112 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 字符串 (String) |
| 113 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 字符串 (String) |
| 114 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 字符串 (String) |
| 115 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 116 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 117 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 118 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 119 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 120 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 121 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 122 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 123 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 124 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 125 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 126 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 127 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 128 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 129 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 130 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 131 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 132 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 133 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 134 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 135 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 136 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 137 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 138 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 139 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 140 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 141 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 142 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 143 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 144 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |