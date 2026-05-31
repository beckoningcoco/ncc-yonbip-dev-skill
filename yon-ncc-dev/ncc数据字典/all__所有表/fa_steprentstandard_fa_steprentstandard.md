# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8167.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_steprentstandard | pk_steprentstandard | pk_steprentstandard | char(20) | √ |
| 2 | end_date | end_date | end_date | char(19) |
| 3 | pk_card | pk_card | pk_card | char(20) |
| 4 | remarks | remarks | remarks | varchar2(200) |
| 5 | rent | rent | rent | number(28, 8) |
| 6 | start_date | start_date | start_date | char(19) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |