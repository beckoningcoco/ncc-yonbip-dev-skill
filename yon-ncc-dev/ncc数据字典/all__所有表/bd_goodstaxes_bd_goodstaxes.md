# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6945.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_goodstaxes | pk_goodstaxes | pk_goodstaxes | char(20) | √ |
| 2 | commontaxes | commontaxes | commontaxes | number(20, 8) |
| 3 | consumetaxes | consumetaxes | consumetaxes | number(20, 8) |
| 4 | enddate | enddate | enddate | char(19) |
| 5 | exportaxesback | exportaxesback | exportaxesback | number(20, 8) |
| 6 | exporttaxes | exporttaxes | exporttaxes | number(20, 8) |
| 7 | favoredtaxes | favoredtaxes | favoredtaxes | number(20, 8) |
| 8 | pk_goodscode | pk_goodscode | pk_goodscode | char(20) | √ |
| 9 | risetaxes | risetaxes | risetaxes | number(20, 8) |
| 10 | startdate | startdate | startdate | char(19) |
| 11 | supervise | supervise | supervise | varchar2(100) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |