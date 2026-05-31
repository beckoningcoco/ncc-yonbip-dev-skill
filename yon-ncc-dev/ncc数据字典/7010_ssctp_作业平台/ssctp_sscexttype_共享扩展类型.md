# |<<

**共享扩展类型 (ssctp_sscexttype / nc.vo.ssctp.sscext.SSCExtTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sscexttype | 主键 | pk_sscexttype | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | metaid | 关联元数据ID | metaid | varchar(50) |  | 字符串 (String) |
| 5 | ispublish | 发布状态标识 | ispublish | char(1) |  | 布尔类型 (UFBoolean) | N |
| 6 | appcode | 小应用编码 | appcode | varchar(50) |  | 字符串 (String) |
| 7 | menucode | 菜单编码 | menucode | varchar(50) |  | 字符串 (String) |
| 8 | pk_doc | 工单类型 | pk_doc | varchar(50) |  | 字符串 (String) |
| 9 | pk_billtype | 工单单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 10 | pk_transtype | 工单交易类型 | pk_transtype | varchar(50) |  | 字符串 (String) |
| 11 | pk_billtypecode | 工单单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 12 | pk_transtypecode | 工单交易类型编码 | pk_transtypecode | varchar(50) |  | 字符串 (String) |
| 13 | pk_tasktype | 共享任务类型 | pk_tasktype | varchar(50) |  | 字符串 (String) |
| 14 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |