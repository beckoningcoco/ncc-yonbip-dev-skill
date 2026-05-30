# |<<

**批量分级主实体 (dm_batrange / nc.vo.dm.policy.entity.BatchRangeHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batrange | 批量分级主实体 | pk_batrange | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vbatlevelname | 批量分级内容 | vbatlevelname | varchar(200) |  | 字符串 (String) |