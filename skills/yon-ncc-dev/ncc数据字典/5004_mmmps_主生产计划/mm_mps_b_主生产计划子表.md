# |<<

**主生产计划子表 (mm_mps_b / nc.vo.mmmps.mps.entity.MpsItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3704.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mps_b | 主生产计划子表 | pk_mps_b | varchar(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_factory | 工厂 | pk_factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_factory_v | 工厂版本 | pk_factory_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | cwkgroupid | 工作中心组 | cwkgroupid | varchar(20) |  | 工作中心组 (pd_wkg) |
| 8 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 11 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | customer | 客户 | customer | varchar(20) |  | 客户基本信息 (customer) |
| 15 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 16 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 17 | vbomversion | 生产BOM版本 | vbomversion | varchar(20) |  | 物料清单 (bd_bom) |
| 18 | vbomversionno | 生产BOM版本号(非ID) | vbomversionno | varchar(20) |  | 字符串 (String) |
| 19 | planinvestnum | 计划投入数量 | planinvestnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | planinvestmnum | 计划投入主数量 | planinvestmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | planoutputnum | 计划产出数量 | planoutputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | planoutputmnum | 计划产出主数量 | planoutputmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | dplanstartdate | 计划开工日期 | dplanstartdate | varchar(19) |  | 日期(开始) (UFDateBegin) |
| 24 | dplanenddate | 计划完工日期 | dplanenddate | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 25 | ddemandtime | 需求日期 | ddemandtime | varchar(19) |  | 日期(结束) (UFDateEnd) |
| 26 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 27 | vsrctrantype | 来源交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 28 | vsrctrantypeid | 来源交易类型主键 | vsrctrantypeid | char(20) |  | 主键 (UFID) |
| 29 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 来源单据类型 (FsrcbilltypeEnum) |  | 55B5=手工增加; |