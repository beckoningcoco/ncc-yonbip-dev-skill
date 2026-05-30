# |<<

**批量分级子实体 (dm_batrange_b / nc.vo.dm.policy.entity.BatchRangeBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1715.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batrange_b | 批量分级子实体 | pk_batrange_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | ilevel | 分级序号 | ilevel | int |  | 整数 (Integer) |
| 4 | nrangefrom | 批量分级从 | nrangefrom | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nrangeto | 批量分级到 | nrangeto | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | vrangename | 批量分级区间 | vrangename | varchar(200) |  | 字符串 (String) |