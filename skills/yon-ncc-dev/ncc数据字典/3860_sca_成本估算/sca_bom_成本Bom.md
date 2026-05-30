# |<<

**成本Bom (sca_bom / nc.vo.sca.costbom.entity.CostBomHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5031.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccmbomid | 成本BOM | ccmbomid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 6 | icompositetype | 结构类型 | icompositetype | int |  | 结构类型 (compositeTypeEnum) | 1 | 1=产品; |