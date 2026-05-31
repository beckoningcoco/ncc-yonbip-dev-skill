# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11970.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_period | pk_period | pk_period | char(20) | √ |
| 2 | accmonth | accmonth | accmonth | char(2) | √ |
| 3 | accyear | accyear | accyear | char(4) | √ |
| 4 | begindate | begindate | begindate | char(10) | √ |
| 5 | curflag | curflag | curflag | char(1) | √ |
| 6 | enddate | enddate | enddate | char(10) | √ |
| 7 | pk_group | pk_group | pk_group | char(20) | √ |
| 8 | pk_org | pk_org | pk_org | char(20) | √ |
| 9 | sealflag | sealflag | sealflag | char(1) | √ |  | 'N' |
| 10 | timemonth | timemonth | timemonth | char(2) | √ |
| 11 | timeyear | timeyear | timeyear | char(4) | √ |
| 12 | creationtime | creationtime | creationtime | char(19) | √ |
| 13 | creator | creator | creator | char(20) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | char(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |