# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12652.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_msgrecv | pk_msgrecv | pk_msgrecv | char(20) | √ |
| 2 | addr_ip | addr_ip | addr_ip | varchar2(50) |
| 3 | code_psn | code_psn | code_psn | varchar2(50) |
| 4 | cont_reply | cont_reply | cont_reply | varchar2(50) |
| 5 | date_read | date_read | date_read | char(19) |
| 6 | date_recv | date_recv | date_recv | char(19) |
| 7 | date_reply | date_reply | date_reply | char(19) |
| 8 | flag_reply | flag_reply | flag_reply | varchar2(50) |
| 9 | name_psn | name_psn | name_psn | varchar2(50) |
| 10 | note | note | note | varchar2(50) |
| 11 | pk_group | pk_group | pk_group | char(20) |
| 12 | pk_msg | pk_msg | pk_msg | char(20) |
| 13 | pk_msgsend | pk_msgsend | pk_msgsend | char(20) |
| 14 | pk_org | pk_org | pk_org | char(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |