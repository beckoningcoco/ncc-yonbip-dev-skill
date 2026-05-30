# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10612.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | disp_seq | disp_seq | disp_seq | number(38, 0) |
| 3 | evalstandard | evalstandard | evalstandard | varchar2(3000) |
| 4 | gaugeid | gaugeid | gaugeid | varchar2(32) |
| 5 | indicatorid | indicatorid | indicatorid | varchar2(32) |
| 6 | indiclass_weight | indiclass_weight | indiclass_weight | number(10, 4) | √ |  | 1.0000 |
| 7 | indi_parent | indi_parent | indi_parent | varchar2(32) |
| 8 | indi_weight | indi_weight | indi_weight | number(10, 4) |
| 9 | plannedgoal | plannedgoal | plannedgoal | varchar2(3000) |
| 10 | tenantid | tenantid | tenantid | varchar2(32) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | date |  |  | sysdate |