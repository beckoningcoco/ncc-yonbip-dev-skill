# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10751.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costfactor_b | pk_costfactor_b | pk_costfactor_b | char(20) | √ |
| 2 | bshow | bshow | bshow | char(1) |  |  | 'Y' |
| 3 | ishoworder | ishoworder | ishoworder | number(38, 0) |
| 4 | pk_accountfactor | pk_accountfactor | pk_accountfactor | varchar2(20) |  |  | '~' |
| 5 | pk_costfactor | pk_costfactor | pk_costfactor | char(20) | √ |
| 6 | pk_material | pk_material | pk_material | char(20) | √ |
| 7 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |