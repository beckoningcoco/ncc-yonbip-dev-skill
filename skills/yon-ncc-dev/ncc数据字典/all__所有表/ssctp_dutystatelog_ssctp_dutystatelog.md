# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dutystatelog | pk_dutystatelog | pk_dutystatelog | char(20) | √ |
| 2 | endtime | endtime | endtime | char(19) |
| 3 | iseffective | iseffective | iseffective | char(1) |
| 4 | pk_tasktype | pk_tasktype | pk_tasktype | varchar2(20) |  |  | '~' |
| 5 | pk_user | pk_user | pk_user | varchar2(20) |  |  | '~' |
| 6 | starttime | starttime | starttime | char(19) |
| 7 | creationtime | creationtime | creationtime | char(19) |
| 8 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 11 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |