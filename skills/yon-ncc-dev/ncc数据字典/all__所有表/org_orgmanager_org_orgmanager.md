# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10247.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_orgmanager | pk_orgmanager | pk_orgmanager | varchar2(50) | √ |
| 2 | cuserid | cuserid | cuserid | varchar2(20) |  |  | '~' |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | pk_dept | pk_dept | pk_dept | char(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | pk_psndoc | pk_psndoc | pk_psndoc | varchar2(20) |  |  | '~' |
| 8 | pk_psnjob | pk_psnjob | pk_psnjob | char(20) |
| 9 | principalflag | principalflag | principalflag | char(1) |
| 10 | viewotherdirector | viewotherdirector | viewotherdirector | char(1) |
| 11 | viewprincipal | viewprincipal | viewprincipal | char(1) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |