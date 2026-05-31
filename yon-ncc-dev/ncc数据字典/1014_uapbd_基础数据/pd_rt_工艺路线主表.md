# |<<

**工艺路线主表 (pd_rt / nc.vo.bd.rt.rt0008.entity.RtHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4375.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crtid | 工艺路线 | crtid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | hcfeaturecode | 特征码 | hcfeaturecode | varchar(20) |  | 特征码档案 (bd_ffile) |
| 8 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 12 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | version | 工艺路线版本 | version | varchar(10) |  | 字符串 (String) |
| 14 | fversiontype | 版本类型 | fversiontype | int |  | 版本类型 (FversiontypeEnum) | 1 | 1=有效版本; |