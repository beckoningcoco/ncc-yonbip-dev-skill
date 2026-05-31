# |<<

**物料范围 (mm_samaterial / nc.vo.mmpub.setanalysis.entity.SaMaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3773.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_br | 物料范围主键 | pk_br | varchar(60) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_marbasclass | 物料分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 8 | lowlevelcode | 物料低层码 | lowlevelcode | int |  | 整数 (Integer) |
| 9 | bvendorid | 供应商 | bvendorid | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | bproductorid | 生产厂商 | bproductorid | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bprojectid | 项目 | bprojectid | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | bcustomerid | 客户 | bcustomerid | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | bvfree1 | 自由辅助属性1 | bvfree1 | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | bvfree2 | 自由辅助属性2 | bvfree2 | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | bvfree3 | 自由辅助属性3 | bvfree3 | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | bvfree4 | 自由辅助属性4 | bvfree4 | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | bvfree5 | 自由辅助属性5 | bvfree5 | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | bvfree6 | 自由辅助属性6 | bvfree6 | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | bvfree7 | 自由辅助属性7 | bvfree7 | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | bvfree8 | 自由辅助属性8 | bvfree8 | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | bvfree9 | 自由辅助属性9 | bvfree9 | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | bvfree10 | 自由辅助属性10 | bvfree10 | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | cmeasdoc | 主单位 | cmeasdoc | varchar(20) |  | 计量单位 (measdoc) |
| 24 | cprodmeasdoc | 生产单位 | cprodmeasdoc | varchar(20) |  | 计量单位 (measdoc) |
| 25 | vchangerate | 换算率 | vchangerate | varchar(20) |  | 字符串 (String) |
| 26 | fsupplytype | 供给类型 | fsupplytype | int |  | 供给类型 (SaSupplyType) |  | 0=存量; |