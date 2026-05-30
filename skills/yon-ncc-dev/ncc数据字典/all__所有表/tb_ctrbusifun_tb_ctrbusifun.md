# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11993.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | busifuncode | busifuncode | busifuncode | varchar2(60) | √ |
| 3 | busisyscode | busisyscode | busisyscode | varchar2(60) | √ |
| 4 | excelfuntype | excelfuntype | excelfuntype | varchar2(60) | √ |
| 5 | exfield1 | exfield1 | exfield1 | varchar2(60) |
| 6 | exfield2 | exfield2 | exfield2 | varchar2(60) |
| 7 | orgtype | orgtype | orgtype | varchar2(60) | √ |
| 8 | orgtypevalue | orgtypevalue | orgtypevalue | varchar2(60) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |