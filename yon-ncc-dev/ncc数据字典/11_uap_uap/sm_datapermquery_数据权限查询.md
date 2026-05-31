# |<<

**数据权限查询 (sm_datapermquery / nc.vo.uap.rbac.query.DataPermissionQueryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5297.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datapermqry | 主键 | pk_datapermqry | varchar(50) | √ | 字符串 (String) |
| 2 | user | 用户名称 | user | varchar(20) |  | 用户 (user) |
| 3 | resource | 资源实体 | resource | varchar(20) |  | 权限资源 (PermissionResource) |
| 4 | type | 数据权限类型 | type | int |  | 数据权限类型枚举 (datapermenum) |  | 0=维护数据权限; |