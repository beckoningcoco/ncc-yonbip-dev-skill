# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6573.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdrecovery_sk | pk_bdrecovery_sk | pk_bdrecovery_sk | char(20) | √ |
| 2 | globalmoney | globalmoney | globalmoney | number(28, 8) |  |  | 0 |
| 3 | globalrate | globalrate | globalrate | number(28, 8) |  |  | 1 |
| 4 | groupmoney | groupmoney | groupmoney | number(28, 8) |  |  | 0 |
| 5 | grouprate | grouprate | grouprate | number(28, 8) |  |  | 1 |
| 6 | localmoney | localmoney | localmoney | number(28, 8) |  |  | 0 |
| 7 | money | money | money | number(28, 8) |  |  | 0 |
| 8 | pk_bdrecovery | pk_bdrecovery | pk_bdrecovery | char(20) | √ |
| 9 | pk_gatherbill | pk_gatherbill | pk_gatherbill | varchar2(20) |  |  | '~' |
| 10 | pk_gatheritem | pk_gatheritem | pk_gatheritem | varchar2(20) |  |  | '~' |
| 11 | rate | rate | rate | number(28, 8) |  |  | 1 |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |