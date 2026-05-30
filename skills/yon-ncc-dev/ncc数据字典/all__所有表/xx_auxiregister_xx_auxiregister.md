# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_auxiregister | pk_auxiregister | pk_auxiregister | char(20) | √ |
| 2 | auxiregister | auxiregister | auxiregister | char(20) | √ |
| 3 | auxiregisterexpvalue | auxiregisterexpvalue | auxiregisterexpvalue | varchar2(50) |
| 4 | auxiregistername | auxiregistername | auxiregistername | varchar2(50) |
| 5 | auxiregistervalue | auxiregistervalue | auxiregistervalue | varchar2(50) |
| 6 | note | note | note | varchar2(2048) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |