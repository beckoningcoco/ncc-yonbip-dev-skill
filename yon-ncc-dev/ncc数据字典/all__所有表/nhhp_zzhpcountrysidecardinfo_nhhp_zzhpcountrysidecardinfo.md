# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cardinfo | pk_cardinfo | pk_cardinfo | char(20) | √ |
| 2 | cardcode | cardcode | cardcode | varchar2(50) | √ |
| 3 | code | code | code | varchar2(50) | √ |
| 4 | csrq | csrq | csrq | char(10) |
| 5 | flag_new | flag_new | flag_new | char(1) |
| 6 | grbm | grbm | grbm | varchar2(20) |
| 7 | jtzz | jtzz | jtzz | varchar2(100) |
| 8 | ljbc | ljbc | ljbc | number(14, 2) |
| 9 | sdx | sdx | sdx | varchar2(20) |
| 10 | sfzh | sfzh | sfzh | varchar2(20) |
| 11 | xb | xb | xb | varchar2(10) |
| 12 | xm | xm | xm | varchar2(20) |
| 13 | yhzgx | yhzgx | yhzgx | varchar2(50) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |