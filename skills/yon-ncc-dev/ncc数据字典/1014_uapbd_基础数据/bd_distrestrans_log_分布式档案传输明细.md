# |<<

**分布式档案传输明细 (bd_distrestrans_log / nc.bs.bd.pub.distribution.BDDistResTransLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/799.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distrestrans_log | 主键 | pk_distrestrans_log | char(20) | √ | 主键 (UFID) |
| 2 | pk_bddoc | 传输档案主键 | pk_bddoc | char(20) |  | 主键 (UFID) |
| 3 | code | 数据编码 | code | varchar(100) |  | 字符串 (String) |
| 4 | name | 数据名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | uploadts | 更新时间 | uploadts | char(19) |  | 日期时间 (UFDateTime) |
| 8 | isallfieldupload | 是否全属性上传 | isallfieldupload | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 9 | isallfieldrecepit | 是否全属性接收 | isallfieldrecepit | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 10 | receiptstatus | 数据接收状态 | receiptstatus | int |  | 资源数据处理状态 (BDDistDataReceiptStatus) | 0 | 0=未接收; |