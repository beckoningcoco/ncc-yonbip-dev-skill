# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8271.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportinforeg | pk_reportinforeg | pk_reportinforeg | char(20) | √ |
| 2 | brief | brief | brief | varchar2(50) |
| 3 | isfixedcurr | isfixedcurr | isfixedcurr | char(1) |
| 4 | isweb | isweb | isweb | char(1) |
| 5 | ownmodule | ownmodule | ownmodule | varchar2(50) | √ |
| 6 | pk_rep | pk_rep | pk_rep | char(20) | √ |
| 7 | pk_repdetail | pk_repdetail | pk_repdetail | char(20) |
| 8 | querytemplatecode | querytemplatecode | querytemplatecode | varchar2(50) |
| 9 | reporttype | reporttype | reporttype | varchar2(50) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |