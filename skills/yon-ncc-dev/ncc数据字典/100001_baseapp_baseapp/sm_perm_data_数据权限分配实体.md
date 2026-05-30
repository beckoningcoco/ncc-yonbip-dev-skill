# |<<

**数据权限分配实体 (sm_perm_data / nc.vo.uap.rbac.DataPermConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5328.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_perm_config | 主键 | pk_perm_config | char(20) | √ | 主键 (UFID) |
| 2 | subjectid | 授权主体 | subjectid | varchar(50) |  | 字符串 (String) |
| 3 | resourceid | 资源 | resourceid | varchar(50) |  | 字符串 (String) |
| 4 | operationcode | 操作编码 | operationcode | varchar(50) |  | 字符串 (String) |
| 5 | ruleid | 规则 | ruleid | varchar(50) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | datapermtype | 权限类型 | datapermtype | int |  | 资源操作类型 (ResourceOperationTypeEnum) |  | 0=维护类; |