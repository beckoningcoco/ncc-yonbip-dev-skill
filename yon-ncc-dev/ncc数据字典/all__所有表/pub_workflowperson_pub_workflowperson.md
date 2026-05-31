# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11046.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workflowperson | pk_workflowperson | pk_workflowperson | char(20) | √ |
| 2 | agentreason | agentreason | agentreason | varchar2(1000) |
| 3 | endtime | endtime | endtime | char(19) |
| 4 | isstarted | isstarted | isstarted | char(1) |
| 5 | istrantask | istrantask | istrantask | char(1) | √ |  | 'N' |
| 6 | pk_cuserid | pk_cuserid | pk_cuserid | char(20) | √ |
| 7 | pk_outinfo | pk_outinfo | pk_outinfo | char(20) |
| 8 | starttime | starttime | starttime | char(19) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |