# |<<

**功能权限分配对象 (sm_power_function / nc.vo.uap.rbac.power.FunctionPowerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5333.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_power | 主键 | pk_power | char(20) | √ | 主键 (UFID) |
| 2 | pk_role | 角色 | pk_role | varchar(20) |  | 角色 (Role) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | resource_id | 资源主键 | resource_id | varchar(50) |  | 字符串 (String) |
| 6 | action_id | 动作 | action_id | varchar(50) |  | 字符串 (String) |