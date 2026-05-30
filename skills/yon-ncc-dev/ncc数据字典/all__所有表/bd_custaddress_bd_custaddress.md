# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_address | pk_address | pk_address | varchar2(20) | √ |  | '~' |
| 2 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 3 | isdefault | isdefault | isdefault | char(1) | √ |  | 'N' |
| 4 | pk_addressdoc | pk_addressdoc | pk_addressdoc | varchar2(20) |  |  | '~' |
| 5 | pk_areacl | pk_areacl | pk_areacl | varchar2(20) |  |  | '~' |
| 6 | pk_custaddress | pk_custaddress | pk_custaddress | char(20) |
| 7 | pk_customer | pk_customer | pk_customer | varchar2(20) | √ |  | '~' |
| 8 | pk_custsale | pk_custsale | pk_custsale | char(20) |  |  | '~' |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_linkman | pk_linkman | pk_linkman | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | def1 | def1 | def1 | varchar2(101) |
| 13 | def2 | def2 | def2 | varchar2(101) |
| 14 | def3 | def3 | def3 | varchar2(101) |
| 15 | def4 | def4 | def4 | varchar2(101) |
| 16 | def5 | def5 | def5 | varchar2(101) |
| 17 | def6 | def6 | def6 | varchar2(101) |
| 18 | def7 | def7 | def7 | varchar2(101) |
| 19 | def8 | def8 | def8 | varchar2(101) |
| 20 | def9 | def9 | def9 | varchar2(101) |
| 21 | def10 | def10 | def10 | varchar2(101) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |