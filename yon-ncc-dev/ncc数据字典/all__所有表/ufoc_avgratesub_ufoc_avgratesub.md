# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12339.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_avgratesub | pk_avgratesub | pk_avgratesub | char(20) | √ |
| 2 | pk_avgrate | pk_avgrate | pk_avgrate | varchar2(20) |  |  | '~' |
| 3 | ratetype | ratetype | ratetype | char(20) |
| 4 | ratevalue | ratevalue | ratevalue | number(28, 8) |
| 5 | subvos | subvos | subvos | char(20) | √ |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |