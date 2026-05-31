# |<<

**材料作业 (sca_bomref_martactv / nc.vo.sca.costbom.entity.MatrRefBuildVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5039.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkmartacvt | 材料作业 | pkmartacvt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_costtype | 成本类型 | pk_costtype | varchar(20) |  | 成本类型 (mapub_costtype) |
| 5 | bomversion4stuff | 材料BOM版本号 | bomversion4stuff | varchar(50) |  | 字符串 (String) |
| 6 | activitysource | 作业来源 | activitysource | int |  | 材料作业来源 (CostBomResEnum) | 1 | 1=BOM; |