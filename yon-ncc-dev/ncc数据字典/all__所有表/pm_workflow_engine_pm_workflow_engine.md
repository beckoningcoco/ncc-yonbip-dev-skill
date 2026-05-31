# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10739.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | bizid | bizid | bizid | varchar2(36) |
| 3 | bizinfo | bizinfo | bizinfo | varchar2(255) |
| 4 | biztype | biztype | biztype | number(38, 0) |
| 5 | checkidea | checkidea | checkidea | varchar2(600) |
| 6 | define1 | define1 | define1 | varchar2(765) |
| 7 | define2 | define2 | define2 | varchar2(765) |
| 8 | define3 | define3 | define3 | varchar2(765) |
| 9 | disposeperson | disposeperson | disposeperson | varchar2(36) |
| 10 | disposetime | disposetime | disposetime | date |
| 11 | state | state | state | number(38, 0) | √ |
| 12 | stepserial | stepserial | stepserial | number(38, 0) | √ |
| 13 | tenantid | tenantid | tenantid | varchar2(32) |
| 14 | wfid | wfid | wfid | varchar2(32) | √ |
| 15 | workstep | workstep | workstep | number(38, 0) | √ |
| 16 | worksteporder | worksteporder | worksteporder | number(38, 0) | √ |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | date |  |  | sysdate |