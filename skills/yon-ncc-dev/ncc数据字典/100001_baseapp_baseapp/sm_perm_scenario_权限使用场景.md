# |<<

**权限使用场景 (sm_perm_scenario / nc.vo.uap.rbac.PermScenarioVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5330.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scenario | 主键 | pk_scenario | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(200) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 字符串 (String) |
| 4 | ownmodule | 模块 | ownmodule | varchar(20) |  | 模块信息 (module) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |