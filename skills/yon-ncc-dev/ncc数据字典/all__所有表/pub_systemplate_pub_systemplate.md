# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10993.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemplate | pk_systemplate | pk_systemplate | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(50) |
| 3 | funnode | funnode | funnode | varchar2(50) | √ |
| 4 | iscomm | iscomm | iscomm | char(1) |
| 5 | moduleid | moduleid | moduleid | varchar2(10) | √ |
| 6 | nodekey | nodekey | nodekey | varchar2(50) |
| 7 | operator | operator | operator | varchar2(20) |  |  | '~' |
| 8 | operator_type | operator_type | operator_type | number(38, 0) |
| 9 | orgtypecode | orgtypecode | orgtypecode | varchar2(2) |
| 10 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 11 | pk_corp | pk_corp | pk_corp | varchar2(20) |  |  | '~' |
| 12 | pk_defaultorg | pk_defaultorg | pk_defaultorg | varchar2(20) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |
| 14 | sysflag | sysflag | sysflag | number(38, 0) |
| 15 | templateflag | templateflag | templateflag | char(1) | √ |
| 16 | templateid | templateid | templateid | char(20) | √ |
| 17 | tempstyle | tempstyle | tempstyle | number(38, 0) | √ |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |