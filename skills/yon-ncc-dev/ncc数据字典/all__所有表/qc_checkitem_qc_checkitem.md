# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11091.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkitem | pk_checkitem | pk_checkitem | char(20) | √ |
| 2 | analymethod | analymethod | analymethod | number(38, 0) |
| 3 | bqpflag | bqpflag | bqpflag | char(1) |
| 4 | cfeature | cfeature | cfeature | varchar2(20) |
| 5 | cfeatureclass | cfeatureclass | cfeatureclass | varchar2(20) |
| 6 | ichecktype | ichecktype | ichecktype | number(38, 0) |
| 7 | iqcindexprfer | iqcindexprfer | iqcindexprfer | number(38, 0) |
| 8 | parentcheckitem | parentcheckitem | parentcheckitem | varchar2(20) |  |  | '~' |
| 9 | pk_checkbasis | pk_checkbasis | pk_checkbasis | varchar2(20) |  |  | '~' |
| 10 | pk_checkmethod | pk_checkmethod | pk_checkmethod | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_outsupplier | pk_outsupplier | pk_outsupplier | varchar2(20) |  |  | '~' |
| 15 | pk_workcenter | pk_workcenter | pk_workcenter | varchar2(20) |  |  | '~' |
| 16 | vcheckitemcode | vcheckitemcode | vcheckitemcode | varchar2(50) |
| 17 | vcheckitemname | vcheckitemname | vcheckitemname | varchar2(300) |
| 18 | vcheckitemname2 | vcheckitemname2 | vcheckitemname2 | varchar2(300) |
| 19 | vcheckitemname3 | vcheckitemname3 | vcheckitemname3 | varchar2(300) |
| 20 | vcheckitemname4 | vcheckitemname4 | vcheckitemname4 | varchar2(300) |
| 21 | vcheckitemname5 | vcheckitemname5 | vcheckitemname5 | varchar2(300) |
| 22 | vcheckitemname6 | vcheckitemname6 | vcheckitemname6 | varchar2(300) |
| 23 | vmemo | vmemo | vmemo | varchar2(181) |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |