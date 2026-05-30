# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6980.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mategrade | pk_mategrade | pk_mategrade | char(20) | √ |
| 2 | endtime | endtime | endtime | char(19) |
| 3 | modifiedtype | modifiedtype | modifiedtype | varchar2(50) |
| 4 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 5 | pk_supabilityset | pk_supabilityset | pk_supabilityset | char(20) |
| 6 | pk_supgadesys | pk_supgadesys | pk_supgadesys | varchar2(20) |  |  | '~' |
| 7 | starttime | starttime | starttime | char(19) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |