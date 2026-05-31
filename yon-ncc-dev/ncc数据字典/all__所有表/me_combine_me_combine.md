# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9840.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_combine | pk_combine | pk_combine | char(20) | √ |
| 2 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | caccountperiod | caccountperiod | caccountperiod | varchar2(20) |  |  | '~' |
| 5 | ccurrencyid | ccurrencyid | ccurrencyid | varchar2(20) |  |  | '~' |
| 6 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 7 | dbilldate | dbilldate | dbilldate | char(19) |
| 8 | dmakedate | dmakedate | dmakedate | char(19) |
| 9 | fstatusflag | fstatusflag | fstatusflag | number(38, 0) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | taudittime | taudittime | taudittime | char(19) |
| 13 | vbillcode | vbillcode | vbillcode | varchar2(40) |
| 14 | vnode | vnode | vnode | varchar2(200) |
| 15 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |  |  | '~' |
| 16 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 17 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 18 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 19 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 20 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 21 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 22 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 23 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 24 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 25 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 26 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 27 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 28 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 29 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 30 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 31 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 32 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 33 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 34 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 35 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 36 | creationtime | creationtime | creationtime | char(19) |
| 37 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 38 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 39 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 40 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 41 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |