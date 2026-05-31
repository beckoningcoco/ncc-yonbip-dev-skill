# |<<

**作业分配 (bd_aassign / nc.vo.bd.aassign.entity.BDAAssignVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/293.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | caassignid | 作业分配主键 | caassignid | varchar(50) | √ | 字符串 (String) |
| 2 | cwkid | 工作中心主键 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | cactivityid | 作业档案主键 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |