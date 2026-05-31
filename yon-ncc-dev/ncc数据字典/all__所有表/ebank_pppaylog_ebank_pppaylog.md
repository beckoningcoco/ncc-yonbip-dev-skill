# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7847.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pppaylog | pk_pppaylog | pk_pppaylog | char(20) | √ |
| 2 | eventdesc | eventdesc | eventdesc | blob |
| 3 | operate_endtime | operate_endtime | operate_endtime | char(23) |
| 4 | operate_result | operate_result | operate_result | varchar2(2) |
| 5 | operate_starttime | operate_starttime | operate_starttime | char(23) |
| 6 | pk_user | pk_user | pk_user | varchar2(20) | √ |
| 7 | prompt | prompt | prompt | varchar2(1024) |
| 8 | srcip | srcip | srcip | varchar2(16) |
| 9 | obmdef1 | obmdef1 | obmdef1 | varchar2(101) |
| 10 | obmdef2 | obmdef2 | obmdef2 | varchar2(101) |
| 11 | obmdef3 | obmdef3 | obmdef3 | varchar2(101) |
| 12 | obmdef4 | obmdef4 | obmdef4 | varchar2(101) |
| 13 | obmdef5 | obmdef5 | obmdef5 | varchar2(101) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |