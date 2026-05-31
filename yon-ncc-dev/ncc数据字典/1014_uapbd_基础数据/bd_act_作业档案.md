# |<<

**作业档案 (bd_act / nc.vo.bd.aassign.entity.BDActVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/321.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactid | 表头主键 | cactid | varchar(20) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cactivityid | 作业档案 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |