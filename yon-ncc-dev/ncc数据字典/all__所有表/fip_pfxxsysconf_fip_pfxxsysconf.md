# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8324.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pfxxsysconf | pk_pfxxsysconf | pk_pfxxsysconf | char(20) | √ |
| 2 | code | code | code | varchar2(100) |
| 3 | des_sysname | des_sysname | des_sysname | varchar2(50) |
| 4 | des_url | des_url | des_url | varchar2(300) |
| 5 | enablestate | enablestate | enablestate | number(38, 0) |
| 6 | name | name | name | varchar2(100) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | remark | remark | remark | varchar2(300) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |