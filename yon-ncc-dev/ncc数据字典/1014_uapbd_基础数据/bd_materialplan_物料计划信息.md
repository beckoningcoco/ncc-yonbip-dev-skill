# |<<

**物料计划信息 (bd_materialplan / nc.vo.bd.material.plan.MaterialPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialplan | 物料计划信息主键 | pk_materialplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_material | 物料基本信息主键 | pk_material | char(20) | √ | 物料基本信息（多版本） (material) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 5 | pk_prodfactory | 生产工厂 | pk_prodfactory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | lowlevelcode | 低层码 | lowlevelcode | int |  | 整数 (Integer) |
| 7 | batchrule | 批量规则 | batchrule | char(2) | √ | 批量规则 (batchrule) |  | ZJ=直接批量; |