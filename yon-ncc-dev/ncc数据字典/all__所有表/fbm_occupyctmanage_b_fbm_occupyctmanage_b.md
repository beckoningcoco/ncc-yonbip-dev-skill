# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8205.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_occupyctmanage_b | pk_occupyctmanage_b | pk_occupyctmanage_b | char(20) | √ |
| 2 | drate | drate | drate | number(28, 8) |
| 3 | effectdate | effectdate | effectdate | char(19) |
| 4 | mrate | mrate | mrate | number(28, 8) |
| 5 | note | note | note | varchar2(100) |
| 6 | pk_occupyctmanage | pk_occupyctmanage | pk_occupyctmanage | char(20) |  |  | '~' |
| 7 | reviser | reviser | reviser | varchar2(20) |  |  | '~' |
| 8 | versionno | versionno | versionno | number(38, 0) |
| 9 | yrate | yrate | yrate | number(28, 8) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |