# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11452.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_martrantype | pk_martrantype | pk_martrantype | char(20) | √ |
| 2 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |  |  | '~' |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 5 | pk_marpuclass | pk_marpuclass | pk_marpuclass | varchar2(20) |  |  | '~' |
| 6 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 7 | pk_materialpu | pk_materialpu | pk_materialpu | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |
| 10 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(50) | √ |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |