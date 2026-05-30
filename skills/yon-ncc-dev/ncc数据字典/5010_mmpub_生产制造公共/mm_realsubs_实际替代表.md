# |<<

**实际替代表 (mm_realsubs / nc.vo.mmpub.replace.entity.RealsubsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3759.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_realsubs | 实际替代表主键 | pk_realsubs | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cpmaterialid | 产品最新版本 | cpmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cpmaterialvid | 产品 | cpmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cpprojectid | 产品项目 | cpprojectid | varchar(20) |  | 项目 (project) |
| 8 | cpcustomerid | 产品客户 | cpcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 9 | cpvendorid | 产品供应商 | cpvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 10 | cpproductorid | 产品生产厂商 | cpproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 11 | cmaterialid | 主料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 主料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | cprojectid | 主料项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 14 | ccustomerid | 主料客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 15 | cvendorid | 主料供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | cproductorid | 主料生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 17 | csmaterialid | 替代料最新版本 | csmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 18 | csmaterialvid | 替代料 | csmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 19 | csprojectid | 替代料项目 | csprojectid | varchar(20) |  | 项目 (project) |
| 20 | cscustomerid | 替代料客户 | cscustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | csvendorid | 替代料供应商 | csvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 22 | csproductorid | 替代料生产厂商 | csproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 23 | vsfree1 | 替代料辅助属性1 | vsfree1 | varchar(101) |  | 自由项 (Custom) |
| 24 | vsfree2 | 替代料辅助属性2 | vsfree2 | varchar(101) |  | 自由项 (Custom) |
| 25 | vsfree3 | 替代料辅助属性3 | vsfree3 | varchar(101) |  | 自由项 (Custom) |
| 26 | vsfree4 | 替代料辅助属性4 | vsfree4 | varchar(101) |  | 自由项 (Custom) |
| 27 | vsfree5 | 替代料辅助属性5 | vsfree5 | varchar(101) |  | 自由项 (Custom) |
| 28 | vsfree6 | 替代料辅助属性6 | vsfree6 | varchar(101) |  | 自由项 (Custom) |
| 29 | vsfree7 | 替代料辅助属性7 | vsfree7 | varchar(101) |  | 自由项 (Custom) |
| 30 | vsfree8 | 替代料辅助属性8 | vsfree8 | varchar(101) |  | 自由项 (Custom) |
| 31 | vsfree9 | 替代料辅助属性9 | vsfree9 | varchar(101) |  | 自由项 (Custom) |
| 32 | vsfree10 | 替代料辅助属性10 | vsfree10 | varchar(101) |  | 自由项 (Custom) |
| 33 | vsbomid | 替代料生产BOM版本 | vsbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 34 | cspackbomid | 替代料包装BOM版本 | cspackbomid | varchar(20) |  | 物料清单 (bd_bom) |
| 35 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 37 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(30) |  | 字符串 (String) |
| 38 | vfirstid | 源头单据表头主键 | vfirstid | varchar(20) |  | 字符串 (String) |
| 39 | vfirstbid | 源头单据表体主键 | vfirstbid | varchar(20) |  | 字符串 (String) |
| 40 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 41 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 42 | vsrcrowno | 来源头单据行号 | vsrcrowno | varchar(30) |  | 字符串 (String) |
| 43 | vsrcid | 来源单据表头主键 | vsrcid | varchar(20) |  | 字符串 (String) |
| 44 | vsrcbid | 来源单据表体主键 | vsrcbid | varchar(20) |  | 字符串 (String) |
| 45 | vsubsrate | 替代系数 | vsubsrate | varchar(50) |  | 字符串 (String) |
| 46 | fsubstype | 替代类型 | fsubstype | int |  | 替代类型 (Substype) |  | 0=用户指定; |