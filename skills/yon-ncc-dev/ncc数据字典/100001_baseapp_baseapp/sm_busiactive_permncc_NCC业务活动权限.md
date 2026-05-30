# |<<

**NCC业务活动权限 (sm_busiactive_permncc / nc.vo.uap.rbac.busiactive.NCCBusiActivePermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5290.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiactive_permncc | 主键 | pk_busiactive_permncc | char(20) | √ | 主键 (UFID) |
| 2 | pk_subject | 主体PK | pk_subject | varchar(50) | √ | 字符串 (String) |
| 3 | subjectcode | 编码 | subjectcode | varchar(50) |  | 字符串 (String) |
| 4 | displayname | 名称 | displayname | varchar(400) |  | 字符串 (String) |
| 5 | parentid | 上级 | parentid | varchar(50) |  | 字符串 (String) |
| 6 | subjecttype | 主体类型 | subjecttype | int |  | 业务活动主体 (busiactivepermenum) |  | 1=模块; |