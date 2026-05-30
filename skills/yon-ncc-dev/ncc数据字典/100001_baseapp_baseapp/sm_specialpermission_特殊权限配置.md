# |<<

**特殊权限配置 (sm_specialpermission / nc.vo.uap.rbac.specialpermission.SpecialPermissionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5348.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_special_permission | 主键 | pk_special_permission | char(20) | √ | 字符串 (String) |
| 2 | resourceid | 单据类型 | resourceid | varchar(20) |  | 权限资源 (PermissionResource) |
| 3 | creatorpermission | 创建者权限 | creatorpermission | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | directorpermission | 主管权限 | directorpermission | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | auditorpermission | 审核者权限 | auditorpermission | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |