# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9366.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fund_info | pk_fund_info | pk_fund_info | varchar2(50) | √ |
| 2 | fund_code | fund_code | fund_code | varchar2(20) |  |  | '~' |
| 3 | fund_name | fund_name | fund_name | varchar2(50) |
| 4 | fund_type | fund_type | fund_type | varchar2(50) |
| 5 | invest_income | invest_income | invest_income | varchar2(50) |
| 6 | nalltargetpaymny | nalltargetpaymny | nalltargetpaymny | number(28, 8) |
| 7 | nbasetargetpaymny | nbasetargetpaymny | nbasetargetpaymny | number(28, 8) |
| 8 | ngptargetpaymny | ngptargetpaymny | ngptargetpaymny | number(28, 8) |
| 9 | norigallpaidmny | norigallpaidmny | norigallpaidmny | number(28, 8) |
| 10 | pk_manager_info | pk_manager_info | pk_manager_info | char(20) | √ |
| 11 | regtime | regtime | regtime | char(19) |
| 12 | src_source | src_source | src_source | varchar2(50) |
| 13 | vmemo | vmemo | vmemo | varchar2(1024) |
| 14 | vreserve1 | vreserve1 | vreserve1 | varchar2(100) |
| 15 | vreserve2 | vreserve2 | vreserve2 | varchar2(100) |
| 16 | vreserve3 | vreserve3 | vreserve3 | varchar2(100) |
| 17 | vreserve4 | vreserve4 | vreserve4 | varchar2(100) |
| 18 | vreserve5 | vreserve5 | vreserve5 | varchar2(100) |
| 19 | vreserve6 | vreserve6 | vreserve6 | varchar2(100) |
| 20 | vreserve7 | vreserve7 | vreserve7 | varchar2(100) |
| 21 | vreserve8 | vreserve8 | vreserve8 | varchar2(100) |
| 22 | vreserve9 | vreserve9 | vreserve9 | varchar2(100) |
| 23 | vreserve10 | vreserve10 | vreserve10 | varchar2(100) |
| 24 | vbdef1 | vbdef1 | vbdef1 | varchar2(101) |
| 25 | vbdef2 | vbdef2 | vbdef2 | varchar2(101) |
| 26 | vbdef3 | vbdef3 | vbdef3 | varchar2(101) |
| 27 | vbdef4 | vbdef4 | vbdef4 | varchar2(101) |
| 28 | vbdef5 | vbdef5 | vbdef5 | varchar2(101) |
| 29 | vbdef6 | vbdef6 | vbdef6 | varchar2(101) |
| 30 | vbdef7 | vbdef7 | vbdef7 | varchar2(101) |
| 31 | vbdef8 | vbdef8 | vbdef8 | varchar2(101) |
| 32 | vbdef9 | vbdef9 | vbdef9 | varchar2(101) |
| 33 | vbdef10 | vbdef10 | vbdef10 | varchar2(101) |
| 34 | vbdef11 | vbdef11 | vbdef11 | varchar2(101) |
| 35 | vbdef12 | vbdef12 | vbdef12 | varchar2(101) |
| 36 | vbdef13 | vbdef13 | vbdef13 | varchar2(101) |
| 37 | vbdef14 | vbdef14 | vbdef14 | varchar2(101) |
| 38 | vbdef15 | vbdef15 | vbdef15 | varchar2(101) |
| 39 | vbdef16 | vbdef16 | vbdef16 | varchar2(101) |
| 40 | vbdef17 | vbdef17 | vbdef17 | varchar2(101) |
| 41 | vbdef18 | vbdef18 | vbdef18 | varchar2(101) |
| 42 | vbdef19 | vbdef19 | vbdef19 | varchar2(101) |
| 43 | vbdef20 | vbdef20 | vbdef20 | varchar2(101) |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |