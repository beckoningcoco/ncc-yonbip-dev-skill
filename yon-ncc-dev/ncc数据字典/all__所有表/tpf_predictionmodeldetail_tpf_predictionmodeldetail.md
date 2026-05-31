# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12229.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_predictionmodeldetail | pk_predictionmodeldetail | pk_predictionmodeldetail | char(20) | √ |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | billmaketime | billmaketime | billmaketime | char(19) |
| 4 | cashflow | cashflow | cashflow | number(38, 0) |
| 5 | economicactivity | economicactivity | economicactivity | number(38, 0) |
| 6 | indicatorcode | indicatorcode | indicatorcode | varchar2(20) |  |  | '~' |
| 7 | indicatorname | indicatorname | indicatorname | varchar2(50) |
| 8 | name | name | name | varchar2(50) |
| 9 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 10 | pk_indicatorlibrary | pk_indicatorlibrary | pk_indicatorlibrary | varchar2(50) |
| 11 | pk_predictionmodel | pk_predictionmodel | pk_predictionmodel | char(20) | √ |
| 12 | remark | remark | remark | varchar2(1024) |
| 13 | targettype | targettype | targettype | varchar2(50) |
| 14 | vbillno | vbillno | vbillno | varchar2(50) |
| 15 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 16 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 17 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 18 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 19 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 20 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 21 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 22 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 23 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 24 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 25 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 26 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 27 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 28 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 29 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 30 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 31 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 32 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 33 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 34 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |