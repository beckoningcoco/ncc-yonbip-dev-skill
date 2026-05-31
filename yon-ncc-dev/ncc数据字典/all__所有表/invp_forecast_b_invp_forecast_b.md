# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9248.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_forecast_b | pk_forecast_b | pk_forecast_b | char(20) | √ |
| 2 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 3 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 4 | crowno | crowno | crowno | varchar2(20) |
| 5 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 6 | dreqdate | dreqdate | dreqdate | char(19) |
| 7 | nnum | nnum | nnum | number(28, 8) |
| 8 | pk_forecast | pk_forecast | pk_forecast | char(20) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | vreq | vreq | vreq | varchar2(10) |
| 13 | vreqmonth | vreqmonth | vreqmonth | varchar2(10) |
| 14 | vreqyear | vreqyear | vreqyear | varchar2(10) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |