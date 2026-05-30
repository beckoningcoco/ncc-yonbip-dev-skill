# |<<

**实际替代快照 (mm_calcrealsubs / nc.vo.mmpps.calc.entity.realsubs.RealSubsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3648.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsrealsubsid | 实际替代快照主键 | cppsrealsubsid | char(36) | √ | 主键 (UFID) |
| 2 | cppsmaterialid | 物料范围主键 | cppsmaterialid | varchar(36) |  | 字符串 (String) |
| 3 | pk_realsubs | 实际替代主键 | pk_realsubs | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | cpmaterialid | 产品最新版本 | cpmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cpmaterialvid | 产品 | cpmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | cpprojectid | 产品项目 | cpprojectid | varchar(20) |  | 项目 (project) |
| 10 | cpcustomerid | 产品客户 | cpcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | cpvendorid | 产品供应商 | cpvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | cpproductorid | 产品生产厂商 | cpproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 13 | cmaterialid | 主料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | cmaterialvid | 主料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 15 | cprojectid | 主料项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 16 | ccustomerid | 主料客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 17 | cvendorid | 主料供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 18 | cproductorid | 主料生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 19 | csmaterialid | 替代料最新版本 | csmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 20 | csmaterialvid | 替代料 | csmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 21 | csprojectid | 替代料项目 | csprojectid | varchar(20) |  | 项目 (project) |
| 22 | cscustomerid | 替代料客户 | cscustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 23 | csvendorid | 替代料供应商 | csvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 24 | csproductorid | 替代料生产厂商 | csproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 25 | vsfree1 | 替代料辅助属性1 | vsfree1 | varchar(101) |  | 自由项 (Custom) |
| 26 | vsfree2 | 替代料辅助属性2 | vsfree2 | varchar(101) |  | 自由项 (Custom) |
| 27 | vsfree3 | 替代料辅助属性3 | vsfree3 | varchar(101) |  | 自由项 (Custom) |
| 28 | vsfree4 | 替代料辅助属性4 | vsfree4 | varchar(101) |  | 自由项 (Custom) |
| 29 | vsfree5 | 替代料辅助属性5 | vsfree5 | varchar(101) |  | 自由项 (Custom) |
| 30 | vsfree6 | 替代料辅助属性6 | vsfree6 | varchar(101) |  | 自由项 (Custom) |
| 31 | vsfree7 | 替代料辅助属性7 | vsfree7 | varchar(101) |  | 自由项 (Custom) |
| 32 | vsfree8 | 替代料辅助属性8 | vsfree8 | varchar(101) |  | 自由项 (Custom) |
| 33 | vsfree9 | 替代料辅助属性9 | vsfree9 | varchar(101) |  | 自由项 (Custom) |
| 34 | vsfree10 | 替代料辅助属性10 | vsfree10 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 37 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(50) |  | 字符串 (String) |
| 38 | vfirstid | 源头单据表头主键 | vfirstid | varchar(50) |  | 字符串 (String) |
| 39 | vfirstbid | 源头单据表体主键 | vfirstbid | varchar(50) |  | 字符串 (String) |
| 40 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 41 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 42 | vsrcrowno | 来源头单据行号 | vsrcrowno | varchar(30) |  | 字符串 (String) |
| 43 | vsrcid | 来源单据表头主键 | vsrcid | varchar(50) |  | 字符串 (String) |
| 44 | vsrcbid | 来源单据表体主键 | vsrcbid | varchar(50) |  | 字符串 (String) |
| 45 | vsubsrate | 替代系数 | vsubsrate | varchar(50) |  | 字符串 (String) |
| 46 | fsubstype | 替代类型 | fsubstype | int |  | 整数 (Integer) |
| 47 | nsubspriority | 替代顺序 | nsubspriority | int |  | 整数 (Integer) |
| 48 | vsubsbid | 替代单据表体主键 | vsubsbid | varchar(50) |  | 字符串 (String) |
| 49 | vsubsid | 替代单据表头主键 | vsubsid | varchar(50) |  | 字符串 (String) |
| 50 | vsubstype | 替代单据类型 | vsubstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 51 | vsubscode | 替代单据号 | vsubscode | varchar(40) |  | 字符串 (String) |
| 52 | vsubsrowno | 替代单据行号 | vsubsrowno | varchar(30) |  | 字符串 (String) |
| 53 | cunitid | 主料主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 54 | castunitid | 主料单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 55 | vchangerate | 主料换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 56 | nnum | 主料被替代主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | nastnum | 主料被替代量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | csunitid | 替代料主单位 | csunitid | varchar(20) |  | 计量单位 (measdoc) |
| 59 | csastunitid | 替代料单位 | csastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 60 | vschangerate | 替代料换算率 | vschangerate | varchar(60) |  | 字符串 (String) |
| 61 | nsnum | 替代料主数量 | nsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 62 | nsastnum | 替代料数量 | nsastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 63 | nsassignednum | 替代料已分配量 | nsassignednum | decimal(28, 8) |  | 数值 (UFDouble) |
| 64 | computecode | 运算标识 | computecode | varchar(40) |  | 字符串 (String) |
| 65 | cpsid | 计划方案 | cpsid | varchar(20) |  | 计划方案 (mm_ps) |
| 66 | csbomid | 替代料生产BOM版本 | csbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 67 | cspackbomid | 替代料包装BOM版本 | cspackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 68 | vpfree1 | 产品物料辅助属性1 | vpfree1 | varchar(101) |  | 自由项 (Custom) |
| 69 | vpfree2 | 产品物料辅助属性2 | vpfree2 | varchar(101) |  | 自由项 (Custom) |
| 70 | vpfree3 | 产品物料辅助属性3 | vpfree3 | varchar(101) |  | 自由项 (Custom) |
| 71 | vpfree4 | 产品物料辅助属性4 | vpfree4 | varchar(101) |  | 自由项 (Custom) |
| 72 | vpfree5 | 产品物料辅助属性5 | vpfree5 | varchar(101) |  | 自由项 (Custom) |
| 73 | vpfree6 | 产品物料辅助属性6 | vpfree6 | varchar(101) |  | 自由项 (Custom) |
| 74 | vpfree7 | 产品物料辅助属性7 | vpfree7 | varchar(101) |  | 自由项 (Custom) |
| 75 | vpfree8 | 产品物料辅助属性8 | vpfree8 | varchar(101) |  | 自由项 (Custom) |
| 76 | vpfree9 | 产品物料辅助属性9 | vpfree9 | varchar(101) |  | 自由项 (Custom) |
| 77 | vpfree10 | 产品物料辅助属性18 | vpfree10 | varchar(101) |  | 自由项 (Custom) |
| 78 | vfree1 | 主料辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 79 | vfree2 | 主料辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 80 | vfree3 | 主料辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 81 | vfree4 | 主料辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 82 | vfree5 | 主料辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 83 | vfree6 | 主料辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 84 | vfree7 | 主料辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 85 | vfree8 | 主料辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 86 | vfree9 | 主料辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 87 | vfree10 | 主料辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |