# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7797.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tariff_bat | pk_tariff_bat | pk_tariff_bat | char(20) | √ |
| 2 | cbatlevelbid | cbatlevelbid | cbatlevelbid | varchar2(20) |  |  | '~' |
| 3 | cbatlevelid | cbatlevelid | cbatlevelid | varchar2(20) |  |  | '~' |
| 4 | cpritemid | cpritemid | cpritemid | varchar2(20) |  |  | '~' |
| 5 | ibatitemno | ibatitemno | ibatitemno | number(38, 0) |
| 6 | iprcitemno | iprcitemno | iprcitemno | number(38, 0) |
| 7 | nprice | nprice | nprice | number(28, 8) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_tariff | pk_tariff | pk_tariff | char(20) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |