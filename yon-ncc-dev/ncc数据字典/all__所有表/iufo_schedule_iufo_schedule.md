# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schedule | pk_schedule | pk_schedule | char(20) | √ |
| 2 | busi_prop | busi_prop | busi_prop | varchar2(20) |
| 3 | enablestate | enablestate | enablestate | number(38, 0) |
| 4 | end_time | end_time | end_time | char(19) |
| 5 | isfromncc | isfromncc | isfromncc | char(1) |
| 6 | name | name | name | varchar2(300) | √ |
| 7 | name2 | name2 | name2 | varchar2(300) |
| 8 | name3 | name3 | name3 | varchar2(300) |
| 9 | name4 | name4 | name4 | varchar2(300) |
| 10 | name5 | name5 | name5 | varchar2(300) |
| 11 | name6 | name6 | name6 | varchar2(300) |
| 12 | note | note | note | varchar2(1024) |
| 13 | offsettype | offsettype | offsettype | number(38, 0) |
| 14 | offsetvalue | offsetvalue | offsetvalue | number(38, 0) |
| 15 | pk_group | pk_group | pk_group | char(20) | √ |
| 16 | pk_operator | pk_operator | pk_operator | char(20) |
| 17 | pk_org | pk_org | pk_org | char(20) | √ |
| 18 | pk_schedulesort | pk_schedulesort | pk_schedulesort | char(20) | √ |
| 19 | showtimingsetting | showtimingsetting | showtimingsetting | blob |
| 20 | start_time | start_time | start_time | char(19) |
| 21 | creationtime | creationtime | creationtime | char(19) |
| 22 | creator | creator | creator | char(20) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 25 | modifier | modifier | modifier | char(20) |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |