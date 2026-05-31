# |<<

**核算要素对应物料分类 (bd_elemrelation_b / nc.vo.bd.elemrelation.entity.ElemRelationMarClassVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/811.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | celemrelationbid | 核算要素对应物料分类 | celemrelationbid | char(20) | √ | 主键 (UFID) |
| 2 | celemrelationid | 核算要素与物料对照表 | celemrelationid | char(20) |  | 主键 (UFID) |
| 3 | marbasclassid | 物料基本分类 | marbasclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | cmarcostclassid | 物料成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 工厂版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 7 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |