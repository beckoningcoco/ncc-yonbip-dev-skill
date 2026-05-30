# |<<

**生产线物料 (pd_wk_prodinv / nc.vo.pd.pd0404.entity.WkProdinvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4386.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cwk_prodinvid | 生产线物料 | cwk_prodinvid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) | √ | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialclassid | 物料分类 | cmaterialclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 9 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 10 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 16 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | ntime | 时间 | ntime | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | ftimeunit | 时间单位 | ftimeunit | int |  | 时间单位 (TimeUnitEnum) |  | 1=小时; |