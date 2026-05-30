# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7820.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_confirmpay_b | pk_confirmpay_b | pk_confirmpay_b | char(20) | √ |
| 2 | acceptstate | acceptstate | acceptstate | number(38, 0) |
| 3 | cdtracc | cdtracc | cdtracc | varchar2(50) |
| 4 | cdtraccname | cdtraccname | cdtraccname | varchar2(100) |
| 5 | cdtrbranchname | cdtrbranchname | cdtrbranchname | varchar2(100) |
| 6 | cdtrdetail | cdtrdetail | cdtrdetail | char(20) | √ |
| 7 | confirmstate | confirmstate | confirmstate | varchar2(50) |
| 8 | confirmtime | confirmtime | confirmtime | char(19) |
| 9 | currtype | currtype | currtype | varchar2(20) |  |  | '~' |
| 10 | paydate | paydate | paydate | char(19) |
| 11 | paymsg | paymsg | paymsg | varchar2(400) |
| 12 | paystate | paystate | paystate | number(38, 0) |
| 13 | pk_confirmpay_h | pk_confirmpay_h | pk_confirmpay_h | varchar2(20) |  |  | '~' |
| 14 | rowno | rowno | rowno | varchar2(50) |
| 15 | sourcebillpk | sourcebillpk | sourcebillpk | varchar2(36) |
| 16 | transmnt | transmnt | transmnt | number(28, 8) |
| 17 | yurref | yurref | yurref | varchar2(100) |
| 18 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 19 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 20 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 21 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 22 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 23 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 24 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 25 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 26 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 27 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |