# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9098.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | bonhandflag | bonhandflag | bonhandflag | char(1) | √ |  | 'N' |
| 2 | bsign | bsign | bsign | char(1) | √ |  | 'N' |
| 3 | dyearmonth | dyearmonth | dyearmonth | varchar2(7) | √ |
| 4 | pk_calbody | pk_calbody | pk_calbody | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |