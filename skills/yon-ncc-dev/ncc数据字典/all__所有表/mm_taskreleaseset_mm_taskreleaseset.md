# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9978.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskreleaseset | pk_taskreleaseset | pk_taskreleaseset | char(20) | √ |
| 2 | allowrelease | allowrelease | allowrelease | char(1) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 6 | releasemeasure | releasemeasure | releasemeasure | varchar2(20) |  |  | '~' |
| 7 | releasetargetbill | releasetargetbill | releasetargetbill | varchar2(50) |  |  | '~' |
| 8 | taskid | taskid | taskid | varchar2(50) |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |