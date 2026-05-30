# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9923.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pickmtranstype | pk_pickmtranstype | pk_pickmtranstype | char(20) | √ |
| 2 | bautoaduitaftersave | bautoaduitaftersave | bautoaduitaftersave | char(1) |
| 3 | bautofinish | bautofinish | bautofinish | char(1) |  |  | '1' |
| 4 | bcaneditafteraudit | bcaneditafteraudit | bcaneditafteraudit | char(1) |  |  | '0' |
| 5 | bcontainwaste | bcontainwaste | bcontainwaste | char(1) |  |  | '1' |
| 6 | bissubcontract | bissubcontract | bissubcontract | char(1) |
| 7 | ctrantypeid | ctrantypeid | ctrantypeid | char(20) |
| 8 | fpickmtype | fpickmtype | fpickmtype | number(38, 0) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |