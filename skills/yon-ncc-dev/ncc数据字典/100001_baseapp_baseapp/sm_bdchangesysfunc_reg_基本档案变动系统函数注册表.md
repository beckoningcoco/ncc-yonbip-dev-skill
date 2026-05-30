# |<<

**基本档案变动系统函数注册表 (sm_bdchangesysfunc_reg / nc.vo.uap.rbac.bdchange.BDChangeSysFuncRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5286.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdchange_sysfunc | 主键 | pk_bdchange_sysfunc | char(20) | √ | 主键 (UFID) |
| 2 | dataid | 变动对象ID | dataid | varchar(50) |  | 字符串 (String) |
| 3 | changetype | 档案类型 | changetype | int |  | 档案变动关系的数据类型 (changetype) |  | 1=用户; |