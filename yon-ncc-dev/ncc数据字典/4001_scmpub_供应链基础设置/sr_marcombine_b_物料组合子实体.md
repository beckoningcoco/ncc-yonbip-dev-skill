# |<<

**物料组合子实体 (sr_marcombine_b / nc.vo.scmf.marcombine.entity.MarCombineBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5455.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marcombine_b | 物料组合子实体 | pk_marcombine_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cmarbaseclassid | 物料基本分类 | cmarbaseclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 4 | cmarsaleclassid | 物料销售分类 | cmarsaleclassid | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | bremoveflag | 排除 | bremoveflag | char(1) |  | 布尔类型 (UFBoolean) |