# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7203.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pohwf | pk_pohwf | pk_pohwf | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | dt_pohwffreq | dt_pohwffreq | dt_pohwffreq | varchar2(50) |
| 4 | dt_pohwftype | dt_pohwftype | dt_pohwftype | varchar2(50) |
| 5 | flag_active | flag_active | flag_active | char(1) |
| 6 | freq_cn | freq_cn | freq_cn | number(38, 0) |
| 7 | interval | interval | interval | varchar2(256) |
| 8 | name | name | name | varchar2(50) |
| 9 | name2 | name2 | name2 | varchar2(50) |
| 10 | name3 | name3 | name3 | varchar2(50) |
| 11 | name4 | name4 | name4 | varchar2(50) |
| 12 | name5 | name5 | name5 | varchar2(50) |
| 13 | name6 | name6 | name6 | varchar2(50) |
| 14 | note | note | note | varchar2(256) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 18 | pk_ph | pk_ph | pk_ph | varchar2(20) |  |  | '~' |
| 19 | pk_phds | pk_phds | pk_phds | varchar2(20) |  |  | '~' |
| 20 | pk_pohwffreq | pk_pohwffreq | pk_pohwffreq | varchar2(20) |  |  | '~' |
| 21 | pk_pohwftype | pk_pohwftype | pk_pohwftype | varchar2(20) |  |  | '~' |
| 22 | sortno | sortno | sortno | number(38, 0) |
| 23 | weekdayno | weekdayno | weekdayno | varchar2(50) |
| 24 | creationtime | creationtime | creationtime | char(19) |
| 25 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 28 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |