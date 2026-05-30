# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7836.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | bankname | bankname | bankname | varchar2(100) |
| 3 | curacc | curacc | curacc | varchar2(50) |
| 4 | down_date | down_date | down_date | char(19) |
| 5 | down_state | down_state | down_state | varchar2(50) |
| 6 | down_time | down_time | down_time | char(8) |
| 7 | msg | msg | msg | varchar2(300) |
| 8 | patype | patype | patype | char(50) |
| 9 | pk_bankaccbas | pk_bankaccbas | pk_bankaccbas | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | unitname | unitname | unitname | varchar2(300) |
| 14 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 15 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 16 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 17 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 18 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |