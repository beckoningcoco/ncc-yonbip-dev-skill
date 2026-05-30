# |<<

**核算要素与物料对照主表 (bd_elemrelation_h / nc.vo.bd.elemrelation.entity.ElemRelationHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/813.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | celemrelationid | 核算要素与物料对照表 | celemrelationid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 6 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |