# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12203.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csettleruleid | csettleruleid | csettleruleid | char(20) | √ |
| 2 | bautosettle | bautosettle | bautosettle | char(1) |
| 3 | bintoia | bintoia | bintoia | char(1) |
| 4 | bouttoia | bouttoia | bouttoia | char(1) |
| 5 | breversesettle | breversesettle | breversesettle | char(1) |
| 6 | bsettleaftersign | bsettleaftersign | bsettleaftersign | char(1) |
| 7 | cincostregionid | cincostregionid | cincostregionid | varchar2(20) |  |  | '~' |
| 8 | cinfinanceorgid | cinfinanceorgid | cinfinanceorgid | varchar2(20) |  |  | '~' |
| 9 | cinstockorgid | cinstockorgid | cinstockorgid | varchar2(20) |  |  | '~' |
| 10 | coutcostregionid | coutcostregionid | coutcostregionid | varchar2(20) |  |  | '~' |
| 11 | coutfinanceorgid | coutfinanceorgid | coutfinanceorgid | varchar2(20) |  |  | '~' |
| 12 | coutstockorgid | coutstockorgid | coutstockorgid | varchar2(20) |  |  | '~' |
| 13 | csettlecurrtype | csettlecurrtype | csettlecurrtype | varchar2(20) |  |  | '~' |
| 14 | ctranstype | ctranstype | ctranstype | varchar2(20) |  |  | '~' |
| 15 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 16 | finterfacerule | finterfacerule | finterfacerule | number(38, 0) |  |  | 1 |
| 17 | fonwayowner | fonwayowner | fonwayowner | number(38, 0) |  |  | 1 |
| 18 | fsettlemainbody | fsettlemainbody | fsettlemainbody | number(38, 0) |  |  | 2 |
| 19 | fsettletype | fsettletype | fsettletype | number(38, 0) | √ |  | 1 |
| 20 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |