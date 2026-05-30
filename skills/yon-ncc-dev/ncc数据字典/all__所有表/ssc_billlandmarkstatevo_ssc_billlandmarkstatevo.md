# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11937.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(50) |
| 3 | landmarkstate | landmarkstate | landmarkstate | varchar2(50) |
| 4 | orderno | orderno | orderno | number(38, 0) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |