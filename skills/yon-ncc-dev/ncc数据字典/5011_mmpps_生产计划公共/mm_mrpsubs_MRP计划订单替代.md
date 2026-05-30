# |<<

**MRP计划订单替代 (mm_mrpsubs / nc.vo.mmpps.replace.entity.MrpSubsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3708.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mrpsubsid | 主键 | pk_mrpsubsid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cpmaterialid | 产品最新版本 | cpmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cpmaterialvid | 产品 | cpmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cpvendorid | 产品供应商 | cpvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | cpproductorid | 产品生产厂商 | cpproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 9 | cpprojectid | 产品项目 | cpprojectid | varchar(20) |  | 项目 (project) |
| 10 | cpcustomid | 产品客户 | cpcustomid | varchar(20) |  | 客户基本信息 (customer) |
| 11 | cmaterialid | 主料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 主料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | cunitid | 主料主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | castunitid | 主料单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | vchangerate | 主料换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 16 | cbomid | 主料生产BOM版本 | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 17 | cpackbomid | 主料包装BOM版本 | cpackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 18 | cvendorid | 主料供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | cproductorid | 主料生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 20 | cprojectid | 主料项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 21 | ccustomid | 主料客户 | ccustomid | varchar(20) |  | 客户基本信息 (customer) |
| 22 | csmaterialid | 替代料最新版本 | csmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 23 | csmaterialvid | 替代料 | csmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 24 | csunitid | 替代料主单位 | csunitid | varchar(20) |  | 计量单位 (measdoc) |
| 25 | csastunitid | 替代料单位 | csastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 26 | vschangerate | 替代料换算率 | vschangerate | varchar(50) |  | 字符串 (String) |
| 27 | csvendorid | 替代料供应商 | csvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 28 | csproductorid | 替代料生产厂商 | csproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 29 | csprojectid | 替代料项目 | csprojectid | varchar(20) |  | 项目 (project) |
| 30 | cscustomid | 替代料客户 | cscustomid | varchar(20) |  | 客户基本信息 (customer) |
| 31 | vsfree1 | 替代料自由辅助属性1 | vsfree1 | varchar(101) |  | 自由项 (Custom) |
| 32 | vsfree2 | 替代料自由辅助属性2 | vsfree2 | varchar(101) |  | 自由项 (Custom) |
| 33 | vsfree3 | 替代料自由辅助属性3 | vsfree3 | varchar(101) |  | 自由项 (Custom) |
| 34 | vsfree4 | 替代料自由辅助属性4 | vsfree4 | varchar(101) |  | 自由项 (Custom) |
| 35 | vsfree5 | 替代料自由辅助属性5 | vsfree5 | varchar(101) |  | 自由项 (Custom) |
| 36 | vsfree6 | 替代料自由辅助属性6 | vsfree6 | varchar(101) |  | 自由项 (Custom) |
| 37 | vsfree7 | 替代料自由辅助属性7 | vsfree7 | varchar(101) |  | 自由项 (Custom) |
| 38 | vsfree8 | 替代料自由辅助属性8 | vsfree8 | varchar(101) |  | 自由项 (Custom) |
| 39 | vsfree9 | 替代料自由辅助属性9 | vsfree9 | varchar(101) |  | 自由项 (Custom) |
| 40 | vsfree10 | 替代料自由辅助属性10 | vsfree10 | varchar(101) |  | 自由项 (Custom) |
| 41 | csbomid | 替代料生产BOM版本 | csbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 42 | cspackbomid | 替代料包装BOM版本 | cspackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 43 | nsubspriority | 替代顺序 | nsubspriority | varchar(50) |  | 字符串 (String) |
| 44 | vsubsrate | 替代系数 | vsubsrate | varchar(50) |  | 字符串 (String) |
| 45 | nonhandnum | 库存主数量 | nonhandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | nonhandastnum | 库存数量 | nonhandastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | npabnum | 在途主数量 | npabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | npabastnum | 在途数量 | npabastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | nhsnum | 计划已分配主数量 | nhsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | nhsastnum | 计划已分配数量 | nhsastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | nsassignednum | 备料已分配主数量 | nsassignednum | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | nsassignedastnum | 备料已分配数量 | nsassignedastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 53 | nremainnum | 可分配主数量 | nremainnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | nremainastnum | 可分配数量 | nremainastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | nnum | 主料被替代主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | nastnum | 主料被替代数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | nsnum | 本次分配主数量 | nsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 58 | nsastnum | 本次分配数量 | nsastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 59 | pk_realsusbs | 实际替代ID | pk_realsusbs | varchar(50) |  | 字符串 (String) |
| 60 | realsusbsts | 实际替代TS | realsusbsts | char(19) |  | 日期时间 (UFDateTime) |
| 61 | pk_psubsid | 替代父项ID | pk_psubsid | varchar(50) |  | 字符串 (String) |
| 62 | cpunitid | 产品主单位 | cpunitid | varchar(20) |  | 计量单位 (measdoc) |
| 63 | cpastunitid | 产品单位 | cpastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 64 | cpffileid | 产品特征码 | cpffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 65 | cffileid | 主料特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 66 | csffileid | 替代料特征码 | csffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 67 | vpfree1 | 产品自由辅助属性1 | vpfree1 | varchar(101) |  | 自由项 (Custom) |
| 68 | vpfree2 | 产品自由辅助属性2 | vpfree2 | varchar(101) |  | 自由项 (Custom) |
| 69 | vpfree3 | 产品自由辅助属性3 | vpfree3 | varchar(101) |  | 自由项 (Custom) |
| 70 | vpfree4 | 产品自由辅助属性4 | vpfree4 | varchar(101) |  | 自由项 (Custom) |
| 71 | vpfree5 | 产品自由辅助属性5 | vpfree5 | varchar(101) |  | 自由项 (Custom) |
| 72 | vpfree6 | 产品自由辅助属性6 | vpfree6 | varchar(101) |  | 自由项 (Custom) |
| 73 | vpfree7 | 产品自由辅助属性7 | vpfree7 | varchar(101) |  | 自由项 (Custom) |
| 74 | vpfree8 | 产品自由辅助属性8 | vpfree8 | varchar(101) |  | 自由项 (Custom) |
| 75 | vpfree9 | 产品自由辅助属性9 | vpfree9 | varchar(101) |  | 自由项 (Custom) |
| 76 | vpfree10 | 产品自由辅助属性10 | vpfree10 | varchar(101) |  | 自由项 (Custom) |
| 77 | vfree1 | 主料自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 78 | vfree2 | 主料自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 79 | vfree3 | 主料自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 80 | vfree4 | 主料自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 81 | vfree5 | 主料自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 82 | vfree6 | 主料自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 83 | vfree7 | 主料自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 84 | vfree8 | 主料自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 85 | vfree9 | 主料自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 86 | vfree10 | 主料自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |