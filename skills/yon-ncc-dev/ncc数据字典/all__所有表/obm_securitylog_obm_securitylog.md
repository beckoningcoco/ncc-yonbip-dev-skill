# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10097.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_slog | pk_slog | pk_slog | char(20) | √ |
| 2 | bresult | bresult | bresult | varchar2(2) |
| 3 | eventdesc | eventdesc | eventdesc | blob |
| 4 | logtime | logtime | logtime | char(19) |
| 5 | mcode | mcode | mcode | varchar2(40) |
| 6 | operate_endtime | operate_endtime | operate_endtime | char(23) |
| 7 | operate_starttime | operate_starttime | operate_starttime | char(23) |
| 8 | pk_user | pk_user | pk_user | varchar2(20) | √ |
| 9 | prompt | prompt | prompt | varchar2(1024) |
| 10 | seriouslevel | seriouslevel | seriouslevel | number(38, 0) |
| 11 | sessionid | sessionid | sessionid | varchar2(20) |
| 12 | srcip | srcip | srcip | varchar2(16) |
| 13 | yurref | yurref | yurref | varchar2(30) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |