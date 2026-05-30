# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8446.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cfitemrelation | pk_cfitemrelation | pk_cfitemrelation | char(20) | √ |
| 2 | descfitemcode | descfitemcode | descfitemcode | varchar2(20) | √ |  | '~' |
| 3 | descfitempk | descfitempk | descfitempk | varchar2(20) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | srccfitemcode | srccfitemcode | srccfitemcode | varchar2(20) | √ |  | '~' |
| 7 | srccfitempk | srccfitempk | srccfitempk | varchar2(20) |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |