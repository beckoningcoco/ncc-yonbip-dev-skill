# |<<

**生产报告序列号信息 (mm_wr_serialno / nc.vo.mmpac.wr.entity.WrSerialNoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3801.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wr_serialno | 序列号信息 | pk_wr_serialno | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | pk_serialno | 序列号id | pk_serialno | char(20) |  | 主键 (UFID) |
| 6 | vserialno | 序列号 | vserialno | varchar(128) |  | 字符串 (String) |
| 7 | csastunitid | 单位 | csastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | csunitid | 主单位 | csunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | vschangerate | 换算率 | vschangerate | varchar(60) |  | 字符串 (String) |
| 10 | nserialnoastnum | 数量 | nserialnoastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nserialnonum | 主数量 | nserialnonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | csmaterialid | 产品最新版本 | csmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 13 | csmaterialvid | 产品编码 | csmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | csqualitylevelid | 质量等级 | csqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 15 | fsprocessmethod | 处理方式 | fsprocessmethod | int |  | 质量等级处理方式 (QualityProcessMethodEnum) |  | 1=合格; |