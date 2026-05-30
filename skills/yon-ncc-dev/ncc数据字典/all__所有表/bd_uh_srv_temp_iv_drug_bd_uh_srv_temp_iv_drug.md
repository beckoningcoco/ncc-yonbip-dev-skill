# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pv_ivdrug | pv_ivdrug | pv_ivdrug | char(20) | √ |
| 2 | dt_role_iv | dt_role_iv | dt_role_iv | varchar2(50) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_role_iv | pk_role_iv | pk_role_iv | varchar2(20) |  |  | '~' |
| 6 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 7 | pk_srvtemp | pk_srvtemp | pk_srvtemp | varchar2(20) |  |  | '~' |
| 8 | pk_srvtempiv | pk_srvtempiv | pk_srvtempiv | char(20) | √ |
| 9 | quan | quan | quan | number(38, 0) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |