# |<<

**共享扩展单据字段映射 (ssctp_sscextbillmap / nc.vo.ssctp.sscext.SSCExtBillMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5662.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sscextbillmap | 主键 | pk_sscextbillmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscexttype | 共享扩展类型 | pk_sscexttype | varchar(20) |  | 共享扩展类型 (sscexttype) |
| 3 | name | 字段名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | sscitem | 共享字段 | sscitem | varchar(50) |  | 字符串 (String) |
| 5 | sscitemshow | 共享显示字段 | sscitemshow | varchar(50) |  | 字符串 (String) |
| 6 | maptype | 映射规则类型 | maptype | varchar(50) |  | 映射规则类型 (ssctp_sscextbillmap_enum) |  | 1=赋值; |