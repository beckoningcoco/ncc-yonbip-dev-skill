# |<<

**全成本计算物料范围设置 (cm_costrangeset / nc.vo.cm.costrangeset.entity.CostRangeSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccostrangesetid | 全成本计算物料范围设置表 | ccostrangesetid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cmarbasclass | 物料基本分类 | cmarbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | cmarcostclass | 物料成本分类 | cmarcostclass | varchar(20) |  | 物料成本分类 (marcostclass) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |