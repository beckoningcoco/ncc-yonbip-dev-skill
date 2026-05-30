# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10852.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_splitflow | pk_splitflow | pk_splitflow | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | billname | billname | billname | varchar2(1024) |
| 4 | glcvoperatemny | glcvoperatemny | glcvoperatemny | number(28, 8) |
| 5 | gllcvoperatemny | gllcvoperatemny | gllcvoperatemny | number(28, 8) |
| 6 | olcvoperatemny | olcvoperatemny | olcvoperatemny | number(28, 8) |
| 7 | pk_billid | pk_billid | pk_billid | varchar2(20) |  |  | '~' |
| 8 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 9 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_parentbillid | pk_parentbillid | pk_parentbillid | varchar2(20) |  |  | '~' |
| 14 | pk_planperiod | pk_planperiod | pk_planperiod | varchar2(20) |  |  | '~' |
| 15 | remark | remark | remark | varchar2(1024) |
| 16 | vbillno | vbillno | vbillno | varchar2(50) |
| 17 | versionno | versionno | versionno | number(38, 0) |
| 18 | voperatedate | voperatedate | voperatedate | char(19) |
| 19 | voperatemny | voperatemny | voperatemny | number(28, 8) |
| 20 | voperatetype | voperatetype | voperatetype | number(38, 0) |
| 21 | voperatornote | voperatornote | voperatornote | varchar2(181) |
| 22 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 23 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 24 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 25 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 26 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 27 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 28 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 29 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 30 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 31 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 32 | creationtime | creationtime | creationtime | char(19) |
| 33 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 34 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 35 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 36 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |