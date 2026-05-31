# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12601.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_optrecsrvs | pk_optrecsrvs | pk_optrecsrvs | char(20) | √ |
| 2 | code_srv_op | code_srv_op | code_srv_op | varchar2(300) |
| 3 | dt_optsrvrole | dt_optsrvrole | dt_optsrvrole | varchar2(20) |  |  | '~' |
| 4 | eu_opsrvrole | eu_opsrvrole | eu_opsrvrole | number(38, 0) |
| 5 | note | note | note | varchar2(4000) |
| 6 | opcode | opcode | opcode | varchar2(50) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_optrec | pk_optrec | pk_optrec | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_srv_op | pk_srv_op | pk_srv_op | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |