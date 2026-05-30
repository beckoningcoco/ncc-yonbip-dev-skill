# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11854.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(50) | √ |
| 2 | num_deal | num_deal | num_deal | number(38, 0) |
| 3 | sscpost | sscpost | sscpost | varchar2(50) |
| 4 | sscunit | sscunit | sscunit | varchar2(50) |
| 5 | sscuser | sscuser | sscuser | varchar2(50) |
| 6 | time_deal | time_deal | time_deal | number(38, 0) |
| 7 | work_deal | work_deal | work_deal | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |