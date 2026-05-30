# |<<

**内部实物待结算调出单子实体 (nresa_presetout_b / nc.vo.nresa.internalsettlement.prematter.PreSettleOutItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3887.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 待结算调出单明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 调出利润中心 | pk_org | varchar(20) |  | 利润中心 (profitcenter) |
| 4 | csettlepcid | 结算利润中心 | csettlepcid | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 6 | dbizdate | 业务日期 | dbizdate | char(19) |  | 日期 (UFDate) |
| 7 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 8 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cinventoryvid | 物料编码 | cinventoryvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 11 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 16 | cqtunitid | 报价单位 | cqtunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | nqtnum | 报价单位数量 | nqtnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | vqtunitrate | 报价单位换算率 | vqtunitrate | varchar(60) |  | 字符串 (String) |
| 19 | norigprice | 主原币无税单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | csettleruleid | 结算规则 | csettleruleid | varchar(20) |  | 内部结算规则 (nresa_insetrule) |
| 22 | csettlerule_bid | 结算规则明细 | csettlerule_bid | varchar(20) |  | 内部结算规则子表 (nresa_insetrule_b) |
| 23 | ccalcid | 计算关系 | ccalcid | varchar(20) |  | 字符串 (String) |
| 24 | nsettlenum | 累计已结算主数量 | nsettlenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | bsettleendflag | 结算完成 | bsettleendflag | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 27 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 28 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 29 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 30 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 31 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 32 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 33 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 34 | cfirstid | 源头单据 | cfirstid | char(20) |  | 主键 (UFID) |
| 35 | cfirstbid | 源头单据明细 | cfirstbid | char(20) |  | 主键 (UFID) |
| 36 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 37 | dfirstbilldate | 源头单据日期 | dfirstbilldate | char(19) |  | 日期 (UFDate) |
| 38 | csrcbid | 来源单据明细 | csrcbid | char(20) |  | 主键 (UFID) |
| 39 | corigcurrencyid | 原币币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 40 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 61 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 62 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 63 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 64 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 65 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 66 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 67 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 68 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 69 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 70 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vfree11 | 自由辅助属性11 | vfree11 | varchar(101) |  | 自由项 (Custom) |
| 101 | vfree12 | 自由辅助属性12 | vfree12 | varchar(101) |  | 自由项 (Custom) |
| 102 | vfree13 | 自由辅助属性13 | vfree13 | varchar(101) |  | 自由项 (Custom) |
| 103 | vfree14 | 自由辅助属性14 | vfree14 | varchar(101) |  | 自由项 (Custom) |
| 104 | vfree15 | 自由辅助属性15 | vfree15 | varchar(101) |  | 自由项 (Custom) |
| 105 | vfree16 | 自由辅助属性16 | vfree16 | varchar(101) |  | 自由项 (Custom) |
| 106 | vfree17 | 自由辅助属性17 | vfree17 | varchar(101) |  | 自由项 (Custom) |
| 107 | vfree18 | 自由辅助属性18 | vfree18 | varchar(101) |  | 自由项 (Custom) |
| 108 | vfree19 | 自由辅助属性19 | vfree19 | varchar(101) |  | 自由项 (Custom) |
| 109 | vfree20 | 自由辅助属性20 | vfree20 | varchar(101) |  | 自由项 (Custom) |