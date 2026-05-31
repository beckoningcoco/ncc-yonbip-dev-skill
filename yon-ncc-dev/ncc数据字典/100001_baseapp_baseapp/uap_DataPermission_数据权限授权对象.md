# |<<

**数据权限授权对象 (uap_DataPermission / nc.vo.uap.rbac.DataPermissionDisplayObject)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5842.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dataperm | 主键 | pk_dataperm | char(20) | √ | 主键 (UFID) |
| 2 | subjectid | 授权主体 | subjectid | varchar(50) |  | 字符串 (String) |
| 3 | resourceid | 资源实体 | resourceid | varchar(20) | √ | 权限资源 (PermissionResource) |
| 4 | operation | 资源操作 | operation | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | permissionrule | 授权规则 | permissionrule | image |  | BLOB (BLOB) |
| 7 | datapermtype | 授权类型 | datapermtype | int |  | 资源操作类型 (ResourceOperationTypeEnum) |  | 0=维护类; |