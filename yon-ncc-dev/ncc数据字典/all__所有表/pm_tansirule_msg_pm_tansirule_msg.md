# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tansirule_msg | pk_tansirule_msg | pk_tansirule_msg | char(20) | √ |
| 2 | pk_receiver | pk_receiver | pk_receiver | varchar2(20) |  |  | '~' |
| 3 | pk_roler | pk_roler | pk_roler | varchar2(20) |  |  | '~' |
| 4 | pk_transi | pk_transi | pk_transi | char(20) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |