# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aeds | pk_aeds | pk_aeds | char(20) | √ |
| 2 | datasourcename | datasourcename | datasourcename | varchar2(50) |
| 3 | dstype | dstype | dstype | varchar2(50) | √ |
| 4 | dsview | dsview | dsview | varchar2(50) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | TO_CHAR(SYSDATE,'yyyy-mm-dd hh24:mi:ss') |