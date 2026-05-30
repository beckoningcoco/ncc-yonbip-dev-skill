# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6764.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchupdaterule | pk_batchupdaterule | pk_batchupdaterule | char(20) | √ |
| 2 | executetime | executetime | executetime | char(19) |
| 3 | executor | executor | executor | varchar2(20) |  |  | '~' |
| 4 | isonlyupdatenull | isonlyupdatenull | isonlyupdatenull | char(1) |
| 5 | mainattrcode | mainattrcode | mainattrcode | varchar2(200) |
| 6 | memo | memo | memo | varchar2(750) |
| 7 | pk_batchupdatetab | pk_batchupdatetab | pk_batchupdatetab | varchar2(20) |  |  | '~' |
| 8 | pk_batchupruleteam | pk_batchupruleteam | pk_batchupruleteam | char(20) | √ |
| 9 | sqlxmlcondition | sqlxmlcondition | sqlxmlcondition | blob |
| 10 | updateattrandvalue | updateattrandvalue | updateattrandvalue | blob |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |