# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_datas | pk_wa_datas | pk_wa_datas | char(20) | √ |
| 2 | caculatevalue | caculatevalue | caculatevalue | number(31, 8) |
| 3 | notes | notes | notes | varchar2(256) |
| 4 | pk_wa_classitem | pk_wa_classitem | pk_wa_classitem | varchar2(20) |
| 5 | pk_wa_data | pk_wa_data | pk_wa_data | varchar2(20) |
| 6 | to_next | to_next | to_next | char(1) |
| 7 | value | value | value | number(31, 8) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | modifier | modifier | modifier | varchar2(20) |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |