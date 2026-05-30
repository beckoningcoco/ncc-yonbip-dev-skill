# |<<

**MPS计划订单替代 (mm_mpssubs / nc.vo.mmpps.replace.entity.MpsSubsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mpssubsid | 主键 | pk_mpssubsid | char(20) | √ | 主键 (UFID) |
| 2 | pk_mpssubspid | 父项ID | pk_mpssubspid | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | cpmaterialid | 产品最新版本 | cpmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cpmaterialvid | 产品 | cpmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cpvendorid | 产品供应商 | cpvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | cpproductorid | 产品生产厂商 | cpproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 10 | cpprojectid | 产品项目 | cpprojectid | varchar(20) |  | 项目 (project) |
| 11 | cpcustomid | 产品客户 | cpcustomid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cmaterialid | 主料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 13 | cmaterialvid | 主料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | cvendorid | 主料供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | cproductorid | 主料生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 16 | cprojectid | 主料项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 17 | ccustomid | 主料客户 | ccustomid | varchar(20) |  | 客户基本信息 (customer) |
| 18 | cunitid | 主料主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | cbomid | 主料生产BOM版本 | cbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 20 | cpackbomid | 主料包装BOM版本 | cpackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 21 | csmaterialid | 替代料最新版本 | csmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 22 | csmaterialvid | 替代料 | csmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 23 | csvendorid | 替代料供应商 | csvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 24 | csproductorid | 替代料生产厂商 | csproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 25 | csprojectid | 替代料项目 | csprojectid | varchar(20) |  | 项目 (project) |
| 26 | cscustomid | 替代料客户 | cscustomid | varchar(20) |  | 客户基本信息 (customer) |
| 27 | vsfree1 | 替代料自由辅助属性1 | vsfree1 | varchar(101) |  | 自由项 (Custom) |
| 28 | vsfree2 | 替代料自由辅助属性2 | vsfree2 | varchar(101) |  | 自由项 (Custom) |
| 29 | vsfree3 | 替代料自由辅助属性3 | vsfree3 | varchar(101) |  | 自由项 (Custom) |
| 30 | vsfree4 | 替代料自由辅助属性4 | vsfree4 | varchar(101) |  | 自由项 (Custom) |
| 31 | vsfree5 | 替代料自由辅助属性5 | vsfree5 | varchar(101) |  | 自由项 (Custom) |
| 32 | vsfree6 | 替代料自由辅助属性6 | vsfree6 | varchar(101) |  | 自由项 (Custom) |
| 33 | vsfree7 | 替代料自由辅助属性7 | vsfree7 | varchar(101) |  | 自由项 (Custom) |
| 34 | vsfree8 | 替代料自由辅助属性8 | vsfree8 | varchar(101) |  | 自由项 (Custom) |
| 35 | vsfree9 | 替代料自由辅助属性9 | vsfree9 | varchar(101) |  | 自由项 (Custom) |
| 36 | vsfree10 | 替代料自由辅助属性10 | vsfree10 | varchar(101) |  | 自由项 (Custom) |
| 37 | csunitid | 替代料主单位 | csunitid | varchar(20) |  | 计量单位 (measdoc) |
| 38 | bcanreplace | 可替代 | bcanreplace | varchar(1) |  | 布尔类型 (UFBoolean) |
| 39 | csbomid | 替代料生产BOM版本 | csbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 40 | cspackbomid | 替代料包装BOM版本 | cspackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 41 | vsubsrate | 替代系数 | vsubsrate | varchar(20) |  | 字符串 (String) |
| 42 | pk_realsusbs | 实际替代ID | pk_realsusbs | varchar(20) |  | 字符串 (String) |
| 43 | realsusbsts | 实际替代TS | realsusbsts | char(19) |  | 日期时间 (UFDateTime) |
| 44 | castunitid | 主料单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 45 | vchangerate | 主料换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 46 | csastunitid | 替代料单位 | csastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 47 | vschangerate | 替代料换算率 | vschangerate | varchar(50) |  | 字符串 (String) |
| 48 | bcustomer | 客户专用料 | bcustomer | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | bproject | 项目专用料 | bproject | char(1) |  | 布尔类型 (UFBoolean) |
| 50 | cpunitid | 产品主单位 | cpunitid | varchar(20) |  | 计量单位 (measdoc) |
| 51 | cpastunitid | 产品单位 | cpastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 52 | cpffileid | 产品特征码 | cpffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 53 | cffileid | 主料特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 54 | csffileid | 替代料特征码 | csffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 55 | vpfree1 | 产品自由辅助属性1 | vpfree1 | varchar(101) |  | 自由项 (Custom) |
| 56 | vpfree2 | 产品自由辅助属性2 | vpfree2 | varchar(101) |  | 自由项 (Custom) |
| 57 | vpfree3 | 产品自由辅助属性3 | vpfree3 | varchar(101) |  | 自由项 (Custom) |
| 58 | vpfree4 | 产品自由辅助属性4 | vpfree4 | varchar(101) |  | 自由项 (Custom) |
| 59 | vpfree5 | 产品自由辅助属性5 | vpfree5 | varchar(101) |  | 自由项 (Custom) |
| 60 | vpfree6 | 产品自由辅助属性6 | vpfree6 | varchar(101) |  | 自由项 (Custom) |
| 61 | vpfree7 | 产品自由辅助属性7 | vpfree7 | varchar(101) |  | 自由项 (Custom) |
| 62 | vpfree8 | 产品自由辅助属性8 | vpfree8 | varchar(101) |  | 自由项 (Custom) |
| 63 | vpfree9 | 产品自由辅助属性9 | vpfree9 | varchar(101) |  | 自由项 (Custom) |
| 64 | vpfree10 | 产品自由辅助属性10 | vpfree10 | varchar(101) |  | 自由项 (Custom) |
| 65 | vfree1 | 主料自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 66 | vfree2 | 主料自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 67 | vfree3 | 主料自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 68 | vfree4 | 主料自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 69 | vfree5 | 主料自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 70 | vfree6 | 主料自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 71 | vfree7 | 主料自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 72 | vfree8 | 主料自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 73 | vfree9 | 主料自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 74 | vfree10 | 主料自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |