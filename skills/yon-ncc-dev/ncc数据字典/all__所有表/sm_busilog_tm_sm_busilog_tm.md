# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11531.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busilog | pk_busilog | pk_busilog | char(20) | √ |
| 2 | busiobjcode | busiobjcode | busiobjcode | varchar2(50) |
| 3 | busiobjname | busiobjname | busiobjname | varchar2(300) |
| 4 | client | client | client | varchar2(50) |
| 5 | logdate | logdate | logdate | char(19) |
| 6 | logmsg | logmsg | logmsg | blob |
| 7 | operateresult | operateresult | operateresult | varchar2(50) |
| 8 | orgpk_busiobj | orgpk_busiobj | orgpk_busiobj | varchar2(36) |  |  | '~' |
| 9 | pk_busiobj | pk_busiobj | pk_busiobj | varchar2(36) |
| 10 | pk_group | pk_group | pk_group | varchar2(36) |  |  | '~' |
| 11 | pk_operation | pk_operation | pk_operation | varchar2(36) |
| 12 | pk_user | pk_user | pk_user | varchar2(36) |  |  | '~' |
| 13 | typepk_busiobj | typepk_busiobj | typepk_busiobj | varchar2(36) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |