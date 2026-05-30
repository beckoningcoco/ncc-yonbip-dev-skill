# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9881.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dispatchtranstype | pk_dispatchtranstype | pk_dispatchtranstype | varchar2(20) | √ |
| 2 | bautoapprove | bautoapprove | bautoapprove | char(1) |
| 3 | bautopickm | bautopickm | bautopickm | char(1) |
| 4 | ctrantypeid | ctrantypeid | ctrantypeid | varchar2(20) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | vtrantypecode | vtrantypecode | vtrantypecode | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |