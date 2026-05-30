# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vochange | pk_vochange | pk_vochange | char(20) | √ |
| 2 | backclass | backclass | backclass | varchar2(128) |
| 3 | dest_billtype | dest_billtype | dest_billtype | varchar2(20) |
| 4 | dest_systype | dest_systype | dest_systype | varchar2(20) |
| 5 | dest_transtype | dest_transtype | dest_transtype | varchar2(20) |
| 6 | frontclass | frontclass | frontclass | varchar2(128) |
| 7 | pk_busitype | pk_busitype | pk_busitype | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | reservebackclass | reservebackclass | reservebackclass | varchar2(128) |
| 10 | reservefrontclass | reservefrontclass | reservefrontclass | varchar2(128) |
| 11 | src_appcode | src_appcode | src_appcode | varchar2(20) |
| 12 | src_billtype | src_billtype | src_billtype | varchar2(20) |
| 13 | src_billui | src_billui | src_billui | varchar2(128) |
| 14 | src_nccqueryclass | src_nccqueryclass | src_nccqueryclass | varchar2(128) |
| 15 | src_nodekey | src_nodekey | src_nodekey | varchar2(50) |
| 16 | src_pagecode | src_pagecode | src_pagecode | varchar2(20) |
| 17 | src_qrytemplate | src_qrytemplate | src_qrytemplate | varchar2(128) |
| 18 | src_systype | src_systype | src_systype | varchar2(20) |
| 19 | src_transtype | src_transtype | src_transtype | varchar2(20) |
| 20 | upgradeexclass | upgradeexclass | upgradeexclass | varchar2(256) |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |