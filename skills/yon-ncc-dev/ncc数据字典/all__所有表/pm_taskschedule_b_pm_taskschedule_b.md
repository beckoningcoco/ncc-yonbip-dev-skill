# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10720.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskschedule_b | pk_taskschedule_b | pk_taskschedule_b | char(20) | √ |
| 2 | actu_finish_date | actu_finish_date | actu_finish_date | char(19) |
| 3 | actu_start_date | actu_start_date | actu_start_date | char(19) |
| 4 | evolve_state | evolve_state | evolve_state | varchar2(200) |
| 5 | last_fill_date | last_fill_date | last_fill_date | char(19) |
| 6 | memo | memo | memo | varchar2(200) |
| 7 | pk_project | pk_project | pk_project | varchar2(20) |  |  | '~' |
| 8 | pk_taskschedule | pk_taskschedule | pk_taskschedule | char(20) | √ |
| 9 | pk_wbs | pk_wbs | pk_wbs | varchar2(20) |  |  | '~' |
| 10 | pk_wbsstate | pk_wbsstate | pk_wbsstate | number(38, 0) |
| 11 | prefinishpercent | prefinishpercent | prefinishpercent | number(28, 8) |
| 12 | pre_finish_date | pre_finish_date | pre_finish_date | char(19) |
| 13 | pre_start_date | pre_start_date | pre_start_date | char(19) |
| 14 | pre_wbsstate | pre_wbsstate | pre_wbsstate | number(38, 0) |
| 15 | taskpercent | taskpercent | taskpercent | number(28, 8) |
| 16 | bdef1 | bdef1 | bdef1 | varchar2(101) |
| 17 | bdef2 | bdef2 | bdef2 | varchar2(101) |
| 18 | bdef3 | bdef3 | bdef3 | varchar2(101) |
| 19 | bdef4 | bdef4 | bdef4 | varchar2(101) |
| 20 | bdef5 | bdef5 | bdef5 | varchar2(101) |
| 21 | bdef6 | bdef6 | bdef6 | varchar2(101) |
| 22 | bdef7 | bdef7 | bdef7 | varchar2(101) |
| 23 | bdef8 | bdef8 | bdef8 | varchar2(101) |
| 24 | bdef9 | bdef9 | bdef9 | varchar2(101) |
| 25 | bdef10 | bdef10 | bdef10 | varchar2(101) |
| 26 | bdef11 | bdef11 | bdef11 | varchar2(101) |
| 27 | bdef12 | bdef12 | bdef12 | varchar2(101) |
| 28 | bdef13 | bdef13 | bdef13 | varchar2(101) |
| 29 | bdef14 | bdef14 | bdef14 | varchar2(101) |
| 30 | bdef15 | bdef15 | bdef15 | varchar2(101) |
| 31 | bdef16 | bdef16 | bdef16 | varchar2(101) |
| 32 | bdef17 | bdef17 | bdef17 | varchar2(101) |
| 33 | bdef18 | bdef18 | bdef18 | varchar2(101) |
| 34 | bdef19 | bdef19 | bdef19 | varchar2(101) |
| 35 | bdef20 | bdef20 | bdef20 | varchar2(101) |
| 36 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 37 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |