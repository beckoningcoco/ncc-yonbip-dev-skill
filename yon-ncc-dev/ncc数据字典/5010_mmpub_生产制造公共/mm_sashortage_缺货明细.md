# |<<

**缺货明细 (mm_sashortage / nc.vo.mmpub.setanalysis.entity.SaShortageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3775.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_outofstock | 缺货明细主键 | pk_outofstock | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | production | 产品 | production | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | nbillnum | 单据主数量 | nbillnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | ndemandnum | 需求主数量 | ndemandnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nmatchnum | 匹配主数量 | nmatchnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nlacknum | 缺料主数量 | nlacknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | demanddate | 需求日期 | demanddate | char(19) |  | 日期 (UFDate) |
| 11 | cppssupplyid | 供给单据明细 | cppssupplyid | varchar(20) |  | 字符串 (String) |
| 12 | csupplyrowno | 供给单据行号 | csupplyrowno | varchar(20) |  | 字符串 (String) |
| 13 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 15 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 16 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 17 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 18 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 19 | computecode | 分析标识 | computecode | varchar(50) |  | 字符串 (String) |
| 20 | vdemandtypecode | 父项单据类型 | vdemandtypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 21 | vdemandcode | 单据号 | vdemandcode | varchar(50) |  | 字符串 (String) |
| 22 | cdemandbillid | 需求单据主键 | cdemandbillid | varchar(50) |  | 字符串 (String) |
| 23 | cdemandbillbid | 需求单据明细主键 | cdemandbillbid | varchar(50) |  | 字符串 (String) |
| 24 | vdemandrowno | 需求行号 | vdemandrowno | varchar(50) |  | 字符串 (String) |
| 25 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 27 | vsrcid | 来源单据主表主键 | vsrcid | varchar(60) |  | 字符串 (String) |
| 28 | vsrcbid | 来源单据表体主键 | vsrcbid | varchar(60) |  | 字符串 (String) |
| 29 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 30 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 31 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 32 | vfirstid | 源头单据主表主键 | vfirstid | varchar(60) |  | 字符串 (String) |
| 33 | vfirstbid | 源头单据表体主键 | vfirstbid | varchar(60) |  | 字符串 (String) |
| 34 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 35 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 36 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 37 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 38 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 39 | fdemandtype | 单据类型 | fdemandtype | int |  | 需求单据类型 (SaDemandType) |  | 1=备料计划; |