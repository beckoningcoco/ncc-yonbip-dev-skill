# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9671.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_querycond | pk_querycond | pk_querycond | char(20) | √ |
| 2 | defaultcond | defaultcond | defaultcond | char(1) |
| 3 | detailcond | detailcond | detailcond | blob |
| 4 | modulename | modulename | modulename | varchar2(50) |
| 5 | name | name | name | varchar2(300) |
| 6 | name2 | name2 | name2 | varchar2(300) |
| 7 | name3 | name3 | name3 | varchar2(300) |
| 8 | name4 | name4 | name4 | varchar2(300) |
| 9 | name5 | name5 | name5 | varchar2(300) |
| 10 | name6 | name6 | name6 | varchar2(300) |
| 11 | pk_rms | pk_rms | pk_rms | varchar2(20) |  |  | '~' |
| 12 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 13 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 14 | position | position | position | number(38, 0) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |