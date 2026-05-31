# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10704.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | act_weight | act_weight | act_weight | number(10, 4) |
| 3 | adjust_status | adjust_status | adjust_status | number(38, 0) |
| 4 | adjust_time | adjust_time | adjust_time | date |
| 5 | disp_seq | disp_seq | disp_seq | number(38, 0) |
| 6 | evalstandard | evalstandard | evalstandard | varchar2(3000) |
| 7 | indicatorid | indicatorid | indicatorid | varchar2(32) |
| 8 | indiclass_weight | indiclass_weight | indiclass_weight | number(10, 4) | √ |  | 1 |
| 9 | indi_parent | indi_parent | indi_parent | varchar2(32) |
| 10 | indi_weight | indi_weight | indi_weight | number(10, 4) |
| 11 | objectiveid | objectiveid | objectiveid | varchar2(32) |
| 12 | plan_text | plan_text | plan_text | varchar2(1000) |
| 13 | release_num | release_num | release_num | number(38, 0) |
| 14 | sheetid | sheetid | sheetid | varchar2(32) |
| 15 | sheetindiid | sheetindiid | sheetindiid | varchar2(32) |
| 16 | targetvalue | targetvalue | targetvalue | varchar2(1000) |
| 17 | tenantid | tenantid | tenantid | varchar2(32) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | date |  |  | sysdate |