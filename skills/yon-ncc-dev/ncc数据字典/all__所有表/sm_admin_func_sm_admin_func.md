# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11503.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_admin_func | pk_admin_func | pk_admin_func | char(20) | √ |
| 2 | admin_role_id | admin_role_id | admin_role_id | varchar2(20) |  |  | '~' |
| 3 | func_id | func_id | func_id | varchar2(50) |  |  | '~' |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | systype | systype | systype | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |