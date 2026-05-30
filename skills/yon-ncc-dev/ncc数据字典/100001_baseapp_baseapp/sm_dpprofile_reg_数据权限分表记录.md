# |<<

**数据权限分表记录 (sm_dpprofile_reg / nc.vo.uap.rbac.DataPermProfileRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5302.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_profilereg | 主键 | pk_profilereg | char(20) | √ | 主键 (UFID) |
| 2 | cuserid | 用户 | cuserid | varchar(20) |  | 用户 (user) |
| 3 | resourceid | 权限资源 | resourceid | varchar(20) |  | 权限资源 (PermissionResource) |
| 4 | operationcode | 操作 | operationcode | varchar(200) |  | 字符串 (String) |
| 5 | dptablename | 表名 | dptablename | varchar(200) |  | 字符串 (String) |
| 6 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |