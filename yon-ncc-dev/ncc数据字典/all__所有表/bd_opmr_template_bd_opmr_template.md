# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7018.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_template | pk_template | pk_template | char(20) | √ |
| 2 | code | code | code | varchar2(20) |  |  | '~' |
| 3 | eu_emrtempright | eu_emrtempright | eu_emrtempright | varchar2(50) |
| 4 | name | name | name | varchar2(20) |  |  | '~' |
| 5 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 6 | pk_father | pk_father | pk_father | varchar2(20) |  |  | '~' |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_psn | pk_psn | pk_psn | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |