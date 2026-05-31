# |<<

**应用注册 (sm_appregister / nc.vo.platform.workbench.AppRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5284.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appregister | 主键 | pk_appregister | char(20) | √ | 主键 (UFID) |
| 2 | code | 应用编码 | code | varchar(50) | √ | 字符串 (String) |
| 3 | name | 应用名称 | name | varchar(50) | √ | 字符串 (String) |
| 4 | own_module | 所属模块 | own_module | varchar(20) |  | 模块信息 (module) |
| 5 | mountid | 应用挂载id | mountid | varchar(50) |  | 字符串 (String) |
| 6 | width | 宽 | width | int |  | 整数 (Integer) |
| 7 | height | 高 | height | int |  | 整数 (Integer) |
| 8 | target_path | 跳转目标路径 | target_path | varchar(500) |  | 字符串 (String) |
| 9 | apptype | 应用类型 | apptype | int |  | 应用类型 (apptypeenum) |  | 0=应用分类; |