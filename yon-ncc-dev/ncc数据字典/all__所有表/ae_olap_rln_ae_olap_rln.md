# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6458.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | pk_relation | pk_relation | char(20) | √ |
| 2 | extfield | extfield | extfield | varchar2(2000) |
| 3 | modelid | modelid | modelid | varchar2(100) |
| 4 | modelname | modelname | modelname | varchar2(200) |
| 5 | modelprop | modelprop | modelprop | varchar2(200) |
| 6 | modeltype | modeltype | modeltype | number(38, 0) |
| 7 | pk_model | pk_model | pk_model | varchar2(50) | √ |
| 8 | relationid | relationid | relationid | varchar2(200) | √ |
| 9 | relationprop | relationprop | relationprop | varchar2(50) | √ |
| 10 | relationtype | relationtype | relationtype | number(38, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |