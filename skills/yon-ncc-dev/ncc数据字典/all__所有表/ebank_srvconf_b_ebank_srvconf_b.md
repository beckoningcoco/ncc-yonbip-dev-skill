# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvconf_b | pk_srvconf_b | pk_srvconf_b | char(20) | √ |
| 2 | bankname | bankname | bankname | varchar2(100) |
| 3 | banktype | banktype | banktype | varchar2(50) |
| 4 | netbankinftpcode | netbankinftpcode | netbankinftpcode | varchar2(50) | √ |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 8 | pk_srvconf | pk_srvconf | pk_srvconf | varchar2(30) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |