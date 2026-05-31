# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11543.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disturb | pk_disturb | pk_disturb | char(20) | √ |
| 2 | duetime | duetime | duetime | char(19) | √ |
| 3 | entrytime | entrytime | entrytime | varchar2(50) | √ |
| 4 | isdark | isdark | isdark | char(1) | √ |
| 5 | isopen | isopen | isopen | char(1) | √ |
| 6 | userid | userid | userid | varchar2(50) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |