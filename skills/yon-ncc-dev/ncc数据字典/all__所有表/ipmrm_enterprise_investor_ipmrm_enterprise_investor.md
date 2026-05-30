# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_investor | pk_investor | pk_investor | char(20) | √ |
| 2 | addr | addr | addr | varchar2(20) |  |  | '~' |
| 3 | bcanedit | bcanedit | bcanedit | char(1) |  |  | 'Y' |
| 4 | category | category | category | varchar2(50) |
| 5 | cfirstbid | cfirstbid | cfirstbid | char(20) |
| 6 | cfirstid | cfirstid | cfirstid | char(20) |
| 7 | crowno | crowno | crowno | varchar2(20) |
| 8 | csrcbid | csrcbid | csrcbid | char(20) |
| 9 | csrcid | csrcid | csrcid | char(20) |
| 10 | equity_ratio | equity_ratio | equity_ratio | number(28, 8) |
| 11 | industry | industry | industry | varchar2(20) |  |  | '~' |
| 12 | investor_name | investor_name | investor_name | varchar2(75) |
| 13 | nallinvestmny | nallinvestmny | nallinvestmny | number(28, 8) |
| 14 | nbaseinvestmny | nbaseinvestmny | nbaseinvestmny | number(28, 8) |
| 15 | ngpinvestmny | ngpinvestmny | ngpinvestmny | number(28, 8) |
| 16 | noriginvestmny | noriginvestmny | noriginvestmny | number(28, 8) |
| 17 | org_form_code | org_form_code | org_form_code | varchar2(50) |
| 18 | pk_enterprise | pk_enterprise | pk_enterprise | char(20) | √ |
| 19 | pk_enterprise_person | pk_enterprise_person | pk_enterprise_person | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 22 | vfirstcode | vfirstcode | vfirstcode | varchar2(50) |
| 23 | vfirstrowno | vfirstrowno | vfirstrowno | varchar2(20) |
| 24 | vfirsttrantype | vfirsttrantype | vfirsttrantype | varchar2(20) |
| 25 | vfirsttype | vfirsttype | vfirsttype | varchar2(20) |
| 26 | vmemo | vmemo | vmemo | varchar2(1536) |
| 27 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 28 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 29 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 30 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 31 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 32 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 33 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 34 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 35 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 36 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 37 | vsrccode | vsrccode | vsrccode | varchar2(50) |
| 38 | vsrcrowno | vsrcrowno | vsrcrowno | varchar2(20) |
| 39 | vsrctrantype | vsrctrantype | vsrctrantype | varchar2(20) |
| 40 | vsrctype | vsrctype | vsrctype | varchar2(20) |
| 41 | vbdef1 | vbdef1 | vbdef1 | varchar2(101) |
| 42 | vbdef2 | vbdef2 | vbdef2 | varchar2(101) |
| 43 | vbdef3 | vbdef3 | vbdef3 | varchar2(101) |
| 44 | vbdef4 | vbdef4 | vbdef4 | varchar2(101) |
| 45 | vbdef5 | vbdef5 | vbdef5 | varchar2(101) |
| 46 | vbdef6 | vbdef6 | vbdef6 | varchar2(101) |
| 47 | vbdef7 | vbdef7 | vbdef7 | varchar2(101) |
| 48 | vbdef8 | vbdef8 | vbdef8 | varchar2(101) |
| 49 | vbdef9 | vbdef9 | vbdef9 | varchar2(101) |
| 50 | vbdef10 | vbdef10 | vbdef10 | varchar2(101) |
| 51 | vbdef11 | vbdef11 | vbdef11 | varchar2(101) |
| 52 | vbdef12 | vbdef12 | vbdef12 | varchar2(101) |
| 53 | vbdef13 | vbdef13 | vbdef13 | varchar2(101) |
| 54 | vbdef14 | vbdef14 | vbdef14 | varchar2(101) |
| 55 | vbdef15 | vbdef15 | vbdef15 | varchar2(101) |
| 56 | vbdef16 | vbdef16 | vbdef16 | varchar2(101) |
| 57 | vbdef17 | vbdef17 | vbdef17 | varchar2(101) |
| 58 | vbdef18 | vbdef18 | vbdef18 | varchar2(101) |
| 59 | vbdef19 | vbdef19 | vbdef19 | varchar2(101) |
| 60 | vbdef20 | vbdef20 | vbdef20 | varchar2(101) |
| 61 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |