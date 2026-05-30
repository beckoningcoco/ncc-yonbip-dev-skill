# |<<

**资源操作 (sm_res_operation / nc.vo.uap.rbac.OperationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5335.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_res_operation | 主键 | pk_res_operation | char(20) | √ | 主键 (UFID) |
| 2 | operationcode | 操作编码 | operationcode | varchar(200) |  | 字符串 (String) |
| 3 | operationname | 操作名称 | operationname | varchar(200) |  | 字符串 (String) |
| 4 | resourceid | 关联资源 | resourceid | varchar(20) |  | 权限资源 (PermissionResource) |
| 5 | iskeyoperation | 关键操作 | iskeyoperation | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | operationtype | 操作类型 | operationtype | int | √ | 资源操作类型 (ResourceOperationTypeEnum) |  | 0=维护类; |