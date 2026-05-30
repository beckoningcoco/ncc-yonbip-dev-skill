# |<<

**自定义项映射 (ia_upg_def / nc.vo.ia.upg.pcia.entity.IAUpgDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2861.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cupgdefid | 主键 | cupgdefid | char(20) | √ | 主键 (UFID) |
| 2 | vgroupcode | 用户定义属性组编码 | vgroupcode | varchar(20) |  | 字符串 (String) |
| 3 | vsrcfield | 来源字段 | vsrcfield | varchar(20) |  | 字符串 (String) |
| 4 | vdestfield | 目的字段 | vdestfield | varchar(20) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |