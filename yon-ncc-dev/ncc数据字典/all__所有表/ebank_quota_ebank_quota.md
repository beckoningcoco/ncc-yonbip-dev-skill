# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7848.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | accountcode | accountcode | accountcode | varchar2(50) |
| 3 | accountname | accountname | accountname | varchar2(100) |
| 4 | bank | bank | bank | varchar2(10) |
| 5 | curdate | curdate | curdate | char(19) |
| 6 | func | func | func | varchar2(10) |
| 7 | pk_bankacc | pk_bankacc | pk_bankacc | varchar2(20) |  |  | '~' |
| 8 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 9 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | char(20) |  |  | '~' |
| 13 | remark | remark | remark | varchar2(181) |
| 14 | trsamt | trsamt | trsamt | number(28, 8) |
| 15 | userid | userid | userid | varchar2(20) |  |  | '~' |
| 16 | versionno | versionno | versionno | number(38, 0) |
| 17 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 18 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 19 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 20 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 21 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |