# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12147.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diag | pk_diag | pk_diag | char(20) | √ |
| 2 | content | content | content | varchar2(50) |
| 3 | diagtime | diagtime | diagtime | char(19) |
| 4 | klks | klks | klks | varchar2(50) |
| 5 | klys | klys | klys | varchar2(50) |
| 6 | pk_pat | pk_pat | pk_pat | varchar2(20) |  |  | '~' |
| 7 | type | type | type | varchar2(50) |
| 8 | zt | zt | zt | varchar2(50) |
| 9 | zxks | zxks | zxks | varchar2(50) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |