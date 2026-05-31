# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6912.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrtempsec | pk_emrtempsec | pk_emrtempsec | char(20) | √ |
| 2 | code_sec | code_sec | code_sec | varchar2(50) |
| 3 | dt_emrsectype | dt_emrsectype | dt_emrsectype | varchar2(50) |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | name_sec | name_sec | name_sec | varchar2(50) |
| 6 | pk_emrsectype | pk_emrsectype | pk_emrsectype | varchar2(20) |  |  | '~' |
| 7 | pk_emrtemp | pk_emrtemp | pk_emrtemp | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(50) |  |  | '~' |
| 10 | sortno | sortno | sortno | number(38, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |