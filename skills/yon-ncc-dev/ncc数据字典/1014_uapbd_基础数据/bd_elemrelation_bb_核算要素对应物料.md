# |<<

**核算要素对应物料 (bd_elemrelation_bb / nc.vo.bd.elemrelation.entity.ElemRelationMarVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/812.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | celemrelationbid2 | 核算要素对应物料 | celemrelationbid2 | char(20) | √ | 主键 (UFID) |
| 2 | celemrelationid | 核算要素与物料对照表 | celemrelationid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | cmaterialid | 物料版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息 (material_v) |