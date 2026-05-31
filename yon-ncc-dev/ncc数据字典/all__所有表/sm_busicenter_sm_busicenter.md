# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11528.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busicenter | pk_busicenter | pk_busicenter | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | datasourcename | datasourcename | datasourcename | varchar2(50) |
| 4 | effectdate | effectdate | effectdate | char(19) |
| 5 | expiredate | expiredate | expiredate | char(19) |
| 6 | islocked | islocked | islocked | char(1) |  |  | 'N' |
| 7 | isportalbc | isportalbc | isportalbc | char(1) |  |  | '~' |
| 8 | name | name | name | varchar2(50) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | TO_CHAR(SYSDATE,'yyyy-mm-dd hh24:mi:ss') |