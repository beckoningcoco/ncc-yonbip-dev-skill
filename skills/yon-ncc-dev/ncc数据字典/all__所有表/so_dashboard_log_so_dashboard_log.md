# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11695.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_so_dashboard_log | pk_so_dashboard_log | pk_so_dashboard_log | char(20) | √ |
| 2 | lastts | lastts | lastts | char(19) |
| 3 | nextts | nextts | nextts | char(19) |
| 4 | norepeatdimkey | norepeatdimkey | norepeatdimkey | varchar2(190) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |