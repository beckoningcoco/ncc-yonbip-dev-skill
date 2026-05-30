# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_refdatatemp | pk_refdatatemp | pk_refdatatemp | char(20) | √ |
| 2 | cuserid | cuserid | cuserid | char(20) | √ |
| 3 | pk_org | pk_org | pk_org | char(20) | √ |
| 4 | pk_selecteddata | pk_selecteddata | pk_selecteddata | char(20) | √ |
| 5 | pk_ts | pk_ts | pk_ts | char(20) | √ |
| 6 | refnodename | refnodename | refnodename | varchar2(80) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |