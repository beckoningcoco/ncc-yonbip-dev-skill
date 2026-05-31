# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11504.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_admin_org | pk_admin_org | pk_admin_org | char(20) | √ |
| 2 | admin_role_id | admin_role_id | admin_role_id | varchar2(20) |  |  | '~' |
| 3 | isrule | isrule | isrule | varchar2(20) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | rulepar | rulepar | rulepar | varchar2(200) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |