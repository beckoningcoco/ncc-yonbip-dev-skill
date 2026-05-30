# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7849.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvconf | pk_srvconf | pk_srvconf | char(20) | √ |
| 2 | ip | ip | ip | varchar2(50) |
| 3 | netbankinftpstyle | netbankinftpstyle | netbankinftpstyle | varchar2(50) |
| 4 | overtime | overtime | overtime | number(38, 0) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | port | port | port | varchar2(50) |
| 9 | servelt | servelt | servelt | varchar2(50) |
| 10 | srvid | srvid | srvid | varchar2(50) |
| 11 | usestate | usestate | usestate | varchar2(50) |
| 12 | weight | weight | weight | number(38, 0) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |