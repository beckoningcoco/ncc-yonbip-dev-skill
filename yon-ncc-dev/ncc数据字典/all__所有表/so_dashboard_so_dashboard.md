# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_so_dashboard | pk_so_dashboard | pk_so_dashboard | char(20) | √ |
| 2 | cchanneltypeid | cchanneltypeid | cchanneltypeid | varchar2(20) |  |  | '~' |
| 3 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 4 | cdeptid | cdeptid | cdeptid | varchar2(20) |  |  | '~' |
| 5 | cemployeeid | cemployeeid | cemployeeid | varchar2(20) |  |  | '~' |
| 6 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 7 | cprodlineid | cprodlineid | cprodlineid | varchar2(20) |  |  | '~' |
| 8 | dbilldate | dbilldate | dbilldate | char(19) |
| 9 | lastts | lastts | lastts | char(19) |
| 10 | ncontractmny_group | ncontractmny_group | ncontractmny_group | number(28, 8) |
| 11 | ncontractmny_org | ncontractmny_org | ncontractmny_org | number(28, 8) |
| 12 | ninvmny_group | ninvmny_group | ninvmny_group | number(28, 8) |
| 13 | ninvmny_org | ninvmny_org | ninvmny_org | number(28, 8) |
| 14 | nmonth | nmonth | nmonth | number(10, 0) |
| 15 | nnum | nnum | nnum | number(28, 8) |
| 16 | noutmny_group | noutmny_group | noutmny_group | number(28, 8) |
| 17 | noutmny_org | noutmny_org | noutmny_org | number(28, 8) |
| 18 | nreceivedmny_group | nreceivedmny_group | nreceivedmny_group | number(28, 8) |
| 19 | nreceivedmny_org | nreceivedmny_org | nreceivedmny_org | number(28, 8) |
| 20 | nyear | nyear | nyear | number(10, 0) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |