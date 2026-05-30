# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8055.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_importlog | pk_importlog | pk_importlog | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(50) | √ |
| 3 | billtypeno | billtypeno | billtypeno | varchar2(50) |
| 4 | cuserid | cuserid | cuserid | varchar2(20) |
| 5 | endtime | endtime | endtime | char(19) |
| 6 | filepath | filepath | filepath | varchar2(500) |
| 7 | logpath | logpath | logpath | varchar2(500) | √ |
| 8 | starttime | starttime | starttime | char(19) |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |