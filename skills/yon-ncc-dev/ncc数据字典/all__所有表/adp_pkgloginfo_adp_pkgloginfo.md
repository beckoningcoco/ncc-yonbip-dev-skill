# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6421.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | logid | logid | logid | char(20) | √ |
| 2 | actiontype | actiontype | actiontype | number(38, 0) |
| 3 | groupid | groupid | groupid | varchar2(20) |  |  | '~' |
| 4 | is_success | is_success | is_success | char(1) |
| 5 | logcontent | logcontent | logcontent | varchar2(2000) |
| 6 | occurtime | occurtime | occurtime | char(19) |
| 7 | packname | packname | packname | varchar2(500) |
| 8 | pkgmanageid | pkgmanageid | pkgmanageid | char(50) |
| 9 | receiver | receiver | receiver | varchar2(20) |  |  | '~' |
| 10 | replyer | replyer | replyer | varchar2(20) |  |  | '~' |
| 11 | sender | sender | sender | varchar2(20) |  |  | '~' |
| 12 | sendtype | sendtype | sendtype | number(38, 0) |
| 13 | userid | userid | userid | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |