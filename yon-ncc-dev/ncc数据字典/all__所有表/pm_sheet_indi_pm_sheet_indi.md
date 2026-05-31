# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10707.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(32) | √ |
| 2 | act_weight | act_weight | act_weight | number(10, 4) |
| 3 | disp_seq | disp_seq | disp_seq | number(38, 0) |
| 4 | evalstandard | evalstandard | evalstandard | varchar2(3000) |
| 5 | indicatorid | indicatorid | indicatorid | varchar2(32) |
| 6 | indiclass_weight | indiclass_weight | indiclass_weight | number(10, 4) | √ |  | 1 |
| 7 | indiflag | indiflag | indiflag | number(38, 0) | √ |
| 8 | indi_parent | indi_parent | indi_parent | varchar2(32) |
| 9 | indi_weight | indi_weight | indi_weight | number(10, 4) |
| 10 | scoreruleid | scoreruleid | scoreruleid | varchar2(32) |
| 11 | sheetid | sheetid | sheetid | varchar2(32) |
| 12 | tenantid | tenantid | tenantid | varchar2(32) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | date |  |  | sysdate |