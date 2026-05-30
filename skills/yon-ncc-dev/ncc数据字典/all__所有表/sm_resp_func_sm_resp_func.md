# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11622.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resp_func | pk_resp_func | pk_resp_func | char(20) | √ |
| 2 | busi_pk | busi_pk | busi_pk | varchar2(50) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_responsibility | pk_responsibility | pk_responsibility | varchar2(20) |  |  | '~' |
| 6 | systype | systype | systype | varchar2(20) |
| 7 | type | type | type | number(38, 0) |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |