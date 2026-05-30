# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11032.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | agentreason | agentreason | agentreason | varchar2(200) |
| 3 | cuserid | cuserid | cuserid | char(20) |
| 4 | endtime | endtime | endtime | char(19) |
| 5 | istrantask | istrantask | istrantask | char(1) |
| 6 | starttime | starttime | starttime | char(19) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |